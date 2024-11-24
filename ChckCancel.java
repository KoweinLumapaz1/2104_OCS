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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jolo
 */
public class ChckCancel extends javax.swing.JPanel {

    int TransactionNumber;
    public ChckCancel() {
        initComponents();
        Connect();
    }
    public void TransactNumber(int TransactionN){
        this.TransactionNumber = TransactionN;
        jLabel2.setText("Transaction Number: "+TransactionN);
        
    }
    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    
        public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
           //JOptionPane.showMessageDialog(null, "Connnected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MInterface.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Fradio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Mradio = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        TN = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel34.setText("Gender:\n");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 30));

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 167, 30));

        Fradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fradio.setText("Female");
        jPanel1.add(Fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 30));

        Mradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Mradio.setText("Male");
        jPanel1.add(Mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 810, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Note: Please fill up all the information needed!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 30));

        jTextField8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 90, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Age:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 30));

        jTextField9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 280, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Address:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 30));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setText("Contact:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, 30));

        jTextField10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 280, 30));

        jTextField11.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 167, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 810, 10));

        jLabel38.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel38.setText("Payment Details");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        TN.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TN.setText("Enter your transaction number:");
        jPanel1.add(TN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 30));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("Email:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 30));

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, -1));

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 810, 130));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setText("AvailedProducts");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            String TransactionNumber = jTextField2.getText();
            if (TransactionNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a Transaction Number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String searchQuery = "SELECT * FROM `products` WHERE `TransactionNumber` = ?";
            pst = connect.prepareStatement(searchQuery);
            pst.setString(1, TransactionNumber);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                // Display fetched data in the panel
                jTextField1.setText(rs.getString("Name"));
                jTextField8.setText(rs.getString("Age"));
                jTextField9.setText(rs.getString("Address"));
                jTextField10.setText(rs.getString("Email"));
                jTextField11.setText(String.valueOf(rs.getLong("Contact")));
                String gender = rs.getString("Gender");
                if (gender.equalsIgnoreCase("M")) {
                    Mradio.setSelected(true);
                } else if (gender.equalsIgnoreCase("F")) {
                    Fradio.setSelected(true);
                }
                jTextArea1.setText(rs.getString("AvailProduct"));
                
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                // Delete record
                String deleteQuery = "DELETE FROM `products` WHERE `TransactionNumber` = ?";
                pst = connect.prepareStatement(deleteQuery);
                pst.setString(1, TransactionNumber);
                int rowsDeleted = pst.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion failed. Record not found.");
                }
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChckCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.JLabel TN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
