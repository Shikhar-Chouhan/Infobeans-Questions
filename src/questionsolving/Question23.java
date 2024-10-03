package questionsolving;

import java.util.Scanner;

//23- Shop discount - Description on Graphic
public class Question23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("SHOP DISCOUNT CALCULATOR :-");
		System.out.print("Enter the Marked Price of Product = ");
		double markedPrice = scanner.nextDouble();
		System.out.print("Enter the Selling price of Product = ");
		double sellingPrice = scanner.nextDouble();
		double discountAmount = markedPrice - sellingPrice;
		double discountPercentage = (discountAmount/markedPrice)*100;
		System.out.println("The Discount Amount on this Product is : "+discountAmount);
		System.out.printf("The Discount Percentage on this Product is : %.2f",discountPercentage);
		System.out.println("%");
		scanner.close();
	}

}
