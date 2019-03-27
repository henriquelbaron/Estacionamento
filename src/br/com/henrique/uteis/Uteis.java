/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import br.com.henrique.view.CadastroUsuarioFrame;
import br.com.henrique.view.EntradaFrame;
import br.com.henrique.view.TESTE;
import java.text.DecimalFormat;

/**
 *
 * @author ACER
 */
public class Uteis {

    public static String formatarDouble(Double d) {
        DecimalFormat df = new DecimalFormat("#,##0,00");
        return df.format(d);
    }

    public static void limparCamposCadastro() {
        TESTE.tfCor.setText("");
        TESTE.tfMarca.setText("");
        TESTE.tfModelo.setText("");
        TESTE.tfNome.setText("");
        TESTE.tfPlaca.setText("");
    }

    public static void limparCamposServico() {
        TESTE.tfPlacaServico.setText("");
        TESTE.tfHoraSaida.setText("");
        TESTE.tfValor.setText("");
    }
}
