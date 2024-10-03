package questionsolving;
//34- Factorial of a number

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number you want to know whose factorial : ");
		int number = scanner.nextInt();
		int n1 = 1,n2 = 1;
		int factorial = 0;
		for(int i=1;i<=number;i++) {
			factorial = n1 * n2;
			n1 = factorial;
			n2++;
		}
		System.out.println("Factorial of "+number+" is = "+factorial);
		
		scanner.close();
	}

}
