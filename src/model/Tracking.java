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
    private Integer shiftId;
    private Integer userId;
    private Boolean registerd;

    public Tracking() {
    }

    public Tracking(Integer id, Timestamp checkin, Timestamp checkout, Integer shiftId, Integer userId, Boolean registerd) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.shiftId = shiftId;
        this.userId = userId;
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

    public Integer getShiftId() {
        return shiftId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Boolean isRegisterd() {
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

    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRegisterd(Boolean registerd) {
        this.registerd = registerd;
    }

    
}
