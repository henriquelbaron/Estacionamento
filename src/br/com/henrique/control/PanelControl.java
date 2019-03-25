/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.view.CadastrandoUsuarioPanel;
import br.com.henrique.view.EntradaFrame;
import br.com.henrique.view.TelaEstacionamento;

/**
 *
 * @author ACER
 */
public class PanelControl {
    
    private static TelaEstacionamento FRAME;
    
    public static void main(String[] args) {
        FRAME = new TelaEstacionamento();
        FRAME.setTitle("Estacionamento");
        FRAME.setVisible(true);
//        panelAdicionarCondutor();
    }
    
    public static void panelAdicionarCondutor() {
        CadastrandoUsuarioPanel panel = new CadastrandoUsuarioPanel();
        FRAME.setContentPane(panel);
        FRAME.setVisible(true);
    }
    
    public static void panelAdicinarEntrada() {
        EntradaFrame ef = new EntradaFrame();
        ef.setVisible(true);
    }
    
}
