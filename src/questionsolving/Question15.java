package questionsolving;

import java.util.Scanner;

//15- Accept name and age from the user. Check if the user is a valid voter or not.
//Vaid - Hello Shery, You are a valid voter.
//Invalid - Sorry Shery, you can't cast the vote.
//Part 2 - Print after how many years the user will be eligible
public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Name = ");
		String name = scanner.nextLine();
		System.out.print("Enter your age = ");
		int age = scanner.nextInt();
		int eligibleAge = 18 - age;
		if (age >= 18) {
			System.out.println("Hello "+name+", You are a valid voter.");
		}
		else if (age < 18) {
			System.out.println("Sorry "+name+", you can't cast the vote.");
				System.out.println("After "+ eligibleAge +" years you are eligible for the voting.");
			
		}
	}

}
