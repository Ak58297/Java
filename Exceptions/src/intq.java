
public class intq {
	static String a="900px";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a="900px";
			int output=Integer.parseInt(a);

			System.out.println(output);
		}
		catch(NumberFormatException e)
		{
			System.out.println(a);
		}
	}

}
