
package day8;


public class recursion{
    public static void odd(int n){
        if( n > 10) return;
        System.out.println(n +1 +   "");
        even(n +1);
    }
    public static void even(int n){
        if(n > 10) return;
        System.out.println(n-1 + "");
        odd(n+1);
        
    }
    public static void main(String args[]){
        odd(1);
    }
}
