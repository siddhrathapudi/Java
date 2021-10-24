package Lab3;

import java.util.*;

public class TokenizerDemo {

	public static void main(String[] args) {
		int num;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		String str  = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			num = Integer.parseInt(temp);
			System.out.println(num);
			total = total + num;
		}
		System.out.println("sum of the integers is: " + total);
		scan.close();
		}
	}


