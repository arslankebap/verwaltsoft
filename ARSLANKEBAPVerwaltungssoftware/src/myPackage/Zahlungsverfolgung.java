package myPackage;
public class Zahlungsverfolgung extends javax.swing.JInternalFrame {

    static int openFrameCount = 0;
    static int xOffset= 30, yOffset= 30;

    
    
    /** Creates new form NewJInternalFrame_1 */
    public Zahlungsverfolgung() {
            initComponents();
            setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            Desktop.desktopPane.add(this);
            if(openFrameCount == 7) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Zahlungsverfolgung_JTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zahlungsverfolgung");

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setOpaque(false);

        Zahlungsverfolgung_JTable1.setBackground(java.awt.Color.lightGray);
        Zahlungsverfolgung_JTable1.setForeground(java.awt.Color.darkGray);
        Zahlungsverfolgung_JTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        Zahlungsverfolgung_JTable1.setToolTipText("Dies ist die Tabelle in die man offene Rechnungen einträgt.");
        Zahlungsverfolgung_JTable1.setFillsViewportHeight(true);
        Zahlungsverfolgung_JTable1.setOpaque(false);
        Zahlungsverfolgung_JTable1.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Zahlungsverfolgung_JTable1.setShowGrid(true);
        TabellenOperationen.JTable_refreshen(Zahlungsverfolgung_JTable1, "SELECT * FROM phpmyadmin.Zahlungsverfolgung WHERE 'Offener Bruttobetrag'>= 0.00;");
        jScrollPane1.setViewportView(Zahlungsverfolgung_JTable1);

        jButton1.setText("Nur heutige Anzeigen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Offene Rechnungen");

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Kundenname:");

        jLabel3.setText("Suche/Filterknopf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(481, 481, 481))
        );

        pack();
    }//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /* VORSICHT: BITTE ALLE VARIABLEN bzw. OBJEKTE ALS NULL / NICHT INSTANZIERT HIER DEFINIEREN 
     * DAMIT GARBAGECOLLECTOR LÖSCHT, FALLS JINTERNALFRAME-ERSTELLUNG VON MIR TEILWEISE BLOCKIERT WURDE
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Zahlungsverfolgung_JTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
