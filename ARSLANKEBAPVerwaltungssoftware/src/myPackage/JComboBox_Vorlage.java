/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author SEAMAC
 */
public class JComboBox_Vorlage {
    
    public static JComboBox mitAnweisung(java.lang.String sql_anweisung,java.lang.String spaltenname){
        JComboBox jcombobox = new JComboBox();
        
        try {
            ResultSet resultset = MySQLVerbindung.mySQLResultSet_aus_Anweisung(sql_anweisung);
            
            while (resultset.next()) {
                String name = resultset.getString(spaltenname);
                jcombobox.addItem(name);
                
            }
            return jcombobox;


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "JBomboBox_Vorlage (Konstruktor): \n"+e);
            return null;
        }
        
        
    }
    
}
