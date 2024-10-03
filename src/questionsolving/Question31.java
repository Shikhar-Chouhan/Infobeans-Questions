package questionsolving;

import java.util.Scanner;

//31- Reverse for loop. Print n to 1.
public class Question31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		
		for(int i=number;i>=1;i--) {
			System.out.println(i);
		}
		scanner.close();
	}

}
