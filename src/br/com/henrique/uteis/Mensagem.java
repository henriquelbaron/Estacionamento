/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Mensagem {

    public static final String CAMPO_VAZIO = "Os campos Nome e Placa\nSão Obrigatorios!";
    public static final String SALVO_SUCESSO = "Salvo com Suceso";
    public static final String REPETIR_OPERACAO = "Deseja repetir a Operação?";

    public static void msgErro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.ERROR_MESSAGE);
    }

    public static void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int msgOpcao(String msg) {
        return JOptionPane.showConfirmDialog(null, msg, "Atenção", JOptionPane.YES_NO_OPTION);
    }
}
