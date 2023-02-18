/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.TextField;

/**
 *
 * @author 15512
 */
public class InsurancePlan {

    private String planName;
    private int planId;
    private float costPerMonth;
    private float costPerYear;
    public InsurancePlan(int planId, String planName, float costPerMonth, float costPerYear) {
        this.planName = planName;
        this.planId = planId;
        this.costPerMonth = costPerMonth;
        this.costPerYear = costPerYear;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public float getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(float costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public float getCostPerYear() {
        return costPerYear;
    }

    public void setCostPerYear(float costPerYear) {
        this.costPerYear = costPerYear;
    }
    
}
