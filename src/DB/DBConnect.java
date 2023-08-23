/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
/**
 *
 * @author prabh
 */
public class DBConnect {
    public Connection con;
    public Statement stmt;
    public ResultSet rst;
    public PreparedStatement pstmt;
    public DBConnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
