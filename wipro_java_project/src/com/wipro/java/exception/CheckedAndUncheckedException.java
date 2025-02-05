package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CheckedAndUncheckedException {
	    public static void main(String[] args) 
	    {
	        // Checked Exception Example
	        try 
	        {
	            File file = new File("non_existent_file.txt");
	            FileReader reader = new FileReader(file); // This may throw FileNotFoundException (Checked Exception)
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Checked Exception Caught: " + e.getMessage());
	        }

	        // Unchecked Exception Example
	        try 
	        {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); // This causes ArrayIndexOutOfBoundsException (Unchecked Exception)
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Unchecked Exception Caught: " + e.getMessage());
	        }
	    }
	}

	
