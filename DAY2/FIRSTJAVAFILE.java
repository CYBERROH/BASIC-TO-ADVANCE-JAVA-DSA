package DAY2;

import java.util.Scanner;
import java.util.Random; 
public class FIRSTJAVAFILE{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 0 for rock:");
       System.out.println("enter 1 for paper:");
       System.out.println("enter 2 for Scissor:");
       int userInput=sc.nextInt();
       Random random=new Random();
       int computerInput=random.nextInt( 3);
       if(userInput==computerInput)
       {
        System.out.println("draw");
       }
       else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
       {
        System.out.println("you win");
       }
       else{
        System.out.println("computer win");
       }
       System.out.println("computer choice:"+computerInput);
    }
    
}

