/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prescription;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql. *;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Prescription01 extends javax.swing.JFrame {

    /**
     * Creates new form Prescription01
     */
    public Prescription01() {
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
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prescriptions" ,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        addnewB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        removeB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        refreshB = new javax.swing.JButton();
        searchB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        signage.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        signage.setText("Optical Prescription Form");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TABLE.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "PatientName", "PatientAge", "PatientAddress", "PatientSex", "PatientContact", "DateAppointed", "ReservedDate", "Diagnosis", "EyeGradeLevel", "GlassFrame"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLE.setMaximumSize(new java.awt.Dimension(2147, 200));
        TABLE.setShowGrid(true);
        jScrollPane3.setViewportView(TABLE);
        if (TABLE.getColumnModel().getColumnCount() > 0) {
            TABLE.getColumnModel().getColumn(1).setMinWidth(200);
            TABLE.getColumnModel().getColumn(1).setPreferredWidth(200);
            TABLE.getColumnModel().getColumn(2).setMinWidth(180);
            TABLE.getColumnModel().getColumn(2).setPreferredWidth(180);
            TABLE.getColumnModel().getColumn(3).setMinWidth(230);
            TABLE.getColumnModel().getColumn(3).setPreferredWidth(230);
            TABLE.getColumnModel().getColumn(4).setMinWidth(180);
            TABLE.getColumnModel().getColumn(4).setPreferredWidth(180);
            TABLE.getColumnModel().getColumn(5).setMinWidth(230);
            TABLE.getColumnModel().getColumn(5).setPreferredWidth(230);
            TABLE.getColumnModel().getColumn(6).setMinWidth(230);
            TABLE.getColumnModel().getColumn(6).setPreferredWidth(230);
            TABLE.getColumnModel().getColumn(7).setMinWidth(230);
            TABLE.getColumnModel().getColumn(7).setPreferredWidth(230);
            TABLE.getColumnModel().getColumn(8).setMinWidth(160);
            TABLE.getColumnModel().getColumn(8).setPreferredWidth(160);
            TABLE.getColumnModel().getColumn(9).setMinWidth(240);
            TABLE.getColumnModel().getColumn(9).setPreferredWidth(240);
            TABLE.getColumnModel().getColumn(10).setMinWidth(210);
            TABLE.getColumnModel().getColumn(10).setPreferredWidth(210);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jPanel3.setPreferredSize(new java.awt.Dimension(738, 586));

        addnewB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        addnewB.setText("Add New");
        addnewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewBActionPerformed(evt);
            }
        });

        updateB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        updateB.setText("Update");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        removeB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        removeB.setText("Remove\n");
        removeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Refresh");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        refreshB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        searchB.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        searchB.setText("Search\n");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addnewB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnewB)
                    .addComponent(updateB)
                    .addComponent(removeB)
                    .addComponent(refreshB)
                    .addComponent(searchB))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(705, 705, 705)
                                .addComponent(signage))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1716, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        UpdatePres ShowAddPres = new UpdatePres();
        ShowAddPres.setVisible(true);
    }//GEN-LAST:event_updateBActionPerformed

    private void addnewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewBActionPerformed
        AddPres ShowAddPres = new AddPres();
        ShowAddPres.setVisible(true);
    }//GEN-LAST:event_addnewBActionPerformed

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        DisplayData();
    }//GEN-LAST:event_refreshBActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        SearchPre ShowAddPres = new SearchPre();
        ShowAddPres.setVisible(true);
    }//GEN-LAST:event_searchBActionPerformed

    private void removeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBActionPerformed
        RemovePres ShowAddPres = new RemovePres();
        ShowAddPres.setVisible(true);
    }//GEN-LAST:event_removeBActionPerformed

    public void DisplayData(){
        try {
            pst = connect.prepareStatement("SELECT * FROM prescriptions");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)TABLE.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("PatientID"));
                    v2.add(rs.getString("PatientName"));
                    v2.add(rs.getInt("PatientAge"));
                    v2.add(rs.getString("PatientAddress"));
                    v2.add(rs.getString("PatientSex"));
                    v2.add(rs.getLong("PatientContact"));
                    v2.add(rs.getString("DateAppointed"));
                    v2.add(rs.getString("ReservedDate"));
                    v2.add(rs.getString("Diagnosis"));
                    v2.add(rs.getDouble("EyeGradeLevel"));
                    v2.add(rs.getString("GlassFrame"));
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescription01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLE;
    private javax.swing.JButton addnewB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshB;
    private javax.swing.JButton removeB;
    private javax.swing.JButton searchB;
    private javax.swing.JLabel signage;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
