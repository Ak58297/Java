package nonStaticInner;

public class Outer {
	void f1()
	{
		System.out.println("Inside Outer method");
	}
	class Inner
	{
		void f2()
		{
			System.out.println("Inside Inner class");
		}
	}

	public static void main(String[] args) {

		Outer o=new Outer();
		o.f1();

	Outer.Inner i=o.new Inner();
	i.f2();
	
	}

}
