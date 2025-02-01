/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {
	String flowerName;
	String color;
	
	
	Flower(String name,String color,int price){
		this.flowerName=name;
		this.color=color;
	
	
	}
	void display() {
		System.out.println("Flower Name: " + flowerName+ ", Color: "+color);
	}
	public static void main(String[] args) {
		Flower flower1 = new Flower("Rose", "Red", 50);
        Flower flower2 = new Flower("Lily", "White", 40);
        Flower flower3 = new Flower("Sunflower", "Yellow", 30);
        flower1.display();
        flower2.display();
        flower3.display();
	}
	

}
