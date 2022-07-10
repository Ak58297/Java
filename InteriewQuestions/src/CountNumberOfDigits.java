import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//		Integer n = Integer.valueOf(number);
//		String s = n.toString();
		int count = 0;
		
		
		
		while (number!=0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println("Total number of digits(non starting zero) is = " + count);
	}

}
