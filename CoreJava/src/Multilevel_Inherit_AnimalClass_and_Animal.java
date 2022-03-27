
public class Multilevel_Inherit_AnimalClass_and_Animal extends Inherit_AnimalClass{

	
	public void wagTail()
	{
		System.out.println("Baby dog wags its tail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multilevel_Inherit_AnimalClass_and_Animal ob=new Multilevel_Inherit_AnimalClass_and_Animal();
		ob.eat();
		ob.bark();
		ob.wagTail();

	}

}
