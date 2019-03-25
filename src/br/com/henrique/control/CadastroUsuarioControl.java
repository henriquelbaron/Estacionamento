/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.view.CadastrandoUsuarioPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ACER
 */
public class CadastroUsuarioControl {

    Carro carro;
    Condutor condutor;
    CondutorDaoImpl condutorDaoImpl;
    CarroDaoImpl carroDaoImpl;
    List<Carro> carros;

    public CadastroUsuarioControl() {
        condutorDaoImpl = new CondutorDaoImpl();
    }

    public void salvarBotaoAction() {
        if (Validacao.placa(CadastrandoUsuarioPanel.tfPlaca) || Validacao.string(CadastrandoUsuarioPanel.tfNome)) {
            Mensagem.msgErro(Mensagem.CAMPO_VAZIO);
            return;
        }
        if (condutor == null) {
            salvarCondutorAction();
        }
    }

    public void salvarCondutorAction() {
        condutor = new Condutor();
        condutor.setCarros(carros = new ArrayList());
        condutor.setNome(CadastrandoUsuarioPanel.tfNome.getText());
        condutor.setTipo(CadastrandoUsuarioPanel.cbTipo.getSelectedItem().toString());

        carro = new Carro();
        carro.setPlaca(CadastrandoUsuarioPanel.tfPlaca.getText());
        carro.setMarca(CadastrandoUsuarioPanel.tfMarca.getText());
        carro.setModelo(CadastrandoUsuarioPanel.tfModelo.getText());
        carro.setCor(CadastrandoUsuarioPanel.tfCor.getText());
        carros.add(carro);

        condutor.setCarros(carros);
        if (condutorDaoImpl.inserir(condutor)) {
            Mensagem.msg(Mensagem.SALVO_SUCESSO);
            if (Mensagem.msgOpcao(Mensagem.REPETIR_OPERACAO) == 0) {
                
            }
        }
    }
}
