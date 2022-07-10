
public class GenerateRandomNumbers {
	static int Max=1000;
	static int Min=100;

	public static void main(String[] args) {

		
		System.out.println("1st random number between 0 and 1 : "+Math.random());
		System.out.println("2nd random number between 0 and 1 : "+Math.random());
		
		
		System.out.println("Random Number Within Range 100 to 1000 : "+GenerateRandomNumbers.RandomNumberWithinRange());
	}
	
	public static int RandomNumberWithinRange()
	{
		double a=Math.random()*(Max-Min+1)+Min;
		int b=(int) a;
		return b;
		
	}

}
