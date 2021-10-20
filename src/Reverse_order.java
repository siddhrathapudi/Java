import java.util.*;
public class Reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter array elements");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		for(int temp=arr.length-1;temp>=0;temp--)
		{
			
			System.out.print(arr[temp]);
		}

	}

}
