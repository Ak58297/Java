import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// System.out.println(number);
		boolean flag = true;

		if (number==0|number==1)
		{
			flag =false;
		}
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				flag = false;
				break;

			}

		}

		if (flag == true) {
			System.out.println(number + " : is prime number");
		} else if (flag == false) {
			System.out.println(number + " : is not a prime number");
		}

	}

}
