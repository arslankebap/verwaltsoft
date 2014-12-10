/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSLANKEBAP;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertiesFile {

    //Standardconfig:
    public WritePropertiesFile() {
        try {
            Properties properties = new Properties();
            properties.setProperty("DB_ip", "192.168.179.71");
            properties.setProperty("DB_db", "phpmyadmin");
            properties.setProperty("DB_user", "root");
            properties.setProperty("DB_pw", "a123456n");

            File file = new File("ARSLANKEBAP.properties");
            FileOutputStream fileOut = new FileOutputStream(file);
            properties.store(fileOut, "Properties zu ARSLANKEBAP");
            fileOut.close();
            instanz = null;

        } catch (Exception e) {
            instanz = null;
        }

    }
    
    // Properties verändern:
    public WritePropertiesFile(String ip, String db, String user, String pw) {
        try {
            Properties properties = new Properties();
            properties.setProperty("DB_ip", ip);
            properties.setProperty("DB_db", db);
            properties.setProperty("DB_user", user);
            properties.setProperty("DB_pw", pw);

            File file = new File("ARSLANKEBAP.properties");
            FileOutputStream fileOut = new FileOutputStream(file);
            properties.store(fileOut, "Properties zu ARSLANKEBAP");
            fileOut.close();
            instanz_2 = null;
        } catch (Exception e) {
            e.printStackTrace();
            instanz = null;
        }
    }

    private static WritePropertiesFile instanz;
    private static WritePropertiesFile instanz_2;

    public static synchronized WritePropertiesFile getInstance() {
        if (WritePropertiesFile.instanz == null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    WritePropertiesFile.instanz = new WritePropertiesFile();

                }
            });
            System.out.println("WritePropertiesFile-Thread erstellt");
            return WritePropertiesFile.instanz;
        }

        return WritePropertiesFile.instanz;
    }

        public static synchronized WritePropertiesFile getInstance(String ip, String db, String user, String pw) {
        if (WritePropertiesFile.instanz_2 == null) {            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    WritePropertiesFile.instanz_2 = new WritePropertiesFile(ip, db, user, pw);

                }
            });
            System.out.println("WritePropertiesFile-Thread erstellt");

            
            return WritePropertiesFile.instanz_2;
        }

        return WritePropertiesFile.instanz_2;

    }
    
}
