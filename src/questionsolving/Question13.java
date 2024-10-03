package questionsolving;
import java.util.Scanner;
//13- Extend the previous program and handle the wrong inputs.
// Print Good Morning sir for input m or M & Good morning Maam for input F or f 
//  else print Wrong Input
public class Question13 {
	public static void main(String[] args) {
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
	        
	        else {
	        	System.out.println("Wrong Input,Enter the correct Gender.");
	        }
	}

}
