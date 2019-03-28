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
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.EntradaFrame;
import br.com.henrique.view.TESTE;
import java.util.List;

/**
 *
 *
 * @author ACER
 */
public class TesteServicoControl {

    private Servico servico;
    private ServicoDaoImpl servicoDaoImpl;
    private Carro carro;
    private static List<Servico> servicos;

    public void salvarServicoAction() {
        if (Validacao.formatedTFVazio(TESTE.tfPlacaServico)) {
            return;
        }
        servicoDaoImpl = new ServicoDaoImpl();
        carro = Validacao.placaExistente(TESTE.tfPlacaServico);
        if (carro == null) {
            Mensagem.msgErro(Mensagem.PLACA_INEXISTENTE);
            return;
        }
        if (carro.getAtivo()) {
            Mensagem.msgErro("Este Carro ja esta estacionado");
        } else {
            servico = new Servico();
            carro.setAtivo(true);
            servico.setCarro(carro);
            CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
            carroDaoImpl.update(carro);
            servico.setHoraEntrada(Datas.converteHoraEDataParaDate(TESTE.tfHoraEntrada.getText(), TESTE.tfDataEntrada.getText()));
            if (servicoDaoImpl.inserir(servico)) {
                Mensagem.msg(Mensagem.SALVO_SUCESSO);
                Uteis.limparCamposServico();
                TestePanelControl.atualizarTabelas();
            }
        }
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
        Servico s = pegarLinhaTabela();
        if (s == null) {
            Mensagem.msgErro(Mensagem.SELECIONE_LINHA);
            return;
        }
        TESTE.tfHoraSaida.setText(Datas.pegarHoraAtual());
        TESTE.tfDataSaida.setText(Datas.pegarDataAtual());
        TESTE.tfValor.setText(Negocio.calcularValorDoEstacionamento(s).toString());
        TESTE.tfDataEntrada.setText(Datas.getData(s.getHoraEntrada()));
        TESTE.tfHoraEntrada.setText(Datas.getHora(s.getHoraEntrada()));
        TESTE.tfPlacaServico.setText(s.getCarro().getPlaca());
        s.setHoraSaida(Datas.converteHoraEDataParaDate(TESTE.tfHoraSaida.getText(), TESTE.tfDataSaida.getText()));
        s.setValor(Negocio.calcularValorDoEstacionamento(s));
        s.getCarro().setAtivo(false);
        if (Mensagem.msgOpcao(Mensagem.TEM_CERTEZA) == 0) {
            servicoDaoImpl = new ServicoDaoImpl();
            servicoDaoImpl.update(s);
            TestePanelControl.atualizarTabelas();
        }
        Uteis.limparCamposServico();
    }
}
