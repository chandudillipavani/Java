package com.wipro.java.oops.polymorphsim;

public class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	public static void main(String[] args) {
		        Animal myAnimal;  // Parent class reference

		        myAnimal = new Dog();  // Dog object assigned
		        myAnimal.makeSound();  // Calls Dog's makeSound()

		        myAnimal = new Cat();  // Cat object assigned
		        myAnimal.makeSound();  // Calls Cat's makeSound()
		    }
		
	}

