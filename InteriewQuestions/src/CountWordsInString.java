
public class CountWordsInString {

	public int countWordsInaString(String sentence)
	{
		String s[]=sentence.split("\\s");
		return s.length;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountWordsInString cw=new CountWordsInString();
		System.out.println(cw.countWordsInaString("count the number of words present in this sentence"));
		
		
	}

}
