package myPackage;
public class Produktion extends javax.swing.JInternalFrame {

    static int openFrameCount = 0;
    static int xOffset= 30, yOffset= 30;

    
    
    /** Creates new form NewJInternalFrame_1 */
    public Produktion() {
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Willkommen im Auswahlmenü");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        pack();
    }//GEN-END:initComponents

    /* VORSICHT: BITTE ALLE VARIABLEN bzw. OBJEKTE ALS NULL / NICHT INSTANZIERT HIER DEFINIEREN 
     * DAMIT GARBAGECOLLECTOR LÖSCHT, FALLS JINTERNALFRAME-ERSTELLUNG VON MIR TEILWEISE BLOCKIERT WURDE
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
