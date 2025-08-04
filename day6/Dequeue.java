
package day6;
import java.util.*;
public class Dequeue{
    public static void main(String args[]){
        Deque<Integer> ne=new ArrayDeque<>();
        ne.offerFirst(10);  
        ne.offer(20);
        ne.offerLast(56);
        System.out.println("total element in stack  "+ne);
        System.out.println("top element in StackCustom is: " + ne.peek());
        System.out.println(ne.poll() + "deleted element from StackCustom is: ");
        System.out.println("top element in StackCustom now is: " + ne.peek());
        System.out.println(ne.size());
       
    }
}
