package day4;


//package day4;
public class Day44{
    public static void bublesort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;i++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
         int a[] ={5,3,8,4,2};
         bublesort(a);
         for(int num:a)
             System.out.println(num + "");
    }
    
}
