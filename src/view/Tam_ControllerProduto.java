/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07431666128
 */
public class Tam_ControllerProduto extends AbstractTableModel{

    private List lstProduto;

    public void setList(List lstProduto) {
        this.lstProduto = lstProduto;
    }

    public ProdutoTam getBean(int rowIndex) {
        return (ProdutoTam) lstProduto.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProduto.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoTam cliente = (ProdutoTam) lstProduto.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getIdprodutoTam();
        } else if (columnIndex == 1) {
            return cliente.getNomeTam();
        } else if (columnIndex == 2) {
            return cliente.getDataFabricacaoTam();
        } else if (columnIndex == 3) {
            return cliente.getQuantidadeProdutoTam();
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
            return "Data Fabricação";
        } else if (columnIndex == 3) {
            return "Quantidade";
        }
        return "";
    }
}
