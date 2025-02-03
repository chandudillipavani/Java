/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class= Manager
 * Extends =Keyword
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//child object is instantiated from child constructor
	   //parent class consumes the properties and behavior of child class
		Employee manager = new Manager();
        manager.setId(1002);
        manager.setName("Devi");
        manager.setSalary(80000f);
        
        System.out.println(manager.getId());
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
	}

}
