
public class StaticVariable {

	static int ab;
	static int cd=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticVariable.ab);// by default it will store "0" as a value
		System.out.println(cd);
		
		StaticVariable s=new StaticVariable();
		System.out.println(s.cd);
		

	}

}
