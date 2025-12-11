/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendasTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class Tam_ControllerVendas extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
    }
    
    public VendasTam getBean(int rowIndex) {
        return (VendasTam) lstVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasTam pedidos = (VendasTam) lstVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return pedidos.getIdvendaTam();
        } else if (columnIndex ==1) {
            return pedidos.getDataVendaTam();        
        } else if (columnIndex ==2) {
            return pedidos.getTotal_tam();
        } else if (columnIndex ==3) {
            return pedidos.getClienteTam().getNomeTam();
        }
        return ""; 
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Data";         
        } else if ( columnIndex == 2) {
            return "Total";
        } else if ( columnIndex == 3) {
            return "Cliente";
        } 
        return "";
    }
}
