package com.wipro.java.exception;

public class JavaExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        try {
            System.out.println("Accessing element: " + numbers[5]); // This will cause ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Exception caught: " + e);
        }
        
        System.out.println("Rest of the code executes normally.");
    }
}
