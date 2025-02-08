package com.wipro.java.java8.usecase.test;
/**
 * The Employee class represents an employee with an ID, name, and salary.
 * It provides methods to access and update employee details.
 */
public class Employee {
	//private attributes

	    private int id;
	    private String name;
	    private double salary;
        //constructor
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }
        //getter and setter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    //method to increase the salary of the employee.
	    public void raiseSalary(double amount) {
	        this.salary += amount;
	    }
	}


