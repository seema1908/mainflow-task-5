/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author seema
 */
public class ConnectionProvider {
    
    static
            Connection con;
    ResultSet rs;
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyerdb","root","seema");
             return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    
}
