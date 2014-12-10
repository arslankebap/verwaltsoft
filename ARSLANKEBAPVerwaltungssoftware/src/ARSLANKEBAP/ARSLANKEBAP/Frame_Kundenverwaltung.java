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
public class Frame_Kundenverwaltung extends javax.swing.JInternalFrame {

    public Frame_Kundenverwaltung() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Wichtig für Threadsicherheit! Beibelassen!
        Desktop.centerJIF(this); // fuegt JInternalFrame dem Desktop zentriert hinzu

    }


    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new JTextField(String.valueOf(jTable3.getRowCount()));
        jTextField28 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Kundenverwaltung");
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
        jLabel1.setText("Kunden");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Kundenname:");

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setBorder(null);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setForeground(new java.awt.Color(102, 102, 102));
        jTable3.setCellSelectionEnabled(true);
        jTable3.setName(""); // NOI18N
        jTable3.setShowGrid(true);
        // Um Gui-Editor und gleichzeitig deutlich mehr freiheit zu haben:
        jScrollPane4.setViewportView(jTable3);

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
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
        jLabel11.setText("Straße:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Haus-Nr.");

        jTextField2.setBackground(new java.awt.Color(0, 102, 153));
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
        jLabel13.setText("PLZ:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Zahlungsziel [Tage]:");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Adr.zusatz:");

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32-weiss.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/find-32.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 102, 153));
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

        jTextField7.setBackground(new java.awt.Color(0, 102, 153));
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

        jTextField8.setBackground(new java.awt.Color(0, 102, 153));
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

        jDateChooser1.setBackground(new java.awt.Color(0, 102, 153));
        jDateChooser1.setAlignmentX(0.0F);
        jDateChooser1.setAlignmentY(0.0F);
        jDateChooser1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jDateChooser2.setBackground(new java.awt.Color(0, 102, 153));
        jDateChooser2.setAlignmentX(0.0F);
        jDateChooser2.setAlignmentY(0.0F);
        jDateChooser2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setText("Anzahl:");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(0, 102, 153));
        jTextField11.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(null);
        jTextField11.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jTextField28.setBackground(new java.awt.Color(0, 102, 153));
        jTextField28.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField28.setForeground(java.awt.Color.white);
        jTextField28.setToolTipText("");
        jTextField28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField28.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField28.setDisabledTextColor(java.awt.Color.black);
        jTextField28.setFocusTraversalPolicyProvider(true);
        jTextField28.setSelectedTextColor(java.awt.Color.white);
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(0, 102, 153));
        jTextField9.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jTextField9.setForeground(java.awt.Color.white);
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField9.setCaretColor(new java.awt.Color(255, 153, 51));
        jTextField9.setDisabledTextColor(java.awt.Color.black);
        jTextField9.setFocusTraversalPolicyProvider(true);
        jTextField9.setInputVerifier(new ARSLANKEBAP.InputVerifier2Nachkommastellen().getInstance());
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Stadt:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }//GEN-END:initComponents

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
            //if ()
            
                PreparedStatement mySQL_prepared_statement = Operationen_MySQL.getInstance().conn.prepareStatement("INSERT INTO phpmyadmin.Kunden "
                        + "(Kundenname, Strasse, Hausnummer, Adresszusatz, PLZ, Stadt, Zahlungsziel) "
                        + "VALUES (?,?,?,?,?,?,?)");

                mySQL_prepared_statement.setString(1, String.valueOf(jTextField28.getText()));
                mySQL_prepared_statement.setFloat(3, Float.parseFloat(jTextField2.getText()));
                mySQL_prepared_statement.setFloat(4, Float.parseFloat(jTextField2.getText())); // Doppelt, weil 'Offener Betrag' anfangs ja 'Bruttorechnungsbetrag' entspricht
                mySQL_prepared_statement.setFloat(5, Float.parseFloat(jTextField6.getText()));
                mySQL_prepared_statement.setFloat(6, Float.parseFloat(jTextField7.getText()));
                mySQL_prepared_statement.setFloat(7, Float.parseFloat(jTextField8.getText()));

                mySQL_prepared_statement.execute();
                Komponenten_reloaden();
                Felder_leeren();
                JOptionPane.showMessageDialog(null, "Neuen Kunden erfolgreich\nin Netzwerkdatenbank eingetragen.",
                        "ARSLAN KEBAP DATENBANK", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("/Bilder/Netzwerkserver-128.png")));

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Felder_leeren();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        // START DES SUCH
        letzte_ansicht_jTable3 = "SELECT * FROM Kunden WHERE";
        boolean bool = false;
        String dateString1 = "";
        String dateString2 = "";
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
        // Wenn das erste Datumsfeld eingetragen wurde:
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
        // Wenn das zweite Datumsfeld eingetragen wurde:        
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
        // Wenn beide Datumsfelder eingetragen wurden:
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

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            Export_XLS.getInstance().export(jTable3, Paths.get("/Users/SEAMAC/Kundenliste.xls"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "jButton4MouseClicked" + e);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        this.instanz = null;        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Komponenten_reloaden();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void Felder_leeren() {

        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField28.setText("");

    }

    public void Komponenten_reloaden() {
        // Tabellen selbst refreshen:
        Operationen_JTable.getInstance().refreshen(jTable3, letzte_ansicht_jTable3); // Offene RG-Tabelle

        jTextField11.setText(String.valueOf(jTable3.getRowCount())); // Anzahl angezeigter Zeilen

        // Alle Felder um alle Tabellen herum leeren:
        Felder_leeren();


    }

    /* Mit den *_ansicht_* -Strings erreiche ich, dass der Code sauberer aussieht und 
     * dass die JTables, JLabels, JComboBoxen etc. leichter refreshed werden können:
     * Durch der Unterscheidung zwischen standard_ansicht_* und letzte_ansicht_* kann ich
     * bspw. die aktuellen Summen von JTable-Spalten in JLabels schön angeben.
     */
    public String standard_ansicht_jTable3 = "SELECT * FROM Kunden ORDER BY Erfassungszeitstempel DESC;";
    public String letzte_ansicht_jTable3 = "SELECT * FROM Kunden ORDER BY Erfassungszeitstempel DESC;"; // wird zunächst identisch initialisiert. Wichtig z.B. für Summenanzeigen.

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private static Frame_Kundenverwaltung instanz;

    public static synchronized Frame_Kundenverwaltung getInstance() {
        if (Frame_Kundenverwaltung.instanz == null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Frame_Kundenverwaltung.instanz = new Frame_Kundenverwaltung();

                }
            });
            System.out.println("Frame_Kundenverwaltung-Thread erstellt");
            return Frame_Kundenverwaltung.instanz;
        }

        return Frame_Kundenverwaltung.instanz;
    }

}
