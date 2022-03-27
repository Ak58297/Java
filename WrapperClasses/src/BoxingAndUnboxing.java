
public class BoxingAndUnboxing {

	public static void main(String[] args) {

		int x=100;
		Integer y=Integer.valueOf(x); // Primitive to Object : Boxing
		
		//Object to Primitive : Unboxing
		int a = y.intValue();
	}

}
