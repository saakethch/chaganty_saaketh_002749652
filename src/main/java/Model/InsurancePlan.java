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

    public InsurancePlan(int id, TextField planName1, TextField costPerMonth1, float costPerAnnum) {
    }
    String planName;
    int planId;
    int costPerMonth;
    int costPerYear;

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

    public int getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public int getCostPerYear() {
        return costPerYear;
    }

    public void setCostPerYear(int costPerYear) {
        this.costPerYear = costPerYear;
    }
    
}
