package Lab3;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		getImage(str);
		System.out.println("Reverse of the String is:" +getImage(str));
		scan.close();
	}
	public static String getImage(String str) {
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){
			rev+=ch[i];
		}
	return rev;
	}

}
