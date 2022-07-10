import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccuranceInString {

	public static void main(String[] args) {

		String s = "kjfaksaaskjdfjsdfdsdsaaa";

		// find number of occurrence of alphabet a
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("No of times a is present : " + count);

//  number of count of each character in a string

		char ch[] = s.toCharArray();
		
		
		Map<Character,Integer> hmap=new HashMap<Character, Integer>();
		
		for (char character: ch)
		{
			if(hmap.containsKey(character))
			{
				hmap.put(character, hmap.get(character)+1);
			}
			else
			{
				hmap.put(character, 1);
			}
		}
		System.out.println(s+" "+hmap);
		
	}

}
