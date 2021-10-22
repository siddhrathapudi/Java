import java.util.*;
public class ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc; // declaration -
		
				try {
				ExceptionalHandling e = new ExceptionalHandling();
				
				System.out.println(e.sc);  // null
				
				
				// Instantiating
				e.sc = new Scanner(System.in);
				System.out.println(5/0);  // ArithmeticException
				
				// calling method
				System.out.println(e.div());
				
				int[] x = new int[5];
				x[0]=1;
				x[1]=2;
				x[2]=3;
				x[4]=5;  //ArrayIndexOutOfBoundException
				
				String str = "Hello World";
				System.out.println(str.charAt(10));  // StringIndexOutOfBoundException
				
				
				// byte values = -128 to 127
				byte y = (byte)10.45f;
				System.out.println(y);
				
				} catch(Exception e) {
					e.printStackTrace();
				}
				//File ff = new File("C:\\temp");
				try {
					BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} 
				
			}
			
			int div() { ;// non static area - can access both static & non static members
				//Scanner sc = new Scanner(System.in); // option1
				System.out.println("Enter first number: ");
				int num1 = sc.nextInt();
				System.out.println("Enter second number");
				int num2 = sc.nextInt();
				int result= num1/num2;
				//System.out.println(result);
				return result;
			}

		}
	}

}
