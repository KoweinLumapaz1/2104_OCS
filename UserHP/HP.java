
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserHP;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
/**
 *
 * @author lumap
 */
public class HP extends javax.swing.JFrame {
    
    public HP() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel7.setBackground(new Color(0,0,0,120));
        jPanel1.setBackground(new Color(0,0,0,120));
        jPanel3.setBackground(new Color(0,0,0,120));
        jPanel4.setBackground(new Color(0,0,0,120));
        ScaleImage();
        ScaleImage1();
        ScaleImage2();
        ScaleImage3();
        //Side Buttons
        SideButton1();
        SideButton2();
        SideButton3();
        SideButton4();
        //Eyeglass
        //frameShape
        FS1();
        FS2();
        FS3();
        //frameType
        FT1();
        FT2();
        FT3();
        //ContactLens
        CL1();
        CL2();
        CL3();
        //products
        //Eyedrop
        ED1();
        ED2();
        ED3();
        ED4();
        ED5();
        //ContactlensSol
        CLS1(); CLS2(); CLS3(); CLS4(); CLS5();
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(18); 
        
    }
    //To stretch background picture
    //logo
    String url = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\logo.png";
    public void ScaleImage(){
        System.out.print(url);
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton7.getWidth(),jButton7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton7.setIcon(scaledIcon);
    }
    
    //HP top bg
    String url1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\doctor-holding-prescription.jpg";
    public void ScaleImage1(){
        System.out.print(url1);
        ImageIcon icon = new ImageIcon(url1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton9.getWidth(),jButton9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton9.setIcon(scaledIcon);
    }
    
    String url2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\glasses-and-contacts-1536x1008-1.jpg";
    public void ScaleImage2(){
        System.out.print(url2);
        ImageIcon icon = new ImageIcon(url2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton10.getWidth(),jButton10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton10.setIcon(scaledIcon);
    }
    String url3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\medBG.jfif";
    public void ScaleImage3(){
        System.out.print(url3);
        ImageIcon icon = new ImageIcon(url3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton8.getWidth(),jButton8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton8.setIcon(scaledIcon);
    }
    //side buttons
    String sb1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\medical-prescription.png";
    public void SideButton1(){
        System.out.print(sb1);
        ImageIcon icon = new ImageIcon(sb1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton6.getWidth(),jButton6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton6.setIcon(scaledIcon);
    }
    String sb2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\checkup.png";
    public void SideButton2(){
        System.out.print(sb2);
        ImageIcon icon = new ImageIcon(sb2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton2.getWidth(),jButton2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton2.setIcon(scaledIcon);
    }
    String sb3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\repair.png";
    public void SideButton3(){
        System.out.print(sb3);
        ImageIcon icon = new ImageIcon(sb3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton3.getWidth(),jButton3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton3.setIcon(scaledIcon);
    }
    String sb4 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\shopping-cart.png";
    public void SideButton4(){
        System.out.print(sb4);
        ImageIcon icon = new ImageIcon(sb4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton4.getWidth(),jButton4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton4.setIcon(scaledIcon);
    }
    //Eyeglasses
    //FrameShape
    String fs1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Oval.png";
    public void FS1(){
        System.out.print(fs1);
        ImageIcon icon = new ImageIcon(fs1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton20.getWidth(),jButton20.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton20.setIcon(scaledIcon);
    }
    String fs2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Square.png";
    public void FS2(){
        System.out.print(fs2);
        ImageIcon icon = new ImageIcon(fs2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton19.getWidth(),jButton19.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton19.setIcon(scaledIcon);
    }
    String fs3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Rectangle.png";
    public void FS3(){
        System.out.print(fs3);
        ImageIcon icon = new ImageIcon(fs3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton18.getWidth(),jButton18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton18.setIcon(scaledIcon);
    }
    
    //FrameType
    String ft1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Plastic.png";
    public void FT1(){
        System.out.print(ft1);
        ImageIcon icon = new ImageIcon(ft1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton29.getWidth(),jButton29.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton29.setIcon(scaledIcon);
    }
    String ft2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Metal.png";
    public void FT2(){
        System.out.print(ft2);
        ImageIcon icon = new ImageIcon(ft2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton30.getWidth(),jButton30.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton30.setIcon(scaledIcon);
    }
    String ft3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\wood.png";
    public void FT3(){
        System.out.print(ft3);
        ImageIcon icon = new ImageIcon(ft3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton31.getWidth(),jButton31.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton31.setIcon(scaledIcon);
    }
    
    //Contact Lens
    String cl1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clNatural-removebg-preview.png";
    public void CL1(){
        System.out.print(cl1);
        ImageIcon icon = new ImageIcon(cl1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton16.getWidth(),jButton16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton16.setIcon(scaledIcon);
    }
    String cl2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clBrown-removebg-preview.png";
    public void CL2(){
        System.out.print(cl2);
        ImageIcon icon = new ImageIcon(cl2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton17.getWidth(),jButton17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton17.setIcon(scaledIcon);
    }
    String cl3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clGray-removebg-preview.png";
    public void CL3(){
        System.out.print(cl3);
        ImageIcon icon = new ImageIcon(cl3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton26.getWidth(),jButton26.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton26.setIcon(scaledIcon);
    }
    //Eye drops product
    String ed1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop1-removebg-preview.png";
    public void ED1(){
        System.out.print(ed1);
        ImageIcon icon = new ImageIcon(ed1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton11.getWidth(),jButton11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton11.setIcon(scaledIcon);
    }
    String ed2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop2-removebg-preview.png";
    public void ED2(){
        System.out.print(ed2);
        ImageIcon icon = new ImageIcon(ed2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton12.getWidth(),jButton12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton12.setIcon(scaledIcon);
    }
    String ed3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop3-removebg-preview.png";
    public void ED3(){
        System.out.print(ed3);
        ImageIcon icon = new ImageIcon(ed3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton13.getWidth(),jButton13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton13.setIcon(scaledIcon);
    }
    String ed4 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop4-removebg-preview.png";
    public void ED4(){
        System.out.print(ed4);
        ImageIcon icon = new ImageIcon(ed4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton14.getWidth(),jButton14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton14.setIcon(scaledIcon);
    }
    String ed5 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop5-removebg-preview.png";
    public void ED5(){
        System.out.print(ed5);
        ImageIcon icon = new ImageIcon(ed5);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton15.getWidth(),jButton15.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton15.setIcon(scaledIcon);
    }
    
    //ContactLensSolution
    String cls1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\OptiFree.png";
    public void CLS1(){
        System.out.print(cls1);
        ImageIcon icon = new ImageIcon(cls1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton25.getWidth(),jButton25.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton25.setIcon(scaledIcon);
    }
    String cls2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Renu.png";
    public void CLS2(){
        System.out.print(cls2);
        ImageIcon icon = new ImageIcon(cls2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton24.getWidth(),jButton24.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton24.setIcon(scaledIcon);
    }
    String cls3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\AllComfort.png";
    public void CLS3(){
        System.out.print(cls3);
        ImageIcon icon = new ImageIcon(cls3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton23.getWidth(),jButton23.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton23.setIcon(scaledIcon);
    }
    String cls4 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\EOFlexWear.png";
    public void CLS4(){
        System.out.print(cls4);
        ImageIcon icon = new ImageIcon(cls4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton22.getWidth(),jButton22.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton22.setIcon(scaledIcon);
    }
    String cls5 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\LensCare.png";
    public void CLS5(){
        System.out.print(cls5);
        ImageIcon icon = new ImageIcon(cls5);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jButton21.getWidth(),jButton21.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jButton21.setIcon(scaledIcon);
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        presPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        checkupPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        repairPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        medPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton15 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton18 = new javax.swing.JButton();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton19 = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton20 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton30 = new javax.swing.JButton();
        jCheckBox18 = new javax.swing.JCheckBox();
        jButton31 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton16 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton17 = new javax.swing.JButton();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton26 = new javax.swing.JButton();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton21 = new javax.swing.JButton();
        jCheckBox20 = new javax.swing.JCheckBox();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OCS");
        setBackground(new java.awt.Color(1, 82, 146));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 240, 248));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jButton2.setBackground(new java.awt.Color(173, 225, 251));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setToolTipText("Book Checkup, Reserved Checkup");
        jButton2.setAutoscrolls(true);
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(173, 225, 251));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setToolTipText("Repair Eyeglasses");
        jButton3.setAutoscrolls(true);
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(173, 225, 251));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setToolTipText("Buy products");
        jButton4.setAutoscrolls(true);
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        jButton6.setBackground(new java.awt.Color(173, 225, 251));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setToolTipText("Avail Prescription\n");
        jButton6.setAutoscrolls(true);
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(173, 225, 251));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setToolTipText("Home");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton5)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 170, 1100));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LJK Optical");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Clinic Services");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome to LJK Optical Clinic, where your vision is our priority!");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Since a lively existence depends on having a clear vision, we at ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LJK are here to help you view the world more clearly.");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserHP/calendar (1).png"))); // NOI18N
        jButton1.setText(" Book Now");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200)
                .addComponent(jButton1)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        homePanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserHP/HpBG.jpg"))); // NOI18N
        homePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 579, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserHP/HPBG3.jpg"))); // NOI18N
        homePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 528, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserHP/HpBG2.jpg"))); // NOI18N
        homePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 550, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        homePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 140));

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        homePanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 140));

        jPanel3.setPreferredSize(new java.awt.Dimension(155, 140));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        homePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(150, 140));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        homePanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        jButton10.setPreferredSize(new java.awt.Dimension(150, 140));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        homePanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 150, -1));

        jButton8.setPreferredSize(new java.awt.Dimension(150, 140));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        homePanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));
        homePanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 750, 870, 30));

        jTabbedPane1.addTab("tab1", homePanel);

        presPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prescription");

        javax.swing.GroupLayout presPanelLayout = new javax.swing.GroupLayout(presPanel);
        presPanel.setLayout(presPanelLayout);
        presPanelLayout.setHorizontalGroup(
            presPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(1342, Short.MAX_VALUE))
        );
        presPanelLayout.setVerticalGroup(
            presPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1309, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", presPanel);

        checkupPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("CHeckUp");

        javax.swing.GroupLayout checkupPanelLayout = new javax.swing.GroupLayout(checkupPanel);
        checkupPanel.setLayout(checkupPanelLayout);
        checkupPanelLayout.setHorizontalGroup(
            checkupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1243, Short.MAX_VALUE))
        );
        checkupPanelLayout.setVerticalGroup(
            checkupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", checkupPanel);

        repairPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setText("Product");

        javax.swing.GroupLayout repairPanelLayout = new javax.swing.GroupLayout(repairPanel);
        repairPanel.setLayout(repairPanelLayout);
        repairPanelLayout.setHorizontalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1063, Short.MAX_VALUE))
        );
        repairPanelLayout.setVerticalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1034, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", repairPanel);

        medPanel.setBackground(new java.awt.Color(255, 255, 255));
        medPanel.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBackground(new java.awt.Color(202, 240, 248));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Explore Available Products");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 77));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 1604, 1471, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1110, 11));

        jLabel29.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Eye Drops:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 780, -1, -1));

        jButton11.setBackground(new java.awt.Color(202, 240, 248));
        jButton11.setToolTipText("<html>ILUBE Eye Drops, Solution 10mL  <html>");
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, 160, 160));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox1.setText("ILUBE Eye Drops, Solution 10ml");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 970, 160, 20));

        jButton12.setBackground(new java.awt.Color(202, 240, 248));
        jButton12.setToolTipText("Lumify Eye Drops 2.5mL");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 810, 160, 160));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox2.setText("Lumify Eye Drops 2.5ml");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 970, 160, 20));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox3.setText("Vigamox ");
        jPanel5.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 970, 160, 20));

        jButton13.setBackground(new java.awt.Color(202, 240, 248));
        jButton13.setToolTipText("VigamoxMoxifloxacin 5mL");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 810, 160, 160));

        jButton14.setBackground(new java.awt.Color(202, 240, 248));
        jButton14.setToolTipText("Systane Ultra 5mL");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton14.setContentAreaFilled(false);
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 810, 160, 160));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox4.setText("Systane Complete");
        jPanel5.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 970, 160, 20));

        jButton15.setBackground(new java.awt.Color(202, 240, 248));
        jButton15.setToolTipText("Systane Complete 10mL");
        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 810, 160, 160));

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox5.setText("Systane Ultra");
        jPanel5.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 970, 160, 20));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox8.setText("Rectangle");
        jCheckBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox8.setContentAreaFilled(false);
        jPanel5.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, 20));

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 220, 100));

        jCheckBox9.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox9.setText("Square");
        jPanel5.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 90, 20));

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton19.setContentAreaFilled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 240, 100));

        jCheckBox10.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox10.setText("Oval");
        jPanel5.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 20));

        jButton20.setBackground(new java.awt.Color(204, 204, 204));
        jButton20.setToolTipText("tttyj tjt\njt j\ntj\nty \ntj t\nyjt\nj\ntyj ");
        jButton20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton20.setContentAreaFilled(false);
        jButton20.setDoubleBuffered(true);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 240, 100));

        jLabel35.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Contact Lens:");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jCheckBox11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox11.setText("EyeDrop1");
        jPanel5.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 1574, 104, -1));

        jCheckBox12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox12.setText("EyeDrop1");
        jPanel5.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 1574, 104, -1));

        jCheckBox13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox13.setText("EyeDrop1");
        jPanel5.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 1574, 104, -1));

        jCheckBox14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox14.setText("EyeDrop1");
        jPanel5.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 1574, 104, -1));

        jCheckBox15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox15.setText("EyeDrop1");
        jPanel5.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 1574, 104, -1));

        jLabel36.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Contact Lens Solutions:");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1500, -1, -1));

        jLabel37.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Frame Shape:");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel39.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("L");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 570, -1, 50));

        jButton29.setBackground(new java.awt.Color(202, 240, 248));
        jButton29.setToolTipText("");
        jButton29.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton29.setContentAreaFilled(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 240, 110));

        jCheckBox16.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox16.setText("Plastic");
        jPanel5.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 100, 20));

        jCheckBox17.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox17.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox17.setText("Metal");
        jPanel5.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 80, 40));

        jButton30.setBackground(new java.awt.Color(202, 240, 248));
        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 240, 110));

        jCheckBox18.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox18.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox18.setText("Wood");
        jPanel5.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 80, 20));

        jButton31.setBackground(new java.awt.Color(202, 240, 248));
        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton31.setContentAreaFilled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 220, 110));

        jLabel38.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Eyeglasses");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 20, 690));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 150, 150));

        jCheckBox6.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText("Natural");
        jPanel5.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 100, 20));

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 150, 150));

        jCheckBox7.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText("Brown");
        jPanel5.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 710, 90, 20));

        jButton26.setBackground(new java.awt.Color(204, 204, 204));
        jButton26.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 150, 150));

        jCheckBox19.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox19.setText("Gray");
        jPanel5.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 70, 20));

        jLabel40.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Frame Type:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));
        jPanel5.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, 80, 30));

        jLabel41.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Eye Grade Level");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("R");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, 20, 50));
        jPanel5.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 80, 30));

        jButton21.setBackground(new java.awt.Color(202, 240, 248));
        jButton21.setToolTipText("Lens Care Multi-Purpose Solution 360mL");
        jButton21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1090, 160, 160));

        jCheckBox20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox20.setText("Lens Care Multi-Purpose Solution 360mL");
        jPanel5.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1250, 160, 20));

        jButton22.setBackground(new java.awt.Color(202, 240, 248));
        jButton22.setToolTipText("EO Flex Wear 360mL");
        jButton22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton22.setContentAreaFilled(false);
        jPanel5.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1090, 160, 160));

        jButton23.setBackground(new java.awt.Color(202, 240, 248));
        jButton23.setToolTipText("All Comfort Formula 500mL");
        jButton23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1090, 160, 160));

        jButton24.setBackground(new java.awt.Color(202, 240, 248));
        jButton24.setToolTipText("Renu Fresh 355mL");
        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1090, 160, 160));

        jButton25.setBackground(new java.awt.Color(202, 240, 248));
        jButton25.setToolTipText("Opti-Free Puremoist 300mL");
        jButton25.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1090, 160, 160));

        jLabel30.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Contact Lens Solutions:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1060, -1, -1));

        jCheckBox21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox21.setText("Opti-Free PureMoist");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1250, 160, 20));

        jCheckBox22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox22.setText("Renu Fresh");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1250, 160, 20));

        jCheckBox23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox23.setText("All Comfort Formula 500mL");
        jPanel5.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1250, 160, 20));

        jCheckBox24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox24.setText("EO Flex Wear 360mL");
        jPanel5.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1250, 160, 20));

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total: Php");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 210, 20));

        jButton33.setBackground(new java.awt.Color(2, 102, 169));
        jButton33.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Cancel");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 120, 30));

        jButton34.setBackground(new java.awt.Color(2, 102, 169));
        jButton34.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Check Out");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 120, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1050, 940, 10));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 363, 300, 10));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 820, 10));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, 1130, 10));

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout medPanelLayout = new javax.swing.GroupLayout(medPanel);
        medPanel.setLayout(medPanelLayout);
        medPanelLayout.setHorizontalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 436, Short.MAX_VALUE))
        );
        medPanelLayout.setVerticalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(566, 566, 566))
        );

        jTabbedPane1.addTab("tab5", medPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 1650, 1490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedComponent(checkupPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedComponent(medPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedComponent(presPanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTabbedPane1.setSelectedComponent(homePanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedComponent(checkupPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedComponent(repairPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        jTabbedPane1.setSelectedComponent(presPanel);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTabbedPane1.setSelectedComponent(repairPanel);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTabbedPane1.setSelectedComponent(medPanel);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox21ActionPerformed

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
            java.util.logging.Logger.getLogger(HP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel checkupPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel medPanel;
    private javax.swing.JPanel presPanel;
    private javax.swing.JPanel repairPanel;
    // End of variables declaration//GEN-END:variables
}
