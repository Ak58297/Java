package StaticInnerClass;

public class Outer {

	static void f1()
	
	{
		System.out.println("Outer class");
	}
	static class Inner
	{
		 static void f2()
		{
			System.out.println("Inner class");
		}
		 void nonStaticInnermethod()
		 {
			 System.out.println("Non static inner method");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer.f1();
		Outer.Inner.f2();
		
		Inner o=new Inner();
		o.nonStaticInnermethod();
		}

}
