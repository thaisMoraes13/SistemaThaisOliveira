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
 * @author 
 */
public class Tam_ControllerConsultasVenda extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
        
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
        return 3 ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasTam vend = (VendasTam) lstVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return vend.getIdvendaTam();
        } else if (columnIndex ==1) {
            return vend.getClienteTam().getNomeTam();        
        } else if (columnIndex ==2) {
            return vend.getVendedorTam().getNomeTam();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome Cliente";         
        } else if ( columnIndex == 2) {
            return "Nome Vendedor";
        } 
        return "";
    }
}
