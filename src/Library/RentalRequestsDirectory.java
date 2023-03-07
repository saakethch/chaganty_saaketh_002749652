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
public class RentalRequestsDirectory {

    private ArrayList<RentalRequest> rentalRequests;

    public ArrayList<RentalRequest> getRentalRequests() {
        return rentalRequests;
    }
    public RentalRequestsDirectory(){
        this.rentalRequests = new ArrayList<RentalRequest>();
    }
    public RentalRequest addToRentalRequests(int price, int duration, Material material,String cusId) {
        
        RentalRequest rentalRequest = new RentalRequest(price*duration, duration, material, cusId);
        this.rentalRequests.add(rentalRequest);
        return rentalRequest;
    }
    
    public void removeFromRentalRequests(String id) {
        for (RentalRequest rr : this.rentalRequests) {
            if(rr.getId().equals(id)){
                this.rentalRequests.remove(rr);
            }
        }
    }

    public int calculateRevenue() {
        int sum = 0;
        for (RentalRequest rr : this.rentalRequests) {
            sum += rr.getPrice();
        }
        return sum;
    }
    
    public RentalRequest findRR(String id) {
        for (RentalRequest rr : this.rentalRequests) {
            if(rr.getId().equals(id)){
                return rr;
            }
        }
        return null;
    }

}
