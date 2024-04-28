/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class Tracking {
    private Integer id;
    private Timestamp checkin;
    private Timestamp checkout;
    private Integer shift_id;
    private Integer user_id;
    private boolean registerd;

    public Tracking() {
    }

    public Tracking(Integer id, Timestamp checkin, Timestamp checkout, Integer shift_id, Integer user_id, boolean registerd) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.shift_id = shift_id;
        this.user_id = user_id;
        this.registerd = registerd;
    }

    public Integer getId() {
        return id;
    }

    public Timestamp getCheckin() {
        return checkin;
    }

    public Timestamp getCheckout() {
        return checkout;
    }

    public Integer getShift_id() {
        return shift_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public boolean isRegisterd() {
        return registerd;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCheckin(Timestamp checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(Timestamp checkout) {
        this.checkout = checkout;
    }

    public void setShift_id(Integer shift_id) {
        this.shift_id = shift_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setRegisterd(boolean registerd) {
        this.registerd = registerd;
    }

    
}
