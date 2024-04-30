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
    
    public List<Tracking> findByShiftAndUserRgs(Integer shiftId, Integer userId) {
        String sql = "SELECT * FROM tracking WHERE shift_id = ? AND user_id = ?";
        return query(sql, new TrackingMapper(), shiftId, userId);
    }
    
    public List<Tracking> findByShift(Integer shiftId) {
        String sql = "SELECT * FROM tracking WHERE shift_id = ?";
        return query(sql, new TrackingMapper(), shiftId);
    }
    
    public Integer save(Tracking tracking) {
        String sql = "INSERT INTO tracking (id, checkin, checkout, shift_id, user_id, registered) VALUES(?, ?, ?, ?, ?, ?)";
        return insert(sql,tracking.getId(), tracking.getCheckin(), tracking.getCheckout(), tracking.getShiftId(), tracking.getUserId(), tracking.isRegisterd());
    }
    
    public void updateTrack(Tracking tracking) {
        String sql = "UPDATE tracking SET checkin = ?, checkout = ?, shift_id = ?, user_id = ?, registered = ? WHERE id = ?";
        update(sql, tracking.getCheckin(), tracking.getCheckout(), tracking.getShiftId(), tracking.getUserId(), tracking.isRegisterd(), tracking.getId());
    }
    
    public void deleteByUserId(Integer id) {
        String sql = "DELETE FROM tracking WHERE user_id = ?";
        delete(sql, id);
    }
}
