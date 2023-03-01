/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class CustomerDirectory {
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    // implement code below
    public Customer createCustomer() {
        return null;
    }
    public Customer assignEmpolyee() {
        return null;
    }
    
}
