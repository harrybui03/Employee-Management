/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO extends DbContext<User>{
    
    public Integer save(User user) {
        StringBuilder sql = new StringBuilder("INSERT INTO user(username, password, role, address, gender, email, salary_id) ");
        sql.append("VALUES(?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(), user.getUsername(), user.getPassword(), user.getRole(),
                user.getAddress(), user.getGender(), user.getEmail(), user.getSalaryId());
    }
}
