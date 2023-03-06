/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Library.Library;
import Personnel.Employee;
import Role.SystemAdminRole;
import Personnel.Customer;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Business {

    ArrayList<Branch> branches;
    UserAccountDirectory userAccounts;
    ArrayList<Customer> customers;

    Business() {
        this.branches = new ArrayList<Branch>();
        this.customers = new ArrayList<Customer>();
        this.userAccounts = new UserAccountDirectory();
        // CREATING ADMIN
        this.userAccounts.createUserAccount("a", "a", new SystemAdminRole());
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch findBranchByName(String name) {
        for (Branch b : this.getBranches()) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public UserAccountDirectory getUserAccounts() {
        return userAccounts;
    }

    public ArrayList<Employee> getEmployeesByBranch(String lib) {
        return this.findBranchByName(lib).getLibrary().getEmployeeDirectory();
    }

//    public void addEmployee(String bName, Employee e) {
//        this.findBranchByName(bName).getLibrary().addEmployee(e);
//    }

    public void addCustomer(String id,String name) {
        Customer c = new Customer(id,name);
        this.customers.add(c);
        
    }
    
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public Customer findCustomer(String id) {
        for (Customer c : this.customers) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Branch createBranch(String name, String building_num) {
        Branch branch = new Branch(name,building_num);
        this.branches.add(branch);
        return branch;
    }

    public static Business getInstance() {
        return new Business();
    }
}
