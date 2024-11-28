/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminSide;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jolo
 */
public class AdminInterface extends javax.swing.JFrame {

    /**
     * Creates new form AdminInterface
     */
    public AdminInterface() {
        initComponents();
        Connect();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        DisplayPatientRecord();
        DisplayPrescribeRecord();
        DisplayRepairRecord();
        DisplayProductRecord();
        //DisplayEyeProduct();
        DisplayFrameShapeProduct();
        DisplayFrameTypeProduct();
        DisplayCount();
        
       
    }

   Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminInterface .class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
     public void DisplayPrescribeRecord(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM prescribeform");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable4.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("PrescribeID"));
                    v2.add(rs.getString("Fname"));
                    v2.add(rs.getString("Lname"));
                    v2.add(rs.getString("Gender"));
                    v2.add(rs.getInt("Age"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Email"));
                    v2.add(rs.getString("Contact"));
                    v2.add(rs.getDate("Date"));
                    v2.add(rs.getString("OpticalType"));
                    v2.add(rs.getString("Fshape"));
                    v2.add(rs.getString("Ftype"));
                    v2.add(rs.getInt("RLevel"));
                    v2.add(rs.getInt("LLevel"));
                    v2.add(rs.getInt("Price"));
                    v2.add(rs.getInt("TransactionNumber"));
 
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void DisplayPatientRecord(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM patientdb");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable8.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("PatientID"));
                    v2.add(rs.getString("UserFName"));
                    v2.add(rs.getString("UserLName"));
                    v2.add(rs.getString("UserGender"));
                    v2.add(rs.getInt("UserAge"));
                    v2.add(rs.getString("UserAddress"));
                    v2.add(rs.getString("UserEmail"));
                    v2.add(rs.getString("UserContact"));
                    v2.add(rs.getTime("ReserveTime"));
                    v2.add(rs.getDate("ReservedDate"));
                    v2.add(rs.getDate("Date"));
                    v2.add(rs.getInt("TransactionNumber"));    
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void DisplayRepairRecord(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM repairdb");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable6.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("RCustomerID"));
                    v2.add(rs.getString("RCustomerFName"));
                    v2.add(rs.getString("RCustomerLName"));
                    v2.add(rs.getString("RCustomerAddress"));
                    v2.add(rs.getString("RCustomerEmail"));
                    v2.add(rs.getString("RCustomerContact"));
                    v2.add(rs.getString("RIssues"));
                    v2.add(rs.getString("RCustomerMode"));
                    v2.add(rs.getInt("RCustomerDown"));
                    v2.add(rs.getString("RCustomerFee"));
                    v2.add(rs.getString("RCustomerDate"));
                    v2.add(rs.getInt("TransactionNumber"));   
                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void DisplayProductRecord(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM products");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable7.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("CustomerID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Gender"));
                    v2.add(rs.getString("Age"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Email"));
                    v2.add(rs.getString("Contact"));
                    v2.add(rs.getString("AvailProduct"));
                    v2.add(rs.getInt("Price"));
                    v2.add(rs.getInt("TransactionNumber"));

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

       public void DisplayFrameShapeProduct(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM frames");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable10.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("ItemID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Quantity"));
                    v2.add(rs.getString("Price"));
                    v2.add(rs.getString("ProductCode"));

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void DisplayFrameTypeProduct(){
        
        try {

            pst = connect.prepareStatement("SELECT * FROM framet");
            rs = pst.executeQuery();
            
            ResultSetMetaData rss = rs.getMetaData();
            
            int q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable11.getModel();
            
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a<= q; a++){
                    
                    v2.add(rs.getInt("ItemID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Quantity"));
                    v2.add(rs.getString("Price"));
                    v2.add(rs.getString("ProductCode"));

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        public void DisplayCount(){
        
        try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS UserID FROM patientdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("UserID");
                 PCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        HistoryChecker = new javax.swing.JButton();
        PatientRecordButton = new javax.swing.JButton();
        OrderRecordButton = new javax.swing.JButton();
        CheckRecordButton = new javax.swing.JButton();
        CancelRecordsButton = new javax.swing.JButton();
        StocksCheckerButton = new javax.swing.JButton();
        FrameStock = new javax.swing.JButton();
        PatientRecordButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        checkupPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        repairPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        PrescriptionPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        CheckUpPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        EyeDropPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FramePanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        DashBoard = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        PCount = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 240, 248));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jButton17.setBackground(new java.awt.Color(255, 51, 51));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Cancel Transaction");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        HistoryChecker.setText("Admin Login");
        HistoryChecker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryCheckerActionPerformed(evt);
            }
        });

        PatientRecordButton.setBackground(new java.awt.Color(202, 240, 248));
        PatientRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PatientRecordButton.setText("Patient Records");
        PatientRecordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        PatientRecordButton.setContentAreaFilled(false);
        PatientRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientRecordButtonActionPerformed(evt);
            }
        });

        OrderRecordButton.setBackground(new java.awt.Color(202, 240, 248));
        OrderRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OrderRecordButton.setText("Order Records");
        OrderRecordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        OrderRecordButton.setContentAreaFilled(false);
        OrderRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderRecordButtonActionPerformed(evt);
            }
        });

        CheckRecordButton.setBackground(new java.awt.Color(202, 240, 248));
        CheckRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckRecordButton.setText("Check Up Reservations");
        CheckRecordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        CheckRecordButton.setContentAreaFilled(false);
        CheckRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRecordButtonActionPerformed(evt);
            }
        });

        CancelRecordsButton.setBackground(new java.awt.Color(202, 240, 248));
        CancelRecordsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelRecordsButton.setText("Availed Products");
        CancelRecordsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        CancelRecordsButton.setContentAreaFilled(false);
        CancelRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRecordsButtonActionPerformed(evt);
            }
        });

        StocksCheckerButton.setBackground(new java.awt.Color(202, 240, 248));
        StocksCheckerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StocksCheckerButton.setText("Product Stocks");
        StocksCheckerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        StocksCheckerButton.setContentAreaFilled(false);
        StocksCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StocksCheckerButtonActionPerformed(evt);
            }
        });

        FrameStock.setBackground(new java.awt.Color(202, 240, 248));
        FrameStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FrameStock.setText("Eye Drop Products");
        FrameStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        FrameStock.setBorderPainted(false);
        FrameStock.setContentAreaFilled(false);
        FrameStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameStockActionPerformed(evt);
            }
        });

        PatientRecordButton2.setBackground(new java.awt.Color(202, 240, 248));
        PatientRecordButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PatientRecordButton2.setText("Dashboard");
        PatientRecordButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 240, 248)));
        PatientRecordButton2.setContentAreaFilled(false);
        PatientRecordButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientRecordButton2ActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PatientRecordButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(HistoryChecker, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(FrameStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(StocksCheckerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CancelRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrderRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(PatientRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(CheckRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CancelRecordsButton, CheckRecordButton, FrameStock, OrderRecordButton, PatientRecordButton, StocksCheckerButton, jButton11});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PatientRecordButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PatientRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelRecordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StocksCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton11)
                .addGap(121, 121, 121)
                .addComponent(FrameStock)
                .addGap(114, 114, 114)
                .addComponent(HistoryChecker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CancelRecordsButton, CheckRecordButton, FrameStock, OrderRecordButton, PatientRecordButton, StocksCheckerButton, jButton11});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 170, 1030));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        checkupPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID", "Name", "Gender", "Age", "Address", "Email", "Contact", "AvailedProducts", "Price", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(170);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(1).setMinWidth(120);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable7.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable7.getColumnModel().getColumn(2).setMinWidth(120);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable7.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable7.getColumnModel().getColumn(4).setMinWidth(170);
            jTable7.getColumnModel().getColumn(4).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(4).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(5).setMinWidth(170);
            jTable7.getColumnModel().getColumn(5).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(5).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(6).setMinWidth(170);
            jTable7.getColumnModel().getColumn(6).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(6).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(7).setMinWidth(170);
            jTable7.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(7).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(8).setMinWidth(170);
            jTable7.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(8).setMaxWidth(170);
            jTable7.getColumnModel().getColumn(9).setMinWidth(170);
            jTable7.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(9).setMaxWidth(170);
        }

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Product Record");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout checkupPanelLayout = new javax.swing.GroupLayout(checkupPanel);
        checkupPanel.setLayout(checkupPanelLayout);
        checkupPanelLayout.setHorizontalGroup(
            checkupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 478, Short.MAX_VALUE))
        );
        checkupPanelLayout.setVerticalGroup(
            checkupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 609, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", checkupPanel);

        repairPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Repair Record");

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTable6.setAutoCreateRowSorter(true);
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Address", "Email", "Contact", "Issues", "Mode", "DownPayment", "Fee", "Date", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(170);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(1).setMinWidth(120);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable6.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable6.getColumnModel().getColumn(2).setMinWidth(120);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable6.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable6.getColumnModel().getColumn(3).setMinWidth(170);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(3).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(4).setMinWidth(170);
            jTable6.getColumnModel().getColumn(4).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(4).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(5).setMinWidth(170);
            jTable6.getColumnModel().getColumn(5).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(5).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(6).setMinWidth(170);
            jTable6.getColumnModel().getColumn(6).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(6).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(7).setMinWidth(170);
            jTable6.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(7).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(8).setMinWidth(170);
            jTable6.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(8).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(9).setMinWidth(170);
            jTable6.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(9).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(10).setMinWidth(170);
            jTable6.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(10).setMaxWidth(170);
            jTable6.getColumnModel().getColumn(11).setMinWidth(170);
            jTable6.getColumnModel().getColumn(11).setPreferredWidth(170);
            jTable6.getColumnModel().getColumn(11).setMaxWidth(170);
        }

        javax.swing.GroupLayout repairPanelLayout = new javax.swing.GroupLayout(repairPanel);
        repairPanel.setLayout(repairPanelLayout);
        repairPanelLayout.setHorizontalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 438, Short.MAX_VALUE))
        );
        repairPanelLayout.setVerticalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addGap(630, 630, 630))
        );

        jTabbedPane1.addTab("tab2", repairPanel);

        PrescriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        PrescriptionPanel.setForeground(new java.awt.Color(255, 255, 255));
        PrescriptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Gender", "Age", "Address", "Email", "Contact", "OpticalType", "Fshape", "Contype", "Ftype", "RightEyeLevel", "LeftEyeLevel", "Price", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(170);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(1).setMinWidth(120);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable4.getColumnModel().getColumn(2).setMinWidth(120);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable4.getColumnModel().getColumn(3).setMinWidth(120);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable4.getColumnModel().getColumn(5).setMinWidth(170);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(5).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(6).setMinWidth(170);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(6).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(7).setMinWidth(170);
            jTable4.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(7).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(8).setMinWidth(170);
            jTable4.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(8).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(9).setMinWidth(170);
            jTable4.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(9).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(10).setMinWidth(170);
            jTable4.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(10).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(11).setMinWidth(170);
            jTable4.getColumnModel().getColumn(11).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(11).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(12).setMinWidth(170);
            jTable4.getColumnModel().getColumn(12).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(12).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(12).setHeaderValue("RightEyeLevel");
            jTable4.getColumnModel().getColumn(13).setMinWidth(170);
            jTable4.getColumnModel().getColumn(13).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(13).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(13).setHeaderValue("LeftEyeLevel");
            jTable4.getColumnModel().getColumn(14).setMinWidth(170);
            jTable4.getColumnModel().getColumn(14).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(14).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(14).setHeaderValue("Price");
            jTable4.getColumnModel().getColumn(15).setMinWidth(170);
            jTable4.getColumnModel().getColumn(15).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(15).setMaxWidth(170);
            jTable4.getColumnModel().getColumn(15).setHeaderValue("TransactionNumber");
        }

        PrescriptionPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1210, 640));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Repair Record");
        PrescriptionPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jTabbedPane1.addTab("tab5", PrescriptionPanel);

        CheckUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        CheckUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check Up Reservation Record");
        CheckUpPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Gender", "Age", "Address", "Email", "Contact", "ReserveTime", "ReservedDate", "Status", "Date", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(170);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(1).setMinWidth(120);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable8.getColumnModel().getColumn(2).setMinWidth(120);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable8.getColumnModel().getColumn(3).setMinWidth(120);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable8.getColumnModel().getColumn(5).setMinWidth(170);
            jTable8.getColumnModel().getColumn(5).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(5).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(6).setMinWidth(170);
            jTable8.getColumnModel().getColumn(6).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(6).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(7).setMinWidth(170);
            jTable8.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(7).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(8).setMinWidth(170);
            jTable8.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(8).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(9).setMinWidth(170);
            jTable8.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(9).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(11).setMinWidth(170);
            jTable8.getColumnModel().getColumn(11).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(11).setMaxWidth(170);
            jTable8.getColumnModel().getColumn(12).setMinWidth(170);
            jTable8.getColumnModel().getColumn(12).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(12).setMaxWidth(170);
        }

        CheckUpPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1210, 640));

        jTabbedPane1.addTab("tab3", CheckUpPanel);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ItemID", "ProductName", "Quantity", "Type", "Price", "ProductCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable9.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable9.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(1).setMinWidth(170);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable9.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable9.getColumnModel().getColumn(2).setMinWidth(120);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable9.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable9.getColumnModel().getColumn(4).setMinWidth(120);
            jTable9.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable9.getColumnModel().getColumn(4).setMaxWidth(120);
            jTable9.getColumnModel().getColumn(5).setMinWidth(120);
            jTable9.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable9.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modify Products");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Update Price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Add Quantity");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Enter Product Code/ID:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Add Quantity");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Update Price");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("jLabel2");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("jLabel24");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("jLabel25");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Solution", "Frame Shape", "Frame Material", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setText("Sort by:");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("Product ID");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Product Name");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("Quantity");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("Type");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Price");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("Product Code");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel27)))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(49, 49, 49)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel22, jLabel23, jLabel24, jLabel25, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31, jLabel32, jLabel33});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel31))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel33))
                .addGap(100, 100, 100)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel22, jLabel23, jLabel24, jLabel25, jLabel27, jLabel28, jLabel29, jLabel30, jLabel31, jLabel32, jLabel33});

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Eye Drop Products");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(428, 428, 428))))
        );

        javax.swing.GroupLayout EyeDropPanelLayout = new javax.swing.GroupLayout(EyeDropPanel);
        EyeDropPanel.setLayout(EyeDropPanelLayout);
        EyeDropPanelLayout.setHorizontalGroup(
            EyeDropPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EyeDropPanelLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );
        EyeDropPanelLayout.setVerticalGroup(
            EyeDropPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EyeDropPanelLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 649, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", EyeDropPanel);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ItemID", "FrameShape", "Quantity", "Price", "ProductCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane8.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(1).setMinWidth(170);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable10.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable10.getColumnModel().getColumn(2).setMinWidth(120);
            jTable10.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable10.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable10.getColumnModel().getColumn(3).setMinWidth(120);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable10.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable10.getColumnModel().getColumn(4).setMinWidth(120);
            jTable10.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable10.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Modify Products");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Update Price");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("Add Quantity");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Enter Product Code:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Add Quantity");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Update Price");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Current Price:");

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Product Name:");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Current Stock:");

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(49, 49, 49)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Check Up Reservation Record");

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ItemID", "FrameType", "Quantity", "Price", "ProductCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane9.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(1).setMinWidth(170);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable11.getColumnModel().getColumn(1).setMaxWidth(170);
            jTable11.getColumnModel().getColumn(2).setMinWidth(120);
            jTable11.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable11.getColumnModel().getColumn(2).setMaxWidth(120);
            jTable11.getColumnModel().getColumn(3).setMinWidth(120);
            jTable11.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable11.getColumnModel().getColumn(3).setMaxWidth(120);
            jTable11.getColumnModel().getColumn(4).setMinWidth(120);
            jTable11.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable11.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jScrollPane9))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FramePanelLayout = new javax.swing.GroupLayout(FramePanel);
        FramePanel.setLayout(FramePanelLayout);
        FramePanelLayout.setHorizontalGroup(
            FramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePanelLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );
        FramePanelLayout.setVerticalGroup(
            FramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePanelLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 719, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", FramePanel);

        PCount.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        PCount.setText("jLabel22");

        jButton9.setText("jButton9");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(PCount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCount)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashBoardLayout = new javax.swing.GroupLayout(DashBoard);
        DashBoard.setLayout(DashBoardLayout);
        DashBoardLayout.setHorizontalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBoardLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1144, Short.MAX_VALUE))
        );
        DashBoardLayout.setVerticalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBoardLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1006, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", DashBoard);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 1650, 1390));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jButton10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton10.setText("Log out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1274, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton10)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void HistoryCheckerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryCheckerActionPerformed


    }//GEN-LAST:event_HistoryCheckerActionPerformed

    private void OrderRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderRecordButtonActionPerformed
        jTabbedPane1.setSelectedComponent(PrescriptionPanel);
    }//GEN-LAST:event_OrderRecordButtonActionPerformed

    private void PatientRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientRecordButtonActionPerformed
        jTabbedPane1.setSelectedComponent(CheckUpPanel);
        
    }//GEN-LAST:event_PatientRecordButtonActionPerformed

    private void CheckRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRecordButtonActionPerformed
        jTabbedPane1.setSelectedComponent(repairPanel);
    }//GEN-LAST:event_CheckRecordButtonActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked

    }//GEN-LAST:event_jTable6MouseClicked

    private void CancelRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRecordsButtonActionPerformed
       jTabbedPane1.setSelectedComponent(checkupPanel);
    }//GEN-LAST:event_CancelRecordsButtonActionPerformed

    private void FrameStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameStockActionPerformed
       jTabbedPane1.setSelectedComponent(EyeDropPanel);
    }//GEN-LAST:event_FrameStockActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String PCode = jTextField1.getText();
        if (PCode.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a product code.");
                return;
            }
            try {
                
                
                
                pst = connect.prepareStatement("SELECT InPrice FROM eyedropstock WHERE productcode = ?");
                pst.setString(1, PCode);
                
                rs = pst.executeQuery();
                if(rs.next()){
                    
                    
                    int CPrice = Integer.parseInt(rs.getString("InPrice"));
                    int UPrice = Integer.parseInt(jTextField3.getText());
                    
                    
                    pst = connect.prepareStatement("UPDATE `eyedropstock` SET `InPrice` = ? WHERE `eyedropstock`.`ProductCode` = ?");
                    pst.setInt(1, UPrice);
                    pst.setString(2, PCode);
                    if(UPrice < 0){
                        JOptionPane.showMessageDialog(null, "The update quantity cant be negative");
                    }else {
                    int OP = JOptionPane.showConfirmDialog(null, "Confirm Update?");
                    
                    if(OP == JOptionPane.YES_OPTION){
                        
                        int Success = pst.executeUpdate();
                        if(Success >0){
                            JOptionPane.showMessageDialog(null, "Price Updated.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Update Failed.");
                        }
                    }
                    } }
                else {
                    JOptionPane.showMessageDialog(null, "No record found with Product Code:");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String PCode = jTextField1.getText();
            
            pst = connect.prepareStatement("SELECT * FROM eyedropstock WHERE productcode = ?");
            pst.setString(1, PCode);
            
            
            rs = pst.executeQuery();
            
            if(rs.next()){
   
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    //DisplayEyeProduct();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void StocksCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StocksCheckerButtonActionPerformed
         jTabbedPane1.setSelectedComponent(EyeDropPanel);
    }//GEN-LAST:event_StocksCheckerButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String PCode = jTextField1.getText();
        if (PCode.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a product code.");
                return;
            }
            try {
                
                
                
                pst = connect.prepareStatement("SELECT Quantity FROM eyedropstock WHERE productcode = ?");
                pst.setString(1, PCode);
                
                rs = pst.executeQuery();
                if(rs.next()){
                    
                    
                    int CQuantity = Integer.parseInt(rs.getString("Quantity"));
                    int UQuantity = Integer.parseInt(jTextField2.getText());
                    
                    
                    pst = connect.prepareStatement("UPDATE `eyedropstock` SET `Quantity` = ? WHERE `eyedropstock`.`ProductCode` = ?");
                    pst.setInt(1, UQuantity);
                    pst.setString(2, PCode);
                    if(UQuantity < 0){
                        JOptionPane.showMessageDialog(null, "The update quantity cant be negative");
                    }else {
                    int OP = JOptionPane.showConfirmDialog(null, "Confirm Update?");
                    
                    if(OP == JOptionPane.YES_OPTION){
                        
                        int Success = pst.executeUpdate();
                        if(Success >0){
                            JOptionPane.showMessageDialog(null, "Quantity Updated.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Update Failed.");
                        }
                    }
                
                else {
                    JOptionPane.showMessageDialog(null, "No record found with Product Code:");
                }
                    }} 
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PatientRecordButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientRecordButton2ActionPerformed
        jTabbedPane1.setSelectedComponent(DashBoard);
    }//GEN-LAST:event_PatientRecordButton2ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
                int row = jTable9.getSelectedRow();
                Object ID = jTable9.getValueAt(row, 0);
                Object Name =  jTable9.getValueAt(row, 1);
                Object Qty =  jTable9.getValueAt(row, 2);
                Object Type =  jTable9.getValueAt(row, 3);
                Object Price =  jTable9.getValueAt(row, 4);
                Object PCode =  jTable9.getValueAt(row, 5);
                
                
                jLabel2.setText(String.valueOf(ID));
                jLabel22.setText(String.valueOf(Name));
                jLabel23.setText(String.valueOf(Qty));
                jLabel24.setText(String.valueOf(Type));
                jLabel27.setText(String.valueOf(Price));
                jLabel25.setText(String.valueOf(PCode));
    }//GEN-LAST:event_jTable9MouseClicked

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange

        
    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object Sort = jComboBox1.getSelectedItem();
            String SortBy = String.valueOf(Sort);
            JOptionPane.showMessageDialog(null, SortBy);

            if(SortBy ==  "All"){
                    try {

                        pst = connect.prepareStatement("SELECT * FROM eyedropstock");
                        rs = pst.executeQuery();

                        ResultSetMetaData rss = rs.getMetaData();

                        int q = rss.getColumnCount();

                        DefaultTableModel df = (DefaultTableModel)jTable9.getModel();

                        df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for(int a = 1; a<= q; a++){

                                v2.add(rs.getInt("ItemID"));
                                v2.add(rs.getString("Name"));
                                v2.add(rs.getString("Quantity"));
                                v2.add(rs.getString("Type"));
                                v2.add(rs.getString("InPrice"));
                                v2.add(rs.getString("ProductCode"));

                            }
                            df.addRow(v2);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    }
            else{
                    try {

                        pst = connect.prepareStatement("SELECT * FROM `eyedropstock` WHERE `Type` LIKE ? ORDER BY `Type` DESC");
                        pst.setString(1, SortBy);
                        rs = pst.executeQuery();

                        ResultSetMetaData rss = rs.getMetaData();

                        int q = rss.getColumnCount();

                        DefaultTableModel df = (DefaultTableModel)jTable9.getModel();

                        df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for(int a = 1; a<= q; a++){

                                v2.add(rs.getInt("ItemID"));
                                v2.add(rs.getString("Name"));
                                v2.add(rs.getString("Quantity"));
                                v2.add(rs.getString("Type"));
                                v2.add(rs.getString("InPrice"));
                                v2.add(rs.getString("ProductCode"));

                            }
                            df.addRow(v2);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelRecordsButton;
    private javax.swing.JButton CheckRecordButton;
    private javax.swing.JPanel CheckUpPanel;
    private javax.swing.JPanel DashBoard;
    private javax.swing.JPanel EyeDropPanel;
    private javax.swing.JPanel FramePanel;
    private javax.swing.JButton FrameStock;
    private javax.swing.JButton HistoryChecker;
    private javax.swing.JButton OrderRecordButton;
    private javax.swing.JLabel PCount;
    private javax.swing.JButton PatientRecordButton;
    private javax.swing.JButton PatientRecordButton2;
    private javax.swing.JPanel PrescriptionPanel;
    private javax.swing.JButton StocksCheckerButton;
    private javax.swing.JPanel checkupPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel repairPanel;
    // End of variables declaration//GEN-END:variables
}
