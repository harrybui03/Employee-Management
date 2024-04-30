/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.MissingHours;
/**
 *
 * @author Admin
 */
public class MissingHoursMapper implements RowMapper<MissingHours>{

    @Override
    public MissingHours mapRow(ResultSet rs) {
        try {
            MissingHours missingHours = new MissingHours();
            missingHours.setId(rs.getInt("id"));
            missingHours.setNumberHours(rs.getInt("number_hours"));
            missingHours.setTrackingId(rs.getInt("tracking_id"));
            return missingHours;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
