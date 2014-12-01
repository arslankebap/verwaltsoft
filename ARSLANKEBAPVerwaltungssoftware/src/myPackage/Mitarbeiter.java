package myPackage;
public class Mitarbeiter extends javax.swing.JInternalFrame {

    static int openFrameCount = 0;
    static int xOffset= 30, yOffset= 30;

    
    
    /** Creates new form NewJInternalFrame_1 */
    public Mitarbeiter() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("phpmyadmin?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        mitarbeiter_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Mitarbeiter_1 m");
        mitarbeiter_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mitarbeiter_1Query.getResultList();
        mitarbeiter_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Mitarbeiter_1 m");
        mitarbeiter_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : mitarbeiter_1Query1.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Personalverwaltung");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mitarbeiter_1List1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dateiordner}"));
        columnBinding.setColumnName("Dateiordner");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentenversicherungsnummer}"));
        columnBinding.setColumnName("Rentenversicherungsnummer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${krankenversicherungsnummer}"));
        columnBinding.setColumnName("Krankenversicherungsnummer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${krankenversicherung}"));
        columnBinding.setColumnName("Krankenversicherung");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${austritt}"));
        columnBinding.setColumnName("Austritt");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${eintritt}"));
        columnBinding.setColumnName("Eintritt");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${iban}"));
        columnBinding.setColumnName("Iban");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nationalitaet}"));
        columnBinding.setColumnName("Nationalitaet");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${geburtsort}"));
        columnBinding.setColumnName("Geburtsort");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${geburtstag}"));
        columnBinding.setColumnName("Geburtstag");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mobiltelefon}"));
        columnBinding.setColumnName("Mobiltelefon");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefonnummer}"));
        columnBinding.setColumnName("Telefonnummer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${wohnort}"));
        columnBinding.setColumnName("Wohnort");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${plz}"));
        columnBinding.setColumnName("Plz");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${adresszusatz}"));
        columnBinding.setColumnName("Adresszusatz");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hausnummer}"));
        columnBinding.setColumnName("Hausnummer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${strasse}"));
        columnBinding.setColumnName("Strasse");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vornamen}"));
        columnBinding.setColumnName("Vornamen");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nachname}"));
        columnBinding.setColumnName("Nachname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMitarbeiter}"));
        columnBinding.setColumnName("Id Mitarbeiter");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 212, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }//GEN-END:initComponents

    /* VORSICHT: BITTE ALLE VARIABLEN bzw. OBJEKTE ALS NULL / NICHT INSTANZIERT HIER DEFINIEREN 
     * DAMIT GARBAGECOLLECTOR LÖSCHT, FALLS JINTERNALFRAME-ERSTELLUNG VON MIR TEILWEISE BLOCKIERT WURDE
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<myPackage.Mitarbeiter_1> mitarbeiter_1List;
    private java.util.List<myPackage.Mitarbeiter_1> mitarbeiter_1List1;
    private javax.persistence.Query mitarbeiter_1Query;
    private javax.persistence.Query mitarbeiter_1Query1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
