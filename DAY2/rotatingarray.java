package DAY2;

import java.util.Arrays;
public class rotatingarray {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int d=2;
        int n=arr.length;
        d=d%n;
        if(d!=0){
            int[] temp=new int[d];
            for(int i=0;i<d;i++){
                temp[i]=arr[n-d+i];
            }
            for(int i=n-1;i>=d;i--){
                arr[i]=arr[i-d];
            }
            for(int i=0;i<d;i++){
                arr[i]=temp[i];
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
