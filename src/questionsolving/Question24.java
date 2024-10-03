package questionsolving;

import java.util.Scanner;

//24- Bijli Bill - Description on Graphic
public class Question24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the units of your bijli bill: ");
		float units = scanner.nextFloat();
		
		if (units<=100) {
			System.out.println("You have to pay "+units*10+" Rupees.");
		}
		else if(units<=200) {
			System.out.println("You have to pay "+((100*10)+(units-100)*15)+" Rupees.");
		}
		
		else if(units<=300) {
			System.out.println("You have to pay "+((100*10)+(100*15)+(units-200)*20)+" Rupees.");
		}
		else if(units>300) {
			System.out.println("You have to pay "+((100*10)+(100*15)+(100*20)+(units-300)*25)+" Rupees.");
		}
			
		scanner.close();
	}

}
 