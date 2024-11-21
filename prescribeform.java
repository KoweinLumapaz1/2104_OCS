/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prescriptions;


import java.sql. *;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class prescribeform extends javax.swing.JFrame {
    LocalDate CurrentDate = java.time.LocalDate.now();
    String SelectedDate;
    String Date = CurrentDate.toString();
    int CurrentMonth = CurrentDate.getMonthValue();
    int CurrentDay = CurrentDate.getDayOfMonth();
    int CurrentYear = CurrentDate.getYear();
    int Month;
    int Day;
    int Year;
    double Rlevel;
    double Llevel;


    public prescribeform() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();
        JSpinner.NumberEditor Nocomma = new JSpinner.NumberEditor(jSpinner3, "#");
        jSpinner3.setEditor(Nocomma);
        f();
    }
    public void f(){
        
            Month = (int) jSpinner1.getValue();
            Day = (int) jSpinner2.getValue();
            Year = (int) jSpinner3.getValue();
            SelectedDate = (String.valueOf(Year)+"-"+String.valueOf(Month)+"-" + String.valueOf(Day));
            Rlevel = (double) jSpinner5.getValue();
            Llevel = (double) jSpinner4.getValue();
            
   }
    Connection connect;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect(){
    
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prescription_01" ,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        rectangleRadio = new javax.swing.JRadioButton();
        squareRadio = new javax.swing.JRadioButton();
        ovalRadio = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        plasticRadio = new javax.swing.JRadioButton();
        metalRadio = new javax.swing.JRadioButton();
        woodRadio = new javax.swing.JRadioButton();
        TextDname = new javax.swing.JTextField();
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
        jLabel44 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel45 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setPreferredSize(new java.awt.Dimension(700, 650));
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(500, 500));

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel16.setText("JKL Optical Clinic");

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setText("4231, Brgy 7. Nasugbu Batangas 123456. Store # 23");

        jLabel53.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel53.setText("jkl@gmail.com");

        jLabel54.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel54.setText("jklBuyOptic@facebook.com");

        jLabel18.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel18.setText("JKL Optical Clinic Receipt");

        jLabel19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel19.setText("Transaction No.");

        jLabel20.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel20.setText("Patient Name:");

        jLabel22.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel22.setText("Age:");

        jLabel25.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel25.setText("Address:");

        jLabel21.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel26.setText("Contact:");

        jLabel27.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel27.setText("Date:");

        jLabel28.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel30.setText("Doctor Name:");

        jLabel31.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel32.setText("Optical Tye:");

        jLabel33.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel34.setText("Grade Level:");

        jLabel35.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel36.setText("Patient Bill:");

        jLabel37.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));

        jSeparator3.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));

        jLabel38.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel38.setText("FrameType:");

        jLabel39.setText("jLabel39");

        jLabel40.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel40.setText("Frame Shape:");

        jLabel41.setText("jLabel41");

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setText("Con.Color:");

        jLabel43.setText("jLabel43");

        jLabel52.setText("jLabel52");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel55.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel55.setText("Personal Information");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel34))
                                        .addGap(121, 121, 121))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel42))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel41)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel19))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel18))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel55)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel38))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(262, 262, 262)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(79, 79, 79))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(1);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRESCRIPTION FORM");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("First Name:\n");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Last Name:\n");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Age:\n");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Gender:\n");

        Fradio.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Fradio.setText("Female");

        Mradio.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Mradio.setText("Male");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Email:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Doctor Name:\n");

        buttonGroup3.add(rectangleRadio);
        rectangleRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rectangleRadio.setText("Rectangle");

        buttonGroup3.add(squareRadio);
        squareRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        squareRadio.setText("Square");

        buttonGroup3.add(ovalRadio);
        ovalRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ovalRadio.setText("Oval");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText(" Date:");

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setText("Frame Shape:");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel11.setText("Grade Level:");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("Frame Type:");

        buttonGroup4.add(plasticRadio);
        plasticRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        plasticRadio.setText("Plastic");

        buttonGroup4.add(metalRadio);
        metalRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        metalRadio.setText("Metal");

        buttonGroup4.add(woodRadio);
        woodRadio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        woodRadio.setText("Wood");

        availB.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        availB.setText("Avail Prescription");
        availB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availBActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Contact:");

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setText("Optical Type:");

        buttonGroup1.add(glasses);
        glasses.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        glasses.setText("Glasses");

        buttonGroup1.add(contactlense);
        contactlense.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        contactlense.setText("ContactLense");

        jLabel15.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel15.setText("Con.Lense Color");

        buttonGroup5.add(natural);
        natural.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        natural.setText("Natural");

        buttonGroup5.add(brown);
        brown.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        brown.setText("Brown");

        buttonGroup5.add(gray);
        gray.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        gray.setText("Gray");

        jLabel44.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel44.setText("Month");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner1.setValue(CurrentMonth);

        jLabel45.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel45.setText("Day");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner2.setValue(CurrentDay
        );

        jLabel46.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel46.setText("Year");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2024, 2024, 2024, 1));
        jSpinner3.setValue(CurrentYear
        );

        jLabel47.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel47.setText("Personal Information");

        jSeparator4.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 255));

        jLabel48.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel48.setText("Others");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 255));

        jLabel49.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel49.setText("Price list");

        jLabel50.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel50.setText("R");

        jLabel51.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel51.setText("L");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0.0d, -10.0d, 10.0d, 0.5d));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextLast)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(TextAge, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(251, 251, 251)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel13))
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Textcontact)
                                .addComponent(Textaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fradio)
                            .addComponent(Mradio))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel47)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(contactlense)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(TextDname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(squareRadio)
                                                    .addComponent(rectangleRadio)
                                                    .addComponent(plasticRadio)
                                                    .addComponent(metalRadio)
                                                    .addComponent(woodRadio)
                                                    .addComponent(ovalRadio)))
                                            .addComponent(jLabel10))
                                        .addGap(110, 110, 110)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(79, 79, 79))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(brown)
                                                            .addComponent(natural))))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(gray)
                                                    .addGap(10, 10, 10)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel50)
                                                    .addComponent(jLabel51))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(241, 241, 241)
                                        .addComponent(glasses)))
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(availB)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addGap(277, 277, 277)))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Textaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Textcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Textemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Fradio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mradio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(TextDname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(glasses)
                                            .addComponent(contactlense))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel15))
                                                .addComponent(ovalRadio))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(natural)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(squareRadio)
                                                    .addComponent(brown))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rectangleRadio)
                                            .addComponent(gray))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(231, 231, 231))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(plasticRadio)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(metalRadio)))
                                                .addGap(9, 9, 9)
                                                .addComponent(woodRadio)
                                                .addGap(141, 141, 141))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel50))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel51))
                                                .addGap(195, 195, 195)))
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel44)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45)
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46)
                                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel49)
                                        .addGap(257, 257, 257)
                                        .addComponent(availB)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(906, 906, 906))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1353, 1353, 1353))
        );

        setSize(new java.awt.Dimension(1382, 753));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void availBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availBActionPerformed
        // Collect data from the form
    String fname = TextFirst.getText();
    String lname = TextLast.getText();
    String age = TextAge.getText();
    String address = Textaddress.getText();
    String gender = Fradio.isSelected() ? "F" : "M";
    String contact = Textcontact.getText();
    String email = Textemail.getText();
    String doctor = TextDname.getText();
    String date = SelectedDate; 
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
        contype = natural.isSelected() ? "Natural" : brown.isSelected() ? "brown" : gray.isSelected() ? "gray" : "";
        if (contype.equals("Natural")) contactLensColorPrice = 500.0;
        else if (contype.equals("brown")) contactLensColorPrice = 600.0;
        else if (contype.equals("gray")) contactLensColorPrice = 700.0;

        // Check if frame type/shape fields are mistakenly selected
        if (rectangleRadio.isSelected() || squareRadio.isSelected() || ovalRadio.isSelected() ||
            plasticRadio.isSelected() || metalRadio.isSelected() || woodRadio.isSelected()) {
            JOptionPane.showMessageDialog(null, "You cannot select frame shape or type when choosing contact lenses.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } else if (opticaltype.equals("glasses")) {
        frameShape = rectangleRadio.isSelected() ? "Rectangle" : squareRadio.isSelected() ? "Square" : "Oval";
        frameType = plasticRadio.isSelected() ? "Plastic" : metalRadio.isSelected() ? "Metal" : "Glass";

        switch (frameShape) {
            case "Rectangle":
                frameShapePrice = 300.0;
                break;
            case "Square":
                frameShapePrice = 400.0;
                break;
            case "Oval":
                frameShapePrice = 350.0;
                break;
            default:
                break;
        }

        switch (frameType) {
            case "Plastic":
                frameTypePrice = 200.0;
                break;
            case "Metal":
                frameTypePrice = 500.0;
                break;
            case "Glass":
                frameTypePrice = 600.0;
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
        doctor.isEmpty() || date.isEmpty() ) {
        JOptionPane.showMessageDialog(null, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int ageInt = Integer.parseInt(age); // Validate age as an integer

        // Confirm total price with the user
        int confirm = JOptionPane.showConfirmDialog(null, "Total Price: " + totalPrice + "\nDo you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        // Insert into database
        pst = connect.prepareStatement("INSERT INTO prescribeform(Fname, Lname, Age, Gender, Address, Contact, Email, Dname, Date, OpticalType, Fshape, ConType, Ftype, RLevel, LLevel, Price)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        pst.setString(1, fname);
        pst.setString(2, lname);
        pst.setInt(3, ageInt);
        pst.setString(4, gender);
        pst.setString(5, address);
        pst.setString(6, contact);
        pst.setString(7, email);
        pst.setString(8, doctor);
        pst.setString(9, date);
        pst.setString(10, opticaltype);
        pst.setString(11, frameShape);  // Will be blank for contact lenses
        pst.setString(12, contype);     // Will be blank for glasses
        pst.setString(13, frameType);  // Will be blank for contact lenses
        pst.setDouble(14, Rlevel);
        pst.setDouble(15, Llevel);
        pst.setDouble(16, totalPrice); // Insert total price

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            jLabel21.setText(fname + " " + lname);
            jLabel23.setText(String.valueOf(age));
            jLabel24.setText(address);
            jLabel29.setText(contact);
            jLabel28.setText(date);
            jLabel31.setText(doctor);
            jLabel33.setText(opticaltype);
            jLabel35.setText(String.valueOf(Rlevel));
            jLabel52.setText(String.valueOf(Llevel));
            jLabel37.setText(String.valueOf(totalPrice));
            jLabel39.setText(frameType);
            jLabel41.setText(frameShape);
            jLabel43.setText(contype);
            jFrame1.setVisible(true);
        }
        connect.close();
        this.dispose();
        
      
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number format for age or prescription level.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_availBActionPerformed

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        f();
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        f();
    }//GEN-LAST:event_jSpinner4StateChanged
    
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
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prescribeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prescribeform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.JTextField TextAge;
    private javax.swing.JTextField TextDname;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
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
