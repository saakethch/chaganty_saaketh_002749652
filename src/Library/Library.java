/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Personnel.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Library {
    
    private ArrayList<Employee> employeeDirectory;
//    private ArrayList<Material>() materialCollection;
//    private ArrayList<String>() authors;
//    private ArrayList<String>() genres;
//    private ArrayList<RentalRequest>() rentalRequests;
    private Employee librarian;
    private Employee manager;

    public Employee getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Employee librarian) {
        this.librarian = librarian;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
    
    
}
