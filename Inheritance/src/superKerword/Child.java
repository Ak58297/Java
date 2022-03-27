package superKerword;

public class Child extends Parent {


	Child()
	{

	   //super.Parent(); Super keyword cannot inherit default constructors.
	   super();
		System.out.println("Inisde child method");
	}
	
	
	void method1()
	{
		
		super.method1();
		System.out.println("Inside child method1");
	}
   
}
