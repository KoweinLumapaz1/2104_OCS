/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserHP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jolo
 */
public class PrescriptionRemovePanel extends javax.swing.JPanel {
    LocalDate CurrentDate = java.time.LocalDate.now();
    double Rlevel;
    double Llevel;
    public PrescriptionRemovePanel() {
        initComponents();
        Connect();
    }
    
    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
    
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpticalType = new javax.swing.ButtonGroup();
        Gender = new javax.swing.ButtonGroup();
        ConLenseColor = new javax.swing.ButtonGroup();
        FrameShape = new javax.swing.ButtonGroup();
        FrameType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fradio = new javax.swing.JRadioButton();
        Mradio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        TextFirst = new javax.swing.JTextField();
        TextLast = new javax.swing.JTextField();
        TextAge = new javax.swing.JTextField();
        Textaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Textemail = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSeparator1 = new javax.swing.JSeparator();
        rectangleRadio = new javax.swing.JRadioButton();
        squareRadio = new javax.swing.JRadioButton();
        ovalRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        plasticRadio = new javax.swing.JRadioButton();
        metalRadio = new javax.swing.JRadioButton();
        woodRadio = new javax.swing.JRadioButton();
        availB = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Textcontact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        glasses = new javax.swing.JRadioButton();
        contactlense = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        natural = new javax.swing.JRadioButton();
        brown = new javax.swing.JRadioButton();
        gray = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 43, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 126, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Gender:\n");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 171, -1, -1));

