
public class ThisKeyword {

	int a;
			int s=8;
	 
	ThisKeyword() //Constructor
	{
		System.out.println(this); //this keyword is used to point to object members
		System.out.println(this.a);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
		new ThisKeyword();
		new ThisKeyword();
		
	}
}
