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
        String sql = "SELECT * FROM tracking WHERE shift_id = ? AND user_id = ? AND registered = 1";
        return query(sql, new TrackingMapper(), shiftId, userId);
    }
    
    public Integer save(Tracking tracking) {
        String sql = "INSERT INTO tracking (id, checkin, checkout, shift_id, user_id, registered) VALUES(?, ?, ?, ?, ?, ?)";
        return insert(sql,tracking.getId(), tracking.getCheckin(), tracking.getCheckout(), tracking.getShiftId(), tracking.getUserId(), tracking.isRegisterd());
    }
    
    public Integer update(Tracking tracking) {
        String sql = "UPDATE tracking SET checkin = ?, checkout = ?, shift_id = ?, user_id = ?, registered = ? WHERE id = ?";
        return insert(sql, tracking.getCheckin(), tracking.getCheckout(), tracking.getShiftId(), tracking.getUserId(), tracking.isRegisterd(), tracking.getId());
    }
}
