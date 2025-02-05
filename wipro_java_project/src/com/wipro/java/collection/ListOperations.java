package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;
public class ListOperations {

	    public static void main(String[] args) {
	        // Creating first list l1 with different values
	        List<Integer> l1 = new ArrayList<>();
	        l1.add(0, 10);
	        l1.add(1, 20);
	        l1.add(2, 30);
	        System.out.println("List l1: " + l1);

	        // Creating second list l2 with different values
	        List<Integer> l2 = new ArrayList<>();
	        l2.add(100);
	        l2.add(200);
	        l2.add(300);
	        System.out.println("List l2: " + l2);

	        // Adding all elements of l2 into l1 at index 1
	        l1.addAll(1, l2);
	        System.out.println("After adding l2 at index 1: " + l1);

	        // Removing element at index 2
	        l1.remove(2);
	        System.out.println("After removing element at index 2: " + l1);

	        // Setting 0th index element to 50
	        l1.set(0, 50);
	        System.out.println("After setting 0th index to 50: " + l1);
	    }
	}


