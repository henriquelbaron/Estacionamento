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
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 *
 * @author ACER
 */
public class Datas {

    private static SimpleDateFormat sdf;

    public static Date converteDateDoBanco(java.sql.Date d) {
        return d;
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
        try {
            sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            return sdf.format(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date converteHoraEDataParaDate(String hora, String data) {
        try {
            sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            return sdf.parse(hora + " " + data);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String dateToString(Date date1, Date date2) {
        DateTime start = new DateTime(date1);
        DateTime end = new DateTime(date2);
        Interval interval = new Interval(start, end);
        Period period = interval.toPeriod(PeriodType.yearMonthDayTime());
        StringBuilder sdate = new StringBuilder();
        sdate.append((period.getYears() == 0) ? "" : ((period.getYears() == 1) ? "1 ano - " : period.getYears() + " anos - "));
        sdate.append((period.getMonths() == 0) ? "" : ((period.getMonths() == 1) ? "1 mes - " : period.getMonths() + " meses - "));
        sdate.append((period.getDays() == 0) ? "" : ((period.getDays() == 1) ? "1 dia - " : period.getDays() + " dias - "));
        sdate.append((period.getHours() == 0) ? "" : ((period.getHours() == 1) ? "1 hora - " : period.getHours() + " horas - "));
        sdate.append((period.getMinutes() == 0) ? "" : ((period.getMinutes() == 1) ? "1 minuto - " : period.getMinutes() + " minutos - "));
        sdate.append((period.getSeconds() == 0) ? "" : ((period.getSeconds() == 1) ? "1 segundo - " : period.getSeconds() + " segundos - "));
        return sdate.toString();
    }

}
