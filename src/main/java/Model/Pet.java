/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.TextField;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Pet {

    private String petName;
    private String petType;
    private InsurancePlan ip;
    private int petAge;
    private Boolean isMale;
    private Boolean isFemale;
    private String breed;
    private ArrayList<Vaccine> vaccinationHistory;

    public Pet(String petName, String petBreed, boolean isFemale, int petAge, String petType, InsurancePlan ip) {
        this.petName = petName;
        this.petAge = petAge;
        this.ip = ip;
        this.breed = petBreed;
        this.petType = petType;
        this.isFemale = isFemale;
        this.isMale = !isFemale;
        this.vaccinationHistory = new ArrayList<Vaccine>();
    }
    
    public InsurancePlan getIp() {
        return ip;
    }

    public void setIp(InsurancePlan ip) {
        this.ip = ip;
    }
    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public Boolean getIsFemale() {
        return isFemale;
    }

    public void setIsFemale(Boolean isFemale) {
        this.isFemale = isFemale;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public ArrayList<Vaccine> getVaccinationHistory() {
        return vaccinationHistory;
    }


    public void addToVaccinationHistory(Vaccine vaccine) {
        this.vaccinationHistory.add(vaccine);
    }
    
    public Vaccine findVaccineById(int id){
        for(Vaccine v : this.vaccinationHistory){
            if(id == v.getVaccineId()){
                return v;
            }
        }
        return this.vaccinationHistory.get(0);
    }
}
