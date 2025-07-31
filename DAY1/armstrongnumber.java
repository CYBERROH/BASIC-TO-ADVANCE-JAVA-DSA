package DAY1;

import java.util.Scanner;
//import java.util.math;
public class armstrongnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //int n=153;
        int temp,d,sum;
        sum=0;
        temp=n;
        while(n>0){
            d=n%10;
            sum+=d*d*d;
            //sum+=math.pow(d,count);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Number is armstong number");
        }
        else{
            System.out.println("number is notarmstrong ");
        }
        
    }
    
}

