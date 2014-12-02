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
public class JComboBox_Vorlage extends javax.swing.JComboBox {
        static JComboBox jcombobox;
        
        
    public static JComboBox mitAnweisung(java.lang.String sql_anweisung,java.lang.String spaltenname){
            jcombobox = new JComboBox();
        try {
            ResultSet resultset = MySQL.mySQLResultSet_aus_Anweisung(sql_anweisung);
            
            while (resultset.next()) {
                String name = resultset.getString(spaltenname);
                jcombobox.addItem(name);
                
            }
            return jcombobox;


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JComboBox_Vorlage: \n"+e);
            return null;
        }
        
        
    }
    
    public static void JComboBox_refreshen(JComboBox jcombo, java.lang.String sql_anweisung,java.lang.String spaltenname){
         try {
            jcombo.removeAll();
            ResultSet resultset = MySQL.mySQLResultSet_aus_Anweisung(sql_anweisung);
                       
            while (resultset.next()) {
                String name = resultset.getString(spaltenname);
                jcombo.addItem(name);
            }



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler beim updaten einer ComboBox: \n"+e);

        }
    }
    
}
