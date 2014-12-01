package myPackage;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SEAMAC
 */
public class mySQLVerbindungAufbauen {
        
        static Connection mySQLverbindung = null;
        
        public static Connection mySQLVerbindungAufbauen(String ip, String db, String user, String pw) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            mySQLverbindung = DriverManager.getConnection("jdbc:mysql://"+ip+"/"+db+"?user="+user+"&password="+pw);
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            return mySQLverbindung;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver fehlgeschlagen:\n" + ex);
            return null;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | HeadlessException e) {
            System.out.println("Verbindung zu Datenbankserver fehlgeschlagen:\n" + e);
            return null;
        }

    }
}
