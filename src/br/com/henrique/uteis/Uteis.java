/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import br.com.henrique.view.CadastroUsuarioFrame;
import br.com.henrique.view.EntradaFrame;

/**
 *
 * @author ACER
 */
public class Uteis {

    public static void limparCamposTelaCadastro() {
        CadastroUsuarioFrame.tfCor.setText("");
        CadastroUsuarioFrame.tfMarca.setText("");
        CadastroUsuarioFrame.tfModelo.setText("");
        CadastroUsuarioFrame.tfNome.setText("");
        CadastroUsuarioFrame.tfPlaca.setText("");
    }

    public static void limparCamposTelaEntrada() {
        EntradaFrame.tfData.setText("");
        EntradaFrame.tfHora.setText("");
        EntradaFrame.tfPlaca.setText("");
    }
}
