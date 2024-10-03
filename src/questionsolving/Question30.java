package questionsolving;

import java.util.Scanner;

//30- Print natural number up to n.
public class Question30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("The natural numbers are as follows :");
		for(int i=1;i<=number;i++) {
			System.out.print(i+",");
		}
		
		scanner.close();
	}

}
