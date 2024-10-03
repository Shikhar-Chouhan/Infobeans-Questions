package questionsolving;

// 10- Take 3 int inputs from user and check and print the result.
// 	all are equal
// 	any of two are equal
// 	( use && || )
import java.util.Scanner;

public class Question_10 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First Number = ");
		int firstNo = scanner.nextInt();
		System.out.print("Enter the Second Number = ");
		int secondNo = scanner.nextInt();
		System.out.print("Enter the Third Number = ");
		int thirdNo = scanner.nextInt();
		if (firstNo == secondNo && secondNo == thirdNo && firstNo == thirdNo) {
			System.out.println("All numbers are equals");
		} else if (firstNo == secondNo || secondNo == thirdNo || firstNo == thirdNo) {
			System.out.println("Any two numbers are equal");
		} else {
			System.out.println("Not any numbers are equal");
		}
	}
}
