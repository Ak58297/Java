
public class NonStaticVariable {

	int a;
	static NonStaticVariable obj1;
	static {
		NonStaticVariable obj = new NonStaticVariable();
		System.out.println("Default value of a is " + obj.a);
		System.out.println(obj);

	}
	
	void method1()
	{
		double d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(a);cannot use a instance variable or local variable directly, it can be accessed from an object
		System.out.println(obj1);
		obj1 = new NonStaticVariable();
		System.out.println(obj1);
		System.out.println(obj1.a);
		obj1.a=100;
		System.out.println(obj1.a);
	}

}
