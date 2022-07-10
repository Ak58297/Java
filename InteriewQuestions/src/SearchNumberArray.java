
public class SearchNumberArray {

	public static void main(String[] args) {

		
		int a[]=new int[] {1,3,2,4,5,7,8,90,100};
		int n=90;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Searched number : "+a[i]);
				System.out.println("Searched number is present at index : "+(i+1));
				break;
			
			}
		}
		
	}

}
