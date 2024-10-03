package questionsolving;

import java.util.Scanner;

//27- Accept an english alphabet from user and check if it is a consonent or a vowel;
public class Question27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the english alphabet : ");
		char alphabet = scanner.next().charAt(0);
		
		if(alphabet=='a' || alphabet=='A' || alphabet=='e' || alphabet=='E' || alphabet=='i' ||
			alphabet=='I' || alphabet=='o' || alphabet=='O' || alphabet=='u' || alphabet=='U') {
			System.out.println(alphabet+" is  a vowel.");
		}
		else {
			System.out.println(alphabet+" is a consonent.");
		}
		
		scanner.close();
	}

}
