package questionsolving;

import java.util.Scanner;

//33- Sum up to n terms.
public class Question33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int sum = 0;
		int n1 = 0;
		int n2 = 1;
		int number = scanner.nextInt();
		for(int i=1;i<=number;i++) {
			sum = n1 + n2;
			n1 = sum;
			n2++;
		}
		System.out.println("The sum of all numbers between 0 to "+number+" is = "+sum);
		scanner.close();
	}

}
