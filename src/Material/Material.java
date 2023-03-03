/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import java.util.Date;

/**
 *
 * @author 15512
 */
public class Material {
    public static int count = 0;
    public String id;
    public String name;
    public Date registeredDate;
    public Boolean isAvailable = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    public Material(){
        this.id = "Serial" + count++; 
    }
    
//    public Material(String name, Date date, boolean isAvail){
//        this.serialNo = "Serial" + count++;
//        this.name = name;
//        this.registerDate = date;
//        this.isAvailable = isAvail;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public String getAvailString(Boolean isAvail){
        if (isAvail){
            return "Y";
        }
        return "N";
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }
}
