package myPackage;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Operationen_MySQL {

    static Connection mySQLverbindung;
    static PreparedStatement mySQL_prepared_statement = null;
    static String ip = "192.168.179.71";
    static String db = "phpmyadmin";
    static String user = "root";
    static String pw = "a123456n";

    public static void AnweisungSenden(String sql_anweisung) {
        try {
            mySQLverbindung = Operationen_MySQL.VerbindungAufbauen();
            PreparedStatement mySQL_prepared_statement = mySQLverbindung.prepareStatement(sql_anweisung);
            mySQL_prepared_statement.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operationen_MySQL.AnweisungSenden() nicht richtig ausgefuehrt:\n" + e);
        }
    
    }

    public static Connection VerbindungAufbauen() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            mySQLverbindung = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + user + "&password=" + pw);
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            //return mySQLverbindung;
            return mySQLverbindung;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datenbankverbindung nicht moeglich:\n" + e);
            return null;
        }
    }

    //Falls mal aus irgeneinem Grund schnell eine alternative IP etc. gebraucht wird:
    public static Connection VerbindungAufbauen(String ip, String db, String user, String pw) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            mySQLverbindung = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + user + "&password=" + pw);
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            return mySQLverbindung;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            JOptionPane.showMessageDialog(null, "mySQLVerbindungAufbauen(2.Konstruktor):\n" + ex);
            return null;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | HeadlessException e) {
            System.out.println("Verbindung zu Datenbankserver fehlgeschlagen:\n" + e);
            return null;
        }
    }

    public static void VerbindungBeenden() {
        try {

            mySQLverbindung.close();
            mySQL_prepared_statement.close();

            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            //return mySQLverbindung;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mySQLVerbindungBeenden: \n" + e);
        }
    }

    public static ResultSet ResultSet_aus_Anweisung(String sql_anweisung) {
        try {
            mySQLverbindung = Operationen_MySQL.VerbindungAufbauen();
            PreparedStatement ps = mySQLverbindung.prepareStatement(sql_anweisung);
            ResultSet mySQLresultset = ps.executeQuery();
            return mySQLresultset;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mySQLResultSet_aus_Anweisung: \n" + e);
            return null;
        }
    }

}