
public class CountSumOfDigitsInAnumber {

	public static void main(String[] args) {
		System.out.println("start prog");
		int number=1005;
		int sum=0;
		while(number!=0)
		{
			
			int remainder=number%10;
			sum=sum+remainder;
			number=(number)/10;
		}
		System.out.println(sum);

	}

}
