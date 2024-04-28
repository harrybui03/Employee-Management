/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author Admin
 */
public class UserMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet rs) {
        try {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setAddress(rs.getString("address"));
            user.setGender(rs.getString("gender"));
            user.setRole(rs.getString("role"));
            user.setSalary_id(rs.getInt("salary_id"));
            return user;
        } catch (SQLException e) {
            return null;
        } 
    }
    
}
