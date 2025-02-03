/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class= Developer
 * Extends =Keyword
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//child object is instantiated from child constructor
		//parent class consumes the properties and behavior of child class
		 Employee developer = new Developer();
	     developer.setId(1001);
	     developer.setName("Farheen");
	     developer.setSalary(50000f);
	     
	     System.out.println(developer.getId());
	     System.out.println(developer.getName());
	     System.out.println(developer.getSalary());
	}
}
