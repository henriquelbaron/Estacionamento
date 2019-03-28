/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.uteis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 *
 * @author ACER
 */
public class Datas {

    private static SimpleDateFormat sdf;

    public static String getData(Date data) {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    public static String getHora(Date data) {
        sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(data);
    }

    public static String pegarHoraAtual() {
        sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(new Date());
    }

    public static String pegarDataAtual() {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }

    public static String pegarDataEHoraAtual() {
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(new Date());
    }

    public static Date pegarDataNow(String data) {
        try {
            sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            return sdf.parse(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String converterDateParaString(Date data) {
        if (data == null) {
            return null;
        }
        try {
            sdf = new SimpleDateFormat("HH:mm - dd/MM/yyyy");
            return sdf.format(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date converteHoraEDataParaDate(String hora, String data) {
        try {
            sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            String string = hora + " " + data;
            return sdf.parse(string);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Calcula a diferença entre 2 datas, e a transforma em minutos;
     *
     *
     * @param date1
     * @param date2
     * @return Minutes (JodaTime)
     */
    public static Minutes minutesEntreDatas(Date date1, Date date2) {
        DateTime start = new DateTime(date1);
        DateTime end = new DateTime(date2);
        return Minutes.minutesBetween(start, end);
    }

}
