package package2;
import package1.*;
public class class_C extends A {

	public void m2()
	{
		System.out.println("insdide package2, m1 method");
	}
	
	
	public static void main(String[] args) {

		A ob= new A();
		class_C ob1 =new class_C();
		
		ob.m1();
		System.out.println(ob.x);
		System.out.println(ob1.z);// instance of Class_c
		ob.m2();
	ob1.m2();
	}

}
