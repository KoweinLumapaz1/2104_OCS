/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserHP;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author jolo
 */
public class PrescriptionPanel extends javax.swing.JPanel {
    Random rand = new Random();
    int TransactionNumber = rand.nextInt(10000);
    LocalDate CurrentDate = java.time.LocalDate.now();
    double Rlevel;
    double Llevel;
    public PrescriptionPanel() {
        initComponents();      
        Connect();
        F();
        Sa();
        //ScaleImage();
    }

    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    public void F(){
        Rlevel = (double) jSpinner5.getValue();
        Llevel = (double) jSpinner4.getValue();
    }

    public void Connect(){
    
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
    }
         public void ScaleImage(){
        
        ImageIcon icon = new ImageIcon("C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\UserHP\\462576275_2078290172628350_5828185968021327589_n.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel8.getWidth(),jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel8.setIcon(scaledIcon);
    }
    public void Sa(){
            if(glasses.isSelected()){
            natural.setEnabled(false);
            brown.setEnabled(false);
            gray.setEnabled(false);
            }
            else if(contactlense.isSelected()){
            ovalRadio.setEnabled(false);
            squareRadio.setEnabled(false);
            rectangleRadio.setEnabled(false);
                    }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
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
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(750, 750));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));

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

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel30.setText("Doctor Name:");

        jLabel31.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel32.setText("Optical Type:");

        jLabel33.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel34.setText("Grade Level:");

        jLabel35.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel36.setText("Patient Bill:");

        jLabel37.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));

        jSeparator3.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));

        jLabel38.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel38.setText("FrameType:");

        jLabel39.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel40.setText("Frame Shape:");

        jLabel41.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel42.setText("Con.Color:");

        jLabel43.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel55.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel55.setText("Personal Information");

        jLabel56.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel56.setText("jLabel56");

        jLabel57.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel57.setText("jLabel57");

        jLabel58.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel58.setText("Prescription Details");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel59.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jSeparator9.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));

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
                                .addComponent(jLabel56)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel57)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addGap(50, 50, 50)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel58)
                                                            .addComponent(jLabel32)))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(167, 167, 167)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel42)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel38)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(265, 265, 265))))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel40)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel55))
                                .addGap(438, 438, 438)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(267, 267, 267)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel36)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(555, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel56)
                    .addComponent(jLabel27)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jLabel58))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel59))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(152, 152, 152)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(747, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel53)))
                        .addGap(58, 58, 58))
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16)))
                .addContainerGap(397, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 828));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 43, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 126, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Gender:\n");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 171, -1, -1));

        buttonGroup5.add(Fradio);
        Fradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fradio.setText("Female");
        Fradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FradioActionPerformed(evt);
            }
        });
        jPanel2.add(Fradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 169, -1, -1));

        buttonGroup5.add(Mradio);
        Mradio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Mradio.setText("Male");
        jPanel2.add(Mradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        TextFirst.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel2.add(TextFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 170, -1));

        TextLast.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel2.add(TextLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        TextAge.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel2.add(TextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 90, -1));

        Textaddress.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Textaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextaddressActionPerformed(evt);
            }
        });
        jPanel2.add(Textaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 251, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setText("Email Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        Textemail.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel2.add(Textemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 251, -1));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 241, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1641, 10));

        buttonGroup2.add(rectangleRadio);
        rectangleRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        rectangleRadio.setText("Rectangle");
        jPanel2.add(rectangleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        buttonGroup2.add(squareRadio);
        squareRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        squareRadio.setText("Square");
        jPanel2.add(squareRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        buttonGroup2.add(ovalRadio);
        ovalRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ovalRadio.setText("Oval");
        jPanel2.add(ovalRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("Frame Shape:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setText("Grade Level:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("Frame Type:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        buttonGroup4.add(plasticRadio);
        plasticRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        plasticRadio.setText("Plastic");
        jPanel2.add(plasticRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        buttonGroup4.add(metalRadio);
        metalRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        metalRadio.setText("Metal");
        jPanel2.add(metalRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        buttonGroup4.add(woodRadio);
        woodRadio.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        woodRadio.setText("Wood");
        jPanel2.add(woodRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        availB.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        availB.setText("Avail Prescription");
        availB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availBActionPerformed(evt);
            }
        });
        jPanel2.add(availB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 270, -1));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setText("Contact Number");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        Textcontact.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Textcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextcontactActionPerformed(evt);
            }
        });
        jPanel2.add(Textcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 251, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setText("Optical Type:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        buttonGroup1.add(glasses);
        glasses.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        glasses.setText("Glasses");
        glasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassesActionPerformed(evt);
            }
        });
        jPanel2.add(glasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        buttonGroup1.add(contactlense);
        contactlense.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        contactlense.setText("Contact Lense");
        jPanel2.add(contactlense, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setText("Con.Lense Color");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        buttonGroup3.add(natural);
        natural.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        natural.setText("Natural");
        jPanel2.add(natural, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        buttonGroup3.add(brown);
        brown.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        brown.setText("Brown");
        jPanel2.add(brown, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        buttonGroup3.add(gray);
        gray.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        gray.setText("Gray");
        jPanel2.add(gray, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jLabel47.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel47.setText("Personal Information");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 10, 501));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 868, 698, 10));

        jLabel49.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel49.setText("Price list");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));

        jLabel50.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel50.setText("R");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jLabel51.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel51.setText("L");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jSpinner4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        jSpinner5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });
        jPanel2.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Order Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 400, 320));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 1400, 1250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 1384, -1));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("LJK Optical Clinic");
        add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1366, 58));

        jLabel61.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel61.setText("Optical Prescription Form");
        add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void availBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availBActionPerformed
        System.out.print(Rlevel);
        jFrame1.setVisible(true);
        // Collect data from the form
        String fname = TextFirst.getText();
        String lname = TextLast.getText();
        String age = TextAge.getText();
        String address = Textaddress.getText();
        String gender = Fradio.isSelected() ? "F" : "M";
        String contact = Textcontact.getText();
        String email = Textemail.getText();
        String doctor = "Dra. Geni Eindecember";
        String opticaltype = glasses.isSelected() ? "glasses" : "contactlense";

        

        // Define prices
        double frameShapePrice = 0;
        double frameTypePrice = 0;
        double contactLensColorPrice = 0;

        // Handle conditional fields and prices
        String contype = "";
        String frameShape = "";
        String frameType = "";

        if (opticaltype.equals("contactlense")) {
            opticaltype = "Contact Lense";
            contype = natural.isSelected() ? "Natural" : brown.isSelected() ? "brown" : gray.isSelected() ? "gray" : "";
            if (contype.equals("Natural")) contactLensColorPrice = 1050.0;
            else if (contype.equals("brown")) contactLensColorPrice = 1250.0;
            else if (contype.equals("gray")) contactLensColorPrice = 1250.0;

            // Check if frame type/shape fields are mistakenly selected
            if (rectangleRadio.isSelected() || squareRadio.isSelected() || ovalRadio.isSelected() ||
                plasticRadio.isSelected() || metalRadio.isSelected() || woodRadio.isSelected()) {
                JOptionPane.showMessageDialog(null, "You cannot select frame shape or type when choosing contact lenses.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (opticaltype.equals("glasses")) {
            opticaltype = "Glasses";
            frameShape = rectangleRadio.isSelected() ? "Rectangle" : squareRadio.isSelected() ? "Square" : "Oval";
            frameType = plasticRadio.isSelected() ? "Plastic" : metalRadio.isSelected() ? "Metal" : "Wood";

            switch (frameShape) {
                case "Rectangle":
                frameShapePrice = 650.0;
                break;
                case "Square":
                frameShapePrice = 550.0;
                break;
                case "Oval":
                frameShapePrice = 800.0;
                break;
                default:
                break;
            }

            switch (frameType) {
                case "Plastic":
                frameTypePrice = 1000.0;
                break;
                case "Metal":
                frameTypePrice = 1500.0;
                break;
                case "Wood":
                frameTypePrice = 1200.0;
                break;
                default:
                break;
            }

            // Check if contact lens color is mistakenly selected
            if (natural.isSelected() || brown.isSelected() || gray.isSelected()) {
                JOptionPane.showMessageDialog(null, "You cannot select contact lens color when choosing glasses.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Calculate total price
        double totalPrice = frameShapePrice + frameTypePrice + contactLensColorPrice;

        // Validate mandatory fields
        if (fname.isEmpty() || lname.isEmpty() || age.isEmpty() || address.isEmpty() || contact.isEmpty() || email.isEmpty() ||
            doctor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int ageInt = Integer.parseInt(age); // Validate age as an integer

            // Confirm total price with the user
            int confirm = JOptionPane.showConfirmDialog(null, "Total Price: " + totalPrice + "\nDo you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;

            // Insert into database
            pst = connect.prepareStatement("INSERT INTO prescribeform(Fname, Lname, Age, Gender, Address, Contact, Email, OpticalType, Fshape, ConType, Ftype, RLevel, LLevel, Price,  TransactionNumber)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setInt(3, ageInt);
            pst.setString(4, gender);
            pst.setString(5, address);
            pst.setString(6, contact);
            pst.setString(7, email);
            pst.setString(8, opticaltype);
            pst.setString(9, frameShape);  // Will be blank for contact lenses
            pst.setString(10, contype);     // Will be blank for glasses
            pst.setString(11, frameType);  // Will be blank for contact lenses
            pst.setDouble(12, Rlevel);
            pst.setDouble(13, Llevel);
            pst.setDouble(14, totalPrice); // Insert total price
            pst.setInt(15, TransactionNumber);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                jLabel21.setText(fname + " " + lname);
                jLabel23.setText(String.valueOf(age));
                jLabel24.setText(address);
                jLabel29.setText(contact);
                jLabel59.setText(opticaltype);
                jLabel35.setText(String.valueOf(Rlevel));
                jLabel52.setText(String.valueOf(Llevel));
                jLabel28.setText(doctor);
                jLabel36.setText("Patient Bill " + String.valueOf(totalPrice));
                jLabel39.setText(frameType);
                jLabel41.setText(frameShape);
                jLabel43.setText(contype);
                jLabel57.setText(String.valueOf(CurrentDate));
                jLabel56.setText(String.valueOf(TransactionNumber));
                jFrame1.setVisible(true);
            }
            connect.close();
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format for age or prescription level.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_availBActionPerformed

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        F();
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        F();
    }//GEN-LAST:event_jSpinner5StateChanged

    private void FradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FradioActionPerformed

    private void glassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassesActionPerformed

    }//GEN-LAST:event_glassesActionPerformed

    private void TextcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextcontactActionPerformed

    private void TextaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextaddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.JTextField TextAge;
    private javax.swing.JTextField TextFirst;
    private javax.swing.JTextField TextLast;
    private javax.swing.JTextField Textaddress;
    private javax.swing.JTextField Textcontact;
    private javax.swing.JTextField Textemail;
    private javax.swing.JButton availB;
    private javax.swing.JRadioButton brown;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton contactlense;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JRadioButton glasses;
    private javax.swing.JRadioButton gray;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JRadioButton metalRadio;
    private javax.swing.JRadioButton natural;
    private javax.swing.JRadioButton ovalRadio;
    private javax.swing.JRadioButton plasticRadio;
    private javax.swing.JRadioButton rectangleRadio;
    private javax.swing.JRadioButton squareRadio;
    private javax.swing.JRadioButton woodRadio;
    // End of variables declaration//GEN-END:variables
}
