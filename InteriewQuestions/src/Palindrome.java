
public class Palindrome {
	public void CheckPalindrome(int number)
	{
		Integer n=Integer.valueOf(number);
		String s=n.toString();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reversed nuber : "+rev);
		
		
		
		if(rev.equals(s))
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Palindrome p=new Palindrome();
p.CheckPalindrome(12321);

	}

}
