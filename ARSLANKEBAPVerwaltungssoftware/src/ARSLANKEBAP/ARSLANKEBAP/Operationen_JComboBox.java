/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSLANKEBAP;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author SEAMAC
 */
public class Operationen_JComboBox {

        
        
    public static JComboBox mitAnweisung(java.lang.String sql_anweisung,java.lang.String spaltenname){
            JComboBox jcombobox = new JComboBox();
        try {
            ResultSet resultset = Operationen_MySQL.getInstance().ResultSet_aus_Anweisung(sql_anweisung);
            
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
    
    public static void refreshen(JComboBox jcombo, java.lang.String sql_anweisung,java.lang.String spaltenname){
         try {
            jcombo.removeAllItems();
            ResultSet resultset = Operationen_MySQL.getInstance().ResultSet_aus_Anweisung(sql_anweisung);
            
            
            while (resultset.next()) {
                String name = resultset.getString(spaltenname);
                jcombo.addItem(name);
            }
            jcombo.validate();
            jcombo.repaint();


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler beim updaten einer ComboBox: \n"+e);

        }
    }
    
        static Operationen_JComboBox instanz;
    public static synchronized Operationen_JComboBox getInstance() {
        if(Operationen_JComboBox.instanz == null){
            System.out.println("Operationen_JComboBox-Thread erstellt");
            Operationen_JComboBox.instanz = new Operationen_JComboBox();
            return Operationen_JComboBox.instanz;            
        }
    
        return Operationen_JComboBox.instanz;
    }
    
}
