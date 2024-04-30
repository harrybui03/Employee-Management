/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Timestamp;
import java.util.List;
import mapper.ShiftMapper;
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
    
    public List<Shift> findAll() {
        String sql = "SELECT * FROM shift";
        return query(sql, new ShiftMapper());
    }
    
    public List<Shift> findById(Integer id) {
        String sql = "SELECT * FROM shift WHERE id = ?";
        return query(sql, new ShiftMapper(), id);
    }
    
    public List<Shift> findByTime() {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        String sql = "SELECT * FROM shift WHERE time_start <= ? AND time_end >= ?";
        return query(sql, new ShiftMapper(), time, time);
    }
    
}
