/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;
import Library.Material.Material;
import java.util.Date;

/**
 *
 * @author 15512
 */
public class Book extends Material{
    private String author;
    private String genre;
    private String pages;
    private String language;
    private String bindingType;
    
    public Book(String name, Date registeredDate, String a, String g, String pages, String lang, String type){
        super();
        this.materialType = "Book";
        this.name = name;
        this.registeredDate = registeredDate;
        this.author = a;
        this.genre = g;
        this.pages = pages;
        this.language = lang;
        this.bindingType = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    
    
    

    
}
