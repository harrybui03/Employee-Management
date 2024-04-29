/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import mapper.TrackingMapper;
import model.Tracking;

/**
 *
 * @author Admin
 */
public class TrackingDAO extends DbContext<Tracking>{
    public List<Tracking> findByShiftAndUser(Integer shiftId, Integer userId) {
        String sql = "SELECT * FROM tracking WHERE shift_id = ? AND user_id = ?";
        return query(sql, new TrackingMapper(), shiftId, userId);
    }
}
