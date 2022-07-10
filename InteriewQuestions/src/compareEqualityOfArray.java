import java.util.Arrays;

public class compareEqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]=new int[] {2,1,4,3,5};
		int arr2[]=new int[] {5,3,4,6,1};
		
		//Lengths of two array
		int length1=arr1.length;
		int length2=arr2.length;
		
		//Sort Array1
		int temp=0;
		for(int i = 0;i<length1;i++)
		{
			for(int j=i+1;j<length1;j++)
			{
				if(arr1[j]<arr1[i])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			System.out.print(" "+arr1[i]);
		}
		
		System.out.print("\n");
		//Sort Array2
				int temp1=0;
				for(int i = 0;i<length1;i++)
				{
					for(int j=i+1;j<length1;j++)
					{
						if(arr2[j]<arr2[i])
						{
							temp1=arr2[i];
							arr2[i]=arr2[j];
							arr2[j]=temp1;
						}
					}
					System.out.print(" "+arr2[i]);
				}
				
		
				
				//Array equality
				System.out.println("\n"+Arrays.equals(arr1, arr2));
				
		
		
	}

}
