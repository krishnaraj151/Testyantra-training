package upcasting;

public class Admin extends User {

	public Admin(String name, long number) {
		super(name, number);
	
	}
	
	public void adduser(String name)
	{
		System.out.println(name+ " is added");
	}
	
	
	public void removeuser(String name)
	{
		System.out.println(name+ "  is removed");
	}

	
}
