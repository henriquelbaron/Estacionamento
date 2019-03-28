/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.CondutorDaoImpl;
import br.com.henrique.domain.Condutor;
import br.com.henrique.persistence.PersistenceDao;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.view.TESTE;
import java.util.List;

/**
 *
 * @author ACER
 */
public class EditarExcluirCliente {

    public void excluirCliente() {
        Condutor condutor = getLinhaDaTabelaCliente();
        if (condutor == null) {
            Mensagem.msgErro(Mensagem.SELECIONE_LINHA);
            return;
        }
        if (Mensagem.msgOpcao(Mensagem.TEM_CERTEZA) == 0) {
            System.out.println(condutor);
            condutor.setAtivo(false);
            if (PersistenceDao.getCondutor().update(condutor)) {
                Mensagem.msg(Mensagem.ATUALIZADO_SUCESSO);
                TestePanelControl.atualizarTabelas();
            } else {
                Mensagem.msg(Mensagem.ERRO_INESPERADO);
            }
        }
    }

    public Condutor getLinhaDaTabelaCliente() {
        List<Condutor> list;
        int i = TESTE.tableClientes1.getSelectedRow();
        list = TestePanelControl.carregarCliente();
        if (i >= 0) {
            return list.get(i);
        }
        return null;
    }

}
