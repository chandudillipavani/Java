package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        // Create a list of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 3));
        animals.add(new Animal("Giraffe", 7));
        animals.add(new Animal("Tiger", 5));  // Same age as Lion, different name
        animals.add(new Animal("Cheetah", 5));  // Same age as Lion & Tiger

        // Sort using Comparable (by Age then Name)
        Collections.sort(animals);
        System.out.println("Animals sorted by age (then name alphabetically if same age) using Comparable:");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // Sort using Comparator (by Age then Name)
        Collections.sort(animals, new AgeNameComparator());
        System.out.println("\nAnimals sorted by age (then name alphabetically if same age) using Comparator:");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
