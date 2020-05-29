import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!");
            count++;
        }

        int data;
        int sum = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        }while(data != 0);

        System.out.println("The sum is " + sum);

        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("Welcome to Java!");
        }
    }
}
