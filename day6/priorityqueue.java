
package day6;
import java.util.*;
public class priorityqueue {
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap.offer(10);  
        minHeap.offer(20);
        minHeap.offer(56);
        System.out.println("total element in stack  "+minHeap);
        System.out.println("top element in StackCustom is: " + minHeap.peek());
        System.out.println(minHeap.poll() + "deleted element from StackCustom is: ");
        System.out.println("top element in StackCustom now is: " + minHeap.peek());
        System.out.println(minHeap.size());
        while(!minHeap .isEmpty()){
            System.out.println("" + minHeap.poll());
        }
       
    }
}
