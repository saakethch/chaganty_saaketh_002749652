/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

import Library.Library;
import Library.RentalRequest;

/**
 *
 * @author 15512
 */
public class Employee {
    public String employeeID;
    public int exp;
    public String designation;
    public String emp_name;
    public Library workingLibrary;
    
    public Employee(String employeeID, String emp_name, String designation, int exp, Library l) {
        this.employeeID = employeeID;
        this.emp_name = emp_name;
        this.exp = exp;
        this.designation = designation;
        this.workingLibrary = l;
    }

    public Employee() {
        }
    
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void acceptRequest(RentalRequest rr){
        rr.getMaterial().setIsAvailable(false);
    }
    
}
