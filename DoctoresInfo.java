/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doctoresinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DoctoresInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/doctor_info";
        String user = "root";
        String password = "";
        
        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connection to the Database");
        }
        catch (SQLException e){
             System.out.println("Connection failed");
             e.printStackTrace();
            
        }
    }
    
}