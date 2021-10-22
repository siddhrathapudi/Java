package Lab2;

import java.util.Arrays;

public class Array_string {

	public static void main(String[] args) {
		
		String [] stringArray = {"PS", "Sh", "v", "tree", "9", "mul", "this10"};
	    sortString(stringArray);

	}

	public static void sortString(String[] sArr)
	{
	    Arrays.sort(sArr);
	    System.out.println(Arrays.toString(sArr));
	}
}