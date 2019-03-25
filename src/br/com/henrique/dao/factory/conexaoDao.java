/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ACER
 */
public class conexaoDao {

    protected Connection conn;
    protected PreparedStatement pstt;
    protected ResultSet rs;
    
    public conexaoDao() {
        this.conn = SessionFactory.getConnect();
    }
}
