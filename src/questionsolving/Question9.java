package questionsolving;
// 9- Accept the Principle amount, time & rate of interest and calculate the Simple Interest
import java.util.Scanner;
public class Question9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of Principle in Rupees = ");
        double principleAmount = scanner.nextDouble();
        System.out.print("Enter the Time in years = ");
        double time = scanner.nextDouble();
        System.out.print("Enter the rate of interest in % = ");
        double rateOfInterest = scanner.nextDouble();
        double calculatedRateOfInterest = rateOfInterest/100;
        double simpleInterest = principleAmount*calculatedRateOfInterest*time;
        System.out.print("The calculated Simple Interest is "+simpleInterest);
    }
}
