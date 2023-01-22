package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 15512
 */
public class HelloWorld {
    public String name = "John";
    public int age = 23;
    public double salary = 65000.00;
    public boolean isEmployed = true;
    public char initial = 'J';
    public int n = 10;
    public int[] arr = new int[n];
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld(); 
        System.out.println("Name: " + hw.name);
        System.out.println("Age: " + hw.age);
        System.out.println("Salary: " + hw.salary);
        System.out.println("Employed: " + hw.isEmployed);
        System.out.println("Initial: " + hw.initial);
    }
}
