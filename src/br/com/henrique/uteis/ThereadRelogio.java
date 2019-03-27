/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import br.com.henrique.view.TESTE;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class ThereadRelogio {

    public static void start() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    Date d = new Date();
                    SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
                    SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
                    TESTE.tfHoraEntrada.setText(sdfHora.format(d));
                    TESTE.tfDataEntrada.setText(sdfData.format(d));
                    TESTE.tfDataSaida.setText(sdfData.format(d));
                    try {
                        Thread.sleep(60000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();

                    }
                }
            }
        }.start();
    }
}
