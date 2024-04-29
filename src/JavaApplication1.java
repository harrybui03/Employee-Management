
import dao.DbContext;
import dao.ShiftDAO;
import dao.UserDAO;
import javaapplication1.auth.Login;
import java.sql.*;
import model.Shift;
import java.sql.Timestamp;
import java.util.List;
import model.User;
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
        login.setVisible(true);
//        Shift shift = new Shift(null,  new Timestamp(System.currentTimeMillis()),new Timestamp(System.currentTimeMillis()+5000000));
//        ShiftDAO shiftDAO = new ShiftDAO();
//        shiftDAO.save(shift);
//        List<Shift> gets = shiftDAO.findByTime();
//        System.out.println(gets.size());
    }
}
