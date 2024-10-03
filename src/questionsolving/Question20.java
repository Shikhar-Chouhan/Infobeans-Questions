package questionsolving;

import java.util.Scanner;

//20- Accept three numbers and print the greatest among them
public class Question20 {
       public static void main(String args[]) {
    	   Scanner scanner = new Scanner(System.in);
    	   System.out.print("Enter the first number = ");
    	   int first = scanner.nextInt();
    	   System.out.print("Enter the second number = ");
    	   int second = scanner.nextInt();
    	   System.out.print("Enter the third number = ");
    	   int third = scanner.nextInt();
    	   
    	   if(first>second && first>third) {
    		   System.out.println(first);
    	   }
    	   else if(second>third&& second>first) {
    		   System.out.println(second);
    	   }
    	   else if(third>second && third>first) {
    		   System.out.println(third);
    	   }
    	   else {
    		   System.out.println("All numbers are equal.");
    	   }
    	   
    	   scanner.close();
       }
}
