/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07431666128
 */
public class Tam_ControllerCliente extends AbstractTableModel{

    private List lstCliente;

    public void setList(List lstCliente) {
        this.lstCliente = lstCliente;
    }

    public ClienteTam getBean(int rowIndex) {
        return (ClienteTam) lstCliente.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstCliente.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteTam cliente = (ClienteTam) lstCliente.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getIdclienteTam();
        } else if (columnIndex == 1) {
            return cliente.getNomeTam();
        } else if (columnIndex == 2) {
            return cliente.getProfissaoTam();
        } else if (columnIndex == 3) {
            return cliente.getCpfTam();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "Profissão";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
