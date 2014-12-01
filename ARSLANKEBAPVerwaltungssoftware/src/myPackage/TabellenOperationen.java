package myPackage;



import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SEAMAC
 */
public class TabellenOperationen {

    static Connection mySQLverbindung = mySQLVerbindungAufbauen.mySQLVerbindungAufbauen("192.168.179.71","phpmyadmin","root","a123456n");
    static PreparedStatement mySQL_prepared_statement;
    static ResultSet mySQLresultset;
    
    public static void JTable_refreshen(JTable JTabelle, String sql_anweisung) {
        try {
            mySQL_prepared_statement = mySQLverbindung.prepareStatement(sql_anweisung);
            mySQLresultset = mySQL_prepared_statement.executeQuery();
            JTabelle.setModel(DbUtils.resultSetToTableModel(mySQLresultset));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tabelle " + JTabelle + " konnte nicht refreshed werden:\n" + e);
        }
    }

    public static JFrame JTableJFrame_erzeugen(String NameDerSQLTabelle, String SQL_anweisung, int preferred_width, int preferred_height) {
        JFrame myWindow = new JFrame(NameDerSQLTabelle);
        JScrollPane jSPane = JTableJScrollPane_erzeugen(NameDerSQLTabelle, SQL_anweisung);

        // if sorgt hier dafür, dass altes Fenster geschlossen und neues erstellt wird
        if (myWindow != null) {
            myWindow.setEnabled(false);
            myWindow.setVisible(false);
            myWindow.removeAll();
            myWindow = null;

        }

        myWindow = new JFrame(NameDerSQLTabelle);
        //myWindow.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        myWindow.setLayout(new BorderLayout());
        // Reihenfolge zw. setLocation und setSize ist wichtig! Sonst wird JFrame erst ab Displaymitte vergroessert
        myWindow.setSize(preferred_width, preferred_height);
        myWindow.setResizable(true);
        myWindow.setUndecorated(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.add(jSPane, BorderLayout.CENTER);
        myWindow.setTitle(NameDerSQLTabelle);

        myWindow.validate();
        myWindow.pack();

        myWindow.setVisible(true);
        return myWindow;

    }


        // Man muss die JScrollPane nur zu einem JFrame adden und schon hat man eine Fenster welches die mySQL-Tabelle anzeigt:
        public static JScrollPane JTableJScrollPane_erzeugen(String NameDerSQLTabelle, String SQL_anweisung) {
        JScrollPane jSPane = new JScrollPane();
        JTable JTabelle1 = new JTable();
        JTabelle1.setAutoCreateRowSorter(true);
        JTabelle1.setModel(new javax.swing.table.DefaultTableModel());
        JTabelle1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        JTabelle1.setPreferredSize(null);
        JTabelle1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JTabelle1.setColumnSelectionAllowed(true);
        JTabelle1.setRowSelectionAllowed(true);
        JTabelle1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); //Vorsicht: bei JScrollPanel muss setLAyout immer mitgeändert werden
        //JTabelle einen Namen zuweisen, damit wir schnell auf den String des Namens zugreifen können:
        JTabelle1.setName(NameDerSQLTabelle);
        JTabelle1.setAutoCreateRowSorter(true);
        JTabelle1.setSelectionBackground(new java.awt.Color(51, 153, 255));
        JTabelle1.setShowGrid(true);
        JTabelle1.getTableHeader().setReorderingAllowed(true);
        JTabelle1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JTabelle1.setColumnSelectionAllowed(true);
        JTabelle1.setRowSelectionAllowed(true);
        JTabelle1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); //Vorsicht: bei JScrollPanel muss setLAyout immer mitgeändert werden
        jSPane.setViewportView(JTabelle1);
        // JTable mit SQL-Anweisung refreshen:
        jSPane.setViewportView(JTabelle1);
        JTable_refreshen(JTabelle1, SQL_anweisung);
        //myWindow.setPreferredSize(new Dimension(preferred_width, preferred_height));
        return jSPane;
    }
    
}
