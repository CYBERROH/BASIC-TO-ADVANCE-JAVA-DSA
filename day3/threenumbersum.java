package day3;

public class threenumbersum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int target = 24;
        
        boolean found = false;
        int sum = 0;
        int startIndex = -1;
        
        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if (sum == target) {
            found = true;
            startIndex = 0;
        }
        
        // Sliding window through array
        for (int i = k; i < arr.length && !found; i++) {
            sum += arr[i] - arr[i - k];
            
            if (sum == target) {
                found = true;
                startIndex = i - k + 1;
                break;
            }
        }
        
        if (found) {
            System.out.println("A subarray with sum " + target + " exists from index " 
                + startIndex + " to " + (startIndex + k - 1) + ".");
        } else {
            System.out.println("No subarray with sum " + target + ".");
        }
    }
}
