import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base nb: ");
        int baseNb = input.nextInt();

        System.out.println("Enter a exponent nb: ");
        int expo = input.nextInt();

        int result = exponent(baseNb, expo);
        System.out.println(result);
    }

    public static int exponent(int baseNb, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return baseNb;
        } else {
            return baseNb * exponent(baseNb, exponent - 1);
        }

    }
}
