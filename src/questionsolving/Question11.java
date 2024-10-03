package questionsolving;
// 11- Accept two numbers and print the greatest between them
import java.util.Scanner;
public class Question11 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First number = ");
        long firstNumber = scanner.nextLong();
        System.out.print("Enter the Second number = ");
        long secondNumber = scanner.nextLong();
        if(firstNumber>secondNumber)
        {
        System.out.print(firstNumber+" is greatest.");
        }
        else if (firstNumber==secondNumber)
        {
            System.out.println("Both numbers are equal.");
        }
else{
    System.out.print(secondNumber+" is greatest.");
}
    }
}
