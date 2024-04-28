/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Shift;

/**
 *
 * @author Admin
 */
public class ShiftDAO extends DbContext<Shift>{
    public Integer save(Shift shift) {
        String sql = "INSERT INTO shift (time_start, time_end) VALUES(?, ?)";
        return insert(sql, shift.getTimeStart(), shift.getTimeEnd());
    }
    
}
