package com.wipro.java.treemap;
import java.util.TreeMap;
import java.util.Scanner;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        generateFibonacci(n, fibonacciMap);
        
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (var entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + " : " + entry.getValue());
        }
    }
    
    private static void generateFibonacci(int n, TreeMap<Integer, Integer> map) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            map.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

