/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.control;

import br.com.henrique.dao.impl.ServicoDaoImpl;
import br.com.henrique.domain.Servico;
import br.com.henrique.uteis.Datas;
import br.com.henrique.uteis.Mensagem;
import br.com.henrique.view.TelaEstacionamento;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class TelaEstacionamentoControl {

    private static List<Servico> servicos;
    private Servico servico;

    public static void carregarDadosTabela() {
        ServicoDaoImpl servicoDaoImpl = new ServicoDaoImpl();
        servicos = servicoDaoImpl.pesquisarPorAtivo(true);
        DefaultTableModel model = (DefaultTableModel) TelaEstacionamento.tableCarrosAtivos.getModel();
        model.setRowCount(0);
        for (Servico servico : servicos) {
            model.addRow(new Object[]{
                servico.getCarro().getPlaca(),
                servico.getCarro().getCondutor().getNome(),
                Datas.converterDateParaString(servico.getHoraEntrada())
            });
        }
    }

    public Servico pegarLinhaTabela() {
        int i = TelaEstacionamento.tableCarrosAtivos.getSelectedRow();
        if (i >= 0) {
            return servicos.get(i);
        }
        return null;
    }

    public void fecharContaAction() {
        Servico s = pegarLinhaTabela();
        if (s == null) {
            Mensagem.msgErro(Mensagem.SELECIONE_LINHA);
            return;
        }
        if (Mensagem.msgOpcao(Mensagem.TEM_CERTEZA) == 1) {
            return;
        }
        
    }

}
