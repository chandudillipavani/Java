package com.wipro.java.designpattern.lazyloading;
public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadBar = new Thread(new ThreadBar()); // Start BAR first
        threadBar.start();

        try {
            threadBar.join(); // Ensure threadBar completes first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread threadFoo = new Thread(new ThreadFoo()); // Start FOO second
        threadFoo.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}