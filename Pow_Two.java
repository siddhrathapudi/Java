import java.util.Scanner;

public class Pow_Two {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter a number: ");
		int n = scn.nextInt();

		// invoking the method
		if (checkNumber(n))
			System.out.println(n + " is a power of 2");
		else {
			System.out.println(n + " is not a power of 2");
		}

	}

	// method to check a number is power of 2 or not.

	static boolean checkNumber(int n) {

		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

}