/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.negocio;

import br.com.henrique.control.Validacao;
import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import org.joda.time.Minutes;

/**
 *
 * @author ACER
 */
public class Negocio {

    public static Double calcularValorDoEstacionamento(Servico servico) {
        double valor = 0.0;
        Minutes m = Datas.minutesEntreDatas(servico.getHoraEntrada(), servico.getHoraSaida());
        int d = (int) m.getMinutes() / 60;
        double resto = (double) m.getMinutes() % 60;
        System.out.println(resto);
        if (resto >= 10) {
            d++;
        }
        if (resto < 0) {
            d--;
        }
        
        if (servico.getCarro().getCondutor().getTipo().equalsIgnoreCase("Público")) {
            valor = d * 4;
        } else {
            valor = d * 2;
        }
        return valor;
    }
}
