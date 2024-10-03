package questionsolving;

import java.util.Scanner;

//16- Accept the parameters and calculate the Compound Interest
//& print it on STDOUT (Use Math class methods)
public class Question16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Principal amount = ");
		double principal = scanner.nextDouble();
		System.out.print("Enter the rate(In Percentage) = ");
		double rate = scanner.nextDouble();
		System.out.print("Enter the time(In Years Only) = ");
		double time = scanner.nextDouble();

		double Amount = principal *
					(Math.pow((1 + rate / 100), time));
				
		double CI = Amount - principal;
				
		System.out.println("Compound Interest is "+ CI);
			

	}

}
