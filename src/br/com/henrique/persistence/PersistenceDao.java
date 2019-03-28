/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.persistence;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.dao.impl.ServicoDaoImpl;

/**
 *
 * @author ACER
 */
public class PersistenceDao {

    private static CondutorDaoImpl condutorDao = new CondutorDaoImpl();
    private static CarroDaoImpl carroDao = new CarroDaoImpl();
    private static ServicoDaoImpl servicoDao = new ServicoDaoImpl();

    public static CondutorDaoImpl getCondutor() {
        return condutorDao;
    }

    public static CarroDaoImpl getCarro() {
        return carroDao;
    }

    public static ServicoDaoImpl getServico() {
        return servicoDao;
    }

}
