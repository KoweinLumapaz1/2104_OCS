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
public class CheckUpRemovePanel extends javax.swing.JPanel {
    LocalDate UserDate = java.time.LocalDate.now();
    String SelectedDay;
    String CurrentDate = UserDate.toString();
    int CurrentMonth = UserDate.getMonthValue();
    int CurrentDay = UserDate.getDayOfMonth();
    int CurrentYear = UserDate.getYear();
    int Month;
    int Day;
    int Year;
    int CheckUpFee = 1000;
    public CheckUpRemovePanel() {
        initComponents();
        Connect();
    }

 
    PreparedStatement pst;
    Connection connect;
    ResultSet rs;
        public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
            //JOptionPane.showMessageDialog(null, "Connnected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MInterface.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        Fradio = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jTextField8 = new javax.swing.JTextField();
        Mradio = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton6.setText("6:00 PM");
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton4.setText("2:00 PM");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 333, -1));

        jLabel34.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel34.setText("Gender:\n");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel42.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel42.setText("Payment Details");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel46.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel46.setText("Initial Check Up Fee:");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 167, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton2.setText("10:00 AM");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 330, -1));

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField3InputMethodTextChanged(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Day");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton3.setText("12:00 PM");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Month");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jSpinner2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner2.setValue(CurrentDay

        );
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1354, 10));

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 200, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner1.setValue(CurrentMonth
        );
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 167, 30));

        buttonGroup2.add(Fradio);
        Fradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fradio.setText("Female");
        jPanel1.add(Fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel47.setText("jLabel47");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setText("Month");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Email Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Year");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel39.setText("Appointment Date");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2024, 2024, null, 1));
        jSpinner3.setValue(CurrentYear
        );
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jTextField8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField8.setText("500");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 91, -1));

        buttonGroup2.add(Mradio);
        Mradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Mradio.setText("Male");
        jPanel1.add(Mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1354, 10));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton5.setText("4:00 PM");
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel38.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel38.setText("Appointment Time");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel37.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel37.setText("Personal Information");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton1.setText("8:00 AM");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 20, 112));

        jLabel45.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel45.setText("Down Payment:");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, -1));

        jLabel40.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel40.setText("Appointment Details");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, -1));

        jLabel41.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel41.setText("Cancel Check Up Reservation");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1210, 20));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setText("Enter your Transaction Number");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextField37.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1367, 731));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField3InputMethodTextChanged

    }//GEN-LAST:event_jTextField3InputMethodTextChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged

    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged

    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged

    }//GEN-LAST:event_jSpinner3StateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

try {
        // Fetch Transaction Number from the text field
        String TransactionNumber = jTextField37.getText();
        if (TransactionNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Transaction Number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Search for the record in `patientDB` table
        String searchQuery = "SELECT * FROM `patientDB` WHERE `TransactionNumber` = ?";
        pst = connect.prepareStatement(searchQuery);
        pst.setString(1, TransactionNumber);
        rs = pst.executeQuery();

        if (rs.next()) {
            // Display fetched data in the panel
            jTextField1.setText(rs.getString("UserFName"));
            jTextField2.setText(rs.getString("UserLName"));
            jTextField3.setText(String.valueOf(rs.getInt("UserAge")));
            jTextField4.setText(rs.getString("UserAddress"));
            jTextField5.setText(rs.getString("UserEmail"));
            jTextField6.setText(String.valueOf(rs.getLong("UserContact")));
            String gender = rs.getString("UserGender");
            if (gender.equalsIgnoreCase("M")) {
                Mradio.setSelected(true);
            } else if (gender.equalsIgnoreCase("F")) {
                Fradio.setSelected(true);
            }

            String reserveTime = rs.getString("ReserveTime");
            switch (reserveTime) {
                case "08:00:00" -> jRadioButton1.setSelected(true);
                case "10:00:00" -> jRadioButton2.setSelected(true);
                case "12:00:00" -> jRadioButton3.setSelected(true);
                case "14:00:00" -> jRadioButton4.setSelected(true);
                case "16:00:00" -> jRadioButton5.setSelected(true);
                case "18:00:00" -> jRadioButton6.setSelected(true);
            }

            jSpinner1.setValue(rs.getDate("ReservedDate").toLocalDate().getMonthValue());
            jSpinner2.setValue(rs.getDate("ReservedDate").toLocalDate().getDayOfMonth());
            jSpinner3.setValue(rs.getDate("ReservedDate").toLocalDate().getYear());

            // Prompt for deletion confirmation
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Delete record
                String deleteQuery = "DELETE FROM `patientDB` WHERE `TransactionNumber` = ?";
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

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
