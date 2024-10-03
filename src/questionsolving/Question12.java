package questionsolving;
// 12- Accept the gender from the user as char and print the respective greeting message
//      Ex - Good Morning Sir (on the basis of gender)
import java.util.Scanner;
public class Question12 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Gender = ");
        char gender = scanner.next().charAt(0);
        if (gender == 'm'|| gender == 'M') 
        {
        	System.out.println("Good Morning Sir.");
        }
        else if (gender == 'f'|| gender == 'F') 
        {
        	System.out.println("Good Morning Maam.");
        }
        
    }
}
 