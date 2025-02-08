package com.wipro.java.java8.usecase.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * JUnit test class for the Employee class.
 * This class tests various functionalities of the Employee class, 
 * including getter methods and salary updates.
 */

public class EmployeeTest {
	    private Employee employee;
	    /**
	     * This method runs before each test case.
	     * It initializes an Employee object with sample data.
	     */
	    @Before
	    public void setUp() {
	        employee = new Employee(1, "Pavani", 5000.0);
	    }
	    /**
	     * Test case to verify the getId() method.
	     * It checks if the employee ID is correctly returned.
	     */

	    @Test
	    public void testGetId() {
	        assertEquals(1, employee.getId());
	    }

	    /**
	     * Test case to verify the getName() method.
	     * It ensures that the employee name is correctly returned.
	     */
	    @Test
	    public void testGetName() {
	        assertEquals("Pavani", employee.getName());
	    }
	    /**
	     * Test case to verify the getSalary() method.
	     * It checks if the initial salary of the employee is correctly returned.
	     */
	    @Test
	    public void testGetSalary() {
	        assertEquals(5000.0, employee.getSalary(), 0.01);
	    }
	    /**
	     * Test case to verify the raiseSalary() method.
	     * It increases the employee's salary and ensures the updated value is correct.
	     */
	    

	    @Test
	    public void testRaiseSalary() {
	        employee.raiseSalary(1000.0);
	        assertEquals(6000.0, employee.getSalary(), 0.01);
	    }
	}