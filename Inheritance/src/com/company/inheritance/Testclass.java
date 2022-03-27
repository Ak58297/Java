package com.company.inheritance;

public class Testclass {

	public static void main(String[] args) {

		Tester t=new Tester(01,"A Tester","TCS","Electrical",new String[] {"Jira","Selenium","Java","Git","Jenkins"});
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.Company);
		System.out.println(t.department);
		//System.out.println(t.tools);
	
		t.work();
		
		Developer d=new Developer(02,"A Developer","TCS","Electrical","Java");
		d.work();
		
		
	}

}
