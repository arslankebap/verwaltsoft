/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.math.BigDecimal;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author SEAMAC
 */
public class InputVerifiers extends InputVerifier{
    
    
    public boolean verify(JComponent inputfield) {
        String text = ((JTextField) inputfield).getText();
        try {
            BigDecimal value = new BigDecimal(text);
            return (value.scale() <= Math.abs(4)); 
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

