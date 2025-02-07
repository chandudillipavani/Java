package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
public class MinMax
{
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 25, 30);

        int min = numbers.stream().min(Integer::compare).get();
        int max = numbers.stream().max(Integer::compare).get();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

}
