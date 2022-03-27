package com.abstraction.java;

public class TestAbstraction {

	public static void main(String[] args) {

		Car c =new Car();
		c.safetyCertification();
		c.color();
		c.type();
		
		Bike b=new Bike();
		b.safetyCertification();
		b.color();
		b.type();
	}

}
