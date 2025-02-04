package com.wipro.java.exception;

public class JavaExceptionExample {
    public static void main(String args[]) {
        int num1 = 100, num2 = 0, result;
        int[] arr = new int[3]; // Array of size 3

        try {
            // Attempting division by zero
            result = num1 / num2;
            System.out.println("Result: " + result);

            // Attempting to access an invalid array index
            arr[5] = 50; // This will cause an ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } 
        finally {
            System.out.println("executed");
        }

        System.out.println("Rest of the code...");
    }
}
