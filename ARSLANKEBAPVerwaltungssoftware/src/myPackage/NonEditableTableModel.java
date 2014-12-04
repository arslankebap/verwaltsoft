package myPackage;

import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class NonEditableTableModel extends DefaultTableModel {

/*
    Ich krieg es bei den JTables irgendwie nicht zum laufen......
    Sie bleiben editierbar oder sie werden garnicht angezeigt.
*/
    
    NonEditableTableModel(Object[][] data, String[] columnNames) {
        super(data, columnNames);
    }

    NonEditableTableModel() {
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}