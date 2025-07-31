package day4;




public class selection {
    public static void selectionsort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String[] args){
        int a[]={77,18,7,45,1};
        selectionsort(a);
        for(int num:a){
        System.out.println(num + " ");
        }
    }
    
}
