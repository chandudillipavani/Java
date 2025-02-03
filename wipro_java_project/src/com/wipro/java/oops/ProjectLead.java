package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class= ProjectLead
 * Extends =Keyword
 */
public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{

		//child object is instantiated from child constructor
		//parent class consumes the properties and behavior of child class
		Employee employee=new ProjectLead();
		employee.setId(1234);
		employee.setName("pavani");
		employee.setSalary(34000f);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		
	}
}
