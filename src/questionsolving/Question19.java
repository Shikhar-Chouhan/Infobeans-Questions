package questionsolving;

//19- Accept a day number between 1-7 and print the corresponding dayname.
import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of day between 1 to 7 = ");
		int day = scanner.nextInt();
		
		switch (day) {
		case 1 -> System.out.print("Monday");
		case 2 -> System.out.print("Tuesday");
		case 3 -> System.out.print("Wednesday");
		case 4 -> System.out.print("Thursday");
		case 5 -> System.out.print("Friday");
		case 6 -> System.out.print("Saturday");
		case 7 -> System.out.print("Sunday");
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + day);
		}
		
	}

}
