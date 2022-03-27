
public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		System.out.println("Enter all the elements in an array");
		try {
			String[] arr= {"a","d","o"};
			  //ArrayIndexOutOfBoundsException
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Eneter a value within a array length-1");
		}

		System.out.println("This will execute after hading the execption");
	}

}
