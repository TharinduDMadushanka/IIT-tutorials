public class Q4 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6, 7, 8, 9};

        // Task a) Find even numbers in set A
        System.out.println("Even numbers in set A:");
        for (int num : A) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line for clarity

        // Task b) Find numbers that, when multiplied by 2, give a number that is also in set A
        System.out.println("Numbers in set A that, when multiplied by 2, give a number in set A:");
        for (int num : A) {
            if (contains(A, num * 2)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line for clarity
    }

    // Helper method to check if an array contains a specific number
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
