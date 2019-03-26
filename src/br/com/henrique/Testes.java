/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.dao.impl.ServicoDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.Hours;

/**
 *
 * @author ACER
 */
public class Testes {

    public static void main(String[] args) throws SQLException {
        Date d1 = Datas.pegarDataNow("16:22 26/03/2019");
        Date d2 = Datas.pegarDataNow("19:23 27/04/2019");
    }
}
