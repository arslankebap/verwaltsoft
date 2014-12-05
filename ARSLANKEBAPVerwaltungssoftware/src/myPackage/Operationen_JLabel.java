/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SEAMAC
 */
public class Operationen_JLabel extends JLabel {
    /*
     VORSICHT: Text in JLabels ist nicht markierbar! Falls diese Funktionalität gewünscht ist: 
     In Operationen_JTextField habe ich fast identische Methoden eingebaut.
     */

    public static JLabel summiereDBSpalte(String sql_anweisung, String spaltenname) {
        /*  Vorsicht: Da meine meisten Gewichts- und Geldbetragsspalten aus verschiedensten Gründen in der MySQL-DB 
         das Format DECIMAL(10,2) haben, muss bei der Nutzung in Java BigDecimal verwendet werden. BigDecimal hat 
         jedoch einige Eigenheiten, daher ist ein einfaches addieren oder adden zweier BigDecimals nicht möglich.
         */

        JLabel jlabel = new JLabel();
        BigDecimal nullwert = BigDecimal.ZERO;
        Double summe = 0.00;

        try {
            ResultSet resultset = Operationen_MySQL.ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                BigDecimal zwischenwert = nullwert.add(resultset.getBigDecimal(spaltenname));
                summe += zwischenwert.doubleValue();
            }

            jlabel.setText(new DecimalFormat("#.##").format(summe));

            return jlabel;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in JLabel_Vorlage.summiereFloatsAusDBSpalte(): \n" + e);
            return null;
        }
    }

    public static void refreshen(JLabel label, String sql_anweisung, String spaltenname) {
        /*  Vorsicht: Da meine meisten Gewichts- und Geldbetragsspalten aus verschiedensten Gründen in der MySQL-DB 
         das Format DECIMAL(10,2) haben, muss bei der Nutzung in Java BigDecimal verwendet werden. BigDecimal hat 
         jedoch einige Eigenheiten, daher ist ein einfaches addieren oder adden zweier BigDecimals nicht möglich.
         */

        BigDecimal nullwert = BigDecimal.ZERO;
        Double summe = 0.00;

        try {
            ResultSet resultset = Operationen_MySQL.ResultSet_aus_Anweisung(sql_anweisung);
            while (resultset.next()) {
                BigDecimal zwischenwert = nullwert.add(resultset.getBigDecimal(spaltenname));
                summe += zwischenwert.doubleValue();
            }
            if (spaltenname.contains("betrag") || spaltenname.contains("Betrag")) {
                label.setText(new DecimalFormat("#.##").format(summe) + " EUR");
            } else {
                label.setText(new DecimalFormat("#.##").format(summe) + " kg");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler in Operationen_JLabel.refreshen(): \n" + e);

        }
    }
}
