
public class StaticVSnonStatic extends StaticVariable {

	
	static void StaticMethodName()
	{
		System.out.println("Inside static Method "+StaticVariable.ab);
	}
	
	{
		System.out.println("Inside a NoNstatic block");
	}

	static 
	{
		System.out.println("Inside a static block");
	}

	
	public void NonStaticMEthod()
	{
		System.out.println("Inside NoNstatic Method "+StaticVariable.ab);
	}
	public static void main(String[] args) {

//Create multiple objects for non static block

		//StaticVSnonStatic obj =new StaticVSnonStatic();
		//new StaticVSnonStatic();
		//new StaticVSnonStatic();
	///	obj.NonStaticMEthod();
		
	//	System.out.println(cd);
		
	StaticVSnonStatic.StaticMethodName();
	
		
	}

}
