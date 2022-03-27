
public class NonStatic {

	
	int abs;// non static variable

	
	NonStatic()//Non static variable
	{
		System.out.println("Inside nonStatic Constructor");
		System.out.println(abs);
	}
	
	{
		System.out.println("Inside non static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(abs); as it is a non static variable we can not call it here
		new NonStatic();
		

	}

}
