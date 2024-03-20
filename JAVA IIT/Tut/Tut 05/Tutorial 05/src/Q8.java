public class Q8 {
    public static void main(String[] args) {

        int number = 5; // Change this to any number you want

        long factorial = findFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to find factorial using recursion
    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
