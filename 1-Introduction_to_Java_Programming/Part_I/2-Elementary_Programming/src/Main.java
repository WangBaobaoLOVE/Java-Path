import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // radius is now 20
        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
         */

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("北京时间： " + (currentHour+8) + ":"
                + currentMinute + ":" + currentSecond);

        JOptionPane.showInputDialog(null,
                "Enter an input",
                "Input Dialog Demo",
                JOptionPane.QUESTION_MESSAGE);

        // Enter annual interest rate
        String annualInterestRateString = JOptionPane.showInputDialog(
                "Enter annual interest rate, for example, 8.25:");

        // Convert string to double
        double annualInterestRate =
                Double.parseDouble(annualInterestRateString);

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog(
                "Enter number of years as an integer, for example, 5:");

        // Convert string to int
        int numberOfYears = Integer.parseInt(numberOfYearsString);

        // Enter loan amount
        String loanString = JOptionPane.showInputDialog(
                "Enter loan amount, for example, 120000.95:");

        // Convert string to double
        double loanAmount = Double.parseDouble(loanString);

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Format to keep two digits after the decimal point
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;

        // Display results
        String output = "The monthly payment is $" + monthlyPayment +"\nThe total payment is $" + totalPayment;
        JOptionPane.showMessageDialog(null, output);
    }
}
