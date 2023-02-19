/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author 15512
 */
public class Applicant {
    private int applicationId;
    private String firstName;
    private String lastName;
    private Date applicationDate;
    private Pet pet;
    public Applicant(int applicantID, String ownerFirstName, String ownerLastName, Date date, Pet pet1) {
        this.applicationDate = date;
        this.pet = pet1;
        this.applicationId = applicantID;
        this.firstName = ownerFirstName;
        this.lastName = ownerLastName;
    }
    

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

 
}
