package com.wipro.java.oops;

// Abstract class representing a library item (Abstraction)
abstract class Library{
    private String title; //private variables(data hiding)
    private String author; //private variables(data hiding)

    public Library(String title, String author) {
        this.title = title;
        this.author = author;
    }
    //getter method
    public String getTitle() 
    { 
    	return title; 
    }
    //setter method
    public void setTitle(String title)
    { 
    	this.title = title; 
    }

    public String getAuthor() 
    { 
    	return author;
    }
    public void setAuthor(String author) 
    { 
    	this.author = author;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void displayDetails();
}

// Subclass representing a Book (Inheritance)
class Book extends Library
{
    private int pageCount;

    public Book(String title, String author, int pageCount) 
    {
        super(title, author);
        this.pageCount = pageCount;
    }

    // Overriding abstract method (Polymorphism)
    @Override
    void displayDetails() 
    {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pageCount);
    }
}

// Subclass representing a Magazine (Inheritance)
class Magazine extends Library {
    private String issueMonth;

    public Magazine(String title, String author, String issueMonth) 
    {
        super(title, author);
        this.issueMonth = issueMonth;
    }

    // Overriding abstract method (Polymorphism)
    @Override
    void displayDetails()
    {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + ", Issue: " + issueMonth);
    }
}

// Main class to test Library System
public class LibraryItem{
    public static void main(String[] args) 
    {
        Library book = new Book("effective Java", "Joshua Bloch", 416);
        Library  magazine = new Magazine("Tech Today", "John Doe", "April 2025");

        book.displayDetails();   
        magazine.displayDetails();  
    }
}
