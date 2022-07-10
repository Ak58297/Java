
public class DuplicateElementInArray {

	public static void main(String[] args) {

		int a[]=new int[] {1,2,2,2,3,5,6,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate Element : "+a[j]);
					
				}
			}
		}
		
	}

}
