
public class ReverseWordsInAstring {

	public static void main(String[] args) {

		String name="My name is Abhishek";
		System.out.println("Before Reversing = "+name);
		String reversed="";
		
		String splitted[]=name.split(" ");
		
		for(String s:splitted)
		{
			System.out.println(s);
		}
		
		for(int i=splitted.length-1;i>=0;i--)
		{
			reversed=reversed+splitted[i]+" ";
		}
		System.out.println("After reversing = "+reversed);
		//System.out.println(reversed.substring(0,reversed.length() - 1));
		
	}

}
