/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ExtraHours {
    private Integer id;
    private Integer numberHours;
    private boolean status;
    private Integer tracking_id;

    public ExtraHours() {
    }

    public ExtraHours(Integer id, Integer numberHours, boolean status, Integer tracking_id) {
        this.id = id;
        this.numberHours = numberHours;
        this.status = status;
        this.tracking_id = tracking_id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumberHours() {
        return numberHours;
    }

    public boolean getStatus() {
        return status;
    }

    public Integer getTracking_id() {
        return tracking_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumberHours(Integer numberHours) {
        this.numberHours = numberHours;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTracking_id(Integer tracking_id) {
        this.tracking_id = tracking_id;
    }
    
    
}
