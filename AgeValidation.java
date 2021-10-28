package Lab5;

import java.util.Scanner;

public class AgeValidation {
	
	static Scanner scn;

	public static void main(String[] args) {
		
		checkAge();

	}
	
	//for checking a age is valid or not
	public static void checkAge() {
		
		
		scn= new Scanner(System.in);
		System.out.println("The Age of the Person Should be Above 15 ");
		System.out.println("Enter valid age: ");
		
		//asking for user input
		int age= scn.nextInt();
		
		try {
			
			//logic of check the age
			if(age<=0) {
				throw new InvalidNumberException("Invalid!!");
			}
			else if (age<15) {
				throw new InvalidAgeException("The age is not above 15");
			}
			else {
				System.out.println("The age is Above 15");
			}
			
		} catch (InvalidAgeException iage) {
			
			System.out.println("Below 15");	
		}
		catch (InvalidNumberException in) {
			System.out.println("Please give greater than 0");
			}	
	}

}