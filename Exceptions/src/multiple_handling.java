
public class multiple_handling {

	public static void main(String[] args) {
		try 
		{
		String input=args[0];

		System.out.println(input);
		int output=Integer.parseInt(input);
		System.out.println(output);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("provide an input");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input provide");
		}
		
		System.out.println("this line will execeute if try catch handling will work properly");
	}

}
