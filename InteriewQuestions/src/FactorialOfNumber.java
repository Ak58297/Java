import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			int result=i*num;
			System.out.println(result);
		}
		
	}

}
