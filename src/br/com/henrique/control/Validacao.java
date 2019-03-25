/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.domain.Carro;
import java.awt.Color;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Validacao {

    public static boolean placa(JFormattedTextField tf) {
        if (tf.getText() == null || tf.getText().trim().isEmpty()) {
            tf.setForeground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean string(JTextField tf) {
        if (tf.getText() == null || tf.getText().trim().isEmpty()) {
            tf.setForeground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean placaExistente(JFormattedTextField tf) {
        CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
        Carro carro = carroDaoImpl.pesquisarPlaca(tf.getText());
        return carro == null;
    }
}
