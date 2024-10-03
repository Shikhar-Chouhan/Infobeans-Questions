package questionsolving;
//4- Accept the User's name, age and print in following manner
//Ex - Hello Shery, you are 12 years old.
import java.util.Scanner;
public class Question4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.format( "Enter the name of the User = ");
        String name = sc.nextLine();
        System.out.format("Enter the age of the User = ");
        int age = sc.nextInt();
        System.out.println("Hello "+name+", You are "+age+" years old.");
    }
}
