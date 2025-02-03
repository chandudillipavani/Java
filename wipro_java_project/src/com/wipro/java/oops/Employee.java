package com.wipro.java.oops;

/**
 * Employee class representing an employee's details.
 */
/**
 * Parent class = Employee
 */

public class Employee {
    
    // Private fields 
    private int id;
    private String name;
    private float salary;
    
    private boolean isTaxApplicable;
	public char[] setId;
 // Getter and Setter for id
	public int getId() {
		return id;
	}
	// Getter and Setter for id
	public void setId(int id) {
		this.id = id;
	}
	// Getter and Setter for name
	public String getName() {
		return name;
	}
	// Getter and Setter for name
	public void setName(String name) {
		this.name = name;
	}
	// Getter and Setter for salary
	public float getSalary() {
		return salary;
	}
	// Getter and Setter for salary
	public void setSalary(float  salary) {
		this.salary = salary;
	}
	public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary);
	}
	
	
}