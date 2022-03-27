package com.company.inheritance;

public class Developer extends Employee {
	
	public Developer(int id, String name, String Company, String department) {
		super(id, name, Company, department);// super() keyword is used to invoke parent constructor.
		// TODO Auto-generated constructor stub
	}

	String technology;
	

	public Developer(int id, String name, String Company, String department, String technology) {
		super(id, name, Company, department);
		this.technology=technology;
		
	}
	
	
	@Override
	protected void work()
	{
		super.work();
		
		System.out.println("Java frontEnd Developer");
	}


		
}
