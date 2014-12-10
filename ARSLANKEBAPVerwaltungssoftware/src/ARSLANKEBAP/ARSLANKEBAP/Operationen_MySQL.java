package ARSLANKEBAP;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// Vorsicht! Instanzieren mit Operationen_MySQL.getInstance(); 
// Und Methoden immer so verwenden: Operationen_MySQL.getInstance().methodenname(...)
public class Operationen_MySQL {

    protected static Connection conn;
    
    private String ip = ReadPropertiesFile.getInstance().getProperty("DB_ip");
    private String db = ReadPropertiesFile.getInstance().getProperty("DB_db");
    private String user = ReadPropertiesFile.getInstance().getProperty("DB_user");
    private String pw = ReadPropertiesFile.getInstance().getProperty("DB_pw");


    
    public static void AnweisungSenden(String sql_anweisung) throws SQLException {
        try {
            if (conn == null) conn = Operationen_MySQL.getInstance().VerbindungAufbauen();
            PreparedStatement mySQL_prepared_statement = conn.prepareStatement(sql_anweisung);
            mySQL_prepared_statement.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operationen_MySQL.AnweisungSenden() nicht richtig ausgefuehrt:\n" + e);

        }

    }

    public Connection VerbindungAufbauen() {
        try {
            
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + user + "&password=" + pw);
            }
            //JOptionPane.showMessageDialog(null, "Verbindung zu Datenbankserver aufgebaut");
            //return conn;
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datenbankverbindung nicht moeglich:\n" + e);
            return null;
        }
    }

       public Connection VerbindungAufbauen(String ip2, String db2, String user2, String pw2) {
        try {

            
            if (conn == null) Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://" + ip2 + "/" + db2 + "?user=" + user2 + "&password=" + pw2);

            if (conn2 == null) {
                JOptionPane.showMessageDialog(null, "Datenbankverbindung nicht moeglich! Bitte Daten korrigieren!\n");
                return null;
            }
            
            this.ip = ip2;
            this.db = db2;
            this.user = user2;
            this.pw = pw2;
            JOptionPane.showMessageDialog(null, "Datenbankverbindung aufgebaut!");
            if (conn != null) conn.close();
            conn = conn2;
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Datenbankverbindung nicht moeglich:\n" + e);
            return null;
        }
    }


    public static ResultSet ResultSet_aus_Anweisung(String sql_anweisung) {
        try {
            if (conn == null) conn = Operationen_MySQL.getInstance().VerbindungAufbauen();
            PreparedStatement ps = conn.prepareStatement(sql_anweisung);
            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mySQLResultSet_aus_Anweisung: \n" + e);
            return null;
        }

    }

    private static Operationen_MySQL instanz;

    public static synchronized Operationen_MySQL getInstance() {
        if (Operationen_MySQL.instanz == null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Operationen_MySQL.instanz = new Operationen_MySQL();

                }
            });
            System.out.println("Operationen_MySQL-Thread erstellt");
            return Operationen_MySQL.instanz;
        }

        return Operationen_MySQL.instanz;
    }

}
