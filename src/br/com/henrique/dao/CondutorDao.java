/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao;

import br.com.henrique.domain.Condutor;

/**
 *
 * @author ACER
 */
public interface CondutorDao<H> extends BaseDao<H>{
    public void gravarCarro(H c);
}
