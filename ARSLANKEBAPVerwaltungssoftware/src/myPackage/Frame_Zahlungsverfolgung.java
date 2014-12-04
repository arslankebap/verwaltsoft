package myPackage;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Frame_Zahlungsverfolgung extends javax.swing.JInternalFrame {

    static int openFrameCount = 0;
    static int xOffset = 30, yOffset = 30;
    static ResultSet resultset;

    /**
     * Creates new form NewJInternalFrame_1
     */
    public Frame_Zahlungsverfolgung() {

        initComponents();
        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Desktop.desktopPane.add(this);
        if (openFrameCount == 7) {
            openFrameCount = 0;
        } else {
            openFrameCount++;
        }
        try {
            this.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

    }


    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = myPackage.Operationen_JComboBox.mitAnweisung("SELECT * FROM Kunden","Kundenname");
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        String standard_sql_jTable3 = "SELECT * FROM phpmyadmin.Zahlungsverfolgung WHERE 'OffenerBetrag'>'0.00';";
        jTable3 = myPackage.Operationen_JTable.JTable_erzeugen(standard_sql_jTable3);
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = myPackage.Operationen_JComboBox.mitAnweisung("SELECT * FROM phpmyadmin.Zahlungsverfolgung","Rechnungsnummer");
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = myPackage.Operationen_JLabel.summiereFloatsAusDBSpalte(standard_sql_jTable3,"Bruttorechnungsbetrag");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setText("jLabel8");

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zahlungsverfolgung");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Offene Rechnungen");

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Kunde:");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(500);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Zahlungseingänge");

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(153, 204, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )// Nicht editierbarkeit:

    );
    // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
    String standard_sql_jTable2 = "SELECT * FROM phpmyadmin.Zahlungsverfolgung_Teilzahlungen;";
    jTable2 = myPackage.Operationen_JTable.JTable_erzeugen(standard_sql_jTable2);
    jScrollPane3.setViewportView(jTable2);

    jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));
    jScrollPane4.setBorder(null);

    jTable3.setAutoCreateRowSorter(true);
    jTable3.setBackground(new java.awt.Color(204, 204, 204));
    jTable3.setName(""); // NOI18N
    jTable3.setShowGrid(true);
    // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
    jScrollPane4.setViewportView(jTable3);

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/bilder/plus-32-weiss.png"))); // NOI18N

    jTextField1.setBackground(new java.awt.Color(153, 153, 153));
    jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jTextField1.setForeground(java.awt.Color.white);
    jTextField1.setToolTipText("");
    jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    jTextField1.setCaretColor(new java.awt.Color(255, 153, 51));
    jTextField1.setDisabledTextColor(java.awt.Color.black);
    jTextField1.setFocusTraversalPolicyProvider(true);
    jTextField1.setSelectedTextColor(java.awt.Color.white);
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });

    jLabel11.setForeground(java.awt.Color.white);
    jLabel11.setText("RG-Nr:");

    jLabel12.setForeground(java.awt.Color.white);
    jLabel12.setText("RG-Betrag (brutto):");

    jTextField2.setBackground(new java.awt.Color(153, 153, 153));
    jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jTextField2.setForeground(java.awt.Color.white);
    jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    jTextField2.setCaretColor(new java.awt.Color(255, 153, 51));
    jTextField2.setDisabledTextColor(java.awt.Color.black);
    jTextField2.setFocusTraversalPolicyProvider(true);
    jTextField2.setInputVerifier(new InputVerifier2Nachkommastellen());
    jTextField2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField2ActionPerformed(evt);
        }
    });
    jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField2KeyTyped(evt);
        }
    });

    jLabel13.setForeground(java.awt.Color.white);
    jLabel13.setText("Gewicht 2:");

    jLabel14.setForeground(java.awt.Color.white);
    jLabel14.setText("Gewicht 3:");

    jLabel15.setForeground(java.awt.Color.white);
    jLabel15.setText("Gewicht 1:");

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/bilder/plus-32-weiss.png"))); // NOI18N
    jButton1.setBorderPainted(false);
    jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton1MouseClicked(evt);
        }
    });
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jLabel9.setForeground(java.awt.Color.white);
    jLabel9.setText("RG-Nr:");

    jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
    jComboBox2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jComboBox2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox2ActionPerformed(evt);
        }
    });

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/bilder/find-32-weiss.png"))); // NOI18N
    jButton2.setBorderPainted(false);
    jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
    jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/bilder/find-32.png"))); // NOI18N

    jTextField6.setBackground(new java.awt.Color(153, 153, 153));
    jTextField6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jTextField6.setForeground(java.awt.Color.white);
    jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    jTextField6.setCaretColor(new java.awt.Color(255, 153, 51));
    jTextField6.setDisabledTextColor(java.awt.Color.black);
    jTextField6.setFocusTraversalPolicyProvider(true);
    jTextField6.setInputVerifier(new InputVerifier2Nachkommastellen());
    jTextField6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField6ActionPerformed(evt);
        }
    });
    jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField6KeyTyped(evt);
        }
    });

    jTextField7.setBackground(new java.awt.Color(153, 153, 153));
    jTextField7.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jTextField7.setForeground(java.awt.Color.white);
    jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    jTextField7.setCaretColor(new java.awt.Color(255, 153, 51));
    jTextField7.setDisabledTextColor(java.awt.Color.black);
    jTextField7.setFocusTraversalPolicyProvider(true);
    jTextField7.setInputVerifier(new InputVerifier2Nachkommastellen());
    jTextField7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField7ActionPerformed(evt);
        }
    });
    jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField7KeyTyped(evt);
        }
    });

    jTextField8.setBackground(new java.awt.Color(153, 153, 153));
    jTextField8.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
    jTextField8.setForeground(java.awt.Color.white);
    jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    jTextField8.setCaretColor(new java.awt.Color(255, 153, 51));
    jTextField8.setDisabledTextColor(java.awt.Color.black);
    jTextField8.setFocusTraversalPolicyProvider(true);
    jTextField8.setInputVerifier(new InputVerifier2Nachkommastellen());
    jTextField8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField8ActionPerformed(evt);
        }
    });
    jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField8KeyTyped(evt);
        }
    });

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    jLabel3.setForeground(java.awt.Color.orange);
    jLabel3.setText("Summe RG-Beträge:");

    jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    jLabel5.setForeground(java.awt.Color.orange);
    jLabel5.setText("0.00");
    jLabel5.setToolTipText("");
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4))
                    .addGap(20, 20, 20))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel14)
                .addComponent(jLabel13)
                .addComponent(jLabel15)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(264, Short.MAX_VALUE))
    );

    pack();
    }//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //jTextField2.setInputVerifier(new InputVerifiers()); 
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_BACKSPACE || Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_BACKSPACE || Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_BACKSPACE || Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c = evt.getKeyChar();
        if (!(c == KeyEvent.VK_BACKSPACE || Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // Neuen Eintrag in die Tabelle 'Frame_Zahlungsverfolgung' nach Kontrolle auf Formatierung:
            if (InputVerifier2Nachkommastellen.verifizieren(jTextField2) && InputVerifier2Nachkommastellen.verifizieren(jTextField6) && InputVerifier2Nachkommastellen.verifizieren(jTextField7) && InputVerifier2Nachkommastellen.verifizieren(jTextField8)) {

                Connection conn1 = Operationen_MySQL.mySQLverbindung; // Unsere bestehende Verbindung aus Klasse Operationen_MySQL nutzen
                PreparedStatement mySQL_prepared_statement = conn1.prepareStatement("INSERT INTO phpmyadmin.Zahlungsverfolgung "
                        + "(Kundenname, Rechnungsnummer, Bruttorechnungsbetrag, OffenerBetrag, Gewicht1, Gewicht2, Gewicht3) "
                        + "VALUES (?,?,?,?,?,?,?)");

                mySQL_prepared_statement.setString(1, String.valueOf(jComboBox1.getSelectedItem()));
                mySQL_prepared_statement.setString(2, String.valueOf(jTextField1.getText()));
                mySQL_prepared_statement.setFloat(3, Float.parseFloat(jTextField2.getText()));
                mySQL_prepared_statement.setFloat(4, Float.parseFloat(jTextField2.getText())); // Doppelt, weil 'Offener Betrag' anfangs ja 'Bruttorechnungsbetrag' entspricht
                mySQL_prepared_statement.setFloat(5, Float.parseFloat(jTextField6.getText()));
                mySQL_prepared_statement.setFloat(6, Float.parseFloat(jTextField7.getText()));
                mySQL_prepared_statement.setFloat(7, Float.parseFloat(jTextField8.getText()));

                mySQL_prepared_statement.execute();

                // Betroffene Komponenten aktualisieren oder leeren
                Operationen_JTable.refreshen(jTable3, "SELECT * FROM phpmyadmin.Zahlungsverfolgung WHERE 'OffenerBetrag' > '0.00';");
//                Operationen_JTable.refreshen(jTable3, "SELECT * FROM phpmyadmin.Zahlungsverfolgung WHERE 'OffenerBetrag' > '0.00';");
//                jScrollPane4.setViewportView(jTable3);
                Operationen_JComboBox.refreshen(jComboBox2, "SELECT * FROM phpmyadmin.Zahlungsverfolgung", "Rechnungsnummer");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                JOptionPane.showMessageDialog(null, "Offene Rechnung erfolgreich in Netzwerkdatenbank eingetragen!", 
                                              "ARSLAN KEBAP DATENBANK", JOptionPane.INFORMATION_MESSAGE, 
                                              new ImageIcon(getClass().getResource("/myPackage/bilder/Netzwerkserver-128.png")));
//                Fehlgeschlagener Versuch alle Komponenten auf einmal zu "refreshen" (ohne refresh-Methoden nutzen zu müssen):
//                SwingUtilities.updateComponentTreeUI(this);
//                Runnable runnable = new Runnable() {public void run() {initComponents();}};
//                runnable.run();
//                this.invalidate();
//                this.validate();
//                this.revalidate();
//                this.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Eingaben kontrollieren!");
            }

        } catch (MySQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Eine Rechnung mit dieser Rechnungsnummer wurde bereits eingetragen.");
            jTextField1.setText(""); // Fehlerhaftes Textfeld leeren
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
