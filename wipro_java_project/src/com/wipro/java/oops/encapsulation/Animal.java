package com.wipro.java.oops.encapsulation;

public class Animal
{
	private String species;
	private int age;
	
	public Animal(String species, int age) 
	{
		// TODO Auto-generated constructor stub
		this.species=species;
		this.age=age;
		
	}

    public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age)
	{
		if(age>0) 
		{
			this.age=age;
		}
		else
		{
			System.out.println("Age must be positive.");
		}
	
	}
	public static void main(String[] args) {
		Animal animal1 = new Animal("Elephant", 10);
        
        // Using species and age fields
        System.out.println("Species: " + animal1.getSpecies());
        System.out.println("Age: " + animal1.getAge());

        // Updating species and age
        animal1.setSpecies("Lion");
        animal1.setAge(12);
       
        System.out.println("Updated Species: " + animal1.getSpecies());
        System.out.println("Updated Age: " + animal1.getAge());
        
        animal1.setAge(-3); 
    }
	

	
}
