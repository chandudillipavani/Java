package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String n;  // Movie Name
    private double r;  // Movie Rating
    private int y;     // Release year

    // Constructor
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // CompareTo method for sorting by rating in ascending order
    public int compareTo(Movie m) {
        return Double.compare(this.r, m.r); // Sorting by rating
    }

    // Getter methods
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }
}
