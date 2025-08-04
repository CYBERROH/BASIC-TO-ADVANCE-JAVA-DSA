
package day7;


import java.util.*;

public class window {
    public static int[] slidingwindows(int[] nums, int k){
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        int[] result=new int[n-k+1];
        for(int i=0;i<n;i++){
            maxHeap.offer(nums[i]);
            if(i>=k-1){
                result[i-k+1]=maxHeap.peek();
                maxHeap.remove(nums[i-k+1]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       int[] nums={1,3,-1,-3,5,3,6,7};
       int k=3;
       int[] result=slidingwindows(nums,k);
        System.out.println(Arrays.toString(result));
        

        //63/8q
        
    }
    
}
