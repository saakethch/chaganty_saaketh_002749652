/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Material.Material;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class RentalRequest {
    private String id;
    private int price;
    private String status;
    private int duration;
    private Material material;
    private String cusId;

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }
    
    private static int counter = 0;

    public RentalRequest (int price, int duration, Material material, String cusId){
        this.id = "rental_request_"+this.counter++;
        this.price = price;
        this.status = "Requested";
        this.duration = duration;
        this.material = material;
        this.cusId = cusId;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    

}
