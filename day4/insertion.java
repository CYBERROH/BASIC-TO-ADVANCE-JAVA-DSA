package day4;




public class insertion {
    public static void insertionsort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i],j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void main(String args[]){
        int[] a={77,18,7,45,1};
        insertionsort(a);
        for(int num:a){
            System.out.println(num + "");
        }
    }
    
}
