package javaio;

import java.io.Serializable;
import java.util.Scanner;

public class Student  implements Serializable{
   
    private int rno;
    private String name;
    private transient int  std; 
    
    
    public Student(int rno,String name,int std)
    {
    	this.rno=rno;
    	this.name=name;
    	this.std=std;
    }
    public Student()
    {
    	
    }
    public void scanData() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rno: ");
        rno = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Enter the Name: ");
        name = sc.nextLine();
        System.out.print("Enter the Std: ");
        std = sc.nextInt();
    }

    // Getters and Setters
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    // Main method (entry point)
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.scanData(); 
        
        // Displaying entered data
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + s.getRno());
        System.out.println("Name: " + s.getName());
        System.out.println("Standard: " + s.getStd());
    }
}