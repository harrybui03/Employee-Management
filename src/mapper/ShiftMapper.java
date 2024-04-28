/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Shift;

/**
 *
 * @author Admin
 */
public class ShiftMapper implements RowMapper<Shift>{

    @Override
    public Shift mapRow(ResultSet rs) {
        try {
            Shift shift = new Shift();
            shift.setId(rs.getInt("id"));
            shift.setTimeStart(rs.getTimestamp("time_start"));
            shift.setTimeEnd(rs.getTimestamp("time_end"));
            return shift;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
