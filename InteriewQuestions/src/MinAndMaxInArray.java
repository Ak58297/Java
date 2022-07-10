
public class MinAndMaxInArray {

	public static void main(String[] args) {
		
		
		int arr[]=new int[] {12,2,3,5,1,6,8,9};
//		method 2
		
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println("Minimm value : "+min);
			
			int max=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.println("Maximum value : "+max);
			

		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[j]<arr[i])
				{
					int t =arr[i];
					arr[i]=arr[j];
					arr[j]=t;
							
				}
			}
		}
		System.out.print("Minimum value after sorting : "+arr[0]);
		
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int t =arr[j];
					arr[j]=arr[i];
					arr[i]=t;
							
				}
			}
		}
		System.out.print("\n"+"Maxmium value after sorting : "+arr[arr.length-1]);
		
		
		
		
		
	
	}

}
