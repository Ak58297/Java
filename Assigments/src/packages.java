import  java.util.Scanner;

import java.util.Scanner;

public class packages {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int power = Integer.parseInt(sc.next());
		double result = Math.pow(num1, power);
		System.out.println(result);
		double squareroot = Math.sqrt(num1);
		System.out.println(squareroot);

	}

}
