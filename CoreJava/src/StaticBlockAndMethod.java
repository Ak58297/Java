
public class StaticBlockAndMethod {
	static int num;
	
	static {
	System.out.println("Inside Static Block1");
	}
	
	
	static {
		System.out.println("Inside Static Block2");
		}
	
	static void StaticMethodName()
	{
		System.out.println("Inside Static Mathod");
	}
	public static void main(String[] args) {
		System.out.println("Inside main Method");
		StaticBlockAndMethod.StaticMethodName();;
		
		
		
	}
}
