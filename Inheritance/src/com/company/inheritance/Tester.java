package com.company.inheritance;

public class Tester extends Employee {
	
	String[] tools;
	
	public Tester(int id, String name, String Company, String department, String[] tools) {
		
		super(id, name, Company, department);
		System.out.println("Inside Tester constructor");

		this.tools=tools;
	}
	
	
	@Override
	protected void work()
	{
		super.work();
		super.EmployeeMethod();
		System.out.println("Tools used by testers");
		for (String tool:tools)
		{
			System.out.println(tool);
		}
	}
	


		
}
