//java program for traffic lights 
import java.util.*;
public class Traffic_lights {

public static void main(String args[])

{
	
	
	System.out.println("Enter 1 for Red light\n"
					 +	"Enter 2 for Orange Light\n"
			         +"Enter 3 for Green Light");
	
	System.out.println("Enter Your Choice:");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	Signal obj=new Signal();
	obj.mysignal(input);
	
}
	
}

class Signal
{

	public static void mysignal(int myinput)
	{
		
		int n=myinput;
		switch(n)
		{
		case 1:
			System.out.println("STOP..!!!");
			break;
		case 2:
			System.out.println("READY..");
			break;
			
		case 3:
			System.out.println("Go...!!!");
			break;
			
		default:
			System.out.println("Enter valid input..");
			
		
		}
		
		
	}
	
}

