import java.util.Scanner;

public class Increasing_Num {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scn.nextInt();

		// invoking of method
		if (checkNumber(number))
			System.out.println(" Increasing number");
		else {
			System.out.println(" Not an increasing number");
		}

		// Closing of resource
		scn.close();

	}

	// method to check a number is in increasing order
	static boolean checkNumber(int number) {

		int lastDigit = number % 10;
		number /= 10;
		boolean flag = false;

		while (number > 0) {
			if (lastDigit <= number % 10) {
				flag = true;
				break;
			}

			lastDigit = number % 10;
			number /= 10;

		}
		if (flag)
			return false;
		else {
			return true;
		}

	}

}