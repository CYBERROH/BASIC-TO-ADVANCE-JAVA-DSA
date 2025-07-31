package DAY1;




public class happynumber {
 public static void main(String[] args){
     int n=100;
     while(n!=1&&n!=4){
         int sum=0;
         while(n>0){
             int d=n%100;
             sum+=d*d;
             n/=100;
         }
         n=sum;
     }
     System.out.println(n == 1?"happy":"not happy");
     
 }   
}