        Gender.add(Fradio);
        Fradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fradio.setText("Female");
        Fradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FradioActionPerformed(evt);
            }
        });
        jPanel3.add(Fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 169, -1, -1));

        Gender.add(Mradio);
        Mradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Mradio.setText("Male");
        jPanel3.add(Mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        TextFirst.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel3.add(TextFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 170, -1));

        TextLast.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel3.add(TextLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        TextAge.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel3.add(TextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 90, -1));

        Textaddress.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Textaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextaddressActionPerformed(evt);
            }
        });
        jPanel3.add(Textaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 251, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setText("Email Address");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        Textemail.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel3.add(Textemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 251, -1));
        jPanel3.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 241, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1641, 10));

        FrameShape.add(rectangleRadio);
        rectangleRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        rectangleRadio.setText("Rectangle");
        jPanel3.add(rectangleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        FrameShape.add(squareRadio);
        squareRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        squareRadio.setText("Square");
        jPanel3.add(squareRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        FrameShape.add(ovalRadio);
        ovalRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ovalRadio.setText("Oval");
        jPanel3.add(ovalRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Frame Shape:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setText("Grade Level:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("Frame Type:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        FrameType.add(plasticRadio);
        plasticRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        plasticRadio.setText("Plastic");
        jPanel3.add(plasticRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        FrameType.add(metalRadio);
        metalRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        metalRadio.setText("Metal");
        jPanel3.add(metalRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        FrameType.add(woodRadio);
        woodRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        woodRadio.setText("Wood");
        jPanel3.add(woodRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        availB.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        availB.setText("Avail Prescription");
        availB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availBActionPerformed(evt);
            }
        });
        jPanel3.add(availB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 270, -1));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setText("Contact Number");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        Textcontact.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Textcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextcontactActionPerformed(evt);
            }
        });
        jPanel3.add(Textcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 251, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setText("Optical Type:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        OpticalType.add(glasses);
        glasses.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        glasses.setText("Glasses");
        glasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassesActionPerformed(evt);
            }
        });
        jPanel3.add(glasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        OpticalType.add(contactlense);
        contactlense.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        contactlense.setText("Contact Lense");
        jPanel3.add(contactlense, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setText("Con.Lense Color");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        ConLenseColor.add(natural);
        natural.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        natural.setText("Natural");
        jPanel3.add(natural, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        ConLenseColor.add(brown);
        brown.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        brown.setText("Brown");
        jPanel3.add(brown, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        ConLenseColor.add(gray);
        gray.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        gray.setText("Gray");
        jPanel3.add(gray, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel47.setText("Personal Information");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 10, 501));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 255));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 868, 698, 10));

        jLabel49.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel49.setText("Price list");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));

        jLabel50.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel50.setText("R");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jLabel51.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel51.setText("L");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jSpinner4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        jPanel3.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        jSpinner5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });
        jPanel3.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Order Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 400, 320));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 1400, 1250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 1384, -1));

        jLabel61.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel61.setText("Optical Prescription Form");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel45.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel45.setText("Down Payment:");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, -1));

        jTextField8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField8.setText("500");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 91, -1));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setText("Enter your Transaction Number");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextField37.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, -1));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1367, 731));
    }// </editor-fold>//GEN-END:initComponents

    private void FradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FradioActionPerformed

    private void TextaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextaddressActionPerformed

    private void availBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availBActionPerformed
        
        
    }//GEN-LAST:event_availBActionPerformed

    private void TextcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextcontactActionPerformed

    private void glassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassesActionPerformed

    }//GEN-LAST:event_glassesActionPerformed

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged

    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged

    }//GEN-LAST:event_jSpinner5StateChanged

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        // Fetch Transaction Number from the text field
        String TransactionNumber = jTextField37.getText();
        if (TransactionNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Transaction Number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Search for the record in `patientDB` table
        String searchQuery = "SELECT * FROM `prescribeform` WHERE `TransactionNumber` = ?";
        pst = connect.prepareStatement(searchQuery);
        pst.setString(1, TransactionNumber);
        rs = pst.executeQuery();

        if (rs.next()) {
            // Display fetched data in the panel
            TextFirst.setText(rs.getString("Fname"));
            TextLast.setText(rs.getString("Lname"));
            TextAge.setText(String.valueOf(rs.getInt("Age")));
            Textaddress.setText(rs.getString("Address"));
            Textemail.setText(rs.getString("Email"));
            Textcontact.setText(String.valueOf(rs.getLong("Contact")));
            String gender = rs.getString("Gender");
            if (gender.equalsIgnoreCase("M")) {
                Mradio.setSelected(true);
            } else if (gender.equalsIgnoreCase("F")) {
                Fradio.setSelected(true);
            }

            String OpticalType = rs.getString("OpticalType");
            switch (OpticalType) {
                case "Glasses" -> glasses.setSelected(true);
                case "Contact Lense" -> contactlense.setSelected(true);

            }
            String FrameS = rs.getString("Fshape");
            switch (FrameS) {
                case "Oval" -> ovalRadio.setSelected(true);
                case "Square" -> squareRadio.setSelected(true);
                case "Rectangle" -> rectangleRadio.setSelected(true);
               
            }
            String ContactS = rs.getString("ConType");
            switch (ContactS) {
                case "brown" -> brown.setSelected(true);
                case "natural" -> natural.setSelected(true);
                case "gray" -> gray.setSelected(true);
            }
            String Ftype = rs.getString("Ftype");
            switch (Ftype) {
                case "Plastic" -> plasticRadio.setSelected(true);
                case "Wood" -> woodRadio.setSelected(true);
                case "Metal" -> metalRadio.setSelected(true);
               
            }

            jSpinner5.setValue(rs.getDouble("RLevel"));
            jSpinner4.setValue(rs.getDouble("LLevel"));
            

            // Prompt for deletion confirmation
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Delete record
                String deleteQuery = "DELETE FROM `prescribeform` WHERE `TransactionNumber` = ?";
                pst = connect.prepareStatement(deleteQuery);
                pst.setString(1, TransactionNumber);
                int rowsDeleted = pst.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion failed. Record not found.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No record found with Transaction Number: " + TransactionNumber);
        }
    } catch (SQLException ex) {
        Logger.getLogger(CheckUpRemovePanel.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ConLenseColor;
    private javax.swing.JRadioButton Fradio;
    private javax.swing.ButtonGroup FrameShape;
    private javax.swing.ButtonGroup FrameType;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.ButtonGroup OpticalType;
    private javax.swing.JTextField TextAge;
    private javax.swing.JTextField TextFirst;
    private javax.swing.JTextField TextLast;
    private javax.swing.JTextField Textaddress;
    private javax.swing.JTextField Textcontact;
    private javax.swing.JTextField Textemail;
    private javax.swing.JButton availB;
    private javax.swing.JRadioButton brown;
    private javax.swing.JRadioButton contactlense;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JRadioButton glasses;
    private javax.swing.JRadioButton gray;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton metalRadio;
    private javax.swing.JRadioButton natural;
    private javax.swing.JRadioButton ovalRadio;
    private javax.swing.JRadioButton plasticRadio;
    private javax.swing.JRadioButton rectangleRadio;
    private javax.swing.JRadioButton squareRadio;
    private javax.swing.JRadioButton woodRadio;
    // End of variables declaration//GEN-END:variables
}
