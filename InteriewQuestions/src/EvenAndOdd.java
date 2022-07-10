import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		
		if (number%2==0)
		{
			System.out.println("Even number");
		}
		else if(number % 2!=0)
		{
			System.out.println("It is odd");
		}
		

	}

}
