package day3;

public class startandendingsubarraysum {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 15;
        int k = 3;

        int[] result = finding(arr, k, target);
        if (result[0] == -1) {
            System.out.println("No subarray of size " + k + " with sum " + target + " found.");
        } else {
            System.out.println("Subarray of size " + k + " with sum " + target + " found between indices: " + result[0] + " and " + result[1]);
        }
    }

    public static int[] finding(int[] arr, int k, int target) {
        int sum = 0;
        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum == target)
            return new int[]{0, k - 1};

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum == target)
                return new int[]{i - k + 1, i};
        }

        // If no such subarray found
        return new int[]{-1, -1};
    }
}
