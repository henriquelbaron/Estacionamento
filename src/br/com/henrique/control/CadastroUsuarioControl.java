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
import br.com.henrique.uteis.Uteis;
import br.com.henrique.view.CadastroUsuarioFrame;
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
        if (Validacao.placa(CadastroUsuarioFrame.tfPlaca) || Validacao.string(CadastroUsuarioFrame.tfNome)) {
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
        condutor.setNome(CadastroUsuarioFrame.tfNome.getText());
        condutor.setTipo(CadastroUsuarioFrame.cbTipo.getSelectedItem().toString());

        carro = new Carro();
        carro.setPlaca(CadastroUsuarioFrame.tfPlaca.getText());
        carro.setMarca(CadastroUsuarioFrame.tfMarca.getText());
        carro.setModelo(CadastroUsuarioFrame.tfModelo.getText());
        carro.setCor(CadastroUsuarioFrame.tfCor.getText());
        carros.add(carro);

        condutor.setCarros(carros);
        if (condutorDaoImpl.inserir(condutor)) {
            Mensagem.msg(Mensagem.SALVO_SUCESSO);
            Uteis.limparCamposTelaCadastro();
        }
    }
}
