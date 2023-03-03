/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import Library.Library;
import Library.Material.Material;
import Library.RentalRequest;
import Personnel.Employee;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */

public class Customer {
    
    private String id;
    private String name;
    private String address;
    private RentalRequest currentRental;
    private ArrayList<RentalRequest> rentalRequestHistory;
    private Library library;
    
    public Customer(String id,String name,String address,Library library){
        this.name = name;
        this.id = id;
        this.address = address;
        this.library = library;
        this.rentalRequestHistory = new ArrayList<RentalRequest>();
        
    }
    
    public String getId() {
        return id;
    }
    
    public void createRentalRequest(int price, int duration, Material material, Library lib){
        this.currentRental = new RentalRequest(price,  duration, material);
        this.rentalRequestHistory.add(this.currentRental);
        this.library.getRentalRequests().addToRentalRequests(this.currentRental);
    }
    
    public void returnRentalRequest(){
        this.currentRental.setStatus("Returned");
        this.currentRental.getMaterial().setIsAvailable(true);
        this.library.getRentalRequests().addToRentalRequests(this.currentRental);
        
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        this.rentalRequestHistory.add(rr);
    }
    
}
