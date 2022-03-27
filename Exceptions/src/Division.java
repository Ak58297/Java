
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		System.out.println("enter two Innteger");
		
		try {
			
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Avoid using '0' as denominator");
		}
		 // java.lang.ArithmeticException:
		System.out.println("Execute this code even if there is exception");
		
	}

}
