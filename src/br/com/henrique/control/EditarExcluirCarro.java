/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.BaseDao;
import br.com.henrique.dao.CarroDao;
import br.com.henrique.dao.CondutorDao;
import br.com.henrique.dao.impl.CarroDaoImpl;
import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.domain.Carro;
import br.com.henrique.persistence.PersistenceDao;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.view.TESTE;
import java.util.List;

/**
 *
 * @author ACER
 */
public class EditarExcluirCarro {

    public void excluirCliente() {
        Carro condutor = getLinhaDaTabelaCliente();
        if (condutor == null) {
            Mensagem.msgErro(Mensagem.SELECIONE_LINHA);
            return;
        }
        if (Mensagem.msgOpcao(Mensagem.TEM_CERTEZA) == 0) {
            System.out.println(condutor);
            condutor.setAtivo(false);
            if (PersistenceDao.getCarro().update(condutor)) {
                Mensagem.msg(Mensagem.ATUALIZADO_SUCESSO);
            }
        }
    }

    public Carro getLinhaDaTabelaCliente() {
        List<Carro> list;
        int i = TESTE.tableClientes1.getSelectedRow();
        list = TestePanelControl.carregarCarros();
        if (i >= 0) {
            return list.get(i);
        }
        return null;
    }
}
