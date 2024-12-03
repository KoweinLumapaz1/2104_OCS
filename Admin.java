/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminSide;


import UserHP.MInterface;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.join;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lumap
 */
public class Admin extends javax.swing.JFrame {
    Random Check = new Random();
    Random Prescript = new Random();
    Random Order = new Random();
    Random Repair = new Random();
    int CTNumber = Check.nextInt(10000);
    int RTnumber = Repair.nextInt(10000);
    int OTNumber = Order.nextInt(10000);
    int PTNumber = Prescript.nextInt(10000);
    
    LocalDate UserDate = java.time.LocalDate.now();
    String SelectedDay;
    String CurrentDate = UserDate.toString();
    int CurrentMonth = UserDate.getMonthValue();
    int CurrentDay = UserDate.getDayOfMonth();
    int CurrentYear = UserDate.getYear();
    int Month;
    int Day;
    int Year;
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
        DisplayRefresher();
        RTPDisplayer();
        
        
          
        
        jPanel5.setBackground(new Color(204,255,204, 100));
        jPanel6.setBackground(new Color(153,204,255, 100));
        //jPanel7.setBackground(new Color(255,102,102,100));
    }
    ArrayList <String> Slist = new ArrayList <String>();
    String d = join(", ", Slist);
    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    public void RTPDisplayer(){
        Timer s = new Timer(200, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                SelectedItem();
            }
        });
          s.start();
       }
    public void Connect(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/try" ,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminInterface .class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void DisplayRefresher(){
    Timer refresh = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DisplayRepairRecord();
                    DisplayPrescribeRecord();
                    DisplayProductRecord();
                    DisplayPatientRecord();
                    DisplayCount();
                    TotalSales();
                    CancelRecord();
                    HistoryRecord();
                    prodtb();   
                }
            });
       refresh.start();
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
    
    */
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
                    v2.add(rs.getString("Payment"));
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
                    v2.add(rs.getString("RCustomerLName"));;
                    v2.add(rs.getString("RCustomerEmail"));
                    v2.add(rs.getString("RCustomerContact"));
                    v2.add(rs.getString("RIssues"));
                    v2.add(rs.getString("RCustomerFee"));
                    v2.add(rs.getString("Paymen")); 
                    v2.add(rs.getString("ChangeF"));
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

            d = String.join(", ", Slist);
            ChPayment5.setText(String.valueOf(SelectedPrice));
            
            
        
       
    }       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientGenderCH = new javax.swing.ButtonGroup();
        PatientTime = new javax.swing.ButtonGroup();
        ChReceiptFrame = new javax.swing.JFrame();
        ChReceipt = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        ChReceiptName = new javax.swing.JLabel();
        ChReceiptAdress = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        ChReceiptContact = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        ChReceiptTRNumber = new javax.swing.JLabel();
        ChReceiptDateN = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        jTabbedPane4 = new javax.swing.JTabbedPane();
        AddPatient2 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ChRecordF4 = new javax.swing.JPanel();
        ChLname4 = new javax.swing.JTextField();
        ChAge1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        Fradio1 = new javax.swing.JRadioButton();
        Mradio1 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        ChAddress1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        ChCNum4 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        ChFname6 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        ChEAdd4 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        CheckUpButton1 = new javax.swing.JButton();
        ChPayment6 = new javax.swing.JLabel();
        ChPayTf3 = new javax.swing.JTextField();
        ChPayment7 = new javax.swing.JLabel();
        ChPayment8 = new javax.swing.JLabel();
        ChPayTf4 = new javax.swing.JTextField();
        RemovePatient2 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        ChRecordF5 = new javax.swing.JPanel();
        ChLname5 = new javax.swing.JTextField();
        ChAge3 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        Fradio3 = new javax.swing.JRadioButton();
        Mradio3 = new javax.swing.JRadioButton();
        jLabel115 = new javax.swing.JLabel();
        ChAddress3 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        ChCNum5 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        ChFname7 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        ChEAdd5 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        RemoveChButton1 = new javax.swing.JButton();
        ChFname8 = new javax.swing.JTextField();
        SearchCH1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        checkuprecordPanel = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        AddPatient = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChRecordF = new javax.swing.JPanel();
        ChLname = new javax.swing.JTextField();
        ChAge = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Fradio = new javax.swing.JRadioButton();
        Mradio = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        ChAddress = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ChCNum = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        ChFname = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        ChEAdd = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        CheckUpButton = new javax.swing.JButton();
        ChPayment = new javax.swing.JLabel();
        ChPayTf = new javax.swing.JTextField();
        ChPayment1 = new javax.swing.JLabel();
        ChPayment2 = new javax.swing.JLabel();
        ChPayTf1 = new javax.swing.JTextField();
        RemovePatient = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ChRecordF2 = new javax.swing.JPanel();
        ChLname2 = new javax.swing.JTextField();
        ChAge2 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        Fradio2 = new javax.swing.JRadioButton();
        Mradio2 = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        ChAddress2 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        ChCNum2 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        ChFname2 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        ChEAdd2 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        RemoveChButton = new javax.swing.JButton();
        ChFname3 = new javax.swing.JTextField();
        SearchCH = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        repairrecordPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        AddPatient1 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        ChRecordF1 = new javax.swing.JPanel();
        ChLname1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        ChCNum1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        ChFname1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        ChEAdd1 = new javax.swing.JTextField();
        ChPayment3 = new javax.swing.JLabel();
        ChPayTf2 = new javax.swing.JTextField();
        ChPayment4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel78 = new javax.swing.JLabel();
        AddRepair = new javax.swing.JButton();
        ChPayment5 = new javax.swing.JLabel();
        RemovePatient1 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        ChRecordF3 = new javax.swing.JPanel();
        ChLname3 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        ChCNum3 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        ChFname4 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        ChEAdd3 = new javax.swing.JTextField();
        RemoveRepair = new javax.swing.JButton();
        ChFname5 = new javax.swing.JTextField();
        SearchRepair = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
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

        ChReceiptFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChReceipt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        ChReceipt.setPreferredSize(new java.awt.Dimension(600, 600));
        ChReceipt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(202, 240, 248));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel56.setText("jkloptics@gmail.com");
        jPanel17.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 52, -1, -1));

        jLabel61.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel61.setText("jklBuyOptic@facebook.com");
        jPanel17.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 78, -1, -1));

        jLabel36.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel36.setText("4231, Brgy 7. Nasugbu Batangas 123456. Store # 23");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 104, -1, -1));

        jLabel45.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel45.setText("JKL Optical Clinic");
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 7, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Modern No. 20", 2, 18)); // NOI18N
        jLabel46.setText("Official Prescription Receipt");
        jPanel18.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 15, -1, -1));

        jLabel48.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel48.setText("Transaction No.");
        jPanel18.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel50.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel50.setText("Patient Name:");
        jPanel18.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel68.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel68.setText("Address:");
        jPanel18.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 26));

        ChReceiptName.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(ChReceiptName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 154, 24));

        ChReceiptAdress.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(ChReceiptAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 206, 28));

        jLabel72.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel72.setText("Contact:");
        jPanel18.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel73.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel73.setText("Date:");
        jPanel18.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel74.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel74.setText("Dra. Geni Eindecember");
        jPanel18.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 239, 24));

        ChReceiptContact.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(ChReceiptContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 206, 24));

        jLabel76.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        jLabel76.setText("Doctor Name:");
        jPanel18.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel82.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 502, 103, 24));

        jSeparator11.setBackground(new java.awt.Color(51, 0, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel18.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 789, 699, 10));

        ChReceiptTRNumber.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(ChReceiptTRNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 136, 20));

        ChReceiptDateN.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel18.add(ChReceiptDateN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 119, 22));

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 866, 10));
        jPanel18.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Qty", "Description", "Price", "Amount"
            }
        ));
        jTable1.setShowVerticalLines(true);
        jScrollPane10.setViewportView(jTable1);

        jPanel18.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 860, 250));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 867, 650));

        ChReceipt.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        ChReceiptFrame.getContentPane().add(ChReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 670));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(jTable2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );

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
        jLabel42.setText("Prescripts");

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
                        .addComponent(jLabel42)))
                .addContainerGap(17, Short.MAX_VALUE))
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

        presrecordPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 390));
        presrecordPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1151, 15));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Prescription Records");
        presrecordPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel71.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel80.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 0, 0));

        ChLname4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLname4ActionPerformed(evt);
            }
        });

        ChAge1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAge1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChAge1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChAge1InputMethodTextChanged(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel47.setText("Contact Number:");

        PatientGenderCH.add(Fradio1);
        Fradio1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Fradio1.setText("Female");

        PatientGenderCH.add(Mradio1);
        Mradio1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Mradio1.setText("Male");

        jLabel81.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel81.setText("Email Address:");

        ChAddress1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAddress1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel83.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel83.setText("Last Name:");

        jLabel84.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel84.setText("Gender: ");

        ChCNum4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNum4ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel85.setText("First Name:");

        ChFname6.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname6ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel86.setText("Personal Information");

        ChEAdd4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel87.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel87.setText("Age:");

        jLabel88.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel88.setText("Address:");

        jLabel89.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel89.setText("Doctor Name: ");

        jLabel51.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel51.setText("Dra. Geni Eindecember");

        CheckUpButton1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        CheckUpButton1.setText("Confirm Details");
        CheckUpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckUpButton1ActionPerformed(evt);
            }
        });

        ChPayment6.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment6.setText("Payment: Php");

        ChPayTf3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayTf3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChPayTf3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChPayTf3InputMethodTextChanged(evt);
            }
        });
        ChPayTf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPayTf3ActionPerformed(evt);
            }
        });

        ChPayment7.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment7.setText("Fee: Php 1000");

        ChPayment8.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment8.setText("Change: Php");

        ChPayTf4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayTf4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChPayTf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPayTf4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChRecordF4Layout = new javax.swing.GroupLayout(ChRecordF4);
        ChRecordF4.setLayout(ChRecordF4Layout);
        ChRecordF4Layout.setHorizontalGroup(
            ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel87))
                                .addGap(24, 24, 24)
                                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                                        .addComponent(Fradio1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mradio1))
                                    .addComponent(ChAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addGap(4, 4, 4)
                                .addComponent(ChFname6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(7, 7, 7)
                                .addComponent(ChLname4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(13, 13, 13)
                                .addComponent(ChCNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel81))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChEAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(CheckUpButton1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF4Layout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51))
                            .addComponent(ChPayment7)
                            .addComponent(ChPayment8))
                        .addGap(732, 732, 732))
                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                        .addComponent(ChPayment6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChPayTf4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(ChPayTf3))
                        .addGap(787, 787, 787))))
        );
        ChRecordF4Layout.setVerticalGroup(
            ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(ChFname6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(ChLname4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(ChAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(Fradio1)
                            .addComponent(Mradio1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(ChCNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(ChRecordF4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(ChAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(ChEAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckUpButton1)
                        .addContainerGap())))
            .addGroup(ChRecordF4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChPayment7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChPayTf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChPayment6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChRecordF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChPayTf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChPayment8))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane15.setViewportView(ChRecordF4);

        javax.swing.GroupLayout AddPatient2Layout = new javax.swing.GroupLayout(AddPatient2);
        AddPatient2.setLayout(AddPatient2Layout);
        AddPatient2Layout.setHorizontalGroup(
            AddPatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPatient2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddPatient2Layout.createSequentialGroup()
                .addGroup(AddPatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPatient2Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel71))
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
        );
        AddPatient2Layout.setVerticalGroup(
            AddPatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPatient2Layout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addGap(122, 122, 122))
        );

        jTabbedPane4.addTab("Add Check-up Reservations", AddPatient2);

        ChLname5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLname5ActionPerformed(evt);
            }
        });

        ChAge3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAge3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChAge3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChAge3InputMethodTextChanged(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel111.setText("Contact Number:");

        PatientGenderCH.add(Fradio3);
        Fradio3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Fradio3.setText("Female");

        PatientGenderCH.add(Mradio3);
        Mradio3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Mradio3.setText("Male");

        jLabel115.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel115.setText("Email Address:");

        ChAddress3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAddress3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel116.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel116.setText("Last Name:");

        jLabel117.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel117.setText("Gender: ");

        ChCNum5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNum5ActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel118.setText("First Name:");

        ChFname7.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname7ActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel119.setText("Personal Information");

        ChEAdd5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel120.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel120.setText("Age:");

        jLabel121.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel121.setText("Address:");

        jLabel122.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel122.setText("Doctor Name: ");

        jLabel123.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel123.setText("Dra. Geni Eindecember");

        RemoveChButton1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        RemoveChButton1.setText("Confirm Details");
        RemoveChButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveChButton1ActionPerformed(evt);
            }
        });

        ChFname8.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname8ActionPerformed(evt);
            }
        });

        SearchCH1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        SearchCH1.setText("Search");
        SearchCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCH1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChRecordF5Layout = new javax.swing.GroupLayout(ChRecordF5);
        ChRecordF5.setLayout(ChRecordF5Layout);
        ChRecordF5Layout.setHorizontalGroup(
            ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF5Layout.createSequentialGroup()
                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ChFname8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(SearchCH1)))
                .addGap(109, 109, 109)
                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel120))
                                .addGap(24, 24, 24)
                                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                                        .addComponent(Fradio3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mradio3))
                                    .addComponent(ChAge3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addGap(4, 4, 4)
                                .addComponent(ChFname7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addGap(7, 7, 7)
                                .addComponent(ChLname5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addComponent(jLabel111)
                                .addGap(13, 13, 13)
                                .addComponent(ChCNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addComponent(jLabel115))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChEAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF5Layout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel123))
                            .addComponent(RemoveChButton1))))
                .addContainerGap(674, Short.MAX_VALUE))
        );
        ChRecordF5Layout.setVerticalGroup(
            ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119)
                .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel118)
                                .addComponent(ChFname8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChFname7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116)
                            .addComponent(ChLname5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchCH1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120)
                            .addComponent(ChAge3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel117)
                            .addComponent(Fradio3)
                            .addComponent(Mradio3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addComponent(ChCNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ChRecordF5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(ChAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(ChEAdd5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ChRecordF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel122)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RemoveChButton1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(ChRecordF5);

        javax.swing.GroupLayout RemovePatient2Layout = new javax.swing.GroupLayout(RemovePatient2);
        RemovePatient2.setLayout(RemovePatient2Layout);
        RemovePatient2Layout.setHorizontalGroup(
            RemovePatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
            .addGroup(RemovePatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RemovePatient2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        RemovePatient2Layout.setVerticalGroup(
            RemovePatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
            .addGroup(RemovePatient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemovePatient2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane4.addTab("Remove Check-up Reservations", RemovePatient2);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Update Check-up Reservation", jPanel20);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("tab4", jPanel21);

        presrecordPanel.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, 240));

        jTabbedPane1.addTab("tab2", presrecordPanel);

        checkuprecordPanel.setBackground(new java.awt.Color(255, 255, 255));
        checkuprecordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        checkuprecordPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 1151, 27));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Checkup Records");
        checkuprecordPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 57, -1, -1));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Gender", "Age", "Address", "Email", "Contact", "Payment", "Change", "Date", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
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
            jTable8.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(9).setResizable(false);
            jTable8.getColumnModel().getColumn(9).setPreferredWidth(120);
            jTable8.getColumnModel().getColumn(10).setResizable(false);
            jTable8.getColumnModel().getColumn(10).setPreferredWidth(170);
            jTable8.getColumnModel().getColumn(11).setResizable(false);
            jTable8.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        checkuprecordPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 1196, 400));

        jLabel57.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 0, 0));

        ChLname.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLnameActionPerformed(evt);
            }
        });

        ChAge.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChAge.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChAgeInputMethodTextChanged(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel40.setText("Contact Number:");

        PatientGenderCH.add(Fradio);
        Fradio.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Fradio.setText("Female");

        PatientGenderCH.add(Mradio);
        Mradio.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Mradio.setText("Male");

        jLabel63.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel63.setText("Email Address:");

        ChAddress.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel64.setText("Last Name:");

        jLabel52.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel52.setText("Gender: ");

        ChCNum.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNumActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel54.setText("First Name:");

        ChFname.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFnameActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel53.setText("Personal Information");

        ChEAdd.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel55.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel55.setText("Age:");

        jLabel58.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel58.setText("Address:");

        jLabel67.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel67.setText("Doctor Name: ");

        jLabel49.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel49.setText("Dra. Geni Eindecember");

        CheckUpButton.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        CheckUpButton.setText("Confirm Details");
        CheckUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckUpButtonActionPerformed(evt);
            }
        });

        ChPayment.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment.setText("Payment: Php");

        ChPayTf.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChPayTf.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChPayTfInputMethodTextChanged(evt);
            }
        });
        ChPayTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPayTfActionPerformed(evt);
            }
        });

        ChPayment1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment1.setText("Fee: Php 1000");

        ChPayment2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment2.setText("Change: Php");

        ChPayTf1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayTf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChPayTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPayTf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChRecordFLayout = new javax.swing.GroupLayout(ChRecordF);
        ChRecordF.setLayout(ChRecordFLayout);
        ChRecordFLayout.setHorizontalGroup(
            ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(ChRecordFLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel55))
                                .addGap(24, 24, 24)
                                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChRecordFLayout.createSequentialGroup()
                                        .addComponent(Fradio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mradio))
                                    .addComponent(ChAge, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(4, 4, 4)
                                .addComponent(ChFname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(7, 7, 7)
                                .addComponent(ChLname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(13, 13, 13)
                                .addComponent(ChCNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel63))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChEAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(CheckUpButton)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ChRecordFLayout.createSequentialGroup()
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordFLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49))
                            .addComponent(ChPayment1)
                            .addComponent(ChPayment2))
                        .addGap(732, 732, 732))
                    .addGroup(ChRecordFLayout.createSequentialGroup()
                        .addComponent(ChPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChPayTf1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(ChPayTf))
                        .addGap(787, 787, 787))))
        );
        ChRecordFLayout.setVerticalGroup(
            ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(ChFname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(ChLname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(ChAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(Fradio)
                            .addComponent(Mradio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(ChCNum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(ChRecordFLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(ChAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(ChEAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckUpButton)
                        .addContainerGap())))
            .addGroup(ChRecordFLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChPayment1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChPayTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChPayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChRecordFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChPayTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChPayment2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(ChRecordF);

        javax.swing.GroupLayout AddPatientLayout = new javax.swing.GroupLayout(AddPatient);
        AddPatient.setLayout(AddPatientLayout);
        AddPatientLayout.setHorizontalGroup(
            AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPatientLayout.createSequentialGroup()
                .addGroup(AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPatientLayout.createSequentialGroup()
                        .addGroup(AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPatientLayout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel57))
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 855, Short.MAX_VALUE))
                    .addGroup(AddPatientLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPatientLayout.createSequentialGroup()
                                .addGap(0, 1168, Short.MAX_VALUE)
                                .addComponent(jLabel59)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE))))
                .addContainerGap())
        );
        AddPatientLayout.setVerticalGroup(
            AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPatientLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(122, 122, 122))
        );

        jTabbedPane2.addTab("Add Check-up Reservations", AddPatient);

        ChLname2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLname2ActionPerformed(evt);
            }
        });

        ChAge2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAge2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChAge2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChAge2InputMethodTextChanged(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel99.setText("Contact Number:");

        PatientGenderCH.add(Fradio2);
        Fradio2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Fradio2.setText("Female");

        PatientGenderCH.add(Mradio2);
        Mradio2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        Mradio2.setText("Male");

        jLabel100.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel100.setText("Email Address:");

        ChAddress2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChAddress2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel101.setText("Last Name:");

        jLabel102.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel102.setText("Gender: ");

        ChCNum2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNum2ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel103.setText("First Name:");

        ChFname2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname2ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel104.setText("Personal Information");

        ChEAdd2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel105.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel105.setText("Age:");

        jLabel106.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel106.setText("Address:");

        jLabel108.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel108.setText("Doctor Name: ");

        jLabel112.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel112.setText("Dra. Geni Eindecember");

        RemoveChButton.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        RemoveChButton.setText("Confirm Details");
        RemoveChButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveChButtonActionPerformed(evt);
            }
        });

        ChFname3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname3ActionPerformed(evt);
            }
        });

        SearchCH.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        SearchCH.setText("Search");
        SearchCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChRecordF2Layout = new javax.swing.GroupLayout(ChRecordF2);
        ChRecordF2.setLayout(ChRecordF2Layout);
        ChRecordF2Layout.setHorizontalGroup(
            ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF2Layout.createSequentialGroup()
                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ChFname3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(SearchCH)))
                .addGap(109, 109, 109)
                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel105))
                                .addGap(24, 24, 24)
                                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                                        .addComponent(Fradio2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mradio2))
                                    .addComponent(ChAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(4, 4, 4)
                                .addComponent(ChFname2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addGap(7, 7, 7)
                                .addComponent(ChLname2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addGap(13, 13, 13)
                                .addComponent(ChCNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChEAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChRecordF2Layout.createSequentialGroup()
                                .addComponent(jLabel108)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel112))
                            .addComponent(RemoveChButton))))
                .addContainerGap(674, Short.MAX_VALUE))
        );
        ChRecordF2Layout.setVerticalGroup(
            ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104)
                .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel103)
                                .addComponent(ChFname3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChFname2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(ChLname2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchCH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(ChAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(Fradio2)
                            .addComponent(Mradio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addComponent(ChCNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ChRecordF2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(ChAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(ChEAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ChRecordF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RemoveChButton)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(ChRecordF2);

        javax.swing.GroupLayout RemovePatientLayout = new javax.swing.GroupLayout(RemovePatient);
        RemovePatient.setLayout(RemovePatientLayout);
        RemovePatientLayout.setHorizontalGroup(
            RemovePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
            .addGroup(RemovePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RemovePatientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        RemovePatientLayout.setVerticalGroup(
            RemovePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
            .addGroup(RemovePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemovePatientLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane2.addTab("Remove Check-up Reservations", RemovePatient);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Update Check-up Reservation", jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab4", jPanel15);

        checkuprecordPanel.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, 234));

        jTabbedPane1.addTab("tab3", checkuprecordPanel);

        repairrecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Repair Records");

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "UserFName", "UserLName", "Email", "Contact", "Issues", "Fee", "Change", "Date", "TransactionNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
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
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable5.getColumnModel().getColumn(4).setResizable(false);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable5.getColumnModel().getColumn(5).setResizable(false);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(300);
            jTable5.getColumnModel().getColumn(6).setResizable(false);
            jTable5.getColumnModel().getColumn(6).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(7).setResizable(false);
            jTable5.getColumnModel().getColumn(8).setResizable(false);
            jTable5.getColumnModel().getColumn(8).setPreferredWidth(170);
            jTable5.getColumnModel().getColumn(9).setResizable(false);
            jTable5.getColumnModel().getColumn(9).setPreferredWidth(170);
        }

        jLabel60.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 0, 0));

        ChLname1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLname1ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel44.setText("Contact Number:");

        jLabel69.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel69.setText("Email Address:");

        jLabel70.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel70.setText("Last Name:");

        ChCNum1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNum1ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel75.setText("First Name:");

        ChFname1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname1ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel77.setText("Personal Information");

        ChEAdd1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ChPayment3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment3.setText("Payment: Php");

        ChPayTf2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayTf2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChPayTf2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ChPayTf2InputMethodTextChanged(evt);
            }
        });
        ChPayTf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPayTf2ActionPerformed(evt);
            }
        });

        ChPayment4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment4.setText("Fee: Php");

        jCheckBox1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox1.setText("Broken or Cracked Lens");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox2.setText("Scratched Lens");

        jCheckBox3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox3.setText("Loose Frame");

        jCheckBox4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox4.setText("Broken Frame");

        jCheckBox5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox5.setText("Damaged Hinges");

        jCheckBox6.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jCheckBox6.setText("Frame Alignment Issues");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
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

        jLabel78.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel78.setText("Issues");

        AddRepair.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        AddRepair.setText("Confirm Details");
        AddRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRepairActionPerformed(evt);
            }
        });

        ChPayment5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChPayment5.setText("Fee: Php");

        javax.swing.GroupLayout ChRecordF1Layout = new javax.swing.GroupLayout(ChRecordF1);
        ChRecordF1.setLayout(ChRecordF1Layout);
        ChRecordF1Layout.setHorizontalGroup(
            ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addGroup(ChRecordF1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                                        .addComponent(jLabel75)
                                        .addGap(4, 4, 4)
                                        .addComponent(ChFname1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addGap(7, 7, 7)
                                        .addComponent(ChLname1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                                        .addComponent(jLabel69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ChEAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(13, 13, 13)
                                        .addComponent(ChCNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ChRecordF1Layout.createSequentialGroup()
                                .addComponent(ChPayment3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChPayTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(787, 787, 787))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ChRecordF1Layout.createSequentialGroup()
                                .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddRepair, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ChRecordF1Layout.createSequentialGroup()
                                        .addComponent(ChPayment4)
                                        .addGap(36, 36, 36)
                                        .addComponent(ChPayment5)))
                                .addContainerGap())))
                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ChRecordF1Layout.setVerticalGroup(
            ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF1Layout.createSequentialGroup()
                .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(ChFname1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(ChLname1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(ChEAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(ChCNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ChRecordF1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChPayment4)
                            .addComponent(ChPayment5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChPayTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChPayment3))
                        .addGap(36, 36, 36)
                        .addComponent(AddRepair)))
                .addGap(30, 30, 30)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(ChRecordF1);

        javax.swing.GroupLayout AddPatient1Layout = new javax.swing.GroupLayout(AddPatient1);
        AddPatient1.setLayout(AddPatient1Layout);
        AddPatient1Layout.setHorizontalGroup(
            AddPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPatient1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddPatient1Layout.createSequentialGroup()
                .addGroup(AddPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPatient1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel60))
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
        );
        AddPatient1Layout.setVerticalGroup(
            AddPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPatient1Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addGap(122, 122, 122))
        );

        jTabbedPane3.addTab("Add Check-up Reservations", AddPatient1);

        ChLname3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChLname3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChLname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLname3ActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel107.setText("Contact Number:");

        jLabel109.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel109.setText("Email Address:");

        jLabel110.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel110.setText("Last Name:");

        ChCNum3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChCNum3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChCNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCNum3ActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel113.setText("First Name:");

        ChFname4.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname4ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jLabel114.setText("Personal Information");

        ChEAdd3.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChEAdd3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RemoveRepair.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        RemoveRepair.setText("Remove Record");
        RemoveRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRepairActionPerformed(evt);
            }
        });

        ChFname5.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        ChFname5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChFname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChFname5ActionPerformed(evt);
            }
        });

        SearchRepair.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        SearchRepair.setText("Search");
        SearchRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChRecordF3Layout = new javax.swing.GroupLayout(ChRecordF3);
        ChRecordF3.setLayout(ChRecordF3Layout);
        ChRecordF3Layout.setHorizontalGroup(
            ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF3Layout.createSequentialGroup()
                .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ChFname5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(SearchRepair)))
                .addGap(109, 109, 109)
                .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114)
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addGap(4, 4, 4)
                        .addComponent(ChFname4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(7, 7, 7)
                        .addComponent(ChLname3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addGap(13, 13, 13)
                        .addComponent(ChCNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveRepair)
                            .addComponent(ChEAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1120, Short.MAX_VALUE))
        );
        ChRecordF3Layout.setVerticalGroup(
            ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChRecordF3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addComponent(ChFname5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchRepair))
                    .addGroup(ChRecordF3Layout.createSequentialGroup()
                        .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addComponent(ChFname4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(ChLname3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(ChCNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChRecordF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(ChEAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveRepair)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(ChRecordF3);

        javax.swing.GroupLayout RemovePatient1Layout = new javax.swing.GroupLayout(RemovePatient1);
        RemovePatient1.setLayout(RemovePatient1Layout);
        RemovePatient1Layout.setHorizontalGroup(
            RemovePatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
            .addGroup(RemovePatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RemovePatient1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        RemovePatient1Layout.setVerticalGroup(
            RemovePatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
            .addGroup(RemovePatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemovePatient1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane3.addTab("Remove Check-up Reservations", RemovePatient1);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Update Check-up Reservation", jPanel16);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab4", jPanel19);

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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(729, Short.MAX_VALUE))
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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab4", repairrecordPanel);

        productrecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Product Inventory");

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ItemID", "ProductName", "Quantity", "Type", "Price", "Date Added", "ProductCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTable9.getColumnModel().getColumn(6).setResizable(false);
            jTable9.getColumnModel().getColumn(6).setPreferredWidth(300);
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
        jLabel17.setText("Enter quantity");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Enter price");

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

    private void ChCNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNumActionPerformed

    private void ChFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFnameActionPerformed

    private void ChAgeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChAgeInputMethodTextChanged

    }//GEN-LAST:event_ChAgeInputMethodTextChanged

    private void ChLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLnameActionPerformed

    private void CheckUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckUpButtonActionPerformed
        int C;
        if (ChFname.getText().isEmpty() || ChLname.getText().isEmpty() || PatientGenderCH.getSelection() == null || 
            ChAge.getText().isEmpty() || ChAddress.getText().isEmpty() || 
            ChEAdd.getText().isEmpty() || ChCNum.getText().isEmpty() || ChPayTf.getText().isEmpty()
            ){
            JOptionPane.showMessageDialog(null, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
         Fradio.setActionCommand("F");
            Mradio.setActionCommand("M");

            
            String UserfName = ChFname.getText();
            String UserlName = ChLname.getText();
            String UserGender = PatientGenderCH.getSelection().getActionCommand();
            int UserAge = Integer.parseInt(ChAge.getText());
            String UserAddress = ChAddress.getText();
            String UserEAddress = ChEAdd.getText();
            String UserContact = ChCNum.getText();
            String TransactN = String.valueOf(CTNumber);
            int UserPayment = Integer.parseInt(ChPayTf.getText());
            
            if(UserPayment > 0 && UserPayment >= 1000 && !(UserPayment < 1000)){
            
            try {

            // JOptionPane.showMessageDialog(null, this.userId);
            String InsertSql = ("INSERT INTO patientDB (UserFName,UserLName,UserGender, UserAge,UserAddress,UserEmail,UserContact,Payment,TransactionNumber) VALUES (?,?,?,?,?,?,?,?,?)");
            pst = connect.prepareStatement(InsertSql);

            pst.setString(1, UserfName);
            pst.setString(2, UserlName);
            pst.setString(3, UserGender);
            pst.setInt(4, UserAge);
            pst.setString(5, UserAddress);
            pst.setString(6, UserEAddress);
            pst.setString(7, UserContact);
            pst.setString(8, String.valueOf(UserPayment));
            pst.setString(9, TransactN);
            C = pst.executeUpdate();
            
                     

                if (C==1){
                  
                        DisplayPatientRecord();
                        String [] Options = {"Ok","Print Receipt"};
                        int choice = JOptionPane.showOptionDialog(null, "Recorded Succesfully", "Action", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,Options,Options[0]);
                        switch(choice){
                            case 0:
                                return;

                            case 1:
                                ChReceiptTRNumber.setText(TransactN);
                                ChReceiptName.setText(UserfName +" "+ UserlName);
                                ChReceiptAdress.setText(UserAddress);
                                ChReceiptContact.setText(UserContact);
                                ChReceiptDateN.setText(CurrentDate);
                                String tbdata[]={"1","Check-up","1000",String.valueOf(UserPayment)};
                                DefaultTableModel tbmodel = (DefaultTableModel) jTable1.getModel();
                                tbmodel.addRow(tbdata);
                                //ChReceiptBill.setText("Total fee: Php 1,000");
                                ChReceiptFrame.setVisible(true);
                                break;
                            }


                        }else {
                    JOptionPane.showMessageDialog(null, "Error while saving record", null,JOptionPane.ERROR_MESSAGE);
                
                }

                
        }catch (SQLException ex) {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
    }
            
            
            }
            else {
                JOptionPane.showMessageDialog(null, "Enter a valid payment",null,JOptionPane.WARNING_MESSAGE);
            }

    
        }            
    }//GEN-LAST:event_CheckUpButtonActionPerformed

    private void ChLname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLname2ActionPerformed

    private void ChAge2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChAge2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChAge2InputMethodTextChanged

    private void ChCNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNum2ActionPerformed

    private void ChFname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname2ActionPerformed

    private void RemoveChButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveChButtonActionPerformed
        String TRNumber = ChFname3.getText();
        try {
        String searchQuery = "SELECT * FROM `patientDB` WHERE `TransactionNumber` = ?";
        pst = connect.prepareStatement(searchQuery);
        pst.setString(1, TRNumber);
        rs = pst.executeQuery();

        if (rs.next()) {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String transactionType = "Check-up";
                    String insertCancelQuery = "INSERT INTO `cancetransacts` (UserName, TransactionNumber, CancelType) VALUES (?, ?, ?)";
                    String name = ChFname2.getText() +" "+ ChLname2.getText();
                    String TranNumber = TRNumber;
                    pst = connect.prepareStatement(insertCancelQuery);
                    pst.setString(1, name);
                    pst.setString(2, TranNumber);
                    pst.setString(3, transactionType); // Assuming the type of transaction is stored as a string
            int rowsInserted = pst.executeUpdate();
                
            if (rowsInserted > 0) {
                String deleteQuery = "DELETE FROM `patientDB` WHERE `TransactionNumber` = ?";
                pst = connect.prepareStatement(deleteQuery);
                pst.setString(1, TRNumber);
                int rowsDeleted = pst.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion failed. Record not found.");
                }
            }
        }
            
        }else {
            JOptionPane.showMessageDialog(null, "No record found with Transaction Number: " + TRNumber);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_RemoveChButtonActionPerformed

    private void ChFname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname3ActionPerformed

    private void SearchCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCHActionPerformed
        
        try {
            String TransactionNumber = ChFname3.getText();
            if (TransactionNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a Transaction Number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Search for the record in `patientDB` table
            String searchQuery = "SELECT * FROM `patientDB` WHERE `TransactionNumber` = ?";
            
            pst = connect.prepareStatement(searchQuery);
            
            pst.setString(1, TransactionNumber);
            rs = pst.executeQuery();
            if (rs.next()) {
                // Display fetched data in the panel
                ChFname2.setText(rs.getString("UserFName"));
                ChLname2.setText(rs.getString("UserLName"));
                ChAge2.setText(String.valueOf(rs.getInt("UserAge")));
                ChAddress2.setText(rs.getString("UserAddress"));
                ChEAdd2.setText(rs.getString("UserEmail"));
                ChCNum2.setText(String.valueOf(rs.getLong("UserContact")));
                String gender = rs.getString("UserGender");
                if (gender.equalsIgnoreCase("M")) {
                    Mradio2.setSelected(true);
                } else if (gender.equalsIgnoreCase("F")) {
                    Fradio2.setSelected(true);
                }
                
                
            }
        }catch (SQLException ex) {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
            
            
            /**
             * @param args the command line arguments
             */
               

    }//GEN-LAST:event_SearchCHActionPerformed

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        /*int row = jTable8.getSelectedRow();
        Object Fname = jTable8.getValueAt(row, 1);
        Object Lname =  jTable8.getValueAt(row, 2);
        Object Age =  jTable8.getValueAt(row, 4);
        Object Address =  jTable8.getValueAt(row, 5);
        Object Email =  jTable8.getValueAt(row, 6);
        Object Contact =  jTable8.getValueAt(row, 7);
        Object TRNumber =  jTable8.getValueAt(row, 12);
        
        ChFname2.setText(String.valueOf(Fname));
        ChLname2.setText(String.valueOf(Lname));
        ChAge2.setText(String.valueOf(Age));
        ChAddress2.setText(String.valueOf(Address));
        ChEAdd2.setText(String.valueOf(Email));
        ChCNum2.setText(String.valueOf(Contact));
        ChFname3.setText(String.valueOf(TRNumber));*/
    }//GEN-LAST:event_jTable8MouseClicked

    private void ChPayTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPayTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf1ActionPerformed

    private void ChPayTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPayTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTfActionPerformed

    private void ChPayTfInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChPayTfInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTfInputMethodTextChanged

    private void SearchRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRepairActionPerformed
        try {
            String TransactionNumber = ChFname5.getText();
            if (TransactionNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a Transaction Number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Search for the record in `patientDB` table
            String searchQuery = "SELECT * FROM `repairdb` WHERE `TransactionNumber` = ?";

            pst = connect.prepareStatement(searchQuery);

            pst.setString(1, TransactionNumber);
            rs = pst.executeQuery();
            if (rs.next()) {
                // Display fetched data in the panel
                ChFname4.setText(rs.getString("RCustomerFName"));
                ChLname3.setText(rs.getString("RCustomerLName"));
                ChEAdd3.setText(rs.getString("RCustomerEmail"));
                ChCNum3.setText(rs.getString("RCustomerContact"));
                

            }
        }catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_SearchRepairActionPerformed

    private void ChFname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname5ActionPerformed

    private void RemoveRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRepairActionPerformed
        String TRNumber = ChFname5.getText();
        try {
        String searchQuery = "SELECT * FROM `repairDB` WHERE `TransactionNumber` = ?";
        pst = connect.prepareStatement(searchQuery);
        pst.setString(1, TRNumber);
        rs = pst.executeQuery();

        if (rs.next()) {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String transactionType = "Repair";
                    String insertCancelQuery = "INSERT INTO `cancetransacts` (UserName, TransactionNumber, CancelType) VALUES (?, ?, ?)";
                    String name = ChFname4.getText() +" "+ ChLname3.getText();
                    String TranNumber = TRNumber;
                    pst = connect.prepareStatement(insertCancelQuery);
                    pst.setString(1, name);
                    pst.setString(2, TranNumber);
                    pst.setString(3, transactionType); // Assuming the type of transaction is stored as a string
            int rowsInserted = pst.executeUpdate();
                
            if (rowsInserted > 0) {
                String deleteQuery = "DELETE FROM `repairDB` WHERE `TransactionNumber` = ?";
                pst = connect.prepareStatement(deleteQuery);
                pst.setString(1, TRNumber);
                int rowsDeleted = pst.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion failed. Record not found.");
                }
            }
        }
            
        }else {
            JOptionPane.showMessageDialog(null, "No record found with Transaction Number: " + TRNumber);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_RemoveRepairActionPerformed

    private void ChFname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname4ActionPerformed

    private void ChCNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNum3ActionPerformed

    private void ChLname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLname3ActionPerformed

    private void AddRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRepairActionPerformed

        try {
            // Get user input and trim whitespace
            String UserfName = ChFname1.getText().trim();
            String UserlName = ChLname1.getText().trim();
            String UserAddress = ChEAdd1.getText().trim();
            String UserContact = ChCNum1.getText().trim();
            String TransactN = String.valueOf(RTnumber);

            // Validate that payment and fee fields are not empty
            if (ChPayTf2.getText().trim().isEmpty() || ChPayment5.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Payment and Fee fields cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Parse payment and fee
            int UserPayment = Integer.parseInt(ChPayTf2.getText().trim());
            int UserFee = Integer.parseInt(ChPayment5.getText().trim());

            // Validate payment
            if (UserPayment <= 0) {
                JOptionPane.showMessageDialog(null, "Payment must be greater than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (UserPayment < UserFee) {
                JOptionPane.showMessageDialog(null, "Payment must be greater than or equal to the fee", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calculate change
            int UserChange = UserPayment - UserFee;

            // Prepare SQL statement
            String Insert = "INSERT INTO `repairdb` (`RCustomerFName`, `RCustomerLName`, `RCustomerEmail`, `RCustomerContact`, `RIssues`, `RCustomerFee`, `Paymen`,`ChangeF`, `TransactionNumber`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = connect.prepareStatement(Insert);

            // Set the parameters
            pst.setString(1, UserfName);
            pst.setString(2, UserlName);
            pst.setString(3, UserAddress);
            pst.setString(4, UserContact);
            pst.setString(5, d); // Ensure 'd' is initialized before this line
            pst.setInt(6, UserFee);
            pst.setInt(7, UserPayment);
            pst.setInt(8, UserChange); // Use setInt for integers
            pst.setString(9, TransactN);

            int C = pst.executeUpdate(); // Execute the insert
            if (C == 1) {
                JOptionPane.showMessageDialog(null, "Record added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error while saving record", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }  catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddRepairActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void ChPayTf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPayTf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf2ActionPerformed

    private void ChPayTf2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChPayTf2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf2InputMethodTextChanged

    private void ChFname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname1ActionPerformed

    private void ChCNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNum1ActionPerformed

    private void ChLname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLname1ActionPerformed

    private void ChLname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLname4ActionPerformed

    private void ChAge1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChAge1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChAge1InputMethodTextChanged

    private void ChCNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNum4ActionPerformed

    private void ChFname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname6ActionPerformed

    private void CheckUpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckUpButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckUpButton1ActionPerformed

    private void ChPayTf3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChPayTf3InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf3InputMethodTextChanged

    private void ChPayTf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPayTf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf3ActionPerformed

    private void ChPayTf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPayTf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChPayTf4ActionPerformed

    private void ChLname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLname5ActionPerformed

    private void ChAge3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ChAge3InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChAge3InputMethodTextChanged

    private void ChCNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCNum5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChCNum5ActionPerformed

    private void ChFname7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname7ActionPerformed

    private void RemoveChButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveChButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveChButton1ActionPerformed

    private void ChFname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChFname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChFname8ActionPerformed

    private void SearchCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCH1ActionPerformed
        

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
    private javax.swing.JPanel AddPatient;
    private javax.swing.JPanel AddPatient1;
    private javax.swing.JPanel AddPatient2;
    private javax.swing.JButton AddRepair;
    private javax.swing.JPanel CancelledOrder;
    private javax.swing.JTextField ChAddress;
    private javax.swing.JTextField ChAddress1;
    private javax.swing.JTextField ChAddress2;
    private javax.swing.JTextField ChAddress3;
    private javax.swing.JTextField ChAge;
    private javax.swing.JTextField ChAge1;
    private javax.swing.JTextField ChAge2;
    private javax.swing.JTextField ChAge3;
    private javax.swing.JTextField ChCNum;
    private javax.swing.JTextField ChCNum1;
    private javax.swing.JTextField ChCNum2;
    private javax.swing.JTextField ChCNum3;
    private javax.swing.JTextField ChCNum4;
    private javax.swing.JTextField ChCNum5;
    private javax.swing.JTextField ChEAdd;
    private javax.swing.JTextField ChEAdd1;
    private javax.swing.JTextField ChEAdd2;
    private javax.swing.JTextField ChEAdd3;
    private javax.swing.JTextField ChEAdd4;
    private javax.swing.JTextField ChEAdd5;
    private javax.swing.JTextField ChFname;
    private javax.swing.JTextField ChFname1;
    private javax.swing.JTextField ChFname2;
    private javax.swing.JTextField ChFname3;
    private javax.swing.JTextField ChFname4;
    private javax.swing.JTextField ChFname5;
    private javax.swing.JTextField ChFname6;
    private javax.swing.JTextField ChFname7;
    private javax.swing.JTextField ChFname8;
    private javax.swing.JTextField ChLname;
    private javax.swing.JTextField ChLname1;
    private javax.swing.JTextField ChLname2;
    private javax.swing.JTextField ChLname3;
    private javax.swing.JTextField ChLname4;
    private javax.swing.JTextField ChLname5;
    private javax.swing.JTextField ChPayTf;
    private javax.swing.JTextField ChPayTf1;
    private javax.swing.JTextField ChPayTf2;
    private javax.swing.JTextField ChPayTf3;
    private javax.swing.JTextField ChPayTf4;
    private javax.swing.JLabel ChPayment;
    private javax.swing.JLabel ChPayment1;
    private javax.swing.JLabel ChPayment2;
    private javax.swing.JLabel ChPayment3;
    private javax.swing.JLabel ChPayment4;
    private javax.swing.JLabel ChPayment5;
    private javax.swing.JLabel ChPayment6;
    private javax.swing.JLabel ChPayment7;
    private javax.swing.JLabel ChPayment8;
    private javax.swing.JPanel ChReceipt;
    private javax.swing.JLabel ChReceiptAdress;
    private javax.swing.JLabel ChReceiptContact;
    private javax.swing.JLabel ChReceiptDateN;
    private javax.swing.JFrame ChReceiptFrame;
    private javax.swing.JLabel ChReceiptName;
    private javax.swing.JLabel ChReceiptTRNumber;
    private javax.swing.JPanel ChRecordF;
    private javax.swing.JPanel ChRecordF1;
    private javax.swing.JPanel ChRecordF2;
    private javax.swing.JPanel ChRecordF3;
    private javax.swing.JPanel ChRecordF4;
    private javax.swing.JPanel ChRecordF5;
    private javax.swing.JButton CheckUpButton;
    private javax.swing.JButton CheckUpButton1;
    private javax.swing.JRadioButton Fradio;
    private javax.swing.JRadioButton Fradio1;
    private javax.swing.JRadioButton Fradio2;
    private javax.swing.JRadioButton Fradio3;
    private javax.swing.JLabel ICount;
    private javax.swing.JRadioButton Mradio;
    private javax.swing.JRadioButton Mradio1;
    private javax.swing.JRadioButton Mradio2;
    private javax.swing.JRadioButton Mradio3;
    private javax.swing.JLabel PCount;
    private javax.swing.ButtonGroup PatientGenderCH;
    private javax.swing.ButtonGroup PatientTime;
    private javax.swing.JLabel PrCount;
    private javax.swing.JLabel RCount;
    private javax.swing.JButton RemoveChButton;
    private javax.swing.JButton RemoveChButton1;
    private javax.swing.JPanel RemovePatient;
    private javax.swing.JPanel RemovePatient1;
    private javax.swing.JPanel RemovePatient2;
    private javax.swing.JButton RemoveRepair;
    private javax.swing.JButton SearchCH;
    private javax.swing.JButton SearchCH1;
    private javax.swing.JButton SearchRepair;
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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
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
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel jLabel99;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable2;
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
