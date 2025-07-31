package DAY1;

import java.util.Scanner;
//import java.util.math;
public class armstrongpow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int n=sc.nextInt();
        
        //int n=153;
        int temp,d,sum;
        sum=0;
        temp=n;
        int count=0;
        while(n>0){
            n=n/10;
          count++;
        }
        n=temp;
        while(n>0){
           d=n%10;
           sum+=Math.pow(d,count);   //Math.ceil()  //Math.floor()
          n=n/10;
        }
        if(sum==temp){
            System.out.println("Number is armstrong number");
        }
        else{
            System.out.println("number is not armstrong ");
        }
        
    }
    
}
