/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author SEAMAC
 */
public class Operationen_JLabel extends JLabel{

    
        public static JLabel summiereFloatsAusDBSpalte(java.lang.String sql_anweisung, String spaltenname){
            JLabel jlabel = new JLabel();
            Float summe = 0.00f;
        try {
            ResultSet resultset = Operationen_MySQL.ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                summe += resultset.getFloat(spaltenname);
            }
            
            jlabel.setText(summe.toString());
            return jlabel;


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JLabel_Vorlage.summiereFloatsAusDBSpalte(): \n"+e);
            return null;
        }
        }
        
        public static void refreshen(JLabel label, java.lang.String sql_anweisung, String spaltenname){
        
            Float summe = 0.00f;
        try {
            ResultSet resultset = Operationen_MySQL.ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                summe += resultset.getFloat(spaltenname);
            }
            
            label.setText(summe.toString());


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JLabel_Vorlage.summiereFloatsAusDBSpalte(): \n"+e);
        }
        
    }
    
}
