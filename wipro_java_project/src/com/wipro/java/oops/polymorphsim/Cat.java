package com.wipro.java.oops.polymorphsim;

public class Cat  extends Animal{
	@Override
    public void makeSound() {  // Also marked as public
        System.out.println("Cat meows");
    }
}
