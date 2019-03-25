/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.dao.impl.TempoDeServicoDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.domain.Servico;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Testes {

    public static void main(String[] args) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  ' as ' HH:mm:ss");
        TempoDeServicoDaoImpl daoImpl = new TempoDeServicoDaoImpl();
        Servico servico = new Servico();
        servico.setHoraEntrada(new Date());
    }
}
