package com.company.inheritance;

public class Employee {
	int id;
	String name;
	String Company;
	String department;
	
	public Employee(int id, String name, String Company, String department)
	{
		this.id=id;
		this.name=name;
		this.Company=Company;
		this.department=department;
		
	}
	
	protected void work()
	{
		System.out.println("This is a common work for all");
	}
	
	final void EmployeeMethod()
	{
		System.out.println("EmployeeMethod cannot be overriden");// means no child class can use same name for overriding
	}

}
