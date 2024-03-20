public class Q6 {
    public static void main(String[] args) {
        int[] runs = {5, 12, 28, 34, 47, 52, 65, 71, 80, 99};
        int target = 47;

        int matchNumber = binarySearch(runs, target);

        if (matchNumber != -1) {
            System.out.println("Batsman scored 47 runs in match " + (matchNumber + 1));
        } else {
            System.out.println("Batsman did not score 47 runs in any match.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
