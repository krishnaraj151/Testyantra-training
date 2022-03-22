package assginment3;
  
import java.util.Scanner;
import java.lang.Math.*;

public class program {
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter the value of A");
        	int a = sc.nextInt();
        	System.out.println("enter the value of B");
        	int b = sc.nextInt();
        	System.out.println("enter the value of c");
        	int c = sc.nextInt();
        	int sum=0;
        	double j;
        	
        	
        	
        	for(int i=0;i<c;i++)
        	{
        		int result = 0;
        		for(j=0;j<=i;j++)
        		{
        			result+=(int)(Math.pow(2,j))*b;
        		}
        		System.out.println(a+result);
        	}
        }
}
