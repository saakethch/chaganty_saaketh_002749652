/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

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
    
    Business() {
        this.branches = new ArrayList<Branch>();
        this.userAccounts = new UserAccountDirectory();
        // CREATING ADMIN
        this.userAccounts.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
    
    public Branch findBranchByName(String name) {
        for (Branch b: this.getBranches()){
            if (b.getName().equals(name)){
                return b;
            }
        }
        return null;  
    }
    
    public UserAccountDirectory getUserAccounts() {
        return userAccounts;
    }

    public ArrayList<Customer> getCustomersByBranch(String lib) {
       return this.findBranchByName(lib).getCustomers();
    }
    
    public ArrayList<Employee> getEmployeesByBranch(String lib) {
        return this.findBranchByName(lib).getLibrary().getEmployeeDirectory();
    }
    
    public void addEmployee(String bName, Employee e) {
        this.findBranchByName(bName).getLibrary().addEmployee(e);
    }
    
    public void addCustomer(String bName, Customer c) {
        this.findBranchByName(bName).addCustomerToBranch(c);
    }

    
    public Branch createBranch(String name, String floorNum) {
        Branch branch = new Branch(name,floorNum);
        this.branches.add(branch);
        return branch;
    }

    public static Business getInstance() {
        return new Business();
    }
}
