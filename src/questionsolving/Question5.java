package questionsolving;
//5- Accept the length and width of a rectangle.
//Calculate & print the area and perimeter.
import java.util.Scanner;
public class Question5 {
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
System.out.format("Enter the Length of the Rectangle = ");
float length = sc.nextFloat();
System.out.format("Enter the Width of the Rectangle = ");
float width = sc.nextFloat();
System.out.format("The area of the rectangle is = "+length*width);
System.out.format("\nThe perimeter of the rectangle is = "+2*(length+width));
    }
}
