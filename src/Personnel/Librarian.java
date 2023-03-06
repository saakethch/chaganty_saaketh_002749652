/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

import Library.Material.Material;
import Library.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Librarian extends Employee{
    
    ArrayList<RentalRequest> rentalRequests;
    
    public Librarian(String id, String name, String designation, int exp){
        super();
        this.designation = "Librarian";
    }


//    public ArrayList<RentalRequest> getAllRentalRequests() {
//        return this.workingLibrary.getRentalRequests().getRentalRequests();
//    }
    
//    public void acceptRentalRequest(Material m, RentalRequest rr){
//        this.workingLibrary.getRentalRequests().acceptRentMaterial(m, rr);
//    }
//    
//    public void rejectRentalRequest(Material m, RentalRequest rr){
//        this.workingLibrary.getRentalRequests().rejectedRequest(m, rr);
//    }

}
    
