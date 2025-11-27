/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07431666128
 */
public class Tam_ControllerVendedor extends AbstractTableModel{

    private List lstVendedor;

    public void setList(List lstVendedor) {
        this.lstVendedor = lstVendedor;
    }

    public VendedorTam getBean(int rowIndex) {
        return (VendedorTam) lstVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedor.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedorTam cliente = (VendedorTam) lstVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getIdvendedorTam();
        } else if (columnIndex == 1) {
            return cliente.getNomeTam();
        } else if (columnIndex == 2) {
            return cliente.getEmailTam();
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
            return "Email";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
