/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Salary;

/**
 *
 * @author Admin
 */
public class SalaryDAO extends DbContext<Salary>{
    public Integer save() {
        String sql = "INSERT INTO salary(penalty_hours, bonus, hourly) VALUES(?, ?, ?)";
        return insert(sql, null, null, 5);
    }
}
