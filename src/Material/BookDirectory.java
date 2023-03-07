/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 15512
 */
public class BookDirectory {
    ArrayList<Book> books;



    public BookDirectory(){
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public Book addBook(String name, Date registerDate, String a, String g, String pages, String lang, String type, String bname){
        Book book = new Book(name, registerDate, a, g, pages, lang, type, bname);
        this.books.add(book);
        
        return book;
    }
    
    public Book findBook(String title){
        for (Book b: books){
            if (b.getName().equals(title)){
                return b;
            }
        }
        return null;
    }
    
    public Book findBookById(String id){
        for (Book b: books){
            if (b.getId().equals(id)){
                return b;
            }
        }
        return null;
    }
    
    
}
