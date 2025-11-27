/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendasProdutosTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tools.Tam_Util;

/**
 *
 * @author Marcos
 */
public class Tam_ControllerVendasProdutos extends AbstractTableModel {

    private List lstVendasProdutosTam;

    public void setList(List lstVendasProdutosTam) {
        this.lstVendasProdutosTam = lstVendasProdutosTam;
        this.fireTableDataChanged();
    }

    public VendasProdutosTam getBean(int rowIndex) {
        return (VendasProdutosTam) lstVendasProdutosTam.get(rowIndex);
    }

    public void addBean(VendasProdutosTam vendasProdutos) {
        lstVendasProdutosTam.add(vendasProdutos);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        lstVendasProdutosTam.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendasProdutosTam.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasProdutosTam vendasProdutos = (VendasProdutosTam) lstVendasProdutosTam.get(rowIndex);
        if (columnIndex == 0) {
            return vendasProdutos.getProdutoTam().getIdprodutoTam();
        } else if (columnIndex == 1) {
            return vendasProdutos.getProdutoTam().getNomeTam();
        } else if (columnIndex == 2) {
            return vendasProdutos.getQuantidadeProdutoTam();
        } else if (columnIndex == 3) {
            return vendasProdutos.getValorUnitarioTam();
        } else if (columnIndex == 4) {
            
            return  Tam_Util.strToDouble(vendasProdutos.getValorUnitarioTam()) * 
                    Tam_Util.strToDouble(vendasProdutos.getQuantidadeProdutoTam());
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}
