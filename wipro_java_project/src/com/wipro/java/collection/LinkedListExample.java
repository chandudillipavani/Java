package com.wipro.java.collection;
import java.util.LinkedList;
public class LinkedListExample {

	    public static void main(String[] args) {
	        int n = 25; // Example value for n

	        // Creating a LinkedList
	        LinkedList<Integer> ll = new LinkedList<>();

	        // Adding elements from 1 to n
	        for (int i = 1; i <= n; i++)
	            ll.add(i);

	        // Printing elements
	        System.out.println("LinkedList: " + ll);

	        // Remove element at index 3
	        ll.remove(3); // Removing the 4th element (0-based index)

	        // Displaying the list after deletion
	        System.out.println("After removing index 3: " + ll);

	        // Printing elements one by one
	        for (int i = 0; i < ll.size(); i++)
	            System.out.print(ll.get(i) + " ");
	    }
	}


