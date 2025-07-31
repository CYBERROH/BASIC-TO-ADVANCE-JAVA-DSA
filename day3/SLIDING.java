package day3;




public class SLIDING {
    public static void main(String[] args) {
        int[] nums={2,1,5,1,3,2};
        int k=3;
        int maxsum=findmaxsubarr(nums,k);
        System.out.println("Maximum sum of a subarray " + k + " is: " +maxsum);
    
    }
    public static int findmaxsubarr(int[] nums,int k){
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
            
        }
        return maxsum;
    }
}
