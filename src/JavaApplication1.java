
import dao.DbContext;
import dao.ShiftDAO;
import dao.TrackingDAO;
import dao.UserDAO;
import javaapplication1.auth.Login;
import java.sql.*;
import model.Shift;
import java.sql.Timestamp;
import java.util.List;
import javaapplication1.admin.manage_account.view.ListAccount;
import javaapplication1.manager.manage_shift.view.ManagerF;
import javaapplication1.seller.checkin_checkout.CheckingCtr;
import javaapplication1.seller.checkin_checkout.view.ShiftDetail;
import javax.swing.SwingUtilities;
import model.Tracking;
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
//    public static void main(String[] args) {
//        CheckingCtr checkingCtr = new CheckingCtr(2);
//    }
    public static void main(String[] args) {
//        Shift shift = new Shift(null,  new Timestamp(System.currentTimeMillis()),new Timestamp(System.currentTimeMillis()+1000*60*60*4));
//        ShiftDAO shiftDAO = new ShiftDAO();
//        shiftDAO.save(shift);
//        Boolean x = true;
//        Tracking tracking = new Tracking(null, null, null, 11, 3, x);
//        TrackingDAO trackingDAO = new TrackingDAO();
//        trackingDAO.save(tracking);
//        List<Shift> gets = shiftDAO.findByTime();
//        System.out.println(gets.size());
//        ListAccount listAccount = new ListAccount();
//        listAccount.setVisible(true);
//        CheckingCtr checkingCtr = new CheckingCtr(6);
         ListAccount listAccount = new ListAccount();
         listAccount.setVisible(true);
//        ManagerF manager = new ManagerF();
//        manager.setVisible(true);
    }
}
