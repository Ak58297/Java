
public class Encapsulation1 {

	 private String Name;
	private int EmpID;
	private int Account_number;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		this.Name=name;
	}
	
	public int getEmpID()
	{
		return EmpID;
	}
	public void setEmpID(int ID)
	{
		this.EmpID=ID;
	}
	
	public int getAcoountNumber()
	{
		return Account_number ;
	}
	public void setAccount_number(int Account_num)
	{
		this.Account_number=Account_num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation1 obj=new Encapsulation1();
		
		obj.setName("Name");
		obj.setEmpID(1815553);
		obj.setAccount_number(12345);
		
		System.out.println(obj.getName());
		
		System.out.println(obj.getEmpID());
		System.out.println(obj.getAcoountNumber());

	}

}
