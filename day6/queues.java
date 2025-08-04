
package day6;
import java.util.*;
public class queues {
    public static void main(String args[]){
        Queue<Integer> ne=new LinkedList<>();
        ne.offer(10);  
        ne.offer(56);
        System.out.println("total element in stack  "+ne);
        System.out.println("top element in StackCustom is: " + ne.peek());
        System.out.println(ne.poll() + "deleted element from StackCustom is: ");
        System.out.println("top element in StackCustom now is: " + ne.peek());
        System.out.println(ne.size());
       
    }
}
