package com.wipro.java.linkedlist;

import java.util.*;

class UserProfile {
    String name;
    String jobTitle;
    String company;

    UserProfile(String name, String jobTitle, String company) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public String toString() {
        return name + " - " + jobTitle + " at " + company;
    }
}
class LinkedInUserList {
    public static void main(String[] args) {
        HashMap<String, List<UserProfile>> linkedInUsers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for User " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Job Title: ");
            String jobTitle = scanner.nextLine();
            System.out.print("Company: ");
            String company = scanner.nextLine();

            addUser(linkedInUsers, new UserProfile(name, jobTitle, company));
        }

        // Display all user profiles
        System.out.println("\nLinkedIn User List:");
        for (Map.Entry<String, List<UserProfile>> entry : linkedInUsers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }

    private static void addUser(HashMap<String, List<UserProfile>> map, UserProfile user) {
        map.putIfAbsent(user.name, new ArrayList<>());
        map.get(user.name).add(user);
    }
}
