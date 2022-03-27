
public class ExplicitTypeCasting {

	double dd;
	public static void main(String[] args) {
		
		int i =75;
		byte b =(byte)i;
		char c=(char)i;
		System.out.println(b);
		System.out.println(c);
		
		
		//System.out.println(dd);  cannot use a instance variable directly, it can be accessed from an object
		
		int i1 =145; //150 is out of range for byte and char
		byte b1 =(byte)i1;
		char c1=(char)i1;
		System.out.println(b1);
		System.out.println(c1);
		
		
		
		//Note: will not be able to change int to String Vice versa as int is primitive and String is non primitive
	}
}
