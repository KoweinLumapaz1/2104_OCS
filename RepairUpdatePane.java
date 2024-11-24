/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserHP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.join;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jolo
 */
public class RepairUpdatePane extends javax.swing.JPanel {


    public RepairUpdatePane() {
        initComponents();
        Connect();
        RTPDisplayer();
        
    }
    PreparedStatement pst;
    Connection connect;
    ResultSet rs;
        public void Connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
            JOptionPane.showMessageDialog(null, "Connnected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Repair.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
         public void RTPDisplayer(){
        Timer s = new Timer(200, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                SelectedItem();
            }
        });
          s.start();
       }

    public void SelectedItem(){
          int SelectedPrice = 0;
          int TotalRepairTime = 0;

            if(jCheckBox1.isSelected()){
                SelectedPrice = SelectedPrice + 950;
                
                 TotalRepairTime = TotalRepairTime + 8;
                 
            }
            if(jCheckBox2.isSelected()){
                SelectedPrice = SelectedPrice + 750;
                
                TotalRepairTime = TotalRepairTime + 6;
            }
            if(jCheckBox3.isSelected()){
                SelectedPrice = SelectedPrice + 400;
                
                TotalRepairTime = TotalRepairTime + 3;
            }
            if(jCheckBox4.isSelected()){
                SelectedPrice = SelectedPrice + 750;
                
                TotalRepairTime = TotalRepairTime + 6;
            }
            if(jCheckBox5.isSelected()){
                SelectedPrice = SelectedPrice + 950;
                
                TotalRepairTime = TotalRepairTime + 8;
            }
            if(jCheckBox6.isSelected()){
                SelectedPrice = SelectedPrice + 430;
               
                TotalRepairTime = TotalRepairTime + 4;
            }
            if(jCheckBox7.isSelected()){
                SelectedPrice = SelectedPrice + 1100;
                
                }
            if(jRadioButton1.isSelected()){
                SelectedPrice = SelectedPrice + 100;
            }
            String RepairTimeDisplay;
                    
            int RepairDays = TotalRepairTime / 24;
            int RepairTime = TotalRepairTime % 24;
            if(RepairDays > 0){
                RepairTimeDisplay = (RepairDays + " Day/s and " + RepairTime + " Hour/s");
            }
            else{
                RepairTimeDisplay = RepairTime + " Hour/s";
            }
            
            jLabel50.setText("Estimated time: " + RepairTimeDisplay);
            jLabel47.setText(String.valueOf(SelectedPrice));
            
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jTextField63 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel47 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jTextField70 = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel50 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel181 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel182 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(750, 750));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel26.setBackground(new java.awt.Color(102, 204, 255));

        jLabel91.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel91.setText("jkloptics@gmail.com");

        jLabel92.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel92.setText("jklBuyOptic@facebook.com");

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setText("4231, Brgy 7. Nasugbu Batangas 123456. Store # 23");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel16.setText("JKL Optical Clinic");

        jLabel18.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel18.setText("Official Prescription Receipt");

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setText("Transaction No.");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel20.setText("Name:");

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel22.setText("Age:");

        jLabel25.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel25.setText("Address:");

        jLabel21.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel26.setText("Contact:");

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel27.setText("Date:");

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel30.setText("Doctor Name:");

        jLabel31.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel34.setText("Grade Level:");

        jLabel49.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel93.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel93.setText("Patient Bill:");

        jLabel94.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));

        jSeparator19.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 255));

        jLabel96.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel98.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel100.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel101.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel102.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel102.setText("Personal Information");

        jLabel104.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel104.setText("jLabel57");

        jLabel105.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel105.setText("Prescription Details");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel106.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator22.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel18))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(270, 270, 270)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel104)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel27Layout.createSequentialGroup()
                                                    .addComponent(jLabel20)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel105))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGap(243, 243, 243)
                                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1044, 1044, 1044)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGap(527, 527, 527)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(167, 167, 167)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(265, 265, 265))))))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel102))
                                .addGap(237, 237, 237)
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(267, 267, 267)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel93)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(555, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel27)
                    .addComponent(jLabel104))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(jLabel105))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel98)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel100)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addGap(152, 152, 152)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(747, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 943, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel91)))
                        .addGap(58, 58, 58))
                    .addComponent(jLabel17)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 828));

        setPreferredSize(new java.awt.Dimension(1650, 1490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 682));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setPreferredSize(new java.awt.Dimension(1650, 690));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel150.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel150.setText("Update Reservation Form");
        jPanel45.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 64, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel11.setText("Month");
        jPanel45.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, -1));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        jLabel151.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel151.setText("Personal Information");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("First Name");

        jLabel152.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel152.setText("Last Name");

        jLabel153.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel153.setText("Age");

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel154.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel154.setText("Contact Number");

        jLabel155.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel155.setText("Address");

        jTextField6.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField4.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField5.setPreferredSize(new java.awt.Dimension(64, 31));

        jLabel156.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel156.setText("Email Address");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel152)
                            .addComponent(jLabel153)
                            .addComponent(jLabel12))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel156)
                                    .addComponent(jLabel154))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel151)
                .addGap(3, 3, 3)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel152)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel153))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel155))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel156)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel154)))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel45.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1951, 190));
        jPanel45.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1474, 1959, 10));

        jLabel46.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel46.setText("Initial Check Up Fee:");
        jPanel45.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel47.setText("jLabel47");
        jPanel45.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, -1, -1));

        jLabel157.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel157.setText("Payment Details");
        jPanel45.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, -1));

        jLabel158.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel158.setText("Minimum down payment is 500 pesos.");
        jPanel45.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 622, 307, -1));

        jTextField63.setText("500");
        jPanel45.add(jTextField63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1813, 650, 91, -1));

        jLabel45.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel45.setText("Down Payment:");
        jPanel45.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 647, -1, -1));

        jLabel159.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel159.setText("Possible Issues");
        jPanel45.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel160.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel160.setText("Repair Details");
        jPanel45.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 683, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportView(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox1.setText("Broken or Cracked Lens");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox2.setText("Scratched Lens");

        jCheckBox3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox3.setText("Loose Frame");

        jCheckBox4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox4.setText("Broken Frame");

        jCheckBox5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox5.setText("Damaged Hinges");

        jCheckBox6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox6.setText("Frame Alignment Issues");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox7.setText("New Prescription");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(163, 163, 163)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox5))
                        .addGap(48, 48, 48)
                        .addComponent(jCheckBox4)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel4);

        jPanel45.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1140, 112));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Mode");
        jPanel47.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton1.setText("Delivery");
        jPanel47.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton2.setText("Pick-Up");
        jPanel47.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Estimated Day/Hours of Repair");
        jPanel47.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel50.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel50.setText("jLabel50");
        jPanel47.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel47.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 6, 40, 80));

        jPanel45.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 640, 105));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Expected Time and Pick-Up Modality Details");
        jPanel45.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 20));
        jPanel45.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 684, 10));
        jPanel45.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 650, 20));
        jPanel45.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1210, 20));

        jLabel13.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel13.setText("Delivery charges 100 pesos");
        jPanel45.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel45.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 10, 160));
        jPanel45.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 680, 20));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel45.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 690, -1, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setText("Enter your Transaction Number");
        jPanel45.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField37.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel45.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 100, -1));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel45.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel48.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel48.setText("Down Payment:");
        jPanel45.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, -1, -1));

        jTextField38.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField38.setText("500");
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        jPanel45.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 90, -1));

        jPanel1.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 682));
        jPanel2.setPreferredSize(new java.awt.Dimension(1650, 1490));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel48.setPreferredSize(new java.awt.Dimension(1650, 690));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel161.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("LJK Optical Clinic");
        jPanel48.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1366, 58));

        jLabel162.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel162.setText("Check Up Reservation Form");
        jPanel48.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 64, -1, -1));

        jLabel163.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel163.setText("Month");
        jPanel48.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, -1));

        jLabel164.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel164.setText("Personal Information");

        jLabel165.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel165.setText("First Name");

        jLabel166.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel166.setText("Last Name");

        jLabel167.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel167.setText("Age");

        jTextField64.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField65.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField66.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel168.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel168.setText("Contact Number");

        jLabel169.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel169.setText("Address");

        jTextField67.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField68.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField69.setPreferredSize(new java.awt.Dimension(64, 31));

        jLabel170.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel170.setText("Email Address");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel166)
                            .addComponent(jLabel167)
                            .addComponent(jLabel165))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel170)
                                    .addComponent(jLabel168))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addComponent(jLabel169)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel164)
                .addGap(3, 3, 3)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel165)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel166)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel167))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel169))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel170)
                            .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168)))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1951, 190));
        jPanel48.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1474, 1959, 10));

        jLabel171.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel171.setText("Initial Check Up Fee:");
        jPanel48.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jLabel172.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel172.setText("jLabel47");
        jPanel48.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, -1, -1));

        jLabel173.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel173.setText("Payment Details");
        jPanel48.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, -1));

        jLabel174.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel174.setText("Minimum down payment is 500 pesos.");
        jPanel48.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 622, 307, -1));

        jTextField70.setText("500");
        jPanel48.add(jTextField70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1813, 650, 91, -1));

        jLabel175.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel175.setText("Down Payment:");
        jPanel48.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 647, -1, -1));

        jLabel176.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel176.setText("Possible Issues");
        jPanel48.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel177.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel177.setText("Repair Details");
        jPanel48.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 683, -1));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jCheckBox8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox8.setText("Broken or Cracked Lens");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox9.setText("Scratched Lens");

        jCheckBox10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox10.setText("Loose Frame");

        jCheckBox11.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox11.setText("Broken Frame");

        jCheckBox12.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox12.setText("Damaged Hinges");

        jCheckBox13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox13.setText("Frame Alignment Issues");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jCheckBox14.setText("New Prescription");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10))
                .addGap(163, 163, 163)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox14)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox12))
                        .addGap(48, 48, 48)
                        .addComponent(jCheckBox11)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox9))
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox10))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel5);

        jPanel48.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1140, 112));

        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel178.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel178.setText("Mode");
        jPanel50.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton3.setText("Delivery");
        jPanel50.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton4.setText("Pick-Up");
        jPanel50.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel179.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel179.setText("Estimated Day/Hours of Repair");
        jPanel50.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel180.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel180.setText("jLabel50");
        jPanel50.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator36.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel50.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 6, 40, 80));

        jPanel48.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 640, 105));

        jLabel181.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel181.setText("Expected Time and Pick-Up Modality Details");
        jPanel48.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        jPanel48.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 684, 10));
        jPanel48.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 650, 20));
        jPanel48.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1210, 20));

        jLabel182.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel182.setText("Delivery charges 100 pesos");
        jPanel48.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jSeparator40.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel48.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 10, 160));
        jPanel48.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 680, 20));

        jPanel2.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1660, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1300, 1459));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        
        try {
            String TransactionNumber = jTextField37.getText();
            pst = connect.prepareStatement("SELECT * FROM `repairdb` WHERE `TransactionNumber` = ?");
            pst.setString(1, TransactionNumber);
            rs = pst.executeQuery();
        
            if(rs.next() == true){
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField5.setText(rs.getString(6));
                jTextField6.setText(rs.getString(7));
                jTextField38.setText(rs.getString(10));
                String Issues = (rs.getString(8));
                String[] issueArray = Issues.split(", ");
                System.out.println("Issue Array: " + Arrays.toString(issueArray));  // Debugging line

                // Uncheck all checkboxes first
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);

                for (String issue : issueArray) {
                    System.out.println("Processing issue: " + issue);  // Debugging line
                    switch (issue) {
                        case "Broken/Cracked Lens" -> jCheckBox1.setSelected(true);
                        case "Scratched Lens" -> jCheckBox2.setSelected(true);
                        case "Loose Frame" -> jCheckBox3.setSelected(true);
                        case "Broken Frame" -> jCheckBox4.setSelected(true);
                        case "Damaged Hinges" -> jCheckBox5.setSelected(true);
                        case "Frame Alignment Issues" -> jCheckBox6.setSelected(true);
                        case "New Prescription" -> jCheckBox7.setSelected(true);
                    }
                }
                String Mode = rs.getString(9);
                if("Delivery".equals(Mode)){
                    jRadioButton1.setSelected(true);
                }
                else{
                    
                    jRadioButton2.setSelected(true);
                }
                String Remove = "DELETE FROM repairdb WHERE `repairdb`.`TransactionNumber` = ?";
                
                try {
                    // Prepare the statement for deleting the record
                    pst = connect.prepareStatement(Remove);
                    
                    if (TransactionNumber.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Transaction Number is required.");
                        return;  // Exit if the Transaction Number is not provided
                    }
                    
                    // Set the TransactionNumber in the PreparedStatement
                    pst.setString(1, TransactionNumber);
                    
                    // Show confirmation dialog before deletion
                    int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this record?");
                    if (d == JOptionPane.YES_OPTION) {
                        // Execute the delete query
                        int C = pst.executeUpdate();
                        if (C == 1) {
                            JOptionPane.showMessageDialog(null, "Record removed successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "No record found with the given Transaction Number.");
                        }
                    } else {        
                        JOptionPane.showMessageDialog(null, "Record removal canceled.");
                    }
                } catch (SQLException ex) {
                    // Handle SQL exceptions
                    Logger.getLogger(RepairUpdatePane.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error removing record: " + ex.getMessage());
                }
                
                
            }
            else {
                // If no record found
                JOptionPane.showMessageDialog(null, "No record found with Transaction Number: " + TransactionNumber);
            }
            /*jTextField8.setText(rs.getString(9));
            jTextField9.setText(rs.getString(10));
            jTextField10.setText(rs.getString(11));*/
            
            // SQL query for deleting the record by TransactionNumber
        } catch (SQLException ex) {
            Logger.getLogger(RepairUpdatePane.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
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
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
