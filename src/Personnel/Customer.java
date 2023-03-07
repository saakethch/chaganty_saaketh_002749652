/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import Library.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */

public class Customer {
    
    private String id;
    private String name;
    private RentalRequest currentRental;
    private ArrayList<RentalRequest> rentalRequestHistory;
    
    public Customer(String id,String name){
        this.name = name;
        this.id = id;
        this.rentalRequestHistory = new ArrayList<RentalRequest>();
    }
    
    public String getId() {
        return id;
    }
     
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public RentalRequest getCurrentRental() {
        return currentRental;
    }

    public void setCurrentRental(RentalRequest currentRental) {
        this.currentRental = currentRental;
    }

    public ArrayList<RentalRequest> getRentalRequestHistory() {
        return rentalRequestHistory;
    }

    public void addToRentalRequestHistory(RentalRequest rr) {
        this.currentRental = rr;
        this.rentalRequestHistory.add(rr);
    }
    
}
