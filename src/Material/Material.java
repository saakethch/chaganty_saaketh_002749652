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
    public String materialType;

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

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
    
//    public Material(String name, Date date){
//        this.id = "Serial" + count++;
//        this.name = name;
//        this.registeredDate = date;
//        this.isAvailable = true;
//        
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
    
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }
}
