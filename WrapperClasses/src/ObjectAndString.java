
public class ObjectAndString {

	public static void main(String[] args) {
		
		long i= 100;
		Long L = Long.valueOf(i);
		System.out.println(L);
		String s=L.toString();

		Long z=Long.valueOf(s);		
		
		System.out.println(z);


		
	}

}
