package com.wipro.java.collection.hashmap;

import java.util.LinkedList;

// Custom implementation of HashMap
class CustomHashMap<K, V> {
    private static final int SIZE = 10;
    private LinkedList<Entry<K, V>>[] buckets;

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Inner class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Put method
    public void put(K key, V value) {
        int index = getIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    // Get method
    public V get(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Remove method
    public void remove(K key) {
        int index = getIndex(key);
        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    // Contains key method
    public boolean containsKey(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Display method
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (!buckets[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print("[" + entry.key + "=" + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }
}
