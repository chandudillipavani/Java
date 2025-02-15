package com.wipro.java.designpattern.singlethread;
public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) { // Not thread-safe
            instance = new Singleton(value);
        }
        return instance;
    }
}
