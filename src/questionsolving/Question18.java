package questionsolving;

import java.util.Scanner;

//18- Accept the value of a, b, c - The values in a quadratic equation and find its roots.
public class Question18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the values of a, b, and c for the quadratic equation (ax^2 + bx + c = 0):");
                System.out.print("a: ");
                double a = scanner.nextDouble();

                System.out.print("b: ");
                double b = scanner.nextDouble();

                System.out.print("c: ");
                double c = scanner.nextDouble();
		
                double discriminant = b * b - (4 * a * c);

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("Two real roots: root1 = " + root1 + ", root2 = " + root2);
                } 
                else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    System.out.println("One real root: root = " + root);
                }
                else {
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                    System.out.println("Complex roots: root1 = " + realPart + " + " + imaginaryPart + "i, root2 = " + realPart + " - " + imaginaryPart + "i");
                }
           

                scanner.close();
	}

}