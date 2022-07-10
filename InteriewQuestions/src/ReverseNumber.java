import java.util.Scanner;

public class ReverseNumber {

	public void MethodOne(int number)
	{
//		Scanner sc= new Scanner(System.in);
//		a=sc.nextInt();
		int a=number ;
		System.out.println("Before reversing: "+a);
		
		String rev="";		
		Integer w= Integer.valueOf(a);
		String s=w.toString();
		
		for (int i=(s.length()-1);i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		System.out.println("Reversed Interger : "+rev);
	}
	
	
	public static void main(String[] args) {
		ReverseNumber rn= new ReverseNumber();
		rn.MethodOne(1234);

		
		
	}

}
