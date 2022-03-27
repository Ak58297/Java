package package1;

public class A {
	public int x=10;
	private int y=20;//limited to only specified class 
	protected int z=30;//package level and could be call inside another package using inheritance
	public static void m1()
	{
		System.out.println("package 1 , method m1");
	}

	public void m2()
	{
		System.out.println("package 1 , method m2");
	}
	public static void main(String[] args) {

		A ob=new A();
		System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(ob.z);

	}

}
