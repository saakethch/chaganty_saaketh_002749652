/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Material.Material;
import Personnel.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Library {
    
    private ArrayList<Employee> employeeDirectory;
    private ArrayList<Material> materialCollection;
    private RentalRequestsDirectory rentalRequests;
    private ArrayList<String> authors;
    private ArrayList<String> genres;
    private Employee librarian;
    private Employee manager;

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void addEmployee(Employee employee) {
        this.employeeDirectory.add(employee);
    }

    public ArrayList<Material> getMaterialCollection() {
        return materialCollection;
    }

    public void setMaterialCollection(ArrayList<Material> materialCollection) {
        this.materialCollection = materialCollection;
    }

    public RentalRequestsDirectory getRentalRequests() {
        return rentalRequests;
    }

    public void setRentalRequests(RentalRequestsDirectory rentalRequests) {
        this.rentalRequests = rentalRequests;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }
    
    public ArrayList<String> getGenreDirectory() {
        return genres;
    }

    public void addToGenreDirectory(String genre) {
        this.genres.add(genre);
    }
    
    public void addToAuthorDirectory(String author) {
        this.authors.add(author);
    }

    public ArrayList<String> getAuthorDirectory() {
        return authors;
    }
    
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
