/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Salary;

/**
 *
 * @author Admin
 */
public class SalaryMapper implements RowMapper<Salary>{

    @Override
    public Salary mapRow(ResultSet rs) {
        try {
            Salary salary = new Salary();
            salary.setId(rs.getInt("id"));
            salary.setBonus(rs.getInt("bonus"));
            salary.setHourly(rs.getInt("hourly"));
            salary.setPenaltyHours(rs.getInt("penalty_hours"));
            return salary;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
