package questionsolving;

import java.util.Scanner;

//26.The International Standard Book Number (ISBN) is a unique numeric book 
//identifier which is printed on every book. 

//The ISBN is based upon a 10-digit code.

//The ISBN is legal if:
//1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 + 6 × digit6 + 
//7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10 is divisible by 11.

//Example : For an ISBN 1401601499
//Sum = 1×1 + 2×4 +3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.

//Write a program to :
//(i) Input the ISBN code as a 10-digit integer.
//(ii) If the ISBN is not a 10-digit integer, output the message, “Illegal ISBN” and terminate the program.
//(iii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.
//      If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11,
//      output the message, “Illegal ISBN”.
      
public class Question26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the 10-digit ISBN code : ");
		long code = scanner.nextLong();
		long temp = code;
		long sum = 0;
		long digit = 0;
		long i = 10;
		
		long length = (long) Math.log10(code) + 1;
		
		if(length!=10) {
			System.out.println("Illegal ISBN code, Please enter the 10-digits code.\nOr \nDon't start the code with 0.");
		}
		
		else if(length==10){
			while(code != 0) {
				digit = code%10;
				sum  = sum + (digit*i);
//				System.out.print(digit+"*"+i+"=");
//				System.out.print(sum+" ");
				code = code/10;
				i--;
			}
//			System.out.println();
		
			 if (sum%11==0) {
			System.out.println(temp+" is a Legal ISBN code.");
			}
		else {
			System.out.println(temp+" is a Illegal ISBN code.");
			}
		}
		scanner.close();
	}

}
