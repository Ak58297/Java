
public class RemoveJunkFromString {
	String s = "khj!fdskjfsadfh$fywefui6#@klfjsdf";

	public static void main(String[] args) {

		String s = "khj!fdskjfsadfh$fywefui6#@klfjsdf";
		String str=s.replaceAll("[^a-zA-Z0-9]"," ");
		
		System.out.println(str.replace(" ", ""));
		
		
//		char ss[]=s.toCharArray();
////		for (int i = 0; i < s.length(); i++) {
////			System.out.print(" " + s.charAt(i));
////		}
//		char[] specialCharacter= {'!','@','#','$','%','^','&','*','(',')'};

//		
//		for(int i=0;i<specialCharacter.length;i++)
//		{
//			for(int j=0;j<s.length();j++)
//			{
//				if(s.charAt(j)==specialCharacter[i])
//				{
//					System.out.print( specialCharacter[i]+"");
//				}
//			}
//		}
//		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=0;j<specialCharacter.length;j++)
//			{
//				if(ss[i]==specialCharacter[j])
//				{
//					System.out.println(ss[i]);
//					RemoveJunkFromString.s.replaceFirst(0, 0);
//				}
//			}
//		}
		
		
		
		
	}

}
