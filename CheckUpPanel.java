/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserHP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.Timer;


public class CheckUpPanel extends javax.swing.JPanel {

    Random rand = new Random();
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
    int TransactionNumber = rand.nextInt(10000);
    
          
    String ResTime;
    public CheckUpPanel() {
        initComponents();        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();   
        SchedRefresher();
        jLabel7.setText(CurrentDate);
        jLabel47.setText(String.valueOf(CheckUpFee));
        JSpinner.NumberEditor NoComma = new JSpinner.NumberEditor(jSpinner3, "#");
        jSpinner3.setEditor(NoComma);
        f();
    }

PreparedStatement pst;
    Connection connect;
    ResultSet rs;
    
   public void f(){
        
            Month = (int) jSpinner1.getValue();
            Day = (int) jSpinner2.getValue();
            Year = (int) jSpinner3.getValue();
            SelectedDay = (String.valueOf(Year)+"-"+String.valueOf(Month)+"-" + String.valueOf(Day));
            //JOptionPane.showMessageDialog(null, SelectedDay);
            System.out.print(SelectedDay);
   }
    
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
           // JOptionPane.showMessageDialog(null, "Connnected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MInterface.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        
    }
    public void SchedRefresher(){
    Timer refresh = new Timer(10000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    Disabler();
                }
            });
       refresh.start();
    }

    public boolean CheckSc(String UserTime) throws SQLException{
        
        String CheckSched = ("SELECT COUNT(*) FROM PatientDB WHERE ReserveTime = ? AND ReservedDate = ?");
        pst = connect.prepareStatement(CheckSched);
        pst.setString(1, UserTime);
        pst.setString(2, SelectedDay);
        rs = pst.executeQuery();
        rs.next();
        int SchedRow = rs.getInt(1);
        return SchedRow > 0;   
    }
    public void Disabler(){
        
        try {
            if(CheckSc("08:00:00")){
                jRadioButton1.setEnabled(false);
            }
            else{
                jRadioButton1.setEnabled(true);
            }
            if(CheckSc("10:00:00")){
                jRadioButton2.setEnabled(false);
            }
            else{
                jRadioButton2.setEnabled(true);
            }
            if(CheckSc("12:00:00")){
                jRadioButton3.setEnabled(false);
            }
            else{
                jRadioButton3.setEnabled(true);
            }
            if(CheckSc("14:00:00")){
                jRadioButton4.setEnabled(false);
            }
            else{
                jRadioButton4.setEnabled(true);
            }
            if(CheckSc("16:00:00")){
                jRadioButton5.setEnabled(false);
            }
            else{
                jRadioButton5.setEnabled(true);
            }
            if(CheckSc("18:00:00")){
                jRadioButton6.setEnabled(false);
            }
            else{
                jRadioButton6.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
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
        jLabel44 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
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

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(750, 750));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel53.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel53.setText("jkloptics@gmail.com");

        jLabel54.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel54.setText("jklBuyOptic@facebook.com");

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setText("4231, Brgy 7. Nasugbu Batangas 123456. Store # 23");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel16.setText("JKL Optical Clinic");

        jLabel18.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel18.setText("Official Prescription Receipt");

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setText("Transaction No.");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel20.setText("Patient Name:");

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
        jLabel28.setText("Dra. Geni Eindecember");

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel30.setText("Doctor Name:");

        jLabel31.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel32.setText("Appointed Date");

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel35.setText("Scheduled Time:");

        jLabel36.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel48.setText("Patient Bill:");

        jLabel49.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));

        jSeparator7.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 255));

        jLabel51.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel59.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel59.setText("Personal Information");

        jLabel60.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel60.setText("jLabel56");

        jLabel61.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel61.setText("jLabel57");

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel63.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator10.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel61)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(438, 438, 438)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(0, 198, Short.MAX_VALUE)
                                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(167, 167, 167)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGap(171, 171, 171)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(265, 265, 265)))))))
                        .addGap(267, 267, 267)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(693, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel60)
                    .addComponent(jLabel27)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel59)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel63)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel55)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel57)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35)))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel48)
                .addGap(127, 127, 127)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(747, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel53))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel16))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 828));

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1650, 1490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton6.setText("6:00 PM");
        add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton4.setText("2:00 PM");
        add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setText("Confirm Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, -1, -1));

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 333, -1));

        jLabel34.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel34.setText("Gender:\n");
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("Last Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel42.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel42.setText("Payment Details");
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel46.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel46.setText("Initial Check Up Fee:");
        add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("Contact Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 167, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton2.setText("10:00 AM");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 330, -1));

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField3InputMethodTextChanged(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Day");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton3.setText("12:00 PM");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Month");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jSpinner2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner2.setValue(CurrentDay

        );
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1354, 10));

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 200, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner1.setValue(CurrentMonth
        );
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 167, 30));

        buttonGroup2.add(Fradio);
        Fradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fradio.setText("Female");
        add(Fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel47.setText("jLabel47");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setText("Month");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("First Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Email Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Year");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel39.setText("Appointment Date");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2024, 2024, null, 1));
        jSpinner3.setValue(CurrentYear
        );
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jLabel44.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel44.setText("Minimum down payment is 500 pesos.");
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 380, -1));

        jTextField8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField8.setText("500");
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 91, -1));

        jLabel43.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("LJK Optical Clinic");
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 1366, 58));

        buttonGroup2.add(Mradio);
        Mradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Mradio.setText("Male");
        add(Mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1354, 10));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton5.setText("4:00 PM");
        add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel38.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel38.setText("Appointment Time");
        add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel37.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel37.setText("Personal Information");
        add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jRadioButton1.setText("8:00 AM");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 20, 112));

        jLabel45.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel45.setText("Down Payment:");
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        jLabel40.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel40.setText("Appointment Details");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, -1));

        jLabel41.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel41.setText("Check Up Reservation Form");
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1210, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

            jRadioButton1.setActionCommand("08:00:00");
            jRadioButton2.setActionCommand("10:00:00");
            jRadioButton3.setActionCommand("12:00:00");
            jRadioButton4.setActionCommand("14:00:00");
            jRadioButton5.setActionCommand("16:00:00");
            jRadioButton6.setActionCommand("18:00:00");
            Fradio.setActionCommand("F");
            Mradio.setActionCommand("M");

            int C;
            String UserfName = jTextField1.getText();
            String UserlName = jTextField2.getText();
            String UserGender = buttonGroup2.getSelection().getActionCommand();
            int UserAge = Integer.parseInt(jTextField3.getText());
            String UserAddress = jTextField4.getText();
            String UserEAddress = jTextField5.getText();
            long UserContact = Long.parseLong(jTextField6.getText());
            String UserTime = buttonGroup1.getSelection().getActionCommand();
            String UserDate = SelectedDay;
            String TransactN = String.valueOf(TransactionNumber);
            JOptionPane.showMessageDialog(null, TransactN);

            if (Month < CurrentMonth || Year < CurrentYear || Day < CurrentDay){
                JOptionPane.showMessageDialog(null, "Check Current Date");
                jSpinner1.setValue(CurrentMonth);
                jSpinner2.setValue(CurrentDay);
                jSpinner3.setValue(CurrentYear);
            }
            else{
                try {
                    if(!CheckSc(UserTime)){
                        
                        String Insert = ("INSERT INTO patientDB (UserFName,UserLName,UserGender, UserAge,UserAddress,UserEmail,UserContact,ReserveTime,ReservedDate,TransactionNumber) VALUES (?,?,?,?,?,?,?,?,?,?)");
                        pst = connect.prepareStatement(Insert);
                        
                        pst.setString(1, UserfName);
                        pst.setString(2, UserlName);
                        pst.setString(3, UserGender);
                        pst.setInt(4, UserAge);
                        pst.setString(5, UserAddress);
                        pst.setString(6, UserEAddress);
                        pst.setLong(7, UserContact);
                        pst.setString(8, UserTime);
                        pst.setString(9, UserDate);
                        pst.setString(10, TransactN);
                        
                        int d = JOptionPane.showConfirmDialog(null, "Confirm Addition?");
                        if(d == JOptionPane.YES_OPTION){
                            C = pst.executeUpdate();
                            if (C==1){
                                JOptionPane.showMessageDialog(null, "Recorded Successfully");
                                jLabel60.setText(TransactN);
                                jLabel21.setText(UserfName +" "+ UserlName);
                                jLabel23.setText(String.valueOf(UserAge));
                                jLabel24.setText(UserAddress);
                                jLabel29.setText(String.valueOf(UserContact));
                                jLabel58.setText(UserTime);
                                jLabel32.setText("Appointed Date: " + UserDate);
                                jLabel61.setText(UserDate);
                                //jLabel48.setText("To be paid: "+  String.valueOf(CheckUpFee));
                                int Dpayment = Integer.parseInt(jTextField8.getText());
                                if (Dpayment > CheckUpFee){
                                    JOptionPane.showMessageDialog(null,"Down payment exceed Check Up fee!");
                                }
                                else if (Dpayment < 500){
                                    JOptionPane.showMessageDialog(null,"Down payment is less than the minimum!");
                                }
                                else{
                                    int Tpayment = CheckUpFee - Dpayment;
                                    //jLabel48.setText(String.valueOf(Dpayment));
                                    jLabel48.setText("To be paid: "+  String.valueOf(Tpayment));
                                    
                                    jFrame1.setVisible(true);
                                    
                                }
                            }

                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CheckUpPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField3InputMethodTextChanged

    }//GEN-LAST:event_jTextField3InputMethodTextChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        SchedRefresher();
        Disabler();
        f();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        SchedRefresher();
        Disabler();
        f();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        SchedRefresher();
        Disabler();
        f();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
