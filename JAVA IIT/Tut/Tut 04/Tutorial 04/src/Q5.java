import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] marks = new double[5][3];

        // Input marks for each student and subject
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Calculate average marks for each student
        System.out.println("Average marks of each student:");
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = sum / 3;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }
}
