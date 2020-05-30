import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }


        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values

        m(x, y); // Invoke m with arguments x and y

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);

        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));

        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});

        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4); // Returns 1
        int j = linearSearch(list, -4); // Returns -1
        int k = linearSearch(list, -3); // Returns 5

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 5555; // Assign a new value to numbers[0]
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1;
             i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }

    public static void printMax( double... numbers ) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
            result = numbers[i];

        System.out.println("The max value is " + result);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
        return -1;
        }
}
