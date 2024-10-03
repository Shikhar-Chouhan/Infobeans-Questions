package questionsolving;

import java.util.Scanner;

//21- Accept a year and check if it a leap year or not (google to find out what's a leap year)
public class Question21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year = ");
		int year = scanner.nextInt();
		int leapYear = year%4;
		if (leapYear == 0) {
			System.out.println("It's a leap year.");
		}
		else {
			System.out.println("It's not a leap year.");
		}

	}

}
