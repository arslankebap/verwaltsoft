package myPackage;
public class KundenFrame extends javax.swing.JInternalFrame {

    static int openFrameCount = 0;
    static int xOffset= 30, yOffset= 30;

    
    
    /** Creates new form NewJInternalFrame_1 */
    public KundenFrame() {
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Kundenverwaltung");

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
        jTable1 = Tabellenoperationen.JTable_erzeugen("SELECT * FROM phpmyadmin.Kunden;");
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Kundenliste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    /* VORSICHT: BITTE ALLE VARIABLEN bzw. OBJEKTE ALS NULL / NICHT INSTANZIERT HIER DEFINIEREN 
     * DAMIT GARBAGECOLLECTOR LÖSCHT, FALLS JINTERNALFRAME-ERSTELLUNG VON MIR TEILWEISE BLOCKIERT WURDE
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
