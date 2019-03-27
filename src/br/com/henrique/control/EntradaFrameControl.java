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
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.EntradaFrame;

/**
 *
 * @author ACER
 */
public class EntradaFrameControl {
    
    private Servico servico;
    private Carro carro;
    
    public EntradaFrameControl() {
    }
    
    public void carregarDadosAction() {
        carro = Validacao.placaExistente(EntradaFrame.tfPlaca);
        if (carro == null) {
            PanelControl.abrirPanelAdicionarCondutor();
        } else {
            insereNovoServico(carro);
        }
    }
    
    public void carregarHoraeData() {
        EntradaFrame.tfHora.setText(Datas.pegarHoraAtual());
        EntradaFrame.tfData.setText(Datas.pegarDataAtual());
    }
    
    public void insereNovoServico(Carro c) {
        servico = new Servico();
        servico.setHoraEntrada(Datas.converteHoraEDataParaDate(EntradaFrame.tfHora.getText(), EntradaFrame.tfData.getText()));
        c.setAtivo(true);
        servico.setCarro(c);
        CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
        carroDaoImpl.update(carro);
        ServicoDaoImpl servicoDaoImpl = new ServicoDaoImpl();
        if (servicoDaoImpl.inserir(servico)) {
            Uteis.limparCamposServico();
            Mensagem.msg(Mensagem.SALVO_SUCESSO);
            TelaEstacionamentoControl.carregarDadosTabela();
        }
    }
    
}
