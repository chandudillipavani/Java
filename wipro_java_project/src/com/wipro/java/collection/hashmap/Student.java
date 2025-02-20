package com.wipro.java.collection.hashmap;
import java.util.*;

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return name + " (Roll No: " + rollNumber + ")";
    }
}

 class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, List<Student>> studentMap = new HashMap<>();

        // Adding students (some with duplicate roll numbers)
        addStudent(studentMap, new Student("Amit", 101));
        addStudent(studentMap, new Student("Ravi", 102));
        addStudent(studentMap, new Student("Priya", 103));
        addStudent(studentMap, new Student("Amit", 101));  // Duplicate Roll No
        addStudent(studentMap, new Student("Neha", 104));
        addStudent(studentMap, new Student("Rahul", 105));
        addStudent(studentMap, new Student("Priya", 103));  // Duplicate Roll No
        addStudent(studentMap, new Student("Kiran", 106));
        addStudent(studentMap, new Student("Sneha", 107));
        addStudent(studentMap, new Student("Amit", 101));  // Duplicate Roll No

        // Displaying the student details
        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void addStudent(HashMap<Integer, List<Student>> map, Student student) {
        map.putIfAbsent(student.rollNumber, new ArrayList<>());
        map.get(student.rollNumber).add(student);
    }
}

