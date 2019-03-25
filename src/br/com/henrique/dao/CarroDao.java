/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao;

import java.util.List;

/**
 *
 * @author ACER
 * @param <H>
 */
public interface CarroDao<H> extends BaseDao<H> {

    public List<H> pesquisarCarrosDoCondutor(Integer id);

    public H pesquisarPlaca(String termo);
}
