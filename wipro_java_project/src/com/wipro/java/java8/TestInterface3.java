package com.wipro.java.java8;

public interface TestInterface3 {
    default void show() {
        System.out.println("Default method from TestInterface3");
    }
}

interface TestInterface4 {
    default void show() {
        System.out.println("Default method from TestInterface4");
    }
}

class DefaultM3 implements TestInterface3, TestInterface4 {
    // Resolving default method conflict by overriding show()
    public void show() {
        TestInterface3.super.show();  // Calling TestInterface3's show()
        TestInterface4.super.show();  // Calling TestInterface4's show()
    }

    public static void main(String[] args) {
        DefaultM3 d = new DefaultM3();
        d.show();
    }
}
