package com.interfaces.abstraction;

public class HondaCB350 implements Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modelNumber() {
		// TODO Auto-generated method stub
		System.out.println("CB350");

	}

	@Override
	public void Brand() {
		System.out.println("Honda");
	}

	@Override
	public void Safety() {
		System.out.println("Certified from gov regulations");
	}

}
