import java.util.*;
public class Natural_Numbers 
{
		public static void main(String args[])
	{
		String  primeNumbers = "";
		System.out.println("Enter a number..");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for (int i = 1; i <= input; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(int num =i; num>=1; num--)
	         {
	        	 if(i%num==0 )
	        	 {
	        		 if( i/3==0 ||i/5==0)
	        		 {
	        		 counter+=1;
	        		 }
	        	 }
	         }
	         
	         if(counter==2 )
    		 {
	        	 
	        		 counter = counter + 1;
	        		 primeNumbers = primeNumbers + i + " ";
	        	 
    		 }
	      }
		System.out.print(primeNumbers);
}
}