package com.encap.ja;

public class ClassA {
	
	private int empID;
	private String name;
	private String company;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		if (name==null)
		{
			System.out.println("This name is Invalid");
		}
		this.name= name;
	}
	
	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company= company;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA a=new ClassA();
		a.setEmpID(2233);
		a.setName("Abhishek Kumar");
		a.setName(null);
		a.setCompany("TCSL");
		System.out.println(a.getEmpID());
		System.out.println(a.getName());
		System.out.println(a.getCompany());
		
		

	}


	
}
