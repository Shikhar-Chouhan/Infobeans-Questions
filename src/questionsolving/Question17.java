package questionsolving;

import java.util.Scanner;

//17- Accept the three sides of triangle and calculate the area using herons formula
public class Question17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first side of triangle = ");
		double firstSide = scanner.nextDouble();
		System.out.print("Enter the second side of triangle = ");
		double secondSide = scanner.nextDouble();
		System.out.print("Enter the third side of triangle = ");
		double thirdSide = scanner.nextDouble();
		
		double semiperimeter = (firstSide+secondSide+thirdSide)/2;
		System.out.println("Semiperimeter of triangle is = "+semiperimeter);
		
		double areaOfTriangle = Math.sqrt(semiperimeter*(semiperimeter-firstSide)
				*(semiperimeter-secondSide)*(semiperimeter-thirdSide));
		System.out.print("The area of the triangle using herons formula is = "+areaOfTriangle);
		
		scanner.close();
	}

}
