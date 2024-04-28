
import dao.DbContext;
import javaapplication1.auth.Login;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ADMIN
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login = new Login();
        DbContext db = new DbContext();
        Connection conn = db.getConnection();
        login.setVisible(true);
        Connection c = db.getConnection();
    }
}
