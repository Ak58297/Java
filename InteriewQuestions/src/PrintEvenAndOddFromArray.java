
public class PrintEvenAndOddFromArray {

	public static void main(String[] args) {

		
		int array[]=new int[]{1,2,3,4,5,3,5};
		
		for(int ar:array)
		{
			if(ar%2==0)
			{
				System.out.println(ar+" is even number");
			}
			else
			{
				System.out.println(ar+" is Odd number");
			}
		}
	}

}
