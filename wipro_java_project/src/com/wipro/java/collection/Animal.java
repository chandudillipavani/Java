package com.wipro.java.collection;

public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Comparable: Sort by Age, then by Name (Alphabetical) if ages are equal
    @Override
    public int compareTo(Animal other) {
        int ageCompare = Integer.compare(this.age, other.age);
        return (ageCompare != 0) ? ageCompare : this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " - Age: " + age;
    }
}
