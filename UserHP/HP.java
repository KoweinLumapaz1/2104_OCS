
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserHP;
import java.awt.Color;
import java.awt.Image;
import static java.lang.String.join;
import java.util.ArrayList;
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
    //Images
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
        CLS1(); 
        CLS2(); 
        CLS3(); 
        CLS4(); 
        CLS5();
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(18);       
    }
    
    ArrayList <String> productList = new ArrayList <String>();
     String d = join(", ", productList);
     
     //Product selection with price
    public void SelectedItem(){
         int SelectedPrice = 0;
         productList.clear();
         
        //Frame shape -- CB=CheckBox
        if (ovalCB.isSelected()) {
        SelectedPrice += 800;
        productList.add("Oval");   
    }
        if (squareCB.isSelected()) {
        SelectedPrice += 550;
        productList.add("Square");  
    }
        if (rectangleeCB.isSelected()) {
        SelectedPrice += 650;
        productList.add("Rectangle"); 
    }
        //Frame type -- CB=CheckBox
        if (plasticCB.isSelected()) {
        SelectedPrice += 1000;
        productList.add("Plastic");    
    }
        if (metalCB.isSelected()) {
        SelectedPrice += 1500;
        productList.add("Metal");   
    }
        if (woodCB.isSelected()) {
        SelectedPrice += 1200;
        productList.add("Wood");  
    }
        //Contact lens
        if (naturalCB.isSelected()) {
        SelectedPrice += 1050;
        productList.add("Natural");
    }
        if (brownCB.isSelected()) {
        SelectedPrice += 1250;
        productList.add("Brown");
    }
        if (grayCB.isSelected()) {
        SelectedPrice += 1250;
        productList.add("Gray");
    }
        //Eye drops -- CB=CheckBox
        if (ilubeCB.isSelected()) {
        SelectedPrice += 110;
        productList.add("ILUBE Eye drop 10mL");
    }
        if (lumifyCB.isSelected()) {
        SelectedPrice += 1202;
        productList.add("Lumify Eye drop 2.5mL");
    }
        if (vigamoxCB.isSelected()) {
        SelectedPrice += 545;
        productList.add("Vigamox 5mL");
    }
        if (systaneUltraCB.isSelected()) {
        SelectedPrice += 257;
        productList.add("Systane Ultra 5mL");
    }
        if (systanecomCB.isSelected()) {
        SelectedPrice += 720;
        productList.add("Systane Complete 10mL");
    }
        //Contact lens solution
        if (optifreeCB.isSelected()) {
        SelectedPrice += 459;
        productList.add("Opti-Free PureMoist 300mL");
    }
        if (renuCB.isSelected()) {
        SelectedPrice += 403;
        productList.add("Renu Fresh 355mL");
    }
        if (allCB.isSelected()) {
        SelectedPrice += 349;
        productList.add("All Comfort Formula 500mL");
    }
        if (eoCB.isSelected()) {
        SelectedPrice += 199;
        productList.add("EO Flex Wear 360mL");
    }
        if (lenscareCB.isSelected()) {
        SelectedPrice += 144;
        productList.add("Lens Care Multi-Purpose Solution 360mL");
    }
    
            d = String.join(", ", productList);
            jLabel13.setText("Total:Php " + String.valueOf(SelectedPrice));
    }
    
    //cancelButton - reset the orders - -- B=button CB=CheckBox
    private void cancelOrder() {
       ovalCB.setSelected(false);
       squareCB.setSelected(false);
       rectangleeCB.setSelected(false);
        
       ovalCB.setEnabled(true);
       squareCB.setEnabled(true);
       rectangleeCB.setEnabled(true);
       
       ovalB.setEnabled(true);
       squareB.setEnabled(true);
       rectangleB.setEnabled(true);

       plasticCB.setSelected(false);
       metalCB.setSelected(false);
       woodCB.setSelected(false);
       
       plasticCB.setEnabled(true);
       metalCB.setEnabled(true);
       woodCB.setEnabled(true);
       
       plasticB.setEnabled(true);
       metalB.setEnabled(true);
       woodB.setEnabled(true);

       naturalCB.setSelected(false);
       brownCB.setSelected(false);
       grayCB.setSelected(false);

       ilubeCB.setSelected(false);
       lumifyCB.setSelected(false);
       vigamoxCB.setSelected(false);  
       systaneUltraCB.setSelected(false);
       systanecomCB .setSelected(false);

       optifreeCB.setSelected(false);
       renuCB.setSelected(false);
       allCB.setSelected(false);
       eoCB.setSelected(false);
       lenscareCB.setSelected(false);

       jLabel13.setText("Total: Php " + "0");
    }
    
    //Disable frame shape if one is selected -- B=button CB=CheckBox
    public void DisableShape(){
        ovalB.setEnabled(true);
        ovalCB.setEnabled(true);
        squareB.setEnabled(true);
        squareCB.setEnabled(true);
        rectangleB.setEnabled(true);
        rectangleeCB.setEnabled(true);

    if (ovalCB.isSelected()) {
        squareB.setEnabled(false);
        squareCB.setEnabled(false);
        rectangleB.setEnabled(false);
        rectangleeCB.setEnabled(false);
     }
    if (squareCB.isSelected()) {
        ovalB.setEnabled(false);
        ovalCB.setEnabled(false);
        rectangleB.setEnabled(false);
        rectangleeCB.setEnabled(false);
     }
    if (rectangleeCB.isSelected()) {
        ovalB.setEnabled(false);
        ovalCB.setEnabled(false);
        squareB.setEnabled(false);
        squareCB.setEnabled(false);
     }
    }
    
    //Disable frame type if one is selected -- B=button CB=CheckBox
    public void DisableType(){
        plasticB.setEnabled(true);
        plasticCB.setEnabled(true);
        metalB.setEnabled(true);
        metalCB.setEnabled(true);
        woodB.setEnabled(true);
        woodCB.setEnabled(true);
        
    if (plasticCB.isSelected()) {
        metalB.setEnabled(false);
        metalCB.setEnabled(false);
        woodB.setEnabled(false);
        woodCB.setEnabled(false);
     }
    if (metalCB.isSelected()) {
        plasticB.setEnabled(false);
        plasticCB.setEnabled(false);
        woodB.setEnabled(false);
        woodCB.setEnabled(false);
     }
    if (woodCB.isSelected()) {
        plasticB.setEnabled(false);
        plasticCB.setEnabled(false);
        metalB.setEnabled(false);
        metalCB.setEnabled(false);
     }
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
        Image imgScale = img.getScaledInstance(ovalB.getWidth(),ovalB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        ovalB.setIcon(scaledIcon);
    }
    String fs2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Square.png";
    public void FS2(){
        System.out.print(fs2);
        ImageIcon icon = new ImageIcon(fs2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(squareB.getWidth(),squareB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        squareB.setIcon(scaledIcon);
    }
    String fs3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Rectangle.png";
    public void FS3(){
        System.out.print(fs3);
        ImageIcon icon = new ImageIcon(fs3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(rectangleB.getWidth(),rectangleB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        rectangleB.setIcon(scaledIcon);
    }
    
    //FrameType
    String ft1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Plastic.png";
    public void FT1(){
        System.out.print(ft1);
        ImageIcon icon = new ImageIcon(ft1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(plasticB.getWidth(),plasticB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        plasticB.setIcon(scaledIcon);
    }
    String ft2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Metal.png";
    public void FT2(){
        System.out.print(ft2);
        ImageIcon icon = new ImageIcon(ft2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(metalB.getWidth(),metalB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        metalB.setIcon(scaledIcon);
    }
    String ft3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\wood.png";
    public void FT3(){
        System.out.print(ft3);
        ImageIcon icon = new ImageIcon(ft3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(woodB.getWidth(),woodB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        woodB.setIcon(scaledIcon);
    }
    
    //Contact Lens
    String cl1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clNatural-removebg-preview.png";
    public void CL1(){
        System.out.print(cl1);
        ImageIcon icon = new ImageIcon(cl1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(naturalB.getWidth(),naturalB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        naturalB.setIcon(scaledIcon);
    }
    String cl2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clBrown-removebg-preview.png";
    public void CL2(){
        System.out.print(cl2);
        ImageIcon icon = new ImageIcon(cl2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(brownB.getWidth(),brownB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        brownB.setIcon(scaledIcon);
    }
    String cl3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\clGray-removebg-preview.png";
    public void CL3(){
        System.out.print(cl3);
        ImageIcon icon = new ImageIcon(cl3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(grayB.getWidth(),grayB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        grayB.setIcon(scaledIcon);
    }
    
    //Eye drops product
    String ed1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop1-removebg-preview.png";
    public void ED1(){
        System.out.print(ed1);
        ImageIcon icon = new ImageIcon(ed1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(ilubeB.getWidth(),ilubeB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        ilubeB.setIcon(scaledIcon);
    }
    String ed2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop2-removebg-preview.png";
    public void ED2(){
        System.out.print(ed2);
        ImageIcon icon = new ImageIcon(ed2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lumifyB.getWidth(),lumifyB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        lumifyB.setIcon(scaledIcon);
    }
    String ed3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop3-removebg-preview.png";
    public void ED3(){
        System.out.print(ed3);
        ImageIcon icon = new ImageIcon(ed3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(vigamoxB.getWidth(),vigamoxB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        vigamoxB.setIcon(scaledIcon);
    }
    String ed4 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop4-removebg-preview.png";
    public void ED4(){
        System.out.print(ed4);
        ImageIcon icon = new ImageIcon(ed4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(systaneUltraB.getWidth(),systaneUltraB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        systaneUltraB.setIcon(scaledIcon);
    }
    String ed5 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Eyedrop5-removebg-preview.png";
    public void ED5(){
        System.out.print(ed5);
        ImageIcon icon = new ImageIcon(ed5);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(systaneComB.getWidth(),systaneComB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        systaneComB.setIcon(scaledIcon);
    }
    
    //ContactLensSolution
    String cls1 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\OptiFree.png";
    public void CLS1(){
        System.out.print(cls1);
        ImageIcon icon = new ImageIcon(cls1);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(optifreeB.getWidth(),optifreeB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        optifreeB.setIcon(scaledIcon);
    }
    String cls2 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\Renu.png";
    public void CLS2(){
        System.out.print(cls2);
        ImageIcon icon = new ImageIcon(cls2);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(renuB.getWidth(),renuB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        renuB.setIcon(scaledIcon);
    }
    String cls3 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\AllComfort.png";
    public void CLS3(){
        System.out.print(cls3);
        ImageIcon icon = new ImageIcon(cls3);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(allB.getWidth(),allB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        allB.setIcon(scaledIcon);
    }
    String cls4 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\EOFlexWear.png";
    public void CLS4(){
        System.out.print(cls4);
        ImageIcon icon = new ImageIcon(cls4);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(eoB.getWidth(),eoB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        eoB.setIcon(scaledIcon);
    }
    String cls5 = "C:\\Users\\lumap\\OneDrive\\Desktop\\Documents\\1PROJECT\\OCS\\CheckUp\\src\\UserHP\\LensCare.png";
    public void CLS5(){
        System.out.print(cls5);
        ImageIcon icon = new ImageIcon(cls5);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lenscareB.getWidth(),lenscareB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        lenscareB.setIcon(scaledIcon);
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
        ilubeB = new javax.swing.JButton();
        ilubeCB = new javax.swing.JCheckBox();
        lumifyB = new javax.swing.JButton();
        lumifyCB = new javax.swing.JCheckBox();
        vigamoxCB = new javax.swing.JCheckBox();
        vigamoxB = new javax.swing.JButton();
        systaneUltraB = new javax.swing.JButton();
        systanecomCB = new javax.swing.JCheckBox();
        systaneComB = new javax.swing.JButton();
        systaneUltraCB = new javax.swing.JCheckBox();
        rectangleeCB = new javax.swing.JCheckBox();
        rectangleB = new javax.swing.JButton();
        squareCB = new javax.swing.JCheckBox();
        squareB = new javax.swing.JButton();
        ovalCB = new javax.swing.JCheckBox();
        ovalB = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        plasticB = new javax.swing.JButton();
        plasticCB = new javax.swing.JCheckBox();
        metalCB = new javax.swing.JCheckBox();
        metalB = new javax.swing.JButton();
        woodCB = new javax.swing.JCheckBox();
        woodB = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        naturalB = new javax.swing.JButton();
        naturalCB = new javax.swing.JCheckBox();
        brownB = new javax.swing.JButton();
        brownCB = new javax.swing.JCheckBox();
        grayB = new javax.swing.JButton();
        grayCB = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        lenscareB = new javax.swing.JButton();
        lenscareCB = new javax.swing.JCheckBox();
        eoB = new javax.swing.JButton();
        allB = new javax.swing.JButton();
        renuB = new javax.swing.JButton();
        optifreeB = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        optifreeCB = new javax.swing.JCheckBox();
        renuCB = new javax.swing.JCheckBox();
        allCB = new javax.swing.JCheckBox();
        eoCB = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();

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

        ilubeB.setBackground(new java.awt.Color(202, 240, 248));
        ilubeB.setToolTipText("<html>\nIlube Eye Drops (Acetylcysteine) (10mL) is commonly used to treat severe dry eyes\n<br>\n<br>Instructions for Use:\n<br>Shake well before use.\n<br>Hold the dropper above your eye and gently squeeze to release 1-2 drops into the pocket.\n<br>Close your eyes and press gently on the inner corner of your eye for about 1-2 minutes. This prevents the drops from draining too quickly.\n<br>\n<br>Dosage:\n<br>Typical Dosage: 1-2 drops in the affected eye(s), 3-4 times daily or as directed by your doctor.\n\n");
        ilubeB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        ilubeB.setContentAreaFilled(false);
        ilubeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilubeBActionPerformed(evt);
            }
        });
        jPanel5.add(ilubeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, 160, 160));

        ilubeCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ilubeCB.setText("ILUBE Eye Drops, Solution 10ml");
        ilubeCB.setToolTipText("<html>\nIlube Eye Drops (Acetylcysteine) (10mL) is commonly used to treat severe dry eyes\n<br>\n<br>Instructions for Use:\n<br>Shake well before use.\n<br>Hold the dropper above your eye and gently squeeze to release 1-2 drops into the pocket.\n<br>Close your eyes and press gently on the inner corner of your eye for about 1-2 minutes. This prevents the drops from draining too quickly.\n<br>\n<br>Dosage:\n<br>Typical Dosage: 1-2 drops in the affected eye(s), 3-4 times daily or as directed by your doctor.\n\n");
        ilubeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilubeCBActionPerformed(evt);
            }
        });
        jPanel5.add(ilubeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 970, 160, 30));

        lumifyB.setBackground(new java.awt.Color(202, 240, 248));
        lumifyB.setToolTipText("<html>\nLumify (Brimonidine Tartrate) (2.5mL) is an over-the-counter eye drop specifically designed to reduce redness in the eyes caused by minor irritations.\n<br>\n<br>Instructions for Use:\n<br>Shake gently if needed.\n<br>Hold the dropper directly over your eye and squeeze 1 drop into the pocket.\n<br>Blink a few times to spread the drops across your eye.\n<br>\n<br>Dosage:\n<br>Recommended Dosage: 1 drop in the affected eye(s), up to 4 times daily.\n<br>Ensure at least 6-8 hours between doses.\n\n");
        lumifyB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        lumifyB.setContentAreaFilled(false);
        lumifyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumifyBActionPerformed(evt);
            }
        });
        jPanel5.add(lumifyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 810, 160, 160));

        lumifyCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lumifyCB.setText("Lumify Eye Drops 2.5ml");
        lumifyCB.setToolTipText("<html>\nLumify (Brimonidine Tartrate) (2.5mL) is an over-the-counter eye drop specifically designed to reduce redness in the eyes caused by minor irritations.\n<br>\n<br>Instructions for Use:\n<br>Shake gently if needed.\n<br>Hold the dropper directly over your eye and squeeze 1 drop into the pocket.\n<br>Blink a few times to spread the drops across your eye.\n<br>\n<br>Dosage:\n<br>Recommended Dosage: 1 drop in the affected eye(s), up to 4 times daily.\n<br>Ensure at least 6-8 hours between doses.\n\n");
        lumifyCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumifyCBActionPerformed(evt);
            }
        });
        jPanel5.add(lumifyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 970, 160, 30));

        vigamoxCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        vigamoxCB.setText("Vigamox 5mL");
        vigamoxCB.setToolTipText("<html> Vigamox (Moxifloxacin) (5mL) is a prescription antibiotic eye drop used to treat bacterial eye infections such as conjunctivitis (pink eye).\n <br> <br>Instructions for Use: \n<br>Shake gently if needed. \n<br>Hold the dropper close to your eye (but do not touch the eye surface) and squeeze 1 drop into the affected eye. \n<br>Close your eye gently and press lightly on the inner corner of the eye for about 1 minute to prevent the medication from draining out. \n<br>\n <br>Dosage:\n <br>Instill 1 drop in the affected eye(s) 3 times daily (every 8 hours). \n<br>Continue treatment for 7 days or as directed by your doctor.");
        vigamoxCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigamoxCBActionPerformed(evt);
            }
        });
        jPanel5.add(vigamoxCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 970, 160, 30));

        vigamoxB.setBackground(new java.awt.Color(202, 240, 248));
        vigamoxB.setToolTipText("<html>\nVigamox (Moxifloxacin) (5mL) is a prescription antibiotic eye drop used to treat bacterial eye infections such as conjunctivitis (pink eye).\n<br>\n<br>Instructions for Use:\n<br>Shake gently if needed.\n<br>Hold the dropper close to your eye (but do not touch the eye surface) and squeeze 1 drop into the affected eye.\n<br>Close your eye gently and press lightly on the inner corner of the eye for about 1 minute to prevent the medication from draining out.\n<br>\n<br>Dosage:\n<br>Instill 1 drop in the affected eye(s) 3 times daily (every 8 hours).\n<br>Continue treatment for 7 days or as directed by your doctor.");
        vigamoxB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        vigamoxB.setContentAreaFilled(false);
        vigamoxB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigamoxBActionPerformed(evt);
            }
        });
        jPanel5.add(vigamoxB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 810, 160, 160));

        systaneUltraB.setBackground(new java.awt.Color(202, 240, 248));
        systaneUltraB.setToolTipText("<html>\nSystane Ultra (5mL) is a lubricating eye drop designed to provide quick relief from dry and irritated eyes.\n<br>\n<br>Instructions for Use:\n<br>Shake the bottle well before use.\n<br>Gently squeeze the bottle to release 1-2 drops into the pocket of the affected eye.\n<br>Close your eyes and blink a few times to spread the solution evenly.\n<br>\n<br>Dosage:\n<br>Use 1-2 drops in the affected eye(s) as needed throughout the day.");
        systaneUltraB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        systaneUltraB.setContentAreaFilled(false);
        systaneUltraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systaneUltraBActionPerformed(evt);
            }
        });
        jPanel5.add(systaneUltraB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 810, 160, 160));

        systanecomCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        systanecomCB.setText("Systane Complete 10mL");
        systanecomCB.setToolTipText("<html>\nSystane Complete (10mL) provide relief for all major types of dry eye, including evaporative dry eye and aqueous tear deficiency.\n<br>\n<br>Instructions for Use:\n<br>Shake well: Systane Complete is an emulsion, so it must be shaken thoroughly before use.\n<br>Squeeze 1-2 drops into the affected eye.\n<br>Close your eyes gently and blink a few times to distribute the solution evenly.\n<br>\n<br>Dosage:\n<br>Use 1-2 drops in the affected eye(s) as needed throughout the day.\n");
        systanecomCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systanecomCBActionPerformed(evt);
            }
        });
        jPanel5.add(systanecomCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 970, 160, -1));

        systaneComB.setBackground(new java.awt.Color(202, 240, 248));
        systaneComB.setToolTipText("<html>\nSystane Complete (10mL) provide relief for all major types of dry eye, including evaporative dry eye and aqueous tear deficiency.\n<br>\n<br>Instructions for Use:\n<br>Shake well: Systane Complete is an emulsion, so it must be shaken thoroughly before use.\n<br>Squeeze 1-2 drops into the affected eye.\n<br>Close your eyes gently and blink a few times to distribute the solution evenly.\n<br>\n<br>Dosage:\n<br>Use 1-2 drops in the affected eye(s) as needed throughout the day.\n");
        systaneComB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        systaneComB.setContentAreaFilled(false);
        systaneComB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systaneComBActionPerformed(evt);
            }
        });
        jPanel5.add(systaneComB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 810, 160, 160));

        systaneUltraCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        systaneUltraCB.setText("Systane Ultra 5mL");
        systaneUltraCB.setToolTipText("<html>\nSystane Ultra (5mL) is a lubricating eye drop designed to provide quick relief from dry and irritated eyes.\n<br>\n<br>Instructions for Use:\n<br>Shake the bottle well before use.\n<br>Gently squeeze the bottle to release 1-2 drops into the pocket of the affected eye.\n<br>Close your eyes and blink a few times to spread the solution evenly.\n<br>\n<br>Dosage:\n<br>Use 1-2 drops in the affected eye(s) as needed throughout the day.\n");
        systaneUltraCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systaneUltraCBActionPerformed(evt);
            }
        });
        jPanel5.add(systaneUltraCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 970, 160, 30));

        rectangleeCB.setBackground(new java.awt.Color(255, 255, 255));
        rectangleeCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        rectangleeCB.setForeground(new java.awt.Color(0, 0, 0));
        rectangleeCB.setText("Rectangle");
        rectangleeCB.setToolTipText("Rectangle shape");
        rectangleeCB.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        rectangleeCB.setContentAreaFilled(false);
        rectangleeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleeCBActionPerformed(evt);
            }
        });
        jPanel5.add(rectangleeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, 20));

        rectangleB.setBackground(new java.awt.Color(204, 204, 204));
        rectangleB.setToolTipText("Recatangle shape");
        rectangleB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        rectangleB.setContentAreaFilled(false);
        rectangleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleBActionPerformed(evt);
            }
        });
        jPanel5.add(rectangleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 220, 100));

        squareCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        squareCB.setForeground(new java.awt.Color(0, 0, 0));
        squareCB.setText("Square");
        squareCB.setToolTipText("Square shape");
        squareCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareCBActionPerformed(evt);
            }
        });
        jPanel5.add(squareCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 90, 20));

        squareB.setBackground(new java.awt.Color(204, 204, 204));
        squareB.setToolTipText("Square shape");
        squareB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        squareB.setContentAreaFilled(false);
        squareB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareBActionPerformed(evt);
            }
        });
        jPanel5.add(squareB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 240, 100));

        ovalCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        ovalCB.setForeground(new java.awt.Color(0, 0, 0));
        ovalCB.setText("Oval");
        ovalCB.setToolTipText("Oval shape");
        ovalCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalCBActionPerformed(evt);
            }
        });
        jPanel5.add(ovalCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 20));

        ovalB.setBackground(new java.awt.Color(204, 204, 204));
        ovalB.setToolTipText("Oval shape");
        ovalB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        ovalB.setContentAreaFilled(false);
        ovalB.setDoubleBuffered(true);
        ovalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalBActionPerformed(evt);
            }
        });
        jPanel5.add(ovalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 240, 100));

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
        jLabel39.setToolTipText("Left eye grade level");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, 20, 50));

        plasticB.setBackground(new java.awt.Color(202, 240, 248));
        plasticB.setToolTipText("Plastic frame");
        plasticB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        plasticB.setContentAreaFilled(false);
        plasticB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasticBActionPerformed(evt);
            }
        });
        jPanel5.add(plasticB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 240, 110));

        plasticCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        plasticCB.setForeground(new java.awt.Color(0, 0, 0));
        plasticCB.setText("Plastic");
        plasticCB.setToolTipText("Plastic frame");
        plasticCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasticCBActionPerformed(evt);
            }
        });
        jPanel5.add(plasticCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 100, 20));

        metalCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        metalCB.setForeground(new java.awt.Color(0, 0, 0));
        metalCB.setText("Metal");
        metalCB.setToolTipText("Metal frame");
        metalCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metalCBActionPerformed(evt);
            }
        });
        jPanel5.add(metalCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 80, 40));

        metalB.setBackground(new java.awt.Color(202, 240, 248));
        metalB.setToolTipText("Metal frame");
        metalB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        metalB.setContentAreaFilled(false);
        metalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metalBActionPerformed(evt);
            }
        });
        jPanel5.add(metalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 240, 110));

        woodCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        woodCB.setForeground(new java.awt.Color(0, 0, 0));
        woodCB.setText("Wood");
        woodCB.setToolTipText("Wood frame");
        woodCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodCBActionPerformed(evt);
            }
        });
        jPanel5.add(woodCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 80, 20));

        woodB.setBackground(new java.awt.Color(202, 240, 248));
        woodB.setToolTipText("Wood frame");
        woodB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        woodB.setContentAreaFilled(false);
        woodB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodBActionPerformed(evt);
            }
        });
        jPanel5.add(woodB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 220, 110));

        jLabel38.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Eyeglasses");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 20, 690));

        naturalB.setBackground(new java.awt.Color(204, 204, 204));
        naturalB.setToolTipText("Natural contact lens");
        naturalB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        naturalB.setContentAreaFilled(false);
        naturalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalBActionPerformed(evt);
            }
        });
        jPanel5.add(naturalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 150, 150));

        naturalCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        naturalCB.setForeground(new java.awt.Color(0, 0, 0));
        naturalCB.setText("Natural");
        naturalCB.setToolTipText("Natural contact lens");
        naturalCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalCBActionPerformed(evt);
            }
        });
        jPanel5.add(naturalCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 100, 20));

        brownB.setBackground(new java.awt.Color(204, 204, 204));
        brownB.setToolTipText("Brown contact lens");
        brownB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        brownB.setContentAreaFilled(false);
        brownB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownBActionPerformed(evt);
            }
        });
        jPanel5.add(brownB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 150, 150));

        brownCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        brownCB.setForeground(new java.awt.Color(0, 0, 0));
        brownCB.setText("Brown");
        brownCB.setToolTipText("Brown contact lens");
        brownCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownCBActionPerformed(evt);
            }
        });
        jPanel5.add(brownCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 710, 90, 20));

        grayB.setBackground(new java.awt.Color(204, 204, 204));
        grayB.setToolTipText("Gray contact lens");
        grayB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        grayB.setContentAreaFilled(false);
        grayB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayBActionPerformed(evt);
            }
        });
        jPanel5.add(grayB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 150, 150));

        grayCB.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        grayCB.setForeground(new java.awt.Color(0, 0, 0));
        grayCB.setText("Gray");
        grayCB.setToolTipText("Gray contact lens");
        grayCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayCBActionPerformed(evt);
            }
        });
        jPanel5.add(grayCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 70, 20));

        jLabel40.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Frame Type:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jSpinner1.setToolTipText("Right eye grade level");
        jPanel5.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 80, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Note: Please choose 1 (one) shape only.");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("R");
        jLabel42.setToolTipText("Right eye grade level");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 20, 50));

        jSpinner2.setToolTipText("Left eye grade level");
        jPanel5.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, 80, 30));

        lenscareB.setBackground(new java.awt.Color(202, 240, 248));
        lenscareB.setToolTipText("<html>\nLens Care Multipurpose Solutions (360mL) are designed to clean, disinfect, rinse, and store soft contact lenses.\n<br>\n<br>Instructions for Proper Use:\n<br>Remove one lens from your eye.\n<br>Apply 3-5 drops of multipurpose solution onto the lens.\n<br>Gently rub the lens with your finger in a circular motion for 10-20 seconds on both sides.\n<br>\n<br>Precautions:\n<br>Follow Replacement Schedule:\n<br>Replace lenses according to your doctor’s recommendations (daily, biweekly, or monthly).\n<br>Avoid Mixing Solutions:\n<br>Do not mix multipurpose solutions with other products unless advised by your doctor.");
        lenscareB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        lenscareB.setContentAreaFilled(false);
        lenscareB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenscareBActionPerformed(evt);
            }
        });
        jPanel5.add(lenscareB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1090, 160, 160));

        lenscareCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lenscareCB.setText("Lens Care Multi-Purpose Solution 360mL");
        lenscareCB.setToolTipText("<html>\nLens Care Multipurpose Solutions (360mL) are designed to clean, disinfect, rinse, and store soft contact lenses.\n<br>\n<br>Instructions for Proper Use:\n<br>Remove one lens from your eye.\n<br>Apply 3-5 drops of multipurpose solution onto the lens.\n<br>Gently rub the lens with your finger in a circular motion for 10-20 seconds on both sides.\n<br>\n<br>Precautions:\n<br>Follow Replacement Schedule:\n<br>Replace lenses according to your doctor’s recommendations (daily, biweekly, or monthly).\n<br>Avoid Mixing Solutions:\n<br>Do not mix multipurpose solutions with other products unless advised by your doctor.");
        lenscareCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenscareCBActionPerformed(evt);
            }
        });
        jPanel5.add(lenscareCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1250, 160, 30));

        eoB.setBackground(new java.awt.Color(202, 240, 248));
        eoB.setToolTipText("<html>\nEO Flexwear Refresh Multipurpose Contact Lens Solution (360mL).\n<br>This solution is designed for cleaning, disinfecting, and storing soft contact lenses, providing moisture and comfort.\n<br>\n<br>Instructions for Use:\n<br>Apply a few drops of EO Flexwear solution to both sides of the lens.\n<br>Gently rub the lens with your finger for 10-20 seconds on each side to remove dirt, proteins, and debris.\n<br>Precautions:\n<br>Keep the solution bottle tightly closed and store it in a cool, dry place.\n<br>Always check the expiration date before using the solution. Do not use expired solutions, as they may not disinfect properly.");
        eoB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        eoB.setContentAreaFilled(false);
        eoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eoBActionPerformed(evt);
            }
        });
        jPanel5.add(eoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1090, 160, 160));

        allB.setBackground(new java.awt.Color(202, 240, 248));
        allB.setToolTipText("<html>\nThe All Comfort Formula (500mL) contact lens solution is designed to clean, disinfect, and store rigid gas permeable lenses. \n<br>It ensures comfort by providing cushioning for the lenses.\n<br>\n<br>Instructions:\n<br>Wash your hands thoroughly with mild soap before handling your lenses. ensuring that both sides are cleaned.\n<br>Rinse the lenses well with fresh tap water to remove any cleaning solution.\n<br>\n<br>Precautions:\n<br>Store the solution at room temperature and avoid freezing.\n<br>Clean and air-dry the interior of your lens case after every use.\n<br>Follow all instructions to avoid contamination and potential eye infections.");
        allB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        allB.setContentAreaFilled(false);
        allB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBActionPerformed(evt);
            }
        });
        jPanel5.add(allB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1090, 160, 160));

        renuB.setBackground(new java.awt.Color(202, 240, 248));
        renuB.setToolTipText("<html>\nRenu Fresh (355mL) is a popular multi-purpose solution used for cleaning, rinsing, disinfecting, and storing soft contact lenses.\n<br>\n<br>Instructions for Use:\n<br>Place at least three drops of the solution on each side of the lens and gently rub for 20 seconds.\n<br>Place the lenses in a clean case and fill it with fresh solution. Soak for at least 4 hours before wearing again.\n<br>\n<br>Precautions:\n<br>Always wash and dry your hands before handling your lenses.\n<br>Avoid storing lenses for more than 30 days without cleaning them again.");
        renuB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        renuB.setContentAreaFilled(false);
        renuB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renuBActionPerformed(evt);
            }
        });
        jPanel5.add(renuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1090, 160, 160));

        optifreeB.setBackground(new java.awt.Color(202, 240, 248));
        optifreeB.setToolTipText("<html>\nOpti-Free PureMoist (300mL) is a multipurpose solution produced by Alcon. It is suitable for disinfecting, cleaning, and storing all types of soft contact lenses.\n<br>\n<br>Instructions:\n<br>Fill the empty lens case with solution.\n<br>Wet each side of the lens with the solution.\n<br>Rub each lens for 20 seconds with your finger.\n<br>Rinse each side of the contact lens for 10 seconds with a steady stream of the solution.\n<br>Place the lenses in the case, tighten the lids and wait overnight or at least six hours.\n<br>\n<br>Precautions:\n<br>Do not use the solution beyond six months after opening. Store lenses in Opti-Free PureMoist for up to 30 days, but they must be cleaned and disinfected before reuse if stored longer.\n<br>Always follow the product directions for use as failure to do so may lead to vision loss or eye infections.\n<br>Do not use if you are hypersensitive to any ingredients in the formulation. Avoid using tap water or saliva with lenses.");
        optifreeB.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        optifreeB.setContentAreaFilled(false);
        optifreeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optifreeBActionPerformed(evt);
            }
        });
        jPanel5.add(optifreeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1090, 160, 160));

        jLabel30.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Contact Lens Solutions:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1060, -1, -1));

        optifreeCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        optifreeCB.setText("Opti-Free PureMoist 300mL");
        optifreeCB.setToolTipText("<html>\nOpti-Free PureMoist (300mL) is a multipurpose solution produced by Alcon. It is suitable for disinfecting, cleaning, and storing all types of soft contact lenses.\n<br>\n<br>Instructions:\n<br>Fill the empty lens case with solution.\n<br>Wet each side of the lens with the solution.\n<br>Rub each lens for 20 seconds with your finger.\n<br>Rinse each side of the contact lens for 10 seconds with a steady stream of the solution.\n<br>Place the lenses in the case, tighten the lids and wait overnight or at least six hours.\n<br>\n<br>Precautions:\n<br>Do not use the solution beyond six months after opening. Store lenses in Opti-Free PureMoist for up to 30 days, but they must be cleaned and disinfected before reuse if stored longer.\n<br>Always follow the product directions for use as failure to do so may lead to vision loss or eye infections.\n<br>Do not use if you are hypersensitive to any ingredients in the formulation. Avoid using tap water or saliva with lenses.");
        optifreeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optifreeCBActionPerformed(evt);
            }
        });
        jPanel5.add(optifreeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1250, 160, 30));

        renuCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        renuCB.setText("Renu Fresh 355mL");
        renuCB.setToolTipText("<html>\nRenu Fresh (355mL) is a popular multi-purpose solution used for cleaning, rinsing, disinfecting, and storing soft contact lenses.\n<br>\n<br>Instructions for Use:\n<br>Place at least three drops of the solution on each side of the lens and gently rub for 20 seconds.\n<br>Place the lenses in a clean case and fill it with fresh solution. Soak for at least 4 hours before wearing again.\n<br>\n<br>Precautions:\n<br>Always wash and dry your hands before handling your lenses.\n<br>Avoid storing lenses for more than 30 days without cleaning them again.");
        renuCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renuCBActionPerformed(evt);
            }
        });
        jPanel5.add(renuCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1250, 160, 30));

        allCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        allCB.setText("All Comfort Formula 500mL");
        allCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCBActionPerformed(evt);
            }
        });
        jPanel5.add(allCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1250, 160, 30));

        eoCB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        eoCB.setText("EO Flex Wear 360mL");
        eoCB.setToolTipText("<html>\nEO Flexwear Refresh Multipurpose Contact Lens Solution (360mL).\n<br>This solution is designed for cleaning, disinfecting, and storing soft contact lenses, providing moisture and comfort.\n<br>\n<br>Instructions for Use:\n<br>Apply a few drops of EO Flexwear solution to both sides of the lens.\n<br>Gently rub the lens with your finger for 10-20 seconds on each side to remove dirt, proteins, and debris.\n<br>Precautions:\n<br>Keep the solution bottle tightly closed and store it in a cool, dry place.\n<br>Always check the expiration date before using the solution. Do not use expired solutions, as they may not disinfect properly.");
        eoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eoCBActionPerformed(evt);
            }
        });
        jPanel5.add(eoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1250, 160, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total:Php");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 210, 40));

        jButton33.setBackground(new java.awt.Color(2, 102, 169));
        jButton33.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Cancel");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 120, 30));

        jButton34.setBackground(new java.awt.Color(2, 102, 169));
        jButton34.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Check Out");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 120, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1050, 940, 10));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 363, 300, 10));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 820, 10));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, 1130, 10));

        jLabel43.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Eye Grade Level");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 183, 150, 10));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("₱ 459.00");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1280, 110, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("₱ 800.00");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("₱ 550.00");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 110, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("₱ 650.00");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 110, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("₱ 1,000.00");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 110, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("₱ 1,500.00");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("₱ 1,200.00");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("₱ 1,250.00");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 110, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("₱ 1,250.00");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 730, 110, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("₱ 1,050.00");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 110, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("₱ 110.00");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1000, 110, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("₱ 1,202.00");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1000, 110, 20));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("₱ 545.00");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1000, 110, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("₱ 257.00");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1000, 110, 20));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("₱ 720.00");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1000, 110, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("₱ 144.00");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1280, 110, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("₱ 199.00");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1280, 110, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("₱ 349.00");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1280, 110, 20));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("₱ 403.00");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1280, 110, 20));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Note: Please double check before check out.");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Note: Please choose 1 (one) frame only.");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout medPanelLayout = new javax.swing.GroupLayout(medPanel);
        medPanel.setLayout(medPanelLayout);
        medPanelLayout.setHorizontalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 441, Short.MAX_VALUE))
        );
        medPanelLayout.setVerticalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 404, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", medPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 1650, 1490));

        cancel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel46.setText("Order cancelled!!!! Fuck u");

        javax.swing.GroupLayout cancelLayout = new javax.swing.GroupLayout(cancel);
        cancel.setLayout(cancelLayout);
        cancelLayout.setHorizontalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        cancelLayout.setVerticalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void ovalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalBActionPerformed
        ovalCB.setSelected(!ovalCB.isSelected());
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_ovalBActionPerformed

    private void squareBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareBActionPerformed
        squareCB.setSelected(!squareCB.isSelected());
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_squareBActionPerformed

    private void rectangleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleBActionPerformed
        rectangleeCB.setSelected(!rectangleeCB.isSelected());
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_rectangleBActionPerformed

    private void systaneComBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systaneComBActionPerformed
        systanecomCB.setSelected(!systanecomCB.isSelected());
         SelectedItem();     
    }//GEN-LAST:event_systaneComBActionPerformed

    private void vigamoxBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigamoxBActionPerformed
        vigamoxCB.setSelected(!vigamoxCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_vigamoxBActionPerformed

    private void lumifyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumifyBActionPerformed
        lumifyCB.setSelected(!lumifyCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_lumifyBActionPerformed

    private void ilubeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilubeBActionPerformed
        ilubeCB.setSelected(!ilubeCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_ilubeBActionPerformed

    private void plasticBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasticBActionPerformed
        plasticCB.setSelected(!plasticCB.isSelected());
         SelectedItem();
         DisableType();
    }//GEN-LAST:event_plasticBActionPerformed

    private void metalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metalBActionPerformed
        metalCB.setSelected(!metalCB.isSelected());
         SelectedItem();
         DisableType();
    }//GEN-LAST:event_metalBActionPerformed

    private void woodBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodBActionPerformed
        woodCB.setSelected(!woodCB.isSelected());
         SelectedItem();
         DisableType();
    }//GEN-LAST:event_woodBActionPerformed

    private void naturalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalBActionPerformed
        naturalCB.setSelected(!naturalCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_naturalBActionPerformed

    private void brownBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownBActionPerformed
        brownCB.setSelected(!brownCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_brownBActionPerformed

    private void grayBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayBActionPerformed
        grayCB.setSelected(!grayCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_grayBActionPerformed

    private void lenscareBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenscareBActionPerformed
        lenscareCB.setSelected(!lenscareCB.isSelected());
        SelectedItem();
    }//GEN-LAST:event_lenscareBActionPerformed

    private void allBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBActionPerformed
        allCB.setSelected(!allCB.isSelected());
        SelectedItem();
    }//GEN-LAST:event_allBActionPerformed

    private void renuBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renuBActionPerformed
        renuCB.setSelected(!renuCB.isSelected());
        SelectedItem();
    }//GEN-LAST:event_renuBActionPerformed

    private void optifreeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optifreeBActionPerformed
        optifreeCB.setSelected(!optifreeCB.isSelected());
        SelectedItem();
    }//GEN-LAST:event_optifreeBActionPerformed

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
        cancelOrder();
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void renuCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renuCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_renuCBActionPerformed

    private void lumifyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumifyCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_lumifyCBActionPerformed

    private void ilubeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilubeCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_ilubeCBActionPerformed

    private void optifreeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optifreeCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_optifreeCBActionPerformed

    private void systaneUltraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systaneUltraBActionPerformed
        systaneUltraCB.setSelected(!systaneUltraCB.isSelected());
         SelectedItem();
    }//GEN-LAST:event_systaneUltraBActionPerformed

    private void eoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eoBActionPerformed
        eoCB.setSelected(!eoCB.isSelected());
        SelectedItem();
    }//GEN-LAST:event_eoBActionPerformed

    private void ovalCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalCBActionPerformed
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_ovalCBActionPerformed

    private void squareCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareCBActionPerformed
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_squareCBActionPerformed

    private void rectangleeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleeCBActionPerformed
        SelectedItem();
        DisableShape();
    }//GEN-LAST:event_rectangleeCBActionPerformed

    private void plasticCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasticCBActionPerformed
        SelectedItem();
        DisableType();
    }//GEN-LAST:event_plasticCBActionPerformed

    private void metalCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metalCBActionPerformed
        SelectedItem();
        DisableType();
    }//GEN-LAST:event_metalCBActionPerformed

    private void woodCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodCBActionPerformed
        SelectedItem();
        DisableType();
    }//GEN-LAST:event_woodCBActionPerformed

    private void naturalCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_naturalCBActionPerformed

    private void brownCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_brownCBActionPerformed

    private void grayCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_grayCBActionPerformed

    private void systaneUltraCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systaneUltraCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_systaneUltraCBActionPerformed

    private void vigamoxCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigamoxCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_vigamoxCBActionPerformed

    private void systanecomCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systanecomCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_systanecomCBActionPerformed

    private void allCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_allCBActionPerformed

    private void eoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eoCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_eoCBActionPerformed

    private void lenscareCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenscareCBActionPerformed
        SelectedItem();
    }//GEN-LAST:event_lenscareCBActionPerformed

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
    private javax.swing.JButton allB;
    private javax.swing.JCheckBox allCB;
    private javax.swing.JButton brownB;
    private javax.swing.JCheckBox brownCB;
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel checkupPanel;
    private javax.swing.JButton eoB;
    private javax.swing.JCheckBox eoCB;
    private javax.swing.JButton grayB;
    private javax.swing.JCheckBox grayCB;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton ilubeB;
    private javax.swing.JCheckBox ilubeCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
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
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton lenscareB;
    private javax.swing.JCheckBox lenscareCB;
    private javax.swing.JButton lumifyB;
    private javax.swing.JCheckBox lumifyCB;
    private javax.swing.JPanel medPanel;
    private javax.swing.JButton metalB;
    private javax.swing.JCheckBox metalCB;
    private javax.swing.JButton naturalB;
    private javax.swing.JCheckBox naturalCB;
    private javax.swing.JButton optifreeB;
    private javax.swing.JCheckBox optifreeCB;
    private javax.swing.JButton ovalB;
    private javax.swing.JCheckBox ovalCB;
    private javax.swing.JButton plasticB;
    private javax.swing.JCheckBox plasticCB;
    private javax.swing.JPanel presPanel;
    private javax.swing.JButton rectangleB;
    private javax.swing.JCheckBox rectangleeCB;
    private javax.swing.JButton renuB;
    private javax.swing.JCheckBox renuCB;
    private javax.swing.JPanel repairPanel;
    private javax.swing.JButton squareB;
    private javax.swing.JCheckBox squareCB;
    private javax.swing.JButton systaneComB;
    private javax.swing.JButton systaneUltraB;
    private javax.swing.JCheckBox systaneUltraCB;
    private javax.swing.JCheckBox systanecomCB;
    private javax.swing.JButton vigamoxB;
    private javax.swing.JCheckBox vigamoxCB;
    private javax.swing.JButton woodB;
    private javax.swing.JCheckBox woodCB;
    // End of variables declaration//GEN-END:variables
}
