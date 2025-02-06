package com.wipro.java.collection;

import java.util.Comparator;

public class AgeNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        int ageCompare = Integer.compare(a1.getAge(), a2.getAge());
        return (ageCompare != 0) ? ageCompare : a1.getName().compareTo(a2.getName());
    }
}
