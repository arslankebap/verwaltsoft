/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSLANKEBAP;

import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author SEAMAC
 */
public class Export_XLS {

    static void export(JTable table, Path path) throws FileNotFoundException, IOException {

        Workbook wb = new HSSFWorkbook(); //Excell workbook
        Sheet sheet = (Sheet) (wb.createSheet()); //WorkSheet
        Row row = sheet.createRow(2); //Row created at line 3
        TableModel model = table.getModel(); //Table model

        Row headerRow = sheet.createRow(2); //Create row at line 0
        for (int headings = 0; headings < model.getColumnCount(); headings++) { //For each column
            headerRow.createCell(headings).setCellValue(model.getColumnName(headings));//Write column name
        }

        for (int rows = 0; rows < model.getRowCount(); rows++) { //For each table row
            for (int cols = 0; cols < table.getColumnCount(); cols++) { //For each table column
                row.createCell(cols).setCellValue(model.getValueAt(rows, cols).toString()); //Write value
            }

            //Set the row to the next one in the sequence 
            row = sheet.createRow((rows + 3));
        }
        wb.write(new FileOutputStream(path.toString()));//Save the file     
    }
    
        static Export_XLS instanz;
    public static synchronized Export_XLS getInstance() {
        if(Export_XLS.instanz == null){
            System.out.println("Export_XLS-Thread erstellt");
            Export_XLS.instanz = new Export_XLS();
            return Export_XLS.instanz;            
        }
    
        return Export_XLS.instanz;
    }
    
}

