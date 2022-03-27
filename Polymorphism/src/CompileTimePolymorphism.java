
public class CompileTimePolymorphism {
	
	public int add(int a, int b)
	{
		System.out.print("add two integer numbers : ");
		return a+b;
	}

	public float add(float a , float b)
	{
		System.out.print("add two float numbers : ");
		return a+b;

		
	}

	public int add(int a,int b,int c)
	{
		System.out.print("add three integer numbers : ");
		return a+b+c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphism a=new CompileTimePolymorphism();
		System.out.println(a.add(10, 20));
		System.out.println(a.add(20f, 30f));
		System.out.println(a.add(10, 10, 10));


	}

}
