package child;

public class child extends parent{

	
	int z;
	int a;
	int b;
	int c;
	int d;
	
	public child(int x,int y, int z) {
		super(x,y);
		this.z=z;
	}

	
	public child(int x, int y, int z, int a, int b) {
		this(x,y,z);
			this.a= a;
			this.b = b;
		}
	
	public child(int x, int y, int z, int a, int b, int c, int d) {
	this(x,y,z,a,b);
		this.c = c;
		this.d = d;
	}
	
	
}
