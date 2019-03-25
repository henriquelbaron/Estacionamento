/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.dao.impl;

import br.com.henrique.dao.CondutorDao;
import br.com.henrique.dao.factory.SessionFactory;
import br.com.henrique.dao.factory.conexaoDao;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CondutorDaoImpl extends conexaoDao implements CondutorDao<Condutor> {

    private Condutor condutor;
    private CarroDaoImpl carroDaoImpl;

    public CondutorDaoImpl() {

    }

    @Override
    public boolean inserir(Condutor objeto) {
        try {
            pstt = conn.prepareStatement("INSERT INTO cliente(nome,tipo) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            pstt.setString(1, objeto.getNome());
            pstt.setString(2, objeto.getTipo());
            pstt.executeUpdate();
            rs = pstt.getGeneratedKeys();
            if (rs.next()) {
                int i = rs.getInt(1);
                objeto.setId(i);
                gravarCarro(objeto);
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Condutor " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Condutor objeto) {
        try {
            pstt = conn.prepareStatement("UPDATE cliente SET  nome = ? tipo= ? where id = ?", Statement.RETURN_GENERATED_KEYS);
            pstt.setString(1, objeto.getNome());
            pstt.setString(2, objeto.getTipo());
            pstt.setInt(3, objeto.getId());
            gravarCarro(objeto);
            return pstt.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar" + e.getMessage());
            return false;
        }
    }

    @Override
    public Condutor pesquisar(Integer id) {
        try {
            pstt = conn.prepareStatement("Select * from cliente where id = ?");
            pstt.setInt(1, id);
            rs = pstt.executeQuery();
            while (rs.next()) {
                condutor = new Condutor();
                condutor.setId(id);
                condutor.setNome(rs.getString("nome"));
                condutor.setTipo(rs.getString("tipo"));
                condutor.setCarros(carroDaoImpl.pesquisarCarrosDoCondutor(id));
                return condutor;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar" + e.getMessage());
            return null;
        }
        return null;
    }

    @Override
    public List<Condutor> pesquisarTodos() {
        try {
            List<Condutor> condutors = new ArrayList<>();
            pstt = conn.prepareStatement("SELECT * FROM cliente");
            rs = pstt.executeQuery();
            while (rs.next()) {
                condutor = new Condutor();
                condutor.setId(rs.getInt("id"));
                condutor.setNome(rs.getString("nome"));
                condutor.setTipo(rs.getString("tipo"));
                condutors.add(condutor);
            }
            return condutors;
        } catch (SQLException e) {
            System.out.println("Erro ao listar Todos" + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean excluir(Integer id) {
        try {
            pstt = conn.prepareStatement("DELETE FROM cliente WHERE id = ?");
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
    public List<Condutor> pesquisarTodosTermo(String termo) {
        try {
            List<Condutor> condutors = new ArrayList<>();
            pstt = conn.prepareStatement("SELECT * FROM cliente WHERE id = ? OR nome LIKE ?");
            pstt.setString(1, termo);
            pstt.setString(2, termo + "%");
            rs = pstt.executeQuery();
            while (rs.next()) {
                condutor = new Condutor();
                condutor.setId(rs.getInt("id"));
                condutor.setNome(rs.getString("nome"));
                condutor.setTipo(rs.getString("tipo"));
                condutors.add(condutor);
            }
            return condutors;
        } catch (SQLException e) {
            System.out.println("Erro ao listar Todos" + e.getMessage());
            return null;
        }
    }

    @Override
    public void gravarCarro(Condutor c) {
        try {
            carroDaoImpl = new CarroDaoImpl();
            carroDaoImpl.excluir(c.getId());
            if (c.getCarros() != null && !c.getCarros().isEmpty()) {
                for (Carro carro : c.getCarros()) {
                    carro.setCondutor(c);
                    carroDaoImpl.inserir(carro);
                }
            }
        } catch (Exception e) {
            System.out.println("aaaaa" + e.getMessage());
        }
    }


}
