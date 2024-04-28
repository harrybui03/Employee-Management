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
    private int id;
    private int penaltyHours;
    private int bonus;
    private int hourly;

    public Salary() {
    }
    public Salary(int id, int penaltyHours, int bonus, int hourly) {
        this.id = id;
        this.penaltyHours = penaltyHours;
        this.bonus = bonus;
        this.hourly = hourly;
    }

    public int getId() {
        return id;
    }

    public int getPenaltyHours() {
        return penaltyHours;
    }

    public int getBonus() {
        return bonus;
    }

    public int getHourly() {
        return hourly;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPenaltyHours(int penaltyHours) {
        this.penaltyHours = penaltyHours;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }
    
}
