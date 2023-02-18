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

    public Pet(String petName, String petBreed, boolean isFemale, int petAge, String petType, InsurancePlan ip) {
    }
    String petName;
    String petType;
    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    int petAge;
    Boolean isMale;
    Boolean isFemale;
    String breed;
    ArrayList<Vaccine> vaccinationHistory;


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

    public void setVaccinationHistory(Vaccine vaccine) {
        this.vaccinationHistory.add(vaccine);
    }

    public void addToVaccinationHistory(Vaccine vaccine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
