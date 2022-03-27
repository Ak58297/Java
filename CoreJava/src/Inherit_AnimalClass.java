
public class Inherit_AnimalClass extends Animal{

	
	public void bark()
	{
		System.out.println("Dog Barks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inherit_AnimalClass ob=new Inherit_AnimalClass();
		ob.eat();
		ob.bark();

	}

}
