/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class DbContext {
    
    public Connection getConnection() {
         try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Set up the connection properties
            String dbURL = "jdbc:mysql://localhost:3306/employee_management";
            String username = "user";
            String password = "password";
            Connection connection = DriverManager.getConnection(dbURL, username, password);
             System.out.println("Connect database successfully");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    } 
    
}
