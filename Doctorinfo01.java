/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doctoresinfo;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql. *;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Doctorinfo01 extends javax.swing.JFrame {

    /**
     * Creates new form addnew_info
     */
    public Doctorinfo01() {
        initComponents();
         Connect();
         DisplayData();
    }

    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
        
       
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_info" ,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        AddB = new javax.swing.JButton();
        RefreshB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        removeb = new javax.swing.JButton();
        searchb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(738, 586));

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Doctor Infomation Form");

        TABLE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DoctorID", "DoctorName", "DoctorAge", "DoctorSex", "DoctorAddress", "DoctorEmail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLE.setShowHorizontalLines(true);
        TABLE.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TABLE);

        AddB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        AddB.setText("Add New\n");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        RefreshB.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        RefreshB.setText("Refresh\n");
        RefreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBActionPerformed(evt);
            }
        });

        updateB.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        updateB.setText("Update\n");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        removeb.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        removeb.setText("Remove");
        removeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebActionPerformed(evt);
            }
        });

        searchb.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        searchb.setText("Search\n");
        searchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(268, 268, 268))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RefreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeb)))
                        .addGap(22, 22, 22)
                        .addComponent(searchb)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateB)
                    .addComponent(searchb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RefreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeb))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        addnewInfo ShowaddnewInfo = new addnewInfo();
        ShowaddnewInfo.setVisible(true);
    }//GEN-LAST:event_AddBActionPerformed

    private void RefreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBActionPerformed
        DisplayData();
    }//GEN-LAST:event_RefreshBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        UpdateInfo ShowaddnewInfo = new UpdateInfo();
        ShowaddnewInfo.setVisible(true);
    }//GEN-LAST:event_updateBActionPerformed

    private void removebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebActionPerformed
        RemoveInfo ShowaddnewInfo = new RemoveInfo();
        ShowaddnewInfo.setVisible(true);
    }//GEN-LAST:event_removebActionPerformed

    private void searchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbActionPerformed
        SearchInfo ShowaddnewInfo = new SearchInfo();
        ShowaddnewInfo.setVisible(true);
    }//GEN-LAST:event_searchbActionPerformed
     public void DisplayData(){
        try {
            pst = connect.prepareStatement("SELECT * FROM doctor_info");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)TABLE.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("DoctorID"));
                    v2.add(rs.getString("DoctorName"));
                    v2.add(rs.getInt("DoctorAge"));
                    v2.add(rs.getString("DoctorSex"));
                    v2.add(rs.getString("DoctorAddress"));
                    v2.add(rs.getLong("DoctorContact"));
                    v2.add(rs.getString("DoctorEmail"));
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctorinfo01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctorinfo01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JButton RefreshB;
    private javax.swing.JTable TABLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeb;
    private javax.swing.JButton searchb;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
