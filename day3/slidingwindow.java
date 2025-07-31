package day3;

public class slidingwindow {

    public static boolean slicingwindow(int[] arr, int k, int target) {
        int sum = 0;
        boolean found = false;

        if (arr.length < k) {
            return false;  // No subarray possible
        }

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum == target) {
            found = true;
            return true;
        }

        // Slide the window over the array
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum == target) {
                found = true;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int target = 8;

        boolean result = slicingwindow(arr, k, target);
        if (result) {
            System.out.println("A subarray with sum " + target + " exists.");
        } else {
            System.out.println("No subarray with sum " + target + ".");
        }
    }
}
