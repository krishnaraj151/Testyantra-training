package phone;

public class smartphone extends phone {
	

	String brand;
	double camera;
	int cameracount;
	
	public smartphone(int price ,int  ram)
	{
		super(price , ram);
	
	
		System.out.println("from smart phone that is sub class");
	}
	
	
	public void play() {
	
		System.out.println("play with friends");
	}
	
	
	public void selfie()
	{
		System.out.println(" with friends");
	}
	

}
