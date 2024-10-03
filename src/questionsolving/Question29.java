package questionsolving;

import java.util.Scanner;

//29- Accept an integer and Print hello world n times
public class Question29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		int i=1;
		
//		while (i<=number) {
//			System.out.println("Shikhar Chouhan = "+i);
//			i++;
//		}
		
		do {
			System.out.println("Shikhar Chouhan = "+i);
			i++;
		} while (i<=number);
		
		scanner.close();
	}

}
