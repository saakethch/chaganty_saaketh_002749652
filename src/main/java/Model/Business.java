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
public Business(){
            this.applicantsDirectory = new ArrayList<Applicant>();
            this.insurancePlansDirectory = new ArrayList<InsurancePlan>();
        }
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
    
    public InsurancePlan findIpById(int id){
        for(InsurancePlan ip : this.insurancePlansDirectory){
            if(id == ip.getPlanId()){
                return ip;
            }
        }
        return this.insurancePlansDirectory.get(0);
    }
    
    public Applicant findApplicantById(int id){
        for(Applicant a : this.applicantsDirectory){
            if(id == a.getApplicationId()){
                return a;
            }
        }
        return this.applicantsDirectory.get(0);
    }
       
    public ArrayList<Applicant> findApplicantByName(String name){
        ArrayList<Applicant> filteredApplicants = new ArrayList<Applicant>();
        for(Applicant a : this.applicantsDirectory){
            if(name.equals(a.getFirstName())){
                filteredApplicants.add(a);
            }
        }
        return filteredApplicants;
    }
    
    public
            Boolean checkIfApplicantIsUnique(int id ) {
        for (Applicant a : this.applicantsDirectory) {
            if (a.getApplicationId() == id) {
                return false;
            }
        }
        return true;
    }
    
}
