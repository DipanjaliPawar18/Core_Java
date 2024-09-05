package com.inheritance;

public class Activa {

	String name;
	double price;
	
	Activa(){
		System.out.println("I have a petrol engine...!");
	}
	
	public void bill(String name, double price) {
		System.out.println("Name is : " + name + " price is : " + price);
	}
}
