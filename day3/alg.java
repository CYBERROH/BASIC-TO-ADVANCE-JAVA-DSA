package day3;



public class alg {
    public static int findi(int[] a,int target){
        int n=a.length;
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=low+(high - low)/2;
            if(a[mid]==target){
                return mid;
            }
        else if(a[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }      
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a={3,5,7,9,11,13,15,17};
        int target=15;
        int index=findi(a,target);
        System.out.println("target found at index :"+index);
    } 
}
