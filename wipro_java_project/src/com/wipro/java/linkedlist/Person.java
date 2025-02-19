package com.wipro.java.linkedlist;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

 class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 22));
        list.add(new Person("Charlie", 30));

        Collections.sort(list, new AgeComparator());
        
        System.out.println("Sorted LinkedList:");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
