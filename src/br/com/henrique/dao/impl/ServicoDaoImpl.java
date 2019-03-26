/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao.impl;

import br.com.henrique.dao.CarroDao;
import br.com.henrique.dao.TempoDeServicoDao;
import br.com.henrique.dao.factory.conexaoDao;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.domain.Servico;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ServicoDaoImpl extends conexaoDao implements TempoDeServicoDao<Servico> {

    private Servico servico;

    @Override
    public boolean inserir(Servico objeto) {
        try {
            pstt = conn.prepareStatement("INSERT INTO servico (hora_entrada, idCliente) values (?,?)");
            pstt.setTimestamp(1, new Timestamp(objeto.getHoraEntrada().getTime()));
            pstt.setInt(2, objeto.getCarro().getCondutor().getId());
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Servico objeto) {
        try {
            pstt = conn.prepareStatement("UPDATE servico set hora_entrada = ?, hora_saida = ?, valor = ? ativo = ? where id = ?");
            pstt.setTimestamp(1, new Timestamp(objeto.getHoraEntrada().getTime()));
            pstt.setTimestamp(2, new Timestamp(objeto.getHoraSaida().getTime()));
            pstt.setDouble(3, objeto.getValor());
            pstt.setBoolean(4, objeto.isAtivo());
            pstt.setInt(5, objeto.getId());
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Servico pesquisar(Integer id) {
        try {
            CondutorDaoImpl condutorDaoImpl = new CondutorDaoImpl();
            pstt = conn.prepareStatement("Select * from servico where id = ?");
            pstt.setInt(1, id);
            rs = pstt.executeQuery();
            if (rs.next()) {
                servico = new Servico();
                servico.setId(id);
                servico.setHoraEntrada(rs.getTimestamp("hora_entrada"));
                servico.setHoraSaida(rs.getTimestamp("hora_saida"));
                servico.setValor(rs.getDouble("valor"));
                servico.setAtivo(rs.getBoolean("ativo"));
            }
            return servico;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Servico> pesquisarTodos() {
        try {
            pstt = conn.prepareStatement("Select * from servico");
            return passaDadosParaObjeto(pstt.executeQuery());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @deprecated @param termo
     * @return
     */
    @Override
    public List<Servico> pesquisarTodosTermo(String termo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Integer id) {
        try {
            pstt = conn.prepareStatement("Delete FROM servico where id=" + id);
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @deprecated @param parametro
     * @return
     */
    @Override
    public boolean excluir(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Servico> passaDadosParaObjeto(ResultSet rs) throws SQLException {
        List<Servico> servicos = new ArrayList<>();
        while (rs.next()) {
            servico = new Servico();
            servico.setId(rs.getInt("id"));
            servico.setHoraEntrada(rs.getTimestamp("hora_entrada"));
            servico.setHoraSaida(rs.getTimestamp("hora_saida"));
            servico.setValor(rs.getDouble("valor"));
            servico.setAtivo(rs.getBoolean("ativo"));
            servicos.add(servico);
        }
        return servicos;
    }

    @Override
    public List<Servico> pesquisarPorEntrada(java.util.Date e1, java.util.Date e2) {
        try {
            pstt = conn.prepareStatement("SELECT DISTINCT hora_entrada FROM servico WHERE hora_entrada BETWEEN " + e1 + " AND " + e2 + " ORDER BY hora_entrada");
            return passaDadosParaObjeto(rs = pstt.executeQuery());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Servico> pesquisarPorSaida(java.util.Date s1, java.util.Date s2) {
        try {
            pstt = conn.prepareStatement("SELECT DISTINCT hora_entrada FROM servico WHERE hora_entrada BETWEEN " + s1 + " AND " + s2 + " ORDER BY hora_entrada");
            return passaDadosParaObjeto(rs = pstt.executeQuery());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Servico> pesquisarPorAtivo(Boolean termo) {
        try {
            List<Servico> servicos = new ArrayList<>();
            pstt = conn.prepareStatement("select c.placa,cl.nome, s.hora_entrada, cl.tipo from carro as c inner join cliente as cl on cl.id = c.idCliente "
                    + "inner join servico as s on s.idCliente=cl.id where ativo = ?");
            pstt.setBoolean(1, termo);
            rs = pstt.executeQuery();
            while (rs.next()) {
                servico = new Servico();
                Carro c = new Carro();
                c.setPlaca(rs.getString("placa"));
                c.setCondutor(new Condutor(rs.getString("nome"), rs.getString("tipo")));
                servico.setCarro(c);
                servico.setHoraEntrada(rs.getTimestamp("hora_entrada"));
                servicos.add(servico);
            }
            return servicos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<Servico> pesquisarPorAtivo() {
        try {
            CondutorDaoImpl condutorDaoImpl = new CondutorDaoImpl();
            List<Servico> servicos = new ArrayList<>();
            pstt = conn.prepareStatement("select c.*,cl.*, s.* from carro as c inner join cliente as cl on cl.id = c.idCliente "
                    + "inner join servico as s on s.idCliente=cl.id");
            rs = pstt.executeQuery();
            while (rs.next()) {
                servico = new Servico();
                servico.setCondutor(condutorDaoImpl.pesquisar(rs.getInt("id")));
                servico.setHoraEntrada(rs.getTimestamp("hora_entrada"));
                servico.setHoraSaida(rs.getTimestamp("hora_saida"));
                servico.setAtivo(rs.getBoolean("ativo"));
                servico.setValor(rs.getDouble("valor"));
                servicos.add(servico);
            }
            return servicos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
