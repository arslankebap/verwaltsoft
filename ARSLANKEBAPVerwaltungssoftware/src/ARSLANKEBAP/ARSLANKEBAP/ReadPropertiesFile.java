/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSLANKEBAP;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    
    public ReadPropertiesFile() {
        try {
            File file = new File("ARSLANKEBAP.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            //Ausgabe aller Keys der Properties-Datei:
//            Enumeration enuKeys = properties.keys();
//            while (enuKeys.hasMoreElements()) {
//                System.out.println("ReadPropertiesFile Test 3");
//                String key = (String) enuKeys.nextElement();
//                String value = properties.getProperty(key);
//                System.out.println(key + ": " + value);
//            }
            System.out.println("Erfolgreich ARSLANKEBAP.properties gelesen.\nReadPropertiesFile.getInstance().properties.getProperty(keyname)\nnutzen um keys abzurufen.");
            
        } catch (Exception e) {
            System.out.println("Das Lesen von ARSLANKEBAP.properties ist fehlgeschlagen.\n"
                             + "Es wird eine neue Properties-Datei mit Standardwerten erstellt.");
            WritePropertiesFile.getInstance(); // Schreiben der Properties-Datei
            ReadPropertiesFile.getInstance();
            System.out.println("ARSLANKEBAP.properties neu erzeugt und gelesen.");
        }

    }
    
    String getProperty(String prop){
        try {
            File file = new File("ARSLANKEBAP.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();        
            System.out.println("ARSLANKEBAP.properties wurde nach Key " + prop +" abgefragt.");
            return properties.getProperty(prop);
        }catch(Exception e) {
            
            return "Fehler bei getProperty von ReadPropertiesFile";
        }
    }

    private static ReadPropertiesFile instanz;

    public static synchronized ReadPropertiesFile getInstance() {
        if (ReadPropertiesFile.instanz == null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    ReadPropertiesFile.instanz = new ReadPropertiesFile();

                }
            });
            System.out.println("ReadPropertiesFile-Thread erstellt");
            return ReadPropertiesFile.instanz;
        }

        return ReadPropertiesFile.instanz;
    }

}
