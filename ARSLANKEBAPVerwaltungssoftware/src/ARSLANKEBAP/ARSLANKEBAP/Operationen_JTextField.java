package ARSLANKEBAP;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author SEAMAC
 */
public class Operationen_JTextField extends JTextField {
    /*
    VORSICHT: Text in JLabels ist nicht markierbar! Falls diese Funktionalität gewünscht ist: 
    In Operationen_JTextField habe ich fast identische Methoden eingebaut.
    */
    
    public static JTextField summiereDBSpalte(String sql_anweisung, String spaltenname) {
        /*  Vorsicht: Da meine meisten Gewichts- und Geldbetragsspalten aus verschiedensten Gründen in der MySQL-DB 
         das Format DECIMAL(10,2) haben, muss bei der Nutzung in Java BigDecimal verwendet werden. BigDecimal hat 
         jedoch einige Eigenheiten, daher ist ein einfaches addieren oder adden zweier BigDecimals nicht möglich.
         */

        JTextField jtextfield = new JTextField();
        BigDecimal nullwert = BigDecimal.ZERO;
        Double summe = 0.00;

        try {
            ResultSet resultset = Operationen_MySQL.getInstance().ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                BigDecimal zwischenwert = nullwert.add(resultset.getBigDecimal(spaltenname));
                summe += zwischenwert.doubleValue();
            }

            jtextfield.setText(new DecimalFormat("#.##").format(summe));
            
            return jtextfield;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JLabel_Vorlage.summiereDBSpalte(): \n" + e);
            return null;
        }
    }
    
    public static JTextField summiereNonDBSpalte(JTable jtable1, int spalte){
        JTextField jtextfield = new JTextField();
        BigDecimal nullwert = BigDecimal.ZERO;
        BigDecimal summe = BigDecimal.ZERO;

        try {
            
            for (int i = 0, rows = jtable1.getRowCount(); i < rows; i++){
                BigDecimal zwischenwert = nullwert.add((BigDecimal) jtable1.getValueAt(i, spalte));  
                summe = summe.add(zwischenwert);  
            }  
            
            jtextfield.setText(new DecimalFormat("#.##").format(summe));
            
            return jtextfield;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JLabel_Vorlage.summiereNonDBSpalte(): \n" + e);
            return null;
        }
    }
    
    public static void refreshen(JTextField textfeld, String sql_anweisung, String spaltenname) { 
        /*  Vorsicht: Da meine meisten Gewichts- und Geldbetragsspalten aus verschiedensten Gründen in der MySQL-DB 
         das Format DECIMAL(10,2) haben, muss bei der Nutzung in Java BigDecimal verwendet werden. BigDecimal hat 
         jedoch einige Eigenheiten, daher ist ein einfaches addieren oder adden zweier BigDecimals nicht möglich.
         */

        BigDecimal nullwert = BigDecimal.ZERO;
        Double summe = 0.00;

        try {
            ResultSet resultset = Operationen_MySQL.getInstance().ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                BigDecimal zwischenwert = nullwert.add(resultset.getBigDecimal(spaltenname));
                summe += zwischenwert.doubleValue();
            }
            textfeld.setText(new DecimalFormat("#.##").format(summe));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in Operationen_JLabel.refreshen(): \n" + e);

        }
    }
    
    public static void refreshen(JTable jtable1, JTextField jtextfield, int spalte){
        BigDecimal nullwert = BigDecimal.ZERO;
        BigDecimal summe = BigDecimal.ZERO;

        try {
            
            for (int i = 0, rows = jtable1.getRowCount(); i < rows; i++){
                BigDecimal zwischenwert = nullwert.add((BigDecimal) jtable1.getValueAt(i, spalte));  
                summe = summe.add(zwischenwert);  
            }  
            
            jtextfield.setText(new DecimalFormat("#.##").format(summe));
           
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private static Operationen_JTextField instanz;
    public static synchronized Operationen_JTextField getInstance() {
        if(Operationen_JTextField.instanz == null){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Operationen_JTextField.instanz = new Operationen_JTextField();

                }
            });
            System.out.println("Operationen_JTextField-Thread erstellt");
            return Operationen_JTextField.instanz;            
        }
    
        return Operationen_JTextField.instanz;
    }
}
