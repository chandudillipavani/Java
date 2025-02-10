package com.wipro.java.java8.usecase2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Encapsulation - Student class
class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student: " + name + " | Age: " + age + " | Grade: " + grade);
    }
}

// Inheritance - LibraryStudent subclass
class LibraryStudent extends Student {
    private int booksBorrowed;

    public LibraryStudent(String name, int age, double grade, int booksBorrowed) {
        super(name, age, grade);
        this.booksBorrowed = booksBorrowed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Library Student: " + getName() + " | Age: " + getAge() + " | Grade: " + getGrade() + " | Books Borrowed: " + booksBorrowed);
    }
}

// Inheritance - SportsStudent subclass
class SportsStudent extends Student {
    private String sport;

    public SportsStudent(String name, int age, double grade, String sport) {
        super(name, age, grade);
        this.sport = sport;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sports Student: " + getName() + " | Age: " + getAge() + " | Grade: " + getGrade() + " | Sport: " + sport);
    }
}

// StudentManager class using Collections and Java 8 features
class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Add a student to the collection
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    public void showAllStudents() {
    	//lambda expressions forEach() method will simplify looping 
        students.forEach(Student::displayInfo);
    }

    // Get students sorted by grade using Java 8 Streams
    public void showSortedStudentsByGrade() {
        System.out.println("\nStudents Sorted by Grade:");
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(Student::displayInfo);
    }

    // Get students by a specific grade range using Java 8 Streams
    public void showStudentsByGradeRange(double min, double max) {
        System.out.println("\nStudents with Grade between " + min + " and " + max + ":");
        //stream API (Sorting,filtering students by grade)
        students.stream()
                .filter(s -> s.getGrade() >= min && s.getGrade() <= max)
                .forEach(Student::displayInfo);
    }
}

// Public class with main method
public class StudentSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Creating Student objects
        Student s1 = new LibraryStudent("Chandu Dilli Pavani", 20, 8.5, 3);
        Student s2 = new SportsStudent("Akkala Devi Priyanka", 22, 9.1, "Football");
        Student s3 = new LibraryStudent("Shaik Farheen", 21, 7.8, 5);
        Student s4 = new SportsStudent("Thanuja", 19, 8.9, "Basketball");

        // Adding students to the manager
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        // Display all students
        System.out.println("All Students:");
        manager.showAllStudents();

        // Display students sorted by grade
        manager.showSortedStudentsByGrade();

        // Display students in a specific grade range
        manager.showStudentsByGradeRange(8.0, 9.5);
    }
}
