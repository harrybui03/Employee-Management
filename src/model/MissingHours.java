/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class MissingHours {
    private Integer id;
    private Integer numberHours;
    private Integer trackingId;

    public MissingHours() {
    }

    public MissingHours(Integer id, Integer numberHours, Integer trackingId) {
        this.id = id;
        this.numberHours = numberHours;
        this.trackingId = trackingId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumberHours() {
        return numberHours;
    }

    public Integer getTrackingId() {
        return trackingId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumberHours(Integer numberHours) {
        this.numberHours = numberHours;
    }

    public void setTrackingId(Integer trackingId) {
        this.trackingId = trackingId;
    }

    
    
}
