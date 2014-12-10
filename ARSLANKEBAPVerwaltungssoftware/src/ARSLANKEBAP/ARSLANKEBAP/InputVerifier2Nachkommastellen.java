/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSLANKEBAP;

import java.math.BigDecimal;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author SEAMAC
 */
public class InputVerifier2Nachkommastellen extends InputVerifier {

    public InputVerifier2Nachkommastellen() {
        super();
    }

    @Override
    public boolean verify(JComponent inputfield) {
        String text = ((JTextComponent) inputfield).getText();
        try {
            BigDecimal value = new BigDecimal(text);
            return (value.scale() <= Math.abs(2));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean verifizieren(JComponent inputfield) {
        String text = ((JTextComponent) inputfield).getText();
        try {
            BigDecimal value = new BigDecimal(text);
            return (value.scale() <= Math.abs(2));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean shouldYieldFocus(JComponent input) {
        //Text je nach Ergebnis färben:
        if (!getInstance().verify(input)) {

            input.setForeground(java.awt.Color.RED);
            return false;
        } else {
            input.setForeground(java.awt.Color.WHITE);
            return true;
        }
    }

    private static InputVerifier2Nachkommastellen instanz;

    public static synchronized InputVerifier2Nachkommastellen getInstance() {
        if (InputVerifier2Nachkommastellen.instanz == null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    InputVerifier2Nachkommastellen.instanz = new InputVerifier2Nachkommastellen();

                }
            });
            System.out.println("InputVerifier2Nachkommastellen-Thread erstellt");
            return InputVerifier2Nachkommastellen.instanz;
        }

        return InputVerifier2Nachkommastellen.instanz;
    }

}
