/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.ServicoDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Servico;
import br.com.henrique.negocio.Negocio;
import br.com.henrique.persistence.PersistenceDao;
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.FecharServico;
import br.com.henrique.view.TESTE;
import java.awt.Color;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.joda.time.Minutes;

/**
 *
 *
 * @author ACER
 */
public class TesteServicoControl {

    private static Servico servico;
    private Carro carro;
    private static List<Servico> servicos;

    public void salvarServicoAction() {
        if (Validacao.formatedData(TESTE.tfPlacaServico)) {
            return;
        }
        carro = Validacao.placaExistente(TESTE.tfPlacaServico);
        if (carro == null) {
            Mensagem.msgErro(Mensagem.PLACA_INEXISTENTE);
            return;
        }
        if (!Validacao.tfVazio(TESTE.tfHoraSaida) || !Validacao.formatedData(TESTE.tfDataSaida) || !Validacao.tfVazio(TESTE.tfValor)) {
            updateSerico();
        } else {
            if (carro.getAtivo()) {
                Mensagem.msgErro("Este Carro ja esta estacionado");
                return;
            }
            inserirNovoServico(carro);
        }
    }

    public void inserirNovoServico(Carro carro) {
        servico = new Servico();
        carro.setAtivo(true);
        servico.setCarro(carro);
        CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
        carroDaoImpl.update(carro);
        servico.setHoraEntrada(Datas.converteHoraEDataParaDate(TESTE.tfHoraEntrada.getText(), TESTE.tfDataEntrada.getText()));
        if (PersistenceDao.getServico().inserir(servico)) {
            Mensagem.msg(Mensagem.SALVO_SUCESSO);
            Uteis.limparCamposServico();
            TestePanelControl.atualizarTabelas();
        }
    }

    public void updateSerico() {
        servico.setHoraEntrada(Datas.converteHoraEDataParaDate(TESTE.tfHoraEntrada.getText(), TESTE.tfDataEntrada.getText()));
        servico.setHoraSaida(Datas.converteHoraEDataParaDate(TESTE.tfHoraSaida.getText(), TESTE.tfDataSaida.getText()));
        servico.setValor(Negocio.calcularValorDoEstacionamento(servico));
        servico.getCarro().setAtivo(false);
        if (servico.getValor() < 0.0) {
            Mensagem.msgErro(Mensagem.DATAS_INVALIDAS);
            return;
        }
        frameTroco();
//        if (Mensagem.msgOpcao(Mensagem.TEM_CERTEZA) == 0) {
//            PersistenceDao.getServico().update(servico);
//            TestePanelControl.atualizarTabelas();
//        }
//        Uteis.limparCamposServico();
    }

    public Servico pegarLinhaTabela() {
        int i = TESTE.tableCarroEstacionados.getSelectedRow();
        servicos = TestePanelControl.carregarCarrosEstacionados();
        if (i >= 0) {
            return servicos.get(i);
        }
        return null;
    }

    public void fecharContaAction() {
        servico = pegarLinhaTabela();
        if (servico == null) {
            Mensagem.msgErro(Mensagem.SELECIONE_LINHA);
            return;
        }
        TESTE.tfHoraSaida.setText(Datas.pegarHoraAtual());
        TESTE.tfDataSaida.setText(Datas.pegarDataAtual());
        TESTE.tfValor.setText(Negocio.calcularValorDoEstacionamento(servico).toString());
        TESTE.tfDataEntrada.setText(Datas.getData(servico.getHoraEntrada()));
        TESTE.tfHoraEntrada.setText(Datas.getHora(servico.getHoraEntrada()));
        TESTE.tfDataSaida.setText(Datas.pegarDataAtual());
        TESTE.tfPlacaServico.setText(servico.getCarro().getPlaca());
    }

    public void atualizaTFValor() {
        if (servico != null) {
            servico.setHoraEntrada(Datas.converteHoraEDataParaDate(TESTE.tfHoraEntrada.getText(), TESTE.tfDataEntrada.getText()));
            servico.setHoraSaida(Datas.converteHoraEDataParaDate(TESTE.tfHoraSaida.getText(), TESTE.tfDataSaida.getText()));
            TESTE.tfValor.setText(Negocio.calcularValorDoEstacionamento(servico).toString());
        }
    }

    private FecharServico fs;

    public void frameTroco() {
        if (fs == null) {
            fs = new FecharServico();
        }
        fs.setVisible(true);
        fs.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        FecharServico.lblTotal.setText(servico.getValor().toString());

    }

    public boolean finalizarAction() {
        if (troco() < 0.0) {
            Mensagem.msgErro(Mensagem.DINHEIRO_INSUFICIENTE);
            return false;
        }
        PersistenceDao.getServico().update(servico);
        TestePanelControl.atualizarTabelas();
        Uteis.limparCamposServico();
        Mensagem.msg(Mensagem.SALVO_SUCESSO);
        System.gc();
        return true;
    }

    public Double troco() {
        double total = Uteis.stringParaDouble(FecharServico.lblTotal.getText());
        double pagamento = Uteis.stringParaDouble(FecharServico.tfRecebido.getText());
        return pagamento - total;
    }

    public void lostFocusPagamento() {
        FecharServico.lblTroco.setText(troco().toString());
        if (troco() < 0) {
            FecharServico.lblTroco.setForeground(Color.RED);
        } else {
            FecharServico.lblTroco.setForeground(Color.green);
        }
    }
}
