/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String role;
    private String address;
    private String gender;
    private String email;
    private Integer salaryId;

    public User() {
    }

    public User(Integer id, String username, String password, String role, String address, String gender, String email, Integer salaryId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.salaryId = salaryId;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    
}
