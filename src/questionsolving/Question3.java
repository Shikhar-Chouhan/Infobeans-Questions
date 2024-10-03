package questionsolving;
//3- Accept two integers from user and print the sum
//Ex - The sum of 45 & 12 = 57
import java.util.Scanner;
public class Question3 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Eneter first number = ");
        int a = scanner.nextInt();
        System.out.format("Eneter second number = ");
        int b = scanner.nextInt();
        int c = a+b ;
        System.out.println("The sum of "+a+" & "+b+" = "+c);
    }
}