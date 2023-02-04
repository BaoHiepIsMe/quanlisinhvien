/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author hiep1
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLiSinhVien;";
            String user="sa";
            String pass = "12345";
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
            
       
}
}
