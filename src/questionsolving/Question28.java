package questionsolving;

import java.util.Scanner;

//28- Accept two numbers from user and swap their values
//Part 2 - Swap without using third variable
public class Question28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.println("Before swapping : a = "+a+" ,b = "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swapping : a = "+a+" ,b = "+b);
		
		 a = a + b;
	     b = a - b;
	     a = a - b;
	     System.out.println("After swapping again : a = "+a+" ,b = "+b);
		
		
		scanner.close();
	}

}
