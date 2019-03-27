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
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Validacao {

    public static Condutor condutorExiste(String nome) {
        CondutorDaoImpl condutorDaoImpl = new CondutorDaoImpl();
        return condutorDaoImpl.pesquisaPorNome(nome);
    }

    public static boolean formatedTFVazio(JFormattedTextField tf) {
        if (tf.getText() == null || tf.getText().trim().isEmpty()) {
            tf.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean tfVazio(JTextField tf) {
        if (tf.getText() == null || tf.getText().trim().isEmpty()) {
            tf.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static Carro placaExistente(JFormattedTextField tf) {
        CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
        Carro carro = carroDaoImpl.pesquisarPlaca(tf.getText());
        return carro;
    }
}
