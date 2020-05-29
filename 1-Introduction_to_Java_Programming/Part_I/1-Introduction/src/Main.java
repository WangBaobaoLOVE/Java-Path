import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Java!");

        System.out.println("Programming is fun!");
        System.out.println("Fundamentals First");
        System.out.println("Problem Driven");

        System.out.println((10.5 + 2 * 3) / (45 - 3.5));

        JOptionPane.showMessageDialog(null,"Welcome to Java!");

        JOptionPane.showMessageDialog(null,
                "Welcome to Java!",
                "Display Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
