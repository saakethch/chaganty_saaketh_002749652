/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Business {
    ArrayList<InsurancePlan> insurancePlansDirectory;
    ArrayList<Applicant> applicantsDirectory;

    public ArrayList<InsurancePlan> getInsurancePlansDirectory() {
        return insurancePlansDirectory;
    }

    public void addToInsurancePlansDirectory(InsurancePlan insurancePlan) {
        this.insurancePlansDirectory.add(insurancePlan);
    }

    public ArrayList<Applicant> getApplicantsDirectory() {
        return applicantsDirectory;
    }

    public void addToApplicantsDirectory(Applicant applicant) {
        this.applicantsDirectory.add(applicant);
    }
    
}
