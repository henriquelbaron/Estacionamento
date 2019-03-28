/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import br.com.henrique.view.TESTE;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author ACER
 */
public class Uteis {

    public static Double stringParaDouble(String d) {
        try {
            return Double.parseDouble(d.replaceAll(",", "."));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1.0;
        }
    }

    public static String formatarDouble(Double d) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
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
        TESTE.tfPlacaServico.setBackground(Color.WHITE);
        TESTE.tfHoraSaida.setText("");
        TESTE.tfHoraSaida.setBackground(Color.WHITE);
        TESTE.tfDataSaida.setText("");
        TESTE.tfDataSaida.setBackground(Color.WHITE);
        TESTE.tfValor.setText("");
        TESTE.tfValor.setBackground(Color.WHITE);
    }
}
