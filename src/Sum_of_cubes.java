import java.util.*;

public class Sum_of_cubes {
	
	public static void main(String args[]) {
	
	System.out.println("Enter a Number:");
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int a=0,b=0;
	long temp=0,result=0;
	while(n>0)
	{
		
		a=n%10;
		b=a;
		temp=b*b*b;
		n=n/10;
		result=result+temp;
	}
	System.out.println("The result is:"+result);
	}
}
