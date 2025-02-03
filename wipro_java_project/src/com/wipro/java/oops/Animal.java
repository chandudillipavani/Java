/**
 * 
 */
package com.wipro.java.oops;

/**
 * 1.NO CONSTRUCTOR
 * 2.GETTERS HAVE RETURN VALUE
 * 3.SETTERS HAVE NO RETURN VALUE
 * 4.PROPERTIES ARE DETERMINED USING PRIVATE FIELDS
 * 5.VALUES ARE BEHAVIOURS ARE DETERMINED THROUGH SETTERS
 * 6.TOSTRING WILL CONVERT THE ENTIRE ANIMAL CLASS WITH PROPERTIES AND BEHAVIOURS
 * 
 */
public class Animal {

	 // Private field=structure
    private String name;
    private String species;
    private int age;
    
    
 /*Getter and Setter for name*/
	public String getName() {
		return name;
	}
	/* Getter and Setter for name*/
	public void setName(String name) {
		this.name = "Fish";
	}
	/*Getter and Setter for species*/
	public String getSpecies() {
		return species;
	}
	/*Getter and Setter for species*/
	public void setSpecies(String species) {
		this.species ="jawless fish" ;
	}
	/* Getter and Setter for age*/
	
	public int getAge() {
		return age;
	}
	/* Getter and Setter for age*/
	public void setAge(int age) {
		this.age = 10;
	}
	 public String toString() {
	        return "Animal { Name: " + name + ", Species: " + species + ", Age: " + age + " }";
	    }
	
	

}
