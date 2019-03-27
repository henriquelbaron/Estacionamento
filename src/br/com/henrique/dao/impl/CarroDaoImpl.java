/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao.impl;

import br.com.henrique.dao.CarroDao;
import br.com.henrique.dao.factory.conexaoDao;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CarroDaoImpl extends conexaoDao implements CarroDao<Carro> {
    
    private Carro carro;
    private CondutorDaoImpl condutorDaoImpl;
    
    @Override
    public boolean inserir(Carro objeto) {
        try {
            pstt = conn.prepareStatement("INSERT INTO carro (placa,cor, modelo, marca, ativo,idCliente) values (?,?,?,?,?,?)");
            pstt.setString(1, objeto.getPlaca());
            pstt.setString(2, objeto.getCor());
            pstt.setString(3, objeto.getModelo());
            pstt.setString(4, objeto.getMarca());
            pstt.setBoolean(5, objeto.getAtivo());
            pstt.setInt(6, objeto.getCondutor().getId());
            return pstt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir novo carro " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean update(Carro objeto) {
        try {
            pstt = conn.prepareStatement("UPDATE carro SET placa = ?, cor = ?,modelo = ?, marca= ?,ativo = ?, idCliente = ? where id = ?");
            pstt.setString(1, objeto.getPlaca());
            pstt.setString(2, objeto.getCor());
            pstt.setString(3, objeto.getModelo());
            pstt.setString(4, objeto.getMarca());
            pstt.setBoolean(5, objeto.getAtivo());
            pstt.setInt(6, objeto.getCondutor().getId());
            pstt.setInt(7, objeto.getId());
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar carro " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public Carro pesquisar(Integer id) {
        try {
            condutorDaoImpl = new CondutorDaoImpl();
            pstt = conn.prepareStatement("Select * from carro where id = ?");
            pstt.setInt(1, id);
            rs = pstt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setId(id);
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                carro.setAtivo(rs.getBoolean("ativo"));
                int idCliente = rs.getInt("idCliente");
                carro.setCondutor(condutorDaoImpl.pesquisar(idCliente));
                return carro;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar" + e.getMessage());
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    @Override
    public List<Carro> pesquisarTodos() {
        condutorDaoImpl = new CondutorDaoImpl();
        try {
            List<Carro> carros = new ArrayList<>();
            pstt = conn.prepareStatement("SELECT * FROM carro");
            rs = pstt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                carro.setAtivo(rs.getBoolean("ativo"));
                int idCliente = rs.getInt("idCliente");
                carro.setCondutor(condutorDaoImpl.pesquisar(idCliente));
                carros.add(carro);
            }
            return carros;
        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar todos " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Carro> pesquisarTodosTermo(String termo) {
        condutorDaoImpl = new CondutorDaoImpl();
        try {
            List<Carro> carros = new ArrayList<>();
            pstt = conn.prepareStatement("SELECT * FROM carro WHERE id = ? or placa LIKE ? or cor LIKE ? or modelo LIKE ? or marca LIKE ? or idCliente = ?");
            pstt.setString(1, termo);
            pstt.setString(2, termo);
            pstt.setString(3, termo + "%");
            pstt.setString(4, termo + "%");
            pstt.setString(5, termo + "%");
            pstt.setString(6, termo);
            rs = pstt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                int idCliente = rs.getInt("idCliente");
                carro.setCondutor(condutorDaoImpl.pesquisar(idCliente));
                carros.add(carro);
            }
            return carros;
        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar todos " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public boolean excluir(Integer id) {
        try {
            pstt = conn.prepareStatement("DELETE FROM carro WHERE id = ?");
            pstt.setInt(1, id);
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao excluir " + e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean excluir(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Carro> pesquisarCarrosDoCondutor(Integer id) {
        condutorDaoImpl = new CondutorDaoImpl();
        try {
            List<Carro> carros = new ArrayList<>();
            pstt = conn.prepareStatement("SELECT * FROM carro where idCliente = ?");
            pstt.setInt(1, id);
            rs = pstt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                int idCliente = rs.getInt("idCliente");
                Condutor c = new Condutor();
                c.setId(idCliente);
                carro.setCondutor(new Condutor());
                carros.add(carro);
            }
            return carros;
        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar todos " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public Carro pesquisarPlaca(String termo) {
        try {
            condutorDaoImpl = new CondutorDaoImpl();
            pstt = conn.prepareStatement("Select * from carro where placa = ?");
            pstt.setString(1, termo);
            rs = pstt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                carro.setAtivo(rs.getBoolean("ativo"));
                int idCliente = rs.getInt("idCliente");
                carro.setCondutor(condutorDaoImpl.pesquisar(idCliente));
                return carro;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar por id " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
}
