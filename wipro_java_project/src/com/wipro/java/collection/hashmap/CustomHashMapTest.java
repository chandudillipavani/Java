package com.wipro.java.collection.hashmap;

public class CustomHashMapTest {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(12, "Orange"); // Collision (same hash index as 2)
        map.put(3, "Cherry");
        map.put(2, "Mango");  // Updating value for key 2

        // Displaying HashMap
        map.display();

        // Fetching values
        System.out.println("\nValue for key 2: " + map.get(2)); // Mango
        System.out.println("Value for key 12: " + map.get(12)); // Orange

        // Checking key existence
        System.out.println("\nContains key 3? " + map.containsKey(3)); // true
        System.out.println("Contains key 10? " + map.containsKey(10)); // false

        // Removing a key
        map.remove(2);
        System.out.println("\nAfter removing key 2:");
        map.display();
    }
}
