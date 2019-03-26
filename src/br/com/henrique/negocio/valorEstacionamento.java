/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.negocio;

/**
 *
 * @author ACER
 */
public class valorEstacionamento {

    public static void calcularValorDoEstacionamento(String tempo) {
        String[] dados = tempo.split("[-]");
        for (int i = 0; i < dados.length; i++) {
            String dado = dados[i];
            if (dado.contains("ano")) {
                
            }
            if (dado.contains("mes")) {

            }
            if (dado.contains("dia")) {

            }
            if (dado.contains("hora")) {

            }
            if (dado.contains("minuto")) {

            }
            if (dado.contains("segundo")) {

            }
        }
    }
}
