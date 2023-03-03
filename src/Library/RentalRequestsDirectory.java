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

    public void addToRentalRequests(RentalRequest rentalRequest) {
        
        this.rentalRequests.add(rentalRequest);
    }

    public int calculateRevenue() {
        int sum = 0;
        for (RentalRequest rr : this.rentalRequests) {
            sum += rr.getPrice();
        }
        return sum;
    }

    
}
