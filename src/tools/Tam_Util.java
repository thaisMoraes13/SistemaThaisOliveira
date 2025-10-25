/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 *
 * @author u06716483144
 */
public class Tam_Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if ((componentes[i]) instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            } else if ((componentes[i]) instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            } else if ((componentes[i]) instanceof JCheckBox){
                ((JCheckBox) componentes[i]).setSelected(false);
            } else {
            
            }

        }
    }

    public static boolean perguntar(String cad) {
        int opcao = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
        return opcao == JOptionPane.YES_OPTION;
    }

    public static String limparFormatacao(String valor) {
        if (valor == null) {
            return null;
        }
        return valor.replaceAll("\\D", "");
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static int strToInt(String num) {
        if (num == null) {
            return 0;
        }
        return Integer.parseInt(num);
    }

    public static String intToString(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String num) {
        if (num == null || num.trim().isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(num.trim().replace(',' ,'.'));
    }

    public static String doubleToString(double num) {
        return String.valueOf(num);
    }

    public static Date strToDate(String data) throws java.text.ParseException {
  
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(data.trim());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Data inválida: " + data);
        }
    }

    public static String dateToStr(Date data) {
        if (data == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

}
