/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Tracking;

/**
 *
 * @author Admin
 */
public class TrackingMapper implements RowMapper<Tracking>{

    @Override
    public Tracking mapRow(ResultSet rs) {
        try {
            Tracking tracking = new Tracking();
            tracking.setId(rs.getInt("id"));
            tracking.setCheckin(rs.getTimestamp("checkin"));
            tracking.setCheckout(rs.getTimestamp("checkout"));
            tracking.setShiftId(rs.getInt("shift_id"));
            tracking.setUserId(rs.getInt("user_id"));
            tracking.setRegisterd(rs.getBoolean("registered"));
            return tracking;
        } catch (SQLException e) {
            return null;
        } 
    }
    
}
