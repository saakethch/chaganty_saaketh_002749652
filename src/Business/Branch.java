package Business;

import Library.Library;
import Personnel.Employee;
import Personnel.Customer;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15512
 */
public class Branch {
    String name;
    ArrayList<Customer> customers;
    Library library; 
    String floorNum;

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
    }
    
    Branch(String name, String floorNum) {
        this.name = name;
        this.floorNum = floorNum;
        this.customers = new ArrayList<Customer>();
        this.library = new Library();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void addCustomerToBranch(Customer c) {
        this.customers.add(c);
    }
    
    public Customer findCustomer(String id){
        for(Customer c : this.customers){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
