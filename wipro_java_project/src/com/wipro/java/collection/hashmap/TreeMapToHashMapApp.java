package com.wipro.java.collection.hashmap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class TreeMapToHashMapApp {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap (Sorted)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Step 2: Insert data into TreeMap
        treeMap.put(101, "Alice");
        treeMap.put(103, "Charlie");
        treeMap.put(102, "Bob");
        treeMap.put(104, "David");

        // Display TreeMap
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Step 3: Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Step 4: Fetch data from TreeMap and store it in HashMap
        hashMap.putAll(treeMap);

        // Step 5: Display HashMap
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}
