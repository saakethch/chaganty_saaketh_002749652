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

    public RentalRequestsDirectory() {
        this.rentalRequests = new ArrayList<RentalRequest>();
    }

    public RentalRequest addToRentalRequests(int price, int duration, Material material, String cusId) {

        RentalRequest rentalRequest = new RentalRequest(price * duration, duration, material, cusId, material.getBranch_name());
        this.rentalRequests.add(rentalRequest);
        return rentalRequest;
    }

//    public int removeFromRentalRequests(String id) {
//        for (RentalRequest rr : this.getRentalRequests()) {
//            if(rr.getId().equals(id)){
//                this.rentalRequests.remove(rr);
//                return 1;
//            }
//        }
//        return 0;
//    }
    public int calculateRevenue() {
        int sum = 0;
        for (RentalRequest rr : this.rentalRequests) {
            if ("Returned".equals(rr.getStatus()) || "Rented".equals(rr.getStatus())) {
                sum += rr.getPrice();
            }
        }
        return sum;
    }

    public RentalRequest findRR(String id) {
        for (RentalRequest rr : this.rentalRequests) {
            if (rr.getId().equals(id)) {
                return rr;
            }
        }
        return null;
    }

}
