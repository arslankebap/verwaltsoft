package ARSLANKEBAP;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


// Vorsicht! Instanzieren mit Operationen_MySQL.getInstance(); 
// Und Methoden immer so verwenden: Operationen_MySQL.getInstance().methodenname(...)
public class Operationen_MySQL {
 
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String ip = "192.168.179.71";
    static String db = "phpmyadmin";
    static String user = "root";
    static String pw = "a123456n";

    public static void AnweisungSenden(String sql_anweisung) {
        try {
            conn = Operationen_MySQL.getInstance().VerbindungAufbauen();
            PreparedStatement mySQL_prepared_statement = conn.prepareStatement(sql_anweisung);
            mySQL_prepared_statement.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operationen_MySQL.AnweisungSenden() nicht richtig ausgefuehrt:\n" + e);
        }

    }

    public static Connection VerbindungAufbauen() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + user + "&password=" + pw);
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            //return conn;
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datenbankverbindung nicht moeglich:\n" + e);
            return null;
        }
    }

    //Falls mal aus irgeneinem Grund schnell eine alternative IP etc. gebraucht wird:
    public static Connection VerbindungAufbauen(String ip, String db, String user, String pw) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + user + "&password=" + pw);
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            return conn;
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
            // Reihenfolge wichtig!! Nicht ändern!!
            rs.close();
            ps.close();
            conn.close();

            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            //return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mySQLVerbindungBeenden: \n" + e);
        }
    }

    public static ResultSet ResultSet_aus_Anweisung(String sql_anweisung) {
        try {
            conn = Operationen_MySQL.getInstance().VerbindungAufbauen();
            PreparedStatement ps = conn.prepareStatement(sql_anweisung);
            rs = ps.executeQuery();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mySQLResultSet_aus_Anweisung: \n" + e);
            return null;
        }

    }
    

    static Operationen_MySQL instanz;
    public static synchronized Operationen_MySQL getInstance() {
        if(Operationen_MySQL.instanz == null){
            System.out.println("Operationen_MySQL-Thread erstellt");
            Operationen_MySQL.instanz = new Operationen_MySQL();
            return Operationen_MySQL.instanz;            
        }
    
        return Operationen_MySQL.instanz;
    }
    
}
