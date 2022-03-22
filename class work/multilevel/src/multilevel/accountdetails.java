package multilevel;

public class accountdetails extends savings {
	
	
	int deposit,withdrawal;
	public accountdetails(String a,int b, int c,int d,int e,int f)
	{
		super(a, b, c, d);
		deposit=e;
		withdrawal=f;
	}

}
