package com.wipro.java.collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample 
{

	
	    public static void main(String[] args) {
	        // Creating a HashMap
	        Map<Integer, String> map = new HashMap<>();

	        // Put elements into the map
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");
	        map.put(4, "Date");

	        // Get and print a value
	        System.out.println("Value for key 2: " + map.get(2));

	        // Remove an element
	        map.remove(3);

	        // Iterate through the map
	        System.out.println("Map elements:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}



