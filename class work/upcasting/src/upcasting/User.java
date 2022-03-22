package upcasting;

public class User {
	
	String name;
	long number;
	public User(String name,long number) {
		this.name=name;
		this.number = number;
		
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public void chat()
	{
		System.out.println(name+ " is chat");
	}
    
	public void videocall() {
		System.out.println(name + " is videocall");
	}
	
	public void share()
	{
		System.out.println(name+ " is share");
	}
}
