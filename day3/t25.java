package day3;

public class t25 {
    public static int jumpsearch(int[] a,int target){
        int n=a.length;
        int step=(int)Math.sqrt(n);
        int prev=0;
        while(step<n && a[step-1]<target){
            prev=step;
            step+=(int)Math.sqrt(n);
        }
        for(int i=prev;i<Math.min(step,n);i++){
            if(a[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a={1,3,5,7,9,11,13,15,17,19};
       
        int target = 5;
        System.out.println(jumpsearch(a,target));
         
        
    }
}
