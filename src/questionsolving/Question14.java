package questionsolving;

import java.util.Scanner;

//14- Accept an integer and check whether it is an even number or odd.
public class Question14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int number = scanner.nextInt();
		if(number%2 == 0) {
			System.out.println("It is an even number.");
		}
		else {
			System.out.println("It is an odd number.");
		}
		
	}

}
