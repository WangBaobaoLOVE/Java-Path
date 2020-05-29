public class Main {

    public static void main(String[] args) {
	// write your code here
        double radius=5; // Declare radius
        double area; // Declare area

        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }

        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is "
                + (int)(interest * 100) / 100.0);

        System.out.printf("Interest is %4.2f", interest);
    }
}
