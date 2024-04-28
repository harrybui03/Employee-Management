/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Salary {
    private Integer id;
    private Integer penaltyHours;
    private Integer bonus;
    private Integer hourly;

    public Salary() {
    }

    public Salary(Integer id, Integer penaltyHours, Integer bonus, Integer hourly) {
        this.id = id;
        this.penaltyHours = penaltyHours;
        this.bonus = bonus;
        this.hourly = hourly;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPenaltyHours() {
        return penaltyHours;
    }

    public Integer getBonus() {
        return bonus;
    }

    public Integer getHourly() {
        return hourly;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPenaltyHours(Integer penaltyHours) {
        this.penaltyHours = penaltyHours;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public void setHourly(Integer hourly) {
        this.hourly = hourly;
    }
    
    
    
}
