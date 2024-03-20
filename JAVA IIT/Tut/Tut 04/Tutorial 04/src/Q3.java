import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of doubles with length 10
        double[] array = new double[10];

        // Fill the array with double values
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for position " + i + ": ");
            array[i] = scanner.nextDouble();
        }

        // Prompt the user to input two indices i and j
        System.out.print("Enter the index i: ");
        int i = scanner.nextInt();
        System.out.print("Enter the index j: ");
        int j = scanner.nextInt();

        // Check if i and j are valid indices
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            // Swap values at positions i and j
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            // Print the contents of the array
            System.out.println("Array contents after swapping:");
            for (double value : array) {
                System.out.println(value);
            }
        } else {
            System.out.println("Invalid indices provided. They must be between 0 and 9 (inclusive).");
        }
    }
}
