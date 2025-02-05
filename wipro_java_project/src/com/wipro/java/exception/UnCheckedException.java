package com.wipro.java.exception;

public class UnCheckedException {

	public static void main(String[] args) {
		try 
		{
			int result = 10 / 0; // Will cause ArithmeticException (Unchecked Exception)
			} 
		catch (ArithmeticException e) 
		{
			System.out.println("Unchecked Exception Caught: " + e.getMessage());
		}
		   
	}
		

}


