package questionsolving;
// 7- Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ), 
//     Write a program to calculate his total marks and percentage marks.
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.print("Enter marks in Maths (out of 100): ");
        double mathsMarks = scanner.nextDouble();

        System.out.print("Enter marks in Computer (out of 100): ");
        double computerMarks = scanner.nextDouble();

        System.out.print("Enter marks in English (out of 100): ");
        double englishMarks = scanner.nextDouble();

        // Calculate total marks
        double totalMarks = mathsMarks + computerMarks + englishMarks;

        // Calculate percentage
        double percentage = (totalMarks / 300.0) * 100.0;

        // Display total marks and percentage
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentage + "%");

        scanner.close();
    
}

}
