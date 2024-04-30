/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import mapper.UserMapper;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO extends DbContext<User>{
    private TrackingDAO trackingDAO = new TrackingDAO();
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return query(sql, new UserMapper());
    }
    
    public List<User> findById(Integer id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return query(sql, new UserMapper(), id);
    }
    
    public List<User> findByEmail(String email) {
        String sql = "SELECT * FROM user WHERE email = ?";
        return query(sql, new UserMapper(), email);
    }
    
    public Integer save(User user) {
        StringBuilder sql = new StringBuilder("INSERT INTO user(username, password, role, address, gender, email, salary_id) ");
        sql.append("VALUES(?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(), user.getUsername(), user.getPassword(), user.getRole(),
                user.getAddress(), user.getGender(), user.getEmail(), user.getSalaryId());
    }
    
    public void updateUser(User user) {
        String sql = "UPDATE user SET username = ?, password = ?, email = ?, gender = ?, role = ?, address = ? WHERE id = ?";
        update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getGender(), user.getRole(), user.getAddress(), user.getId());
    }
    
    public void deleteUser(Integer id) {
        trackingDAO.deleteByUserId(id);
        String sql = "DELETE FROM user WHERE id = ?";
        delete(sql, id);
    }
}
