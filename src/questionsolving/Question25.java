package questionsolving;

import java.util.Scanner;

//25- INR Denomination - Description on Graphic
public class Question25 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the amount: ");
	    int amount = scanner.nextInt();

	    // Calculate the number of 500 rupee notes
	    int notes500 = amount / 500;
	    amount %= 500;

	    // Calculate the number of 200 rupee notes
	    int notes200 = amount / 200;
	    amount %= 200;
	    
	    // Calculate the number of 100 rupee notes
	    int notes100 = amount / 100;
	    amount %= 100;

	    // Calculate the number of 50 rupee notes
	    int notes50 = amount / 50;
	    amount %= 50;

	    // Calculate the number of 20 rupee notes
	    int notes20 = amount / 20;
	    amount %= 20;

	    // Calculate the number of 10 rupee notes
	    int notes10 = amount / 10;
	    amount %= 10;
	    
	    // Calculate the number of 5 rupee coins
	    int coins5 = amount / 5;
	    amount %= 5;
	    
	    // Calculate the number of 2 rupee coins
	    int coins2 = amount / 2;
	    amount %= 2;

	    // Calculate the number of 1 rupee coins
	    int coins1 = amount / 1;
	    amount %= 1;
	    
	    // Print the results
	    System.out.println("500 rupee notes: " + notes500);
	    System.out.println("200 rupee notes: " + notes200);
	    System.out.println("100 rupee notes: " + notes100);
	    System.out.println("50 rupee notes: " + notes50);
	    System.out.println("20 rupee notes: " + notes20);
	    System.out.println("10 rupee notes: " + notes10);
	    System.out.println("5 rupee coins: " + coins5);
	    System.out.println("2 rupee coins: " + coins2);
	    System.out.println("1 rupee coins: " + coins1);
	    
	    var totalnotes = notes500+notes200+notes100+notes50+notes20+notes10+coins5+coins2+coins1;
	    System.out.println("Total number of notes & coins required : "+totalnotes);
	    scanner.close();
	}

}


