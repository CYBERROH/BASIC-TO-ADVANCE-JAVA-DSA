package day3;




public class t24 {
    public static int printn(int n){
        int start=1,end=n,ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<=n){
                start =mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args){
        int x1=5;
        System.out.println(printn(x1));
    }
    
}
