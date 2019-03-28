/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.persistence.PersistenceDao;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.TESTE;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class TesteClienteControl {

    private Condutor condutor;
    private Carro carro;
    private List<Carro> carros;

    public void salvarAction() {
        if (Validacao.formatedData(TESTE.tfPlaca) || Validacao.tfVazio(TESTE.tfNome)) {
            return;
        }
        condutor = Validacao.condutorExiste(TESTE.tfNome.getText());
        if (condutor == null) {
            salvarNovoCondutor();
        } else {
            updateCondutor(condutor);
        }
    }

    public void salvarNovoCondutor() {
        condutor = new Condutor();
        condutor.setNome(TESTE.tfNome.getText());
        condutor.setTipo(TESTE.cbTipo.getSelectedItem().toString());

        carros = new ArrayList<>();
        carros.add(carregarDadosCarro());
        condutor.setCarros(carros);
        if (PersistenceDao.getCondutor().inserir(condutor)) {
            TestePanelControl.atualizarTabelas();
            Mensagem.msg(Mensagem.SALVO_SUCESSO);
            Uteis.limparCamposCadastro();
        } else {
            Mensagem.msgErro(Mensagem.ERRO_INESPERADO);
        }
    }

    public void updateCondutor(Condutor c) {
        carros = new ArrayList<>();
        if (Validacao.placaExistente(TESTE.tfPlaca) == null) {
            carros.add(carregarDadosCarro());
            c.setCarros(carros);
        }
        
        if (PersistenceDao.getCondutor().update(condutor)) {
            TestePanelControl.atualizarTabelas();
            Mensagem.msg(Mensagem.ATUALIZADO_SUCESSO);
            Uteis.limparCamposCadastro();
        } else {
            Mensagem.msgErro(Mensagem.ERRO_INESPERADO);
        }
    }

    public Carro carregarDadosCarro() {
        carro = new Carro();
        carro.setPlaca(TESTE.tfPlaca.getText());
        carro.setMarca(TESTE.tfMarca.getText());
        carro.setModelo(TESTE.tfModelo.getText());
        carro.setCor(TESTE.tfCor.getText());
        carro.setAtivo(false);
        return carro;
    }
}
