package questionsolving;
// 8- Write a program to accept temperature in Fahrenheit &
// convert into Celsius. (Look for the formula on internet)
import java.util.Scanner;
public class Question8 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit that you want to convert = ");
        double temperatureInFahrenheit = scanner.nextDouble();
        double calculatedTemperatureInCelsius = (temperatureInFahrenheit - 32) * 5/9;
        System.out.print("The calculated temperature in celsius are = "+calculatedTemperatureInCelsius);
    }
}



