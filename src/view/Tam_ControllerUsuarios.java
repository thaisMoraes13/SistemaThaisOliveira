/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuariosTam;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class Tam_ControllerUsuarios extends AbstractTableModel {

    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
    public UsuariosTam getBean(int rowIndex) {
        return (UsuariosTam) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UsuariosTam usuarios = (UsuariosTam) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getIdusuarios();
        } else if (columnIndex ==1) {
            return usuarios.getNome();        
        } else if (columnIndex ==2) {
            return usuarios.getApelido();
        } else if (columnIndex ==3) {
            return usuarios.getCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
