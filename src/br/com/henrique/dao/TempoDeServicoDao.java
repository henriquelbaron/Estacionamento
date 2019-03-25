/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao;

import br.com.henrique.domain.Servico;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface TempoDeServicoDao<H> extends BaseDao<H> {

    public List<H> pesquisarPorEntrada(Date e1, Date e2);

    public List<H> pesquisarPorSaida(Date s1, Date s2);

    public List<H> pesquisarPorAtivo(Boolean termo);
}
