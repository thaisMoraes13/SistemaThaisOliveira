/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendedorTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 
 */
public class Tam_ControllerConsultasVendedor extends AbstractTableModel {

    private List lstVendedores;

    public void setList(List lstVendedores) {
        this.lstVendedores = lstVendedores;
        this.fireTableDataChanged();
        
    }
    
    public VendedorTam getBean(int rowIndex) {
        return (VendedorTam) lstVendedores.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedores.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedorTam vend = (VendedorTam) lstVendedores.get( rowIndex);
        if ( columnIndex == 0 ){
            return vend.getIdvendedorTam();
        } else if (columnIndex ==1) {
            return vend.getNomeTam();        
        } else if (columnIndex ==2) {
            return vend.getEmailTam();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Email";
        } 
        return "";
    }
}
