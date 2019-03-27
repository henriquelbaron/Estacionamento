/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.ServicoDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.TESTE;

/**
 *
 *
 * @author ACER
 */
public class TesteServicoControl {

    private Servico servico;
    private ServicoDaoImpl servicoDaoImpl;
    private Carro carro;

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
            servico.setHoraEntrada(Datas.converteHoraEDataParaDate(TESTE.tfHoraEntrada.getText(), TESTE.tfDataEntrada.getText()));
            if (servicoDaoImpl.inserir(servico)) {
                Mensagem.msg(Mensagem.SALVO_SUCESSO);
                Uteis.limparCamposServico();
                TestePanelControl.carregarCarrosEstacionados();
            }
        }
    }
}