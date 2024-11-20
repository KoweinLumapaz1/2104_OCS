/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import Interface.Interface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jolo
 */
public class DBConnections {
    private static final String username = "root";
    private static final String password = "";
    private static final String db_con  = "jdbc:mysql://localhost:8111/try";
    
    private static  Connection connect;
    private static  DBConnections dbc;
    
    
    public void Connect(){
       connect = null;
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(db_con,username,password);
            JOptionPane.showMessageDialog(null, "Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static DBConnections getDBConnection(){
    if (dbc == null){
        dbc = new DBConnections();// now dbc HAS A NEW VALUE WHENEVER IT WAS IDENTIFIED WITH A NULL VALUE
    }
    return dbc;
    }
    public  Connection getConnection(){
        return connect;
    }
    
}
