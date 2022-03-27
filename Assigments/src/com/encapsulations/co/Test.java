package com.encapsulations.co;

public class Test {

	public static void main(String[] args) {

		Patient p=new Patient();
		p.setId(123);
		p.setName("John");
		p.setSsn("ssf");
	
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());
	}

}
