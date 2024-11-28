/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminSide;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;
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
 * @author lumap
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        Connect();
        ADMINI();
        DB1();
        SB1();
        SB2();
        SB3();
        SB4();
        SB5();
        SB6();
        SB7();
        DisplayRepairRecord();
        DisplayPrescribeRecord();
        DisplayProductRecord();
        DisplayPatientRecord();
        DisplayCount();
        TotalSales();
        CancelRecord();
        HistoryRecord();
        prodtb();
          
        
        jPanel5.setBackground(new Color(204,255,204, 100));
        jPanel6.setBackground(new Color(153,204,255, 100));
        //jPanel7.setBackground(new Color(255,102,102,100));
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

    String adminI = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\admin.png";
    public void ADMINI(){
        System.out.print(adminI);
        ImageIcon icon = new ImageIcon(adminI);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(adminLabel.getWidth(),adminLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        adminLabel.setIcon(scaledIcon);
    }
    String dashButton1 = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\dashboard.png";
    public void DB1(){
        System.out.print(dashButton1);
        ImageIcon icon = new ImageIcon(dashButton1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(dashboardB.getWidth(),dashboardB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        dashboardB.setIcon(scaledIcon);
    }
    String sideButton1 = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\prescriptionRecord.png";
    public void SB1(){
        System.out.print(sideButton1);
        ImageIcon icon = new ImageIcon(sideButton1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(presrecordB.getWidth(),presrecordB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        presrecordB.setIcon(scaledIcon);
    }
    String sideButton2 = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\checkupRecord.png";
    public void SB2(){
        System.out.print(sideButton2);
        ImageIcon icon = new ImageIcon(sideButton2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(checkuprecordB.getWidth(),checkuprecordB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        checkuprecordB.setIcon(scaledIcon);
    }
    String sideButton3 = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\repairRecord.png";
    public void SB3(){
        System.out.print(sideButton3);
        ImageIcon icon = new ImageIcon(sideButton3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(repairrecordB.getWidth(),repairrecordB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        repairrecordB.setIcon(scaledIcon);
    }
    String sideButton4 = "C:\\Users\\jolo\\OneDrive\\Documents\\NetBeansProjects\\OCS\\CheckUp\\src\\AdminSide\\productRecord.png";
    public void SB4(){
        System.out.print(sideButton4);
        ImageIcon icon = new ImageIcon(sideButton4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(productrecordB.getWidth(),productrecordB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        productrecordB.setIcon(scaledIcon);
    }
    String sideButton5 = "C:\\Users\\jolo\\Downloads\\462562913_3846007799052661_152689955921215009_n.png";
    public void SB5(){
        System.out.print(sideButton5);
        ImageIcon icon = new ImageIcon(sideButton5);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(orderedProductRec.getWidth(),orderedProductRec.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        orderedProductRec.setIcon(scaledIcon);
    }
    String sideButton6 = "C:\\Users\\jolo\\Downloads\\delete-removebg-preview.png";
    public void SB6(){
        System.out.print(sideButton6);
        ImageIcon icon = new ImageIcon(sideButton6);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(orderedProductRec1.getWidth(),orderedProductRec1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        orderedProductRec1.setIcon(scaledIcon);
    }
    String sideButton7 = "\\Users\\jolo\\Downloads\\462539375_1510934396290492_1616152340899449364_n-removebg-preview.png";
    public void SB7(){
        System.out.print(sideButton7);
        ImageIcon icon = new ImageIcon(sideButton7);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(productrecordB1.getWidth(),productrecordB1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        productrecordB1.setIcon(scaledIcon);
    }
    /*public void caretRemove(){
        DefaultCaret caret = (DefaultCaret) jTextArea1.getCaret();
        caret.setVisible(false);
        jTextArea1.setEditable(false);
    }
    public void caretBack(){
        DefaultCaret caret = (DefaultCaret) jTextArea1.getCaret();
        caret.setVisible(true);
        jTextArea1.setEditable(true);
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ public void DisplayPrescribeRecord(){
        
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
            
            DefaultTableModel df = (DefaultTableModel)jTable5.getModel();
            
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
       public void TotalSales(){
           double PresPrice = 0,OrPrice = 0,RepPrice = 0;
           double Total = PresPrice + OrPrice + RepPrice;
           
           try {

            pst = connect.prepareStatement("SELECT SUM(price) AS Tprice FROM prescribeform");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PdtCount =rs.getInt("Tprice");
                 Total += PdtCount;
                 
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
           try {

            pst = connect.prepareStatement("SELECT SUM(price) AS OrPrice FROM products");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PdtCount =rs.getInt("OrPrice");
                 Total += PdtCount;
                 
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
           try {

            pst = connect.prepareStatement("SELECT SUM(RCustomerFee) AS RepPrice FROM repairdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PdtCount =rs.getInt("RepPrice");
                 Total += PdtCount;
                 
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
           jLabel12.setText(String.valueOf(Total));
          
       
       try {

            pst = connect.prepareStatement("SELECT SUM(AvailCount) AS AvProd FROM products");
            rs = pst.executeQuery();
            if(rs.next()){
                 int AvProducts =rs.getInt("AvProd");
                 
                 ICount.setText(String.valueOf(AvProducts));
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
        try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS PrescribeID FROM prescribeform");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("PrescribeID");
                 PrCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS RCustomerID FROM repairdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("RCustomerID");
                 RCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS UserID FROM patientdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("UserID");
                 PCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS UserID FROM patientdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("UserID");
                 PCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*try {

            pst = connect.prepareStatement("SELECT COUNT(*) AS UserID FROM patientdb");
            rs = pst.executeQuery();
            if(rs.next()){
                 int PtCount =rs.getInt("UserID");
                 PCount.setText(String.valueOf(PtCount));
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        dashboardB = new javax.swing.JButton();
        presrecordB = new javax.swing.JButton();
        checkuprecordB = new javax.swing.JButton();
        repairrecordB = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        orderedProductRec1 = new javax.swing.JButton();
        orderedProductRec = new javax.swing.JButton();
        productrecordB = new javax.swing.JButton();
        productrecordB1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ICount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PCount = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        RCount = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        PrCount = new javax.swing.JLabel();
        presrecordPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        checkuprecordPanel = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        repairrecordPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        productrecordPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
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
        orderRecord = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        CancelledOrder = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 240, 248));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 122, 121));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(202, 240, 248));

        dashboardB.setBackground(new java.awt.Color(153, 153, 153));
        dashboardB.setBorderPainted(false);
        dashboardB.setContentAreaFilled(false);
        dashboardB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBActionPerformed(evt);
            }
        });

        presrecordB.setBackground(new java.awt.Color(153, 153, 153));
        presrecordB.setBorderPainted(false);
        presrecordB.setContentAreaFilled(false);
        presrecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presrecordBActionPerformed(evt);
            }
        });

        checkuprecordB.setBackground(new java.awt.Color(153, 153, 153));
        checkuprecordB.setBorderPainted(false);
        checkuprecordB.setContentAreaFilled(false);
        checkuprecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkuprecordBActionPerformed(evt);
            }
        });

        repairrecordB.setBorderPainted(false);
        repairrecordB.setContentAreaFilled(false);
        repairrecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairrecordBActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(187, 89, 95));
        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Exit");
        jButton5.setToolTipText("Exit program");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        orderedProductRec1.setBorderPainted(false);
        orderedProductRec1.setContentAreaFilled(false);
        orderedProductRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderedProductRec1ActionPerformed(evt);
            }
        });

        orderedProductRec.setBorderPainted(false);
        orderedProductRec.setContentAreaFilled(false);
        orderedProductRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderedProductRecActionPerformed(evt);
            }
        });

        productrecordB.setBorderPainted(false);
        productrecordB.setContentAreaFilled(false);
        productrecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productrecordBActionPerformed(evt);
            }
        });

        productrecordB1.setBorderPainted(false);
        productrecordB1.setContentAreaFilled(false);
        productrecordB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productrecordB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productrecordB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(productrecordB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderedProductRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderedProductRec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(repairrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(checkuprecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(presrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dashboardB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(presrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(checkuprecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(repairrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(orderedProductRec, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(orderedProductRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productrecordB1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel3);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 950));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        dashPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashPanelMouseClicked(evt);
            }
        });
        dashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        dashPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 130, 1151, 27));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Dashboard");
        dashPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 55, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(285, 130));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sales");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Items");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));

        ICount.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        ICount.setForeground(new java.awt.Color(51, 51, 51));
        ICount.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ICount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ICount))
                        .addGap(35, 35, 35))))
        );

        dashPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(285, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Income");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Php");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        dashPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(285, 130));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Patients");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Patient");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));

        PCount.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PCount.setForeground(new java.awt.Color(51, 51, 51));
        PCount.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel21))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel35)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(PCount))
                        .addGap(35, 35, 35))))
        );

        dashPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jPanel12.setBackground(new java.awt.Color(204, 255, 204));
        jPanel12.setPreferredSize(new java.awt.Dimension(285, 130));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Repairs");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Repairs");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));

        RCount.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        RCount.setForeground(new java.awt.Color(51, 51, 51));
        RCount.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel37))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel39)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(RCount))
                        .addGap(35, 35, 35))))
        );

        dashPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, 130));

        jPanel13.setBackground(new java.awt.Color(204, 255, 204));
        jPanel13.setPreferredSize(new java.awt.Dimension(285, 130));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Prescriptions");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Precripts");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));

        PrCount.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PrCount.setForeground(new java.awt.Color(51, 51, 51));
        PrCount.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel41))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel41)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel43)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(PrCount))
                        .addGap(35, 35, 35))))
        );

        dashPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jTabbedPane1.addTab("tab1", dashPanel);

        presrecordPanel.setBackground(new java.awt.Color(255, 255, 255));
        presrecordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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
        jTable4.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(7).setResizable(false);
            jTable4.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(8).setResizable(false);
            jTable4.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(9).setResizable(false);
            jTable4.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(10).setResizable(false);
            jTable4.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(11).setResizable(false);
            jTable4.getColumnModel().getColumn(11).setPreferredWidth(170);
            jTable4.getColumnModel().getColumn(12).setResizable(false);
            jTable4.getColumnModel().getColumn(12).setPreferredWidth(150);
            jTable4.getColumnModel().getColumn(13).setResizable(false);
            jTable4.getColumnModel().getColumn(13).setPreferredWidth(150);
            jTable4.getColumnModel().getColumn(14).setResizable(false);
            jTable4.getColumnModel().getColumn(14).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(15).setResizable(false);
            jTable4.getColumnModel().getColumn(15).setPreferredWidth(120);
        }

        presrecordPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 590));
        presrecordPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1151, 15));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Prescription Records");
        presrecordPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTabbedPane1.addTab("tab2", presrecordPanel);

        checkuprecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Checkup Rservations");

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

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
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(3).setResizable(false);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(4).setResizable(false);
            jTable8.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(5).setResizable(false);
            jTable8.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable8.getColumnModel().getColumn(6).setResizable(false);
            jTable8.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable8.getColumnModel().getColumn(7).setResizable(false);
            jTable8.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(8).setResizable(false);
            jTable8.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(9).setResizable(false);
            jTable8.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(10).setResizable(false);
            jTable8.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(11).setResizable(false);
            jTable8.getColumnModel().getColumn(11).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(12).setResizable(false);
            jTable8.getColumnModel().getColumn(12).setPreferredWidth(150);
        }

        javax.swing.GroupLayout checkuprecordPanelLayout = new javax.swing.GroupLayout(checkuprecordPanel);
        checkuprecordPanel.setLayout(checkuprecordPanelLayout);
        checkuprecordPanelLayout.setHorizontalGroup(
            checkuprecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkuprecordPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(checkuprecordPanelLayout.createSequentialGroup()
                .addGroup(checkuprecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 454, Short.MAX_VALUE))
        );
        checkuprecordPanelLayout.setVerticalGroup(
            checkuprecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkuprecordPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", checkuprecordPanel);

        repairrecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Repair Records");

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Age", "Address", "Email", "Issues", "Mode", "Down", "Fee", "Date", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(3).setResizable(false);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable5.getColumnModel().getColumn(4).setResizable(false);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable5.getColumnModel().getColumn(5).setResizable(false);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable5.getColumnModel().getColumn(6).setResizable(false);
            jTable5.getColumnModel().getColumn(6).setPreferredWidth(300);
            jTable5.getColumnModel().getColumn(7).setResizable(false);
            jTable5.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(8).setResizable(false);
            jTable5.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(9).setResizable(false);
            jTable5.getColumnModel().getColumn(9).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(10).setResizable(false);
            jTable5.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(11).setResizable(false);
            jTable5.getColumnModel().getColumn(11).setPreferredWidth(170);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(752, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout repairrecordPanelLayout = new javax.swing.GroupLayout(repairrecordPanel);
        repairrecordPanel.setLayout(repairrecordPanelLayout);
        repairrecordPanelLayout.setHorizontalGroup(
            repairrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1650, Short.MAX_VALUE)
            .addGroup(repairrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(repairrecordPanelLayout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        repairrecordPanelLayout.setVerticalGroup(
            repairrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1499, Short.MAX_VALUE)
            .addGroup(repairrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(repairrecordPanelLayout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab4", repairrecordPanel);

        productrecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Product Inventory");

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
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable9.getColumnModel().getColumn(2).setResizable(false);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable9.getColumnModel().getColumn(3).setResizable(false);
            jTable9.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTable9.getColumnModel().getColumn(4).setResizable(false);
            jTable9.getColumnModel().getColumn(4).setPreferredWidth(250);
            jTable9.getColumnModel().getColumn(5).setResizable(false);
            jTable9.getColumnModel().getColumn(5).setPreferredWidth(300);
            jTable9.getColumnModel().getColumn(5).setHeaderValue("ProductCode");
        }

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Modify Products");

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Enter Product Code:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Add Quantity");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Update Price");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jButton6)
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
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel27)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(49, 49, 49)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
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
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(744, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productrecordPanelLayout = new javax.swing.GroupLayout(productrecordPanel);
        productrecordPanel.setLayout(productrecordPanelLayout);
        productrecordPanelLayout.setHorizontalGroup(
            productrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productrecordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productrecordPanelLayout.setVerticalGroup(
            productrecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productrecordPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", productrecordPanel);

        orderRecord.setBackground(new java.awt.Color(255, 255, 255));
        orderRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setText("Order Records");
        orderRecord.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        orderRecord.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1151, 15));

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
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(4).setResizable(false);
            jTable7.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable7.getColumnModel().getColumn(5).setResizable(false);
            jTable7.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable7.getColumnModel().getColumn(6).setResizable(false);
            jTable7.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(7).setResizable(false);
            jTable7.getColumnModel().getColumn(7).setPreferredWidth(300);
            jTable7.getColumnModel().getColumn(8).setResizable(false);
            jTable7.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(9).setResizable(false);
            jTable7.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        orderRecord.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1180, 610));

        jTabbedPane1.addTab("tab6", orderRecord);

        CancelledOrder.setBackground(new java.awt.Color(255, 255, 255));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CancelID", "UserName", "TransactionNumber", "TransactionType", "CancelDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setResizable(false);
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable10.getColumnModel().getColumn(1).setResizable(false);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable10.getColumnModel().getColumn(2).setResizable(false);
            jTable10.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable10.getColumnModel().getColumn(3).setResizable(false);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTable10.getColumnModel().getColumn(4).setResizable(false);
            jTable10.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Cancelled Transactions");

        javax.swing.GroupLayout CancelledOrderLayout = new javax.swing.GroupLayout(CancelledOrder);
        CancelledOrder.setLayout(CancelledOrderLayout);
        CancelledOrderLayout.setHorizontalGroup(
            CancelledOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelledOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CancelledOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CancelledOrderLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        CancelledOrderLayout.setVerticalGroup(
            CancelledOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelledOrderLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", CancelledOrder);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "HistoryID", "UserName", "TransactionNumber", "TransactionType", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable11.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable11.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable11.setShowGrid(false);
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(0).setResizable(false);
            jTable11.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable11.getColumnModel().getColumn(1).setResizable(false);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable11.getColumnModel().getColumn(2).setResizable(false);
            jTable11.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable11.getColumnModel().getColumn(3).setResizable(false);
            jTable11.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTable11.getColumnModel().getColumn(4).setResizable(false);
            jTable11.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setText("Transaction History");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(747, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, -36, 1650, 1530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void productrecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productrecordBActionPerformed
        jTabbedPane1.setSelectedComponent(productrecordPanel);
    }//GEN-LAST:event_productrecordBActionPerformed

    private void dashboardBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBActionPerformed
        jTabbedPane1.setSelectedComponent(dashPanel);
    }//GEN-LAST:event_dashboardBActionPerformed

    private void presrecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presrecordBActionPerformed
       jTabbedPane1.setSelectedComponent(presrecordPanel);
    }//GEN-LAST:event_presrecordBActionPerformed

    private void checkuprecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkuprecordBActionPerformed
        jTabbedPane1.setSelectedComponent(checkuprecordPanel);
    }//GEN-LAST:event_checkuprecordBActionPerformed

    private void repairrecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairrecordBActionPerformed
        jTabbedPane1.setSelectedComponent(repairrecordPanel);
    }//GEN-LAST:event_repairrecordBActionPerformed

    private void dashPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPanelMouseClicked
       
    }//GEN-LAST:event_dashPanelMouseClicked

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        int row = jTable9.getSelectedRow();
        Object ID = jTable9.getValueAt(row, 0);
        Object Name =  jTable9.getValueAt(row, 1);
        Object Qty =  jTable9.getValueAt(row, 2);
        Object Type =  jTable9.getValueAt(row, 3);
        Object Price =  jTable9.getValueAt(row, 4);
        Object PCode =  jTable9.getValueAt(row, 5);
        
        jLabel19.setText(String.valueOf(ID));
        jLabel22.setText(String.valueOf(Name));
        jLabel23.setText(String.valueOf(Qty));
        jLabel24.setText(String.valueOf(Type));
        jLabel25.setText(String.valueOf(Price));
        jLabel27.setText(String.valueOf(PCode));
    }//GEN-LAST:event_jTable9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String PCode = jTextField1.getText();
        if (PCode.trim().isEmpty() || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a product code and updated price");
            return;
        }
        try {

            pst = connect.prepareStatement("SELECT InPrice FROM eyedropstock WHERE productcode = ?");
            pst.setString(1, PCode);

            rs = pst.executeQuery();
            if(rs.next()){

                int CPrice = Integer.parseInt(rs.getString("InPrice"));
                int UPrice = Integer.parseInt(jTextField3.getText());

                pst = connect.prepareStatement("UPDATE `eyedropstock` SET `InPrice` = ? WHERE `ProductCode` = ?");
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
                            jTextField2.setText("");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String PCode = jTextField1.getText();
        if (PCode.trim().isEmpty()|| jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a product code and updated quantity.");
            return;
        }
        try {

            pst = connect.prepareStatement("SELECT Quantity FROM eyedropstock WHERE productcode = ?");
            pst.setString(1, PCode);

            rs = pst.executeQuery();
            if(rs.next()){

                int CQuantity = Integer.parseInt(rs.getString("Quantity"));
                int UQuantity = Integer.parseInt(jTextField2.getText());

                pst = connect.prepareStatement("UPDATE `eyedropstock` SET `Quantity` = ? WHERE `productcode` = ?");
                pst.setInt(1, UQuantity+CQuantity);
                pst.setString(2, PCode);
                if(UQuantity < 0){
                    JOptionPane.showMessageDialog(null, "The update quantity cant be negative");
                }else {
                    int OP = JOptionPane.showConfirmDialog(null, "Confirm Update?");

                    if(OP == JOptionPane.YES_OPTION){

                        int Success = pst.executeUpdate();
                        if(Success >0){
                            JOptionPane.showMessageDialog(null, "Quantity Updated.");
                            jTextField2.setText("");
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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

    }//GEN-LAST:event_jButton6ActionPerformed
    public void prodtb(){
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
    public void CancelRecord(){
        try {

                pst = connect.prepareStatement("SELECT * FROM cancetransacts");
                rs = pst.executeQuery();

                ResultSetMetaData rss = rs.getMetaData();

                int q = rss.getColumnCount();

                DefaultTableModel df = (DefaultTableModel)jTable10.getModel();

                df.setRowCount(0);
                while(rs.next()){
                    Vector v2 = new Vector();
                    for(int a = 1; a<= q; a++){

                        v2.add(rs.getInt("CancelId"));
                        v2.add(rs.getString("UserName"));
                        v2.add(rs.getString("TransactionNumber"));
                        v2.add(rs.getString("CancelType"));
                        v2.add(rs.getString("CancelDate"));

                    }
                    df.addRow(v2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }
    public void HistoryRecord(){
        try {

                pst = connect.prepareStatement("SELECT * FROM history");
                rs = pst.executeQuery();

                ResultSetMetaData rss = rs.getMetaData();

                int q = rss.getColumnCount();

                DefaultTableModel df = (DefaultTableModel)jTable11.getModel();

                df.setRowCount(0);
                while(rs.next()){
                    Vector v2 = new Vector();
                    for(int a = 1; a<= q; a++){

                        v2.add(rs.getInt("HistoryId"));
                        v2.add(rs.getString("UserName"));
                        v2.add(rs.getString("TransactionType"));
                        v2.add(rs.getString("UserTransaction"));
                        v2.add(rs.getString("Date"));

                    }
                    df.addRow(v2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        prodtb();
    }//GEN-LAST:event_jButton8ActionPerformed

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

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange

    }//GEN-LAST:event_jComboBox1PropertyChange

    private void orderedProductRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderedProductRecActionPerformed
        jTabbedPane1.setSelectedComponent(orderRecord);
    }//GEN-LAST:event_orderedProductRecActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        String text = jTextField3.getText().trim();
                if (!text.matches("\\d*")) { // Allow only digits
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    jTextField3.requestFocus();
                    jTextField3.setText("");// Bring focus back to the field
                }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        String text = jTextField2.getText().trim();
                if (!text.matches("\\d*")) { // Allow only digits
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    jTextField2.requestFocus();
                    jTextField2.setText("");// Bring focus back to the field
                }
    }//GEN-LAST:event_jTextField2FocusLost

    private void orderedProductRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderedProductRec1ActionPerformed
        jTabbedPane1.setSelectedComponent(CancelledOrder);
    }//GEN-LAST:event_orderedProductRec1ActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
       
    }//GEN-LAST:event_jTable10MouseClicked

    private void productrecordB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productrecordB1ActionPerformed
        jTabbedPane1.setSelectedComponent(jPanel1);
    }//GEN-LAST:event_productrecordB1ActionPerformed

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable11MouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CancelledOrder;
    private javax.swing.JLabel ICount;
    private javax.swing.JLabel PCount;
    private javax.swing.JLabel PrCount;
    private javax.swing.JLabel RCount;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton checkuprecordB;
    private javax.swing.JPanel checkuprecordPanel;
    private javax.swing.JPanel dashPanel;
    private javax.swing.JButton dashboardB;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel orderRecord;
    private javax.swing.JButton orderedProductRec;
    private javax.swing.JButton orderedProductRec1;
    private javax.swing.JButton presrecordB;
    private javax.swing.JPanel presrecordPanel;
    private javax.swing.JButton productrecordB;
    private javax.swing.JButton productrecordB1;
    private javax.swing.JPanel productrecordPanel;
    private javax.swing.JButton repairrecordB;
    private javax.swing.JPanel repairrecordPanel;
    // End of variables declaration//GEN-END:variables
}
