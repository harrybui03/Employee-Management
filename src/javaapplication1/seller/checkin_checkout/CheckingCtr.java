/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.seller.checkin_checkout;

import dao.ShiftDAO;
import dao.TrackingDAO;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javaapplication1.seller.checkin_checkout.view.Checkin;
import javaapplication1.seller.checkin_checkout.view.Checkout;
import javaapplication1.seller.checkin_checkout.view.ShiftDetail;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Shift;
import model.Tracking;
import model.User;
/**
 *
 * @author Admin
 */
public class CheckingCtr {
    private ShiftDAO shiftDAO = new ShiftDAO();
    private TrackingDAO trackingDAO = new TrackingDAO();
    private Tracking tracking;
    private Shift currentShift;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JFrame frame;
    public CheckingCtr(Integer userId) {
        List<Shift> shifts = shiftDAO.findByTime();
        for(int i = 0; i < shifts.size(); i++){
            List<Tracking> lists = trackingDAO.findByShiftAndUser(shifts.get(i).getId(), userId);
            if(lists.size() != 0) {
                this.tracking = lists.get(0);
                this.currentShift = shiftDAO.findById(lists.get(0).getShiftId()).get(0);
                break;
            }
        }
        
        
        
  
        
        if(currentShift != null) {
            ShiftDetail shiftDetail = new ShiftDetail(currentShift, tracking);
            shiftDetail.setVisible(true);
        }
        
    }
    
}
