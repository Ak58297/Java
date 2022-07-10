import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int medium=num/2;
		if(num>1) {
			
			int z=0;
			for (int i=2;i<=medium;i++)
			{
				if(num%i==0) {
					z++;
				}
			}
			if (z>0)
			{
				System.out.println("Not a prime number");
			}
			else
			{
				System.out.println("Prime number");
			}
			
			
			
			
		}
		else
		{
			System.out.println("Enter Number greater than One");
		}
		
		
		

	}

}
