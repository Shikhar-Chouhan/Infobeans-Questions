package questionsolving;

import java.util.Scanner;

//32- Take a number as input and print its table
//5 * 1 = 5
//5 * 2 = 10 ... up to 10 terms
public class Question32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
		
		scanner.close();
	}

}
