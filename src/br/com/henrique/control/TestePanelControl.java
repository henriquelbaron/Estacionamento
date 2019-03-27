/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.dao.impl.ServicoDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.domain.Condutor;
import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import br.com.henrique.view.TESTE;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class TestePanelControl {

    public static void carregarCarrosEstacionados() {
        List<Servico> servicos = new ArrayList<>();
        ServicoDaoImpl servicoDaoImpl = new ServicoDaoImpl();
        servicos = servicoDaoImpl.pesquisarPorAtivo(true);
        String[] colunas = {"Id", "Placa", "Proprietario", "Entrada"};
        String[][] dados = new String[servicos.size()][colunas.length];
        for (int i = 0; i < servicos.size(); i++) {
            Servico s = servicos.get(i);
            dados[i][0] = s.getId().toString();
            dados[i][1] = s.getCarro().getPlaca();
            dados[i][2] = s.getCarro().getCondutor().getNome();
            dados[i][3] = Datas.converterDateParaString(s.getHoraEntrada());
        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        TESTE.tableCarrosEstacionados.setModel(modelo);
    }

    public static void carregarCliente() {
        List<Condutor> condutors = new ArrayList<>();
        CondutorDaoImpl condutorDaoImpl = new CondutorDaoImpl();
        condutors = condutorDaoImpl.pesquisarTodos();
        String[] colunas = {"Id", "Nome", "Tipo"};
        String[][] dados = new String[condutors.size()][colunas.length];
        for (int i = 0; i < condutors.size(); i++) {
            Condutor c = condutors.get(i);
            dados[i][0] = c.getId().toString();
            dados[i][1] = c.getNome();
            dados[i][2] = c.getTipo();
        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        TESTE.tableClientes1.setModel(modelo);
    }

    public static void carregarCarros() {
        List<Carro> carros = new ArrayList<>();
        CarroDaoImpl carroDaoImpl = new CarroDaoImpl();
        carros = carroDaoImpl.pesquisarTodos();
        String[] colunas = {"Id", "Placa", "Cor", "Modelo", "Marca", "Estacionado", "Proprietario"};
        String[][] dados = new String[carros.size()][colunas.length];
        for (int i = 0; i < carros.size(); i++) {
            Carro c = carros.get(i);
            dados[i][0] = c.getId().toString();
            dados[i][1] = c.getPlaca();
            dados[i][2] = c.getCor();
            dados[i][3] = c.getModelo();
            dados[i][4] = c.getMarca();
            dados[i][5] = c.getAtivo().toString();
            dados[i][6] = c.getCondutor().getNome();
        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        TESTE.tableCarros.setModel(modelo);
    }

}
