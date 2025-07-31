package DAY2;

//import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args) {
        //int arr[]={10,12,14,7,8};
        int arr[]={4,6};
        int n=arr.length;
        int max=1,cu=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0) ){
               
            cu++;
            max=Math.max(max,cu);
            }
            else{
                cu=1;
            }
        }
            System.out.println(max);
    }
}
