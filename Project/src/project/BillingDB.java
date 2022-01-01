/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class BillingDB {
    
    public static void insertIntoBillingDB(String uname, int price, String d){
        try {
//            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/billingDB.db");
             Connection con=null;
             Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_proj","root","");
            String sql= "INSERT INTO bill(uname, price, d) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, uname);
            ps.setInt(2, price);
            ps.setString(3, d);
            ps.executeUpdate();

        } catch(Exception e){System.out.println(e);}
    
    }
    
    public static ArrayList<BillObject> billlings(){
        ArrayList<BillObject> customers = new ArrayList<>();
      
        try {
//            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/billingDB.db");
             Connection con=null;
             Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_proj","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT uname, price, d FROM bill");
            
            BillObject pl;
            
            while(rs.next()){
                pl = new BillObject(rs.getString("uname"),rs.getInt("price"),rs.getString("d"));
                customers.add(pl);

            }
        }catch(Exception e){System.out.println(e);}
        return customers;
    }
    
    //Deleting billing log
    public static void deleteBillings(){
         try {
            Connection con=null;
             Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_proj","root","");
//             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
            PreparedStatement ps = con.prepareStatement("DELETE FROM bill");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "All entries have been deleted!");
            
        } catch(Exception e){System.out.println(e);}
    }
    
    
    
}
