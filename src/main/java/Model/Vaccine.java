/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 15512
 */
public class Vaccine {
    private int vaccineId;
    private String vaccinationName;
    private Boolean isCourseFinished;

    public Vaccine(String vaccinationName1, boolean courseCompleted, int randomInt) {
         this.vaccineId = vaccineId;
         this.vaccinationName = vaccinationName;
         this.isCourseFinished = isCourseFinished;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }
    
    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public Boolean getIsCourseFinished() {
        return isCourseFinished;
    }

    public void setIsCourseFinished(Boolean isCourseFinished) {
        this.isCourseFinished = isCourseFinished;
    }
    
}
