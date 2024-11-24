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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jolo
 */
public class RepairPane extends javax.swing.JPanel {
     LocalDate UserDate = java.time.LocalDate.now();
     String CurrentDate = UserDate.toString();
     ArrayList <String> Slist = new ArrayList <String>();
     String d = join(", ", Slist);
    /**
     *
     */
    public RepairPane() {
        
        initComponents();
        initComponents();
        RTPDisplayer();
        Connect();
        jLabel11.setText(CurrentDate);
        System.out.print(d);
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
Random rand = new Random();
    int TransactionNumber = rand.nextInt(10000);
    
    
 
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
          Slist.clear();
            if (jCheckBox1.isSelected()) {
        SelectedPrice += 950;
        Slist.add("Broken/Cracked Lens");
        TotalRepairTime += 8;
    }
    if (jCheckBox2.isSelected()) {
        SelectedPrice += 750;
        Slist.add("Scratched Lens");
        TotalRepairTime += 6;
    }
    if (jCheckBox3.isSelected()) {
        SelectedPrice += 400;
        Slist.add("Loose Frame");
        TotalRepairTime += 3;
    }
    if (jCheckBox4.isSelected()) {
        SelectedPrice += 750;
        Slist.add("Broken Frame");
        TotalRepairTime += 6;
    }
    if (jCheckBox5.isSelected()) {
        SelectedPrice += 950;
        Slist.add("Damaged Hinges");
        TotalRepairTime += 8;
    }
    if (jCheckBox6.isSelected()) {
        SelectedPrice += 430;
        Slist.add("Frame Alignment Issues");
        TotalRepairTime += 4;
    }
    if (jCheckBox7.isSelected()) {
        SelectedPrice += 1100;
        Slist.add("New Prescription");
    }
    if (jRadioButton1.isSelected()) {
        SelectedPrice += 100;
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
            d = String.join(", ", Slist);
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
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel76 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

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

        jLabel31.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

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
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
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
                                .addGap(138, 138, 138)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(261, 261, 261)
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
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1035, 1035, 1035)
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
                                .addComponent(jLabel102)
                                .addGap(247, 247, 247)
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
                .addGap(19, 19, 19)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addContainerGap(767, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addContainerGap(218, Short.MAX_VALUE))
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
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE))
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

        setMinimumSize(new java.awt.Dimension(1366, 682));
        setPreferredSize(new java.awt.Dimension(1650, 1490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(1650, 690));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("LJK Optical Clinic");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1366, 58));

        jLabel52.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel52.setText("Repair Request Form");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 64, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel11.setText("Month");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel53.setText("Personal Information");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("First Name");

        jLabel54.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel54.setText("Last Name");

        jLabel55.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel55.setText("Age");

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel56.setText("Contact Number");

        jLabel57.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel57.setText("Address");

        jTextField6.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField4.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField5.setPreferredSize(new java.awt.Dimension(64, 31));

        jLabel58.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel58.setText("Email Address");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel12))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel56))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addGap(3, 3, 3)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel55))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField4, jTextField5});

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1951, 190));
        jPanel11.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1474, 1959, 10));

        jLabel46.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel46.setText("Initial Check Up Fee:");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel47.setText("jLabel47");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, -1, -1));

        jLabel42.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel42.setText("Payment Details");
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, -1));

        jLabel44.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel44.setText("Minimum down payment is 500 pesos.");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 622, 307, -1));

        jTextField8.setText("500");
        jPanel11.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1813, 650, 91, -1));

        jLabel45.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel45.setText("Down Payment:");
        jPanel11.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 647, -1, -1));

        jLabel38.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel38.setText("Possible Issues");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel40.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel40.setText("Repair Details");
        jPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 683, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
                .addContainerGap()
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
                .addContainerGap(426, Short.MAX_VALUE))
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

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1210, 112));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Mode");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton1.setText("Delivery");
        jPanel10.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton2.setText("Pick-Up");
        jPanel10.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Estimated Day/Hours of Repair");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel50.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel50.setText("jLabel50");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel10.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 6, 40, 80));

        jPanel11.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 640, 105));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Expected Time and Pick-Up Modality Details");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        jPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 684, 10));
        jPanel11.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 650, 20));
        jPanel11.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1210, 20));

        jLabel13.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel13.setText("Delivery charges 100 pesos");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel11.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 10, 160));
        jPanel11.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 680, 20));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setText("Confirm Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, -1, -1));

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 682));
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(1650, 690));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("LJK Optical Clinic");
        jPanel12.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1366, 58));

        jLabel60.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel60.setText("Check Up Reservation Form");
        jPanel12.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 64, -1, -1));

        jLabel37.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel37.setText("Month");
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, -1, -1));

        jLabel61.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel61.setText("Personal Information");

        jLabel41.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel41.setText("First Name");

        jLabel62.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel62.setText("Last Name");

        jLabel63.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel63.setText("Age");

        jTextField7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel64.setText("Contact Number");

        jLabel65.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel65.setText("Address");

        jTextField11.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField12.setPreferredSize(new java.awt.Dimension(64, 31));

        jTextField13.setPreferredSize(new java.awt.Dimension(64, 31));

        jLabel66.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel66.setText("Email Address");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel41))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel64))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel61)
                .addGap(3, 3, 3)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel63))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1951, 190));
        jPanel12.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1474, 1959, 10));

        jLabel67.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel67.setText("Initial Check Up Fee:");
        jPanel12.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jLabel68.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel68.setText("jLabel47");
        jPanel12.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, -1, -1));

        jLabel43.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel43.setText("Payment Details");
        jPanel12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, -1));

        jLabel69.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel69.setText("Minimum down payment is 500 pesos.");
        jPanel12.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 622, 307, -1));

        jTextField14.setText("500");
        jPanel12.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1813, 650, 91, -1));

        jLabel70.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel70.setText("Down Payment:");
        jPanel12.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1658, 647, -1, -1));

        jLabel71.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel71.setText("Possible Issues");
        jPanel12.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel72.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel72.setText("Repair Details");
        jPanel12.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 683, -1));

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

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1140, 112));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel73.setText("Mode");
        jPanel13.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton3.setText("Delivery");
        jPanel13.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton4.setText("Pick-Up");
        jPanel13.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel74.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel74.setText("Estimated Day/Hours of Repair");
        jPanel13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel75.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel75.setText("jLabel50");
        jPanel13.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel13.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 6, 40, 80));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 640, 105));

        jLabel76.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel76.setText("Expected Time and Pick-Up Modality Details");
        jPanel12.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        jPanel12.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 684, 10));
        jPanel12.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 650, 20));
        jPanel12.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1210, 20));

        jLabel77.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel77.setText("Delivery charges 100 pesos");
        jPanel12.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel12.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 10, 160));
        jPanel12.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 680, 20));

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 710, -1, -1));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
             /*int Confirmer = JOptionPane.showConfirmDialog(null, "Confirm?");
             if(Confirmer == JOptionPane.YES_OPTION){*/
             jRadioButton1.setActionCommand("Delivery");
             jRadioButton2.setActionCommand("Pick-Up");
             
             /* if(jCheckBox7.isSelected()){
             int Ad = JOptionPane.showConfirmDialog(null, "Reserve Check Up?");
             if (Ad == JOptionPane.YES_OPTION){
             MInterface CheckUpInterface = new MInterface();
             CheckUpInterface.setVisible(true);
             }
             }
             else{*/
             
             String UserfName = jTextField1.getText();
             String UserlName = jTextField2.getText();
             int UserAge = Integer.parseInt(jTextField3.getText());
             String UserAddress = jTextField4.getText();
             String UserEAddress = jTextField5.getText();
             long UserContact = Long.parseLong(jTextField6.getText());
             String Mode = buttonGroup1.getSelection().getActionCommand();
             int DownP = Integer.parseInt(jTextField8.getText());
             String TransactN = String.valueOf(TransactionNumber);
             String Price = jLabel47.getText();
             
             int C;
             
             int FPrice = Integer.parseInt(Price);
             String Insert = ("INSERT INTO `repairdb` (`RCustomerFName`, `RCustomerLName`,`RCustomerAge`, `RCustomerAddress`, `RCustomerEmail`, `RCustomerContact`, `RIssues`,`RCustomerMode`, `RCustomerDown`, `RCustomerFee`, `TransactionNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
             pst = connect.prepareStatement(Insert);
             
             pst.setString(1, UserfName);
             pst.setString(2, UserlName);
             pst.setInt(3, UserAge);
             pst.setString(4, UserAddress);
             pst.setString(5, UserEAddress);
             pst.setLong(6, UserContact);
             pst.setString(7, d);
             pst.setString(8, Mode);
             pst.setInt(9, DownP);
             pst.setInt(10, FPrice);
             pst.setString(11, TransactN);
             
             int ds = JOptionPane.showConfirmDialog(null, "Confirm Addition?");
             if(ds == JOptionPane.YES_OPTION){
                 C = pst.executeUpdate();
                 if (C==1){
                     JOptionPane.showMessageDialog(null, "Recorded Successfully");
                     jLabel21.setText(UserfName +" "+ UserlName);
                     jLabel23.setText(String.valueOf(UserAge));
                     jLabel24.setText(UserAddress);
                     jLabel18.setText(UserEAddress);
                     jLabel29.setText(String.valueOf(UserContact));
                     jLabel104.setText(CurrentDate);
                     jTextArea1.setText(d);
                     
                     jLabel19.setText("Transaction Number: " +String.valueOf(TransactionNumber));
                     int Dpayment = Integer.parseInt(jTextField8.getText());
                     if (Dpayment > FPrice){
                         JOptionPane.showMessageDialog(null,"Down payment exceed Check Up fee!");
                     }
                     else{
                         int Tpayment = FPrice - Dpayment;
                         jLabel93.setText("To be paid: " + String.valueOf(Tpayment));
                         
                         jFrame1.setVisible(true);
                         
                     }
                     
                 } 
             }
         } catch (SQLException ex) {
             Logger.getLogger(RepairPane.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
