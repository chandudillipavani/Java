
package com.wipro.java;

public class MyClass {
    int num = 5;

    // Method to change the value of 'num'
    // 'this.num' refers to the instance variable
    // 'num' (parameter) refers to the argument passed in the method
    public void changeValue(int num) {
        this.num = num;
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.changeValue(10);
        System.out.println(obj.num); 
    }
}
