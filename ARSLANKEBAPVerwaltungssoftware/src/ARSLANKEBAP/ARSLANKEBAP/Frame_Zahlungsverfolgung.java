package ARSLANKEBAP;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.sun.glass.events.KeyEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

// Vorsicht! Instanzieren mit Frame_Zahlungsverfolgung.getInstance(); 
// Und Methoden immer so verwenden: Frame_Zahlungsverfolgung.getInstance().methodenname(...)
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
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = ARSLANKEBAP.Operationen_JComboBox.getInstance().mitAnweisung("SELECT * FROM Kunden","Kundenname");
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = ARSLANKEBAP.Operationen_JTable.getInstance().JTable_erzeugen(standard_ansicht_jTable3);
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereNonDBSpalte(jTable3,2);
        jTextField4 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable3,spaltenname_summenfeld_jTextField4);
        jTextField5 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable3,spaltenname_summenfeld_jTextField5);
        jTextField9 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable3,spaltenname_summenfeld_jTextField9);
        jTextField10 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable3,spaltenname_summenfeld_jTextField10);
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new JTextField(String.valueOf(jTable3.getRowCount()));
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new JTextField(String.valueOf(new DecimalFormat("#.##").format(
            (Double) Double.parseDouble(jTextField5.getText())
            + (Double) Double.parseDouble(jTextField9.getText())
            + (Double) Double.parseDouble(jTextField10.getText())
        )));
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = ARSLANKEBAP.Operationen_JTable.getInstance().JTable_erzeugen(standard_ansicht_jTable2);
        jComboBox2 = ARSLANKEBAP.Operationen_JComboBox.getInstance().mitAnweisung("SELECT * FROM Zahlungsverfolgung WHERE OffenerBetrag > '0.00' ORDER BY Erfassungszeitstempel DESC;","Rechnungsnummer");
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox3 = jComboBox1;
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = ARSLANKEBAP.Operationen_JTable.getInstance().JTable_erzeugen(standard_ansicht_jTable4);
        jTextField15 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTextField21 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereNonDBSpalte(jTable4,2);
        jTextField23 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable4,spaltenname_summenfeld_jTextField23);
        jTextField24 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable4,spaltenname_summenfeld_jTextField24);
        jTextField25 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereDBSpalte(letzte_ansicht_jTable4,spaltenname_summenfeld_jTextField25);
        jTextField17 = new JTextField(String.valueOf(new DecimalFormat("#.##").format(
            (Double) Double.parseDouble(jTextField23.getText())
            + (Double) Double.parseDouble(jTextField24.getText())
            + (Double) Double.parseDouble(jTextField25.getText())
        )));
        jButton11 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new JTextField(String.valueOf(jTable4.getRowCount()));
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField27 = new JTextField(String.valueOf(jTable4.getRowCount()));
        jLabel37 = new javax.swing.JLabel();
        jTextField22 = ARSLANKEBAP.Operationen_JTextField.getInstance().summiereNonDBSpalte(jTable2,3);
        jLabel28 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zahlungsverfolgung");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Offene");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Kunde:");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jComboBox1.setMaximumRowCount(500);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Zahlungseingänge");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setBorder(null);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(null);
        jTable3.setForeground(new java.awt.Color(102, 102, 102));
        jTable3.setCellSelectionEnabled(true);
        jTable3.setName(""); // NOI18N
        jTable3.setShowGrid(true);
        // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
        jScrollPane4.setViewportView(jTable3);

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("RG-Nr:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Brutto-RG-Betrag:");

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField2.setForeground(java.awt.Color.white);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField2.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField2.setDisabledTextColor(java.awt.Color.black);
        jTextField2.setFocusTraversalPolicyProvider(true);
        jTextField2.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
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

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Gew. 2:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Gew. 3:");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Gew.1:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/add-32.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/add-32-dark.png"))); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("RG-Nr:");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32-weiss.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField6.setForeground(java.awt.Color.white);
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField6.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField6.setDisabledTextColor(java.awt.Color.black);
        jTextField6.setFocusTraversalPolicyProvider(true);
        jTextField6.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
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

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField7.setForeground(java.awt.Color.white);
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField7.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField7.setDisabledTextColor(java.awt.Color.black);
        jTextField7.setFocusTraversalPolicyProvider(true);
        jTextField7.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
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

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField8.setForeground(java.awt.Color.white);
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField8.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField8.setDisabledTextColor(java.awt.Color.black);
        jTextField8.setFocusTraversalPolicyProvider(true);
        jTextField8.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
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
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("RG-Beträge:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("Offener Beträge:");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("Gewicht1:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("Gewicht2:");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("Gewicht3:");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/arrow_circle_left.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/arrow_circle_left_clicked.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/647714-excel-16.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setBorder(null);
        jTextField3.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setBorder(null);
        jTextField4.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setBorder(null);
        jTextField5.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setBorder(null);
        jTextField9.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setBorder(null);
        jTextField10.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32-weiss.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(102, 102, 102));
        jDateChooser1.setAlignmentX(0.0F);
        jDateChooser1.setAlignmentY(0.0F);
        jDateChooser1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jDateChooser2.setBackground(new java.awt.Color(102, 102, 102));
        jDateChooser2.setAlignmentX(0.0F);
        jDateChooser2.setAlignmentY(0.0F);
        jDateChooser2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 0));
        jLabel24.setText("Anzahl:");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(102, 102, 102));
        jTextField11.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(null);
        jTextField11.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("kg");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("kg");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("kg");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("€");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("€");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("Gesamtgewicht:");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("kg");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(102, 102, 102));
        jTextField12.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setBorder(null);
        jTextField12.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/add-32.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/add-32-dark.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/647714-excel-16.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });

        jScrollPane5.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane5.setBorder(null);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setForeground(new java.awt.Color(102, 102, 102));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setName(""); // NOI18N
        jTable2.setShowGrid(true);
        // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
        jScrollPane5.setViewportView(jTable2);

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jComboBox2.setMaximumRowCount(500);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Kommentar:");

        jTextField13.setBackground(new java.awt.Color(102, 102, 102));
        jTextField13.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField13.setForeground(java.awt.Color.white);
        jTextField13.setToolTipText("");
        jTextField13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField13.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField13.setDisabledTextColor(java.awt.Color.black);
        jTextField13.setFocusTraversalPolicyProvider(true);
        jTextField13.setSelectedTextColor(java.awt.Color.white);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("Eingangsbetrag:");

        jTextField14.setBackground(new java.awt.Color(102, 102, 102));
        jTextField14.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField14.setForeground(java.awt.Color.white);
        jTextField14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField14.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField14.setDisabledTextColor(java.awt.Color.black);
        jTextField14.setFocusTraversalPolicyProvider(true);
        jTextField14.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Barzahlung:");
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jCheckBox2.setForeground(java.awt.Color.white);
        jCheckBox2.setText("Überweisung:");
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bezahlte");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setPreferredSize(new java.awt.Dimension(127, 17));

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel26.setForeground(java.awt.Color.white);
        jLabel26.setText("Kunde:");

        jComboBox3.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jComboBox3.setMaximumRowCount(500);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jScrollPane6.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane6.setBorder(null);

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBackground(new java.awt.Color(153, 204, 255));
        jTable4.setForeground(new java.awt.Color(102, 102, 102));
        jTable4.setCellSelectionEnabled(true);
        jTable4.setName(""); // NOI18N
        jTable4.setShowGrid(true);
        // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
        jScrollPane6.setViewportView(jTable4);

        jTextField15.setBackground(new java.awt.Color(102, 102, 102));
        jTextField15.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField15.setForeground(java.awt.Color.white);
        jTextField15.setToolTipText("");
        jTextField15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField15.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField15.setDisabledTextColor(java.awt.Color.black);
        jTextField15.setFocusTraversalPolicyProvider(true);
        jTextField15.setSelectedTextColor(java.awt.Color.white);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("RG-Nr:");

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel29.setForeground(java.awt.Color.white);
        jLabel29.setText("Brutto-RG-Betrag:");

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel30.setForeground(java.awt.Color.white);
        jLabel30.setText("€");

        jTextField16.setBackground(new java.awt.Color(102, 102, 102));
        jTextField16.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField16.setForeground(java.awt.Color.white);
        jTextField16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField16.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField16.setDisabledTextColor(java.awt.Color.black);
        jTextField16.setFocusTraversalPolicyProvider(true);
        jTextField16.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 0));
        jLabel31.setText("Gesamtgewicht:");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel32.setForeground(java.awt.Color.white);
        jLabel32.setText("kg");

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel33.setForeground(java.awt.Color.white);
        jLabel33.setText("Gew. 2:");

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel34.setForeground(java.awt.Color.white);
        jLabel34.setText("Gew. 3:");

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("Gew.1:");

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32-weiss.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32.png"))); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(102, 102, 102));
        jTextField18.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField18.setForeground(java.awt.Color.white);
        jTextField18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField18.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField18.setDisabledTextColor(java.awt.Color.black);
        jTextField18.setFocusTraversalPolicyProvider(true);
        jTextField18.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });

        jTextField19.setBackground(new java.awt.Color(102, 102, 102));
        jTextField19.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField19.setForeground(java.awt.Color.white);
        jTextField19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField19.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField19.setDisabledTextColor(java.awt.Color.black);
        jTextField19.setFocusTraversalPolicyProvider(true);
        jTextField19.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField19KeyTyped(evt);
            }
        });

        jTextField20.setBackground(new java.awt.Color(102, 102, 102));
        jTextField20.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField20.setForeground(java.awt.Color.white);
        jTextField20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField20.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField20.setDisabledTextColor(java.awt.Color.black);
        jTextField20.setFocusTraversalPolicyProvider(true);
        jTextField20.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField20KeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setText("RG-Beträge:");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 153, 0));
        jLabel38.setText("Gewicht1:");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 153, 0));
        jLabel39.setText("Gewicht2:");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel40.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 153, 0));
        jLabel40.setText("Gewicht3:");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/647714-excel-16.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(102, 102, 102));
        jTextField21.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField21.setBorder(null);
        jTextField21.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(102, 102, 102));
        jTextField23.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField23.setBorder(null);
        jTextField23.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(102, 102, 102));
        jTextField24.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setBorder(null);
        jTextField24.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(102, 102, 102));
        jTextField25.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setBorder(null);
        jTextField25.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(102, 102, 102));
        jTextField17.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField17.setBorder(null);
        jTextField17.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32-weiss.png"))); // NOI18N
        jButton11.setBorderPainted(false);
        jButton11.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32.png"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jDateChooser3.setBackground(new java.awt.Color(102, 102, 102));
        jDateChooser3.setAlignmentX(0.0F);
        jDateChooser3.setAlignmentY(0.0F);
        jDateChooser3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jDateChooser4.setBackground(new java.awt.Color(102, 102, 102));
        jDateChooser4.setAlignmentX(0.0F);
        jDateChooser4.setAlignmentY(0.0F);
        jDateChooser4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 153, 0));
        jLabel41.setText("Anzahl:");
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(102, 102, 102));
        jTextField26.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(255, 255, 255));
        jTextField26.setBorder(null);
        jTextField26.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel42.setForeground(java.awt.Color.white);
        jLabel42.setText("kg");

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel43.setForeground(java.awt.Color.white);
        jLabel43.setText("kg");

        jLabel44.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel44.setForeground(java.awt.Color.white);
        jLabel44.setText("kg");

        jLabel45.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 153, 0));
        jLabel45.setText("Anzahl:");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(102, 102, 102));
        jTextField27.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(255, 255, 255));
        jTextField27.setBorder(null);
        jTextField27.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 153, 0));
        jLabel37.setText("Summe:");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(102, 102, 102));
        jTextField22.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setBorder(null);
        jTextField22.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel28.setForeground(java.awt.Color.white);
        jLabel28.setText("€");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32-weiss.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/basics-22-32.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32-weiss.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32.png"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addGap(251, 251, 251)
                                .addComponent(jButton10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addComponent(jLabel16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
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
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jButton7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(jCheckBox1)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jCheckBox2)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)))))
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jComboBox1.setSelectedItem(null);
        jComboBox1.setSelectedItem(null);
        jComboBox1.setSelectedItem(null);

        pack();
    }//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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

            if (InputVerifier2Nachkommastellen.getInstance().verifizieren(jTextField2) && InputVerifier2Nachkommastellen.getInstance().verifizieren(jTextField6) && InputVerifier2Nachkommastellen.getInstance().verifizieren(jTextField7) && InputVerifier2Nachkommastellen.getInstance().verifizieren(jTextField8)) {

                PreparedStatement mySQL_prepared_statement = Operationen_MySQL.getInstance().conn.prepareStatement("INSERT INTO phpmyadmin.Zahlungsverfolgung "
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
                System.out.println("Test0");
                // Betroffene Komponenten aktualisieren bzw. leeren
                Komponenten_reloaden();
                System.out.println("Test1");
                Felder_leeren();
                System.out.println("Test2");
                JOptionPane.showMessageDialog(null, "Offene Rechnung erfolgreich\nin Netzwerkdatenbank eingetragen.",
                        "ARSLAN KEBAP DATENBANK", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("/Bilder/Netzwerkserver-128.png")));
                System.out.println("Test4");
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
            JOptionPane.showMessageDialog(null, "jButton1MouseClicked" + e);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Komponenten_reloaden();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Felder_leeren();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        // START DES SUCH
        letzte_ansicht_jTable3 = "SELECT * FROM Zahlungsverfolgung WHERE";
        boolean bool = false;
        String dateString1 = "";
        String dateString2 = "";

        if (jComboBox1.getSelectedItem() != null) {
            letzte_ansicht_jTable3 += " Kundenname LIKE '%" + jComboBox1.getSelectedItem() + "%'";
            bool = true;
        }
        if (!jTextField1.getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            letzte_ansicht_jTable3 += " Rechnungsnummer LIKE '%" + jTextField1.getText() + "%'";
            bool = true;
        }
        if (!jTextField2.getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            letzte_ansicht_jTable3 += " Bruttorechnungsbetrag LIKE '%" + jTextField2.getText() + "%'";
            bool = true;
        }
        if (!jTextField6.getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            letzte_ansicht_jTable3 += " Gewicht1 LIKE '%" + jTextField6.getText() + "%'";
            bool = true;
        }
        if (!jTextField7.getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            letzte_ansicht_jTable3 += " Gewicht2 LIKE '%" + jTextField7.getText() + "%'";
            bool = true;
        }
        if (!jTextField8.getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            letzte_ansicht_jTable3 += " Gewicht3 LIKE '%" + jTextField8.getText() + "%'";
            bool = true;
        }

        if (!(((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).getText().trim().equals(""))
                && ((JTextComponent) jDateChooser2.getDateEditor().getUiComponent()).getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            Date datum = jDateChooser1.getDate();
            dateString1 = String.format("%1$tY-%1$tm-%1$td", datum);
            letzte_ansicht_jTable3 += " Erfassungszeitstempel LIKE '" + dateString1 + "%'";
            bool = true;
        }
        if (!(((JTextComponent) jDateChooser2.getDateEditor().getUiComponent()).getText().trim().equals(""))
                && ((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).getText().trim().equals("")) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            Date datum = jDateChooser2.getDate();
            dateString2 = String.format("%1$tY-%1$tm-%1$td", datum);
            letzte_ansicht_jTable3 += " Erfassungszeitstempel LIKE '" + dateString2 + "%'";
            bool = true;
        }
        if (!(((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).getText().trim().equals(""))
                && !(((JTextComponent) jDateChooser2.getDateEditor().getUiComponent()).getText().trim().equals(""))) {
            if (bool) {
                letzte_ansicht_jTable3 += " AND ";
            }
            Date datum1 = jDateChooser1.getDate();
            Date datum2 = jDateChooser2.getDate();
            dateString1 = String.format("%1$tY-%1$tm-%1$td", datum1);
            dateString2 = String.format("%1$tY-%1$tm-%1$td", datum2);
            letzte_ansicht_jTable3 += " Erfassungszeitstempel BETWEEN '" + dateString1 + "%' AND '" + dateString2 + "%'";
            bool = true;
        }

        letzte_ansicht_jTable3 += ";";

        if (bool == false) {
            letzte_ansicht_jTable3 = standard_ansicht_jTable3;
        }

        Komponenten_reloaden();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            Export_XLS.getInstance().export(jTable3, Paths.get("/Users/SEAMAC/OffeneRG.xls"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "jButton4MouseClicked" + e);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        this.instanz = null;        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            if ((jComboBox2.getSelectedItem() != null)
                    && (jTextField14.getText() != null)
                    && (Float.parseFloat(jTextField14.getText()) >= 0.00f)
                    && InputVerifier2Nachkommastellen.getInstance().verifizieren(jTextField14)
                    && !(jCheckBox1.isSelected() == true && jCheckBox2.isSelected() == true)
                    && (jCheckBox1.isSelected() == true || jCheckBox2.isSelected() == true)) {

                /* 
                 * Aktuellste Variablen aus der Datenbanktabelle 'Zahlungsverfolgung' abrufen und konvertieren:
                 */
                ResultSet rs = Operationen_MySQL.getInstance().ResultSet_aus_Anweisung("SELECT * FROM phpmyadmin.Zahlungsverfolgung WHERE Rechnungsnummer LIKE '" + (String) jComboBox2.getSelectedItem() + "';");
                rs.next();
                System.out.println(jComboBox2.getSelectedItem());
                System.out.println(rs.getString("Rechnungsnummer"));
                if (!jComboBox2.getSelectedItem().equals(rs.getString("Rechnungsnummer"))) {
                    JOptionPane.showMessageDialog(null, "Fehler in der Datenbank:\nDiese Rechnung existiert nicht oder ist doppelt vorhanden.\nRufen Sie den Techniker.");
                    return;
                }

                String kundenname = rs.getString("Kundenname");
                BigDecimal bruttorechnungsbetrag_BD = rs.getBigDecimal("Bruttorechnungsbetrag").setScale(2, RoundingMode.HALF_UP);
                BigDecimal offenerBetrag_BD = rs.getBigDecimal("OffenerBetrag").setScale(2, RoundingMode.HALF_UP);

                /* 
                 * Variablen konvertieren:
                 */
                Double bruttorechnungsbetrag_D = bruttorechnungsbetrag_BD.doubleValue();
                float bruttorechnungsbetrag_f = bruttorechnungsbetrag_D.floatValue();
                Double offenerbetrag_D = offenerBetrag_BD.doubleValue();
                float offenerbetrag_f = offenerbetrag_D.floatValue();

                /* 
                 * Berechnungen der Restbetraege etc.
                 */
                float neuer_OffenerBetrag = offenerbetrag_f - Float.parseFloat(jTextField14.getText());

                if (neuer_OffenerBetrag < 0.00f) {
                    JOptionPane.showMessageDialog(null, "Der neue offene RG-Betrag darf nicht unter 0.00 EUR liegen!\nGeben Sie bitte die korrekten Zahlungseingänge ein.");
                    return;
                };

                /* 
                 * Zahlungseingang in DB-Tabelle 'Zahlungsverfolgung_Teilzahlungen' (= 'Zahlungseingaenge'-Tabelle in der GUI) verbuchen:
                 */
                PreparedStatement ps1 = Operationen_MySQL.getInstance().conn.prepareStatement("INSERT INTO phpmyadmin.Zahlungsverfolgung_Teilzahlungen "
                        + "(Rechnungsnummer, Kundenname, Bruttorechnungsbetrag, EingegangenerBetrag, Barzahlung, Ueberweisung, Kommentar) "
                        + "VALUES (?,?,?,?,?,?,?)");

                ps1.setString(1, String.valueOf(jComboBox2.getSelectedItem())); // RG-Nr
                ps1.setString(2, kundenname);
                ps1.setFloat(3, bruttorechnungsbetrag_f);
                ps1.setFloat(4, Float.parseFloat(jTextField14.getText())); // EingegangenerBetrag
                if (jCheckBox1.isSelected()) { // set eines tinyint(1) klappt über byte
                    ps1.setByte(5, (byte) 1);
                    ps1.setByte(6, (byte) 0);
                } else {
                    ps1.setByte(5, (byte) 0);
                    ps1.setByte(6, (byte) 1);
                }
                ps1.setString(7, jTextField13.getText());
                ps1.execute();

                /* 
                 * Neuen offenen Betrag in der DB-Tabelle 'Zahlungsverfolgung' (= 'Offene RG'-Tabelle in der GUI) eintragen:
                 */
                PreparedStatement ps2 = Operationen_MySQL.getInstance().conn.prepareStatement(
                        "UPDATE phpmyadmin.Zahlungsverfolgung SET OffenerBetrag = ? WHERE Rechnungsnummer = ?");
                ps2.setFloat(1, neuer_OffenerBetrag);
                ps2.setString(2, String.valueOf(jComboBox2.getSelectedItem()));
                ps2.executeUpdate();

                JOptionPane.showMessageDialog(null, "Zahlungseingang erfolgreich\nin Netzwerkdatenbank verbucht.",
                        "ARSLAN KEBAP DATENBANK", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("/Bilder/Netzwerkserver-128.png")));
                // Betroffene Komponenten aktualisieren bzw. leeren

                Komponenten_reloaden();
                Felder_leeren();

//                Fehlgeschlagener Versuch alle Komponenten auf einmal zu "refreshen" (ohne refresh-Methoden nutzen zu müssen):
//                SwingUtilities.updateComponentTreeUI(this);
//                Runnable runnable = new Runnable() {public void run() {initComponents();}};
//                runnable.run();
//                this.invalidate();
//                this.validate();
//                this.revalidate();
//                this.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Eingaben bspw. auf folgendes pruefen:\n"
                        + "1. Entweder Barzahlung ODER Überweisung anklicken.\n"
                        + "2. Der Betrag darf nicht ausgelassen werden und muss groesser als 0.00 EUR sein.");
            }

        } catch (MySQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Eine Rechnung mit dieser Rechnungsnummer wurde bereits eingetragen.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "jButton1MouseClicked" + e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            Export_XLS.getInstance().export(jTable2, Paths.get("/Users/SEAMAC/Zahlungseingaenge.xls"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "jButton7MouseClicked" + e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19KeyTyped

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20KeyTyped

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        try {
            Export_XLS.getInstance().export(jTable4, Paths.get("/Users/SEAMAC/BezahlteRG.xls"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "jButton10MouseClicked" + e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        Felder_leeren();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        Felder_leeren();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void Felder_leeren() {
        jComboBox1.setSelectedItem(null);
        jComboBox2.setSelectedItem(null);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
    }

    public void Komponenten_reloaden() {
        Operationen_JTable.getInstance().refreshen(jTable3, letzte_ansicht_jTable3); // Offene RG-Tabelle
        Operationen_JTable.getInstance().refreshen(jTable2, letzte_ansicht_jTable2); // Zahlungseingänge-Tabelle
        Operationen_JTable.getInstance().refreshen(jTable4, letzte_ansicht_jTable4); // Zahlungseingänge-Tabelle

        Operationen_JTextField.getInstance().refreshen(jTable3, jTextField3, 2); // Bruttorechnungsbetrag
        Operationen_JTextField.getInstance().refreshen(jTable3, jTextField4, 3); // OffenerBetrag
        Operationen_JTextField.getInstance().refreshen(jTable3, jTextField5, 4); // Gewicht1
        Operationen_JTextField.getInstance().refreshen(jTable3, jTextField9, 5);// Gewicht2
        Operationen_JTextField.getInstance().refreshen(jTable3, jTextField10, 6);// Gewicht3

        Operationen_JTextField.getInstance().refreshen(jTable4, jTextField21, 2); // Bruttorechnungsbetrag
        Operationen_JTextField.getInstance().refreshen(jTable4, jTextField23, 4); // Gewicht1
        Operationen_JTextField.getInstance().refreshen(jTable4, jTextField24, 5);// Gewicht2
        Operationen_JTextField.getInstance().refreshen(jTable4, jTextField25, 6);// Gewicht3

        jTextField27.setText(String.valueOf(jTable2.getRowCount())); // Anzahl angezeigter Zeilen
        jTextField11.setText(String.valueOf(jTable3.getRowCount())); // Anzahl angezeigter Zeilen
        jTextField26.setText(String.valueOf(jTable4.getRowCount())); // Anzahl angezeigter Zeilen
        jTextField12.setText(String.valueOf(new DecimalFormat("#.##").format( // Gesamtgewicht. Vorsicht: Betroffene Gewichte müssen zuvor refrehed worden sein!
                (Double) Double.parseDouble(jTextField5.getText())
                + (Double) Double.parseDouble(jTextField9.getText())
                + (Double) Double.parseDouble(jTextField10.getText())
        )));

        jTextField17.setText(String.valueOf(new DecimalFormat("#.##").format( // Gesamtgewicht. Vorsicht: Betroffene Gewichte müssen zuvor refrehed worden sein!
                (Double) Double.parseDouble(jTextField23.getText())
                + (Double) Double.parseDouble(jTextField24.getText())
                + (Double) Double.parseDouble(jTextField25.getText())
        )));

        Operationen_JComboBox.getInstance().refreshen(jComboBox1, "SELECT * FROM Kunden", "Kundenname"); // Kundennamen-ComboBox bei Offene RG-Tabelle
        jComboBox3 = jComboBox1; // Um nicht die selbe Abfrage doppelt zu tätigen
        Operationen_JComboBox.getInstance().refreshen(jComboBox2, standard_ansicht_jTable3, "Rechnungsnummer"); // RG-Nr-ComboBox bei Zahlungseingänge-Tabelle
        Felder_leeren();

    }

    /* Mit den *_ansicht_* -Strings erreiche ich, dass der Code sauberer aussieht und 
     * dass die JTables, JLabels, JComboBoxen etc. leichter refreshed werden können:
     * Durch der Unterscheidung zwischen standard_ansicht_* und letzte_ansicht_* kann ich
     * bspw. die aktuellen Summen von JTable-Spalten in JLabels schön angeben.
     */
    public String standard_ansicht_jTable3 = "SELECT * FROM Zahlungsverfolgung WHERE OffenerBetrag > '0.00' ORDER BY Erfassungszeitstempel DESC;";
    public String letzte_ansicht_jTable3 = "SELECT * FROM Zahlungsverfolgung WHERE OffenerBetrag > '0.00' ORDER BY Erfassungszeitstempel DESC;"; // wird zunächst identisch initialisiert. Wichtig z.B. für Summenanzeigen.
    public String standard_ansicht_jTable2 = "SELECT * FROM Zahlungsverfolgung_Teilzahlungen;";
    public String letzte_ansicht_jTable2 = "SELECT * FROM Zahlungsverfolgung_Teilzahlungen;";
    public String standard_ansicht_jTable4 = "SELECT * FROM Zahlungsverfolgung WHERE OffenerBetrag LIKE '0.00' ORDER BY Erfassungszeitstempel DESC;";
    public String letzte_ansicht_jTable4 = "SELECT * FROM Zahlungsverfolgung WHERE OffenerBetrag LIKE '0.00' ORDER BY Erfassungszeitstempel DESC;";
    public String spaltenname_summenfeld_jTextField3 = "Bruttorechnungsbetrag";
    public String spaltenname_summenfeld_jTextField4 = "OffenerBetrag";
    public String spaltenname_summenfeld_jTextField5 = "Gewicht1";
    public String spaltenname_summenfeld_jTextField9 = "Gewicht2";
    public String spaltenname_summenfeld_jTextField10 = "Gewicht3";
    public String spaltenname_summenfeld_jTextField23 = "Gewicht1";
    public String spaltenname_summenfeld_jTextField24 = "Gewicht2";
    public String spaltenname_summenfeld_jTextField25 = "Gewicht3";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    static Frame_Zahlungsverfolgung instanz;

    public static synchronized Frame_Zahlungsverfolgung getInstance() {
        if (Frame_Zahlungsverfolgung.instanz == null) {
            System.out.println("Frame_Zahlungsverfolgung-Thread erstellt");
            Frame_Zahlungsverfolgung.instanz = new Frame_Zahlungsverfolgung();
            return Frame_Zahlungsverfolgung.instanz;
        }

        return Frame_Zahlungsverfolgung.instanz;
    }

}
