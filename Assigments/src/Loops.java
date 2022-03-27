import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		// for loop
		System.out.println("For Loop");
		for (int i = 1; i <= number; i++) {
			if (i % 10 == 0) {
				continue;
			} else if (i > 100) {
				break;
			}

			System.out.print(i + " ");

		}
		System.out.println();

		// while loop
		System.out.println("while Loop");

		int k = 1;
		while (k <= number) {
				if (k % 10 == 0) {
k++;
				continue;
			} else if (k > 100) {
				break;
			}
				
			System.out.print(k + " ");
			k++;
		}
		System.out.println();

		// do while loop
		System.out.println("do while Loop");

		int j = 1;
		do {
			if (j % 10 == 0) {
				j++;
				continue;
			} else if (j>100) {
				break;
			}

			System.out.print(j + " ");
			j++;
		} while (j <= number);

	}

}
