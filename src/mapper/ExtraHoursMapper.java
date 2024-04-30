/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ExtraHours;

/**
 *
 * @author Admin
 */
public class ExtraHoursMapper implements RowMapper<ExtraHours>{

    @Override
    public ExtraHours mapRow(ResultSet rs) {
        try {
            ExtraHours extraHours = new ExtraHours();
            extraHours.setId(rs.getInt("id"));
            extraHours.setNumberHours(rs.getInt("number_hours"));
            extraHours.setStatus(rs.getBoolean("status"));
            extraHours.setTrackingId(rs.getInt("tracking_id"));
            return extraHours;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
