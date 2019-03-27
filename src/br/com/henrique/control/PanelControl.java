/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.view.CadastroUsuarioFrame;
import br.com.henrique.view.EntradaFrame;
import br.com.henrique.view.TelaEstacionamento;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ACER
 */
public class PanelControl {

    private static TelaEstacionamento FRAME;
    private static EntradaFrame EF;
    private static CadastroUsuarioFrame CADASTRO_USUARIO;

    public static void main(String[] args) {
        chamaTelaEstacionamento();
    }

    public static void chamaTelaEstacionamento() {
        FRAME = new TelaEstacionamento();
        FRAME.setTitle("Estacionamento");
        FRAME.pack();
        FRAME.setVisible(true);
    }

    public static void abrirPanelAdicionarCondutor() {
        CADASTRO_USUARIO = new CadastroUsuarioFrame();
        CADASTRO_USUARIO.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        CADASTRO_USUARIO.pack();
        CADASTRO_USUARIO.setVisible(true);
    }

    public static void abirPanelAdicinarEntrada() {
        EF = new EntradaFrame();
        EF.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        EF.setVisible(true);
    }

}
