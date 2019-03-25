/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import br.com.henrique.view.EntradaFrame;

/**
 *
 * @author ACER
 */
public class EntradaFrameControl {
    
    private Servico servico;
    
    public EntradaFrameControl() {
        EntradaFrame entradaFrame = new EntradaFrame();
        entradaFrame.setVisible(true);
    }
    
    public void carregarDadosAction() {
        if (Validacao.placaExistente(EntradaFrame.tfPlaca)) {
            
        }
    }
    
    public void carregarHora() {
        EntradaFrame.tfHora.setText(Datas.pegarHoraAtual());
    }
    
   
}
