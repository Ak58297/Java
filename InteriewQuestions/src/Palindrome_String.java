
public class Palindrome_String {
	public void CheckPalindrome(String GivenString)
	{
		String rev="";
		
		for(int i=GivenString.length()-1;i>=0;i--)
		{
			rev=rev+GivenString.charAt(i);
		}
		
		System.out.println("Reversed String : "+rev);
		
		
		
		if(rev.equals(GivenString))
		{
			System.out.println("It is a palindrome String");
		}
		else
		{
			System.out.println("Not a palindrome String");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Palindrome_String p=new Palindrome_String();
p.CheckPalindrome("AbhihbA");

	}

}
