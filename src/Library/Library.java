/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Material.Material;
import Personnel.Employee;
import java.util.ArrayList;
import Material.MagazineDirectory;
import Material.BookDirectory;

/**
 *
 * @author 15512
 */
public class Library {

    private ArrayList<Employee> employeeDirectory;
    private ArrayList<Material> materialCollection;
    private BookDirectory bookDirectory;
    private MagazineDirectory magDiretory;
    private RentalRequestsDirectory rentalRequests;
    private ArrayList<String> authors;
    private ArrayList<String> genres;
    private Employee librarian;
    private Employee manager;
    private String lib_building;

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public MagazineDirectory getMagDiretory() {
        return magDiretory;
    }

    public void setMagDiretory(MagazineDirectory magDiretory) {
        this.magDiretory = magDiretory;
    }

    public Library(String lib_building) {
        this.employeeDirectory = new ArrayList<Employee>();
        this.materialCollection = new ArrayList<Material>();
        this.rentalRequests = new RentalRequestsDirectory();
        this.bookDirectory = new BookDirectory();
        this.magDiretory = new MagazineDirectory();
        this.authors = new ArrayList<String>();
        this.genres = new ArrayList<String>();
        this.lib_building = lib_building;
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void addEmployee(String employeeID, String emp_name, String designation, int exp, Library lib) {
        Employee employee = new Employee(employeeID, emp_name, designation, exp, lib);
        this.employeeDirectory.add(employee);
        if (designation == "manager") {
            this.manager = employee;
        }
        if (designation == "librarian") {
            this.librarian = employee;
        }
    }

    public void acceptRentalReq(String rr_id) {
        this.rentalRequests.findRR(rr_id).setStatus("Rented");
        String mId = this.rentalRequests.findRR(rr_id).getMaterial().getId();
        if (this.rentalRequests.findRR(rr_id).getMaterial().getMaterialType() == "Book") {
            this.bookDirectory.findBookById(mId).setIsAvailable(false);
        } else {
            this.magDiretory.findMagById(mId).setIsAvailable(false);
        }
    }

    public void rejectRentalReq(String rr_id) {
        this.rentalRequests.findRR(rr_id).setStatus("Rejected");
    }

    public void returnedRentalReq(String rr_id) {
        this.rentalRequests.findRR(rr_id).setStatus("Returned");
        String mId = this.rentalRequests.findRR(rr_id).getMaterial().getId();
        if (this.rentalRequests.findRR(rr_id).getMaterial().getMaterialType() == "Book") {
            this.bookDirectory.findBookById(mId).setIsAvailable(true);
        } else {
            this.magDiretory.findMagById(mId).setIsAvailable(true);
        }
        this.rentalRequests.removeFromRentalRequests(rr_id);
    }

    public ArrayList<Material> getMaterialCollection() {
        return materialCollection;
    }

    public String getLib_building() {
        return lib_building;
    }

    public void setLib_building(String lib_building) {
        this.lib_building = lib_building;
    }

    public void setMaterialCollection(ArrayList<Material> materialCollection) {
        this.materialCollection = materialCollection;
    }

//    public void addMaterial(String name, Date date) {
//        
//        Material m = new Material(name,date);
//        this.materialCollection.add(m);
//    }
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
