/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.negocio;

import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import java.util.Date;
import org.joda.time.Minutes;

/**
 *
 * @author ACER
 */
public class Negocio {

    public static Double calcularValorDoEstacionamento(Servico servico) {
        Minutes m = Datas.minutesEntreDatas(servico.getHoraEntrada(), servico.getHoraSaida());
        double d = (double) m.getMinutes() / 60;
        double resto = (double) m.getMinutes() % 60;
        if (resto <= 10) {
            d++;
        }
        Double valor;
        if (servico.getCarro().getCondutor().getTipo().equalsIgnoreCase("Público")) {
            valor = d * 4;
        } else {
            valor = d * 2;
        }
        return valor;
    }
}
