
package day6;

import java.util.Collections;
import java.util.PriorityQueue;

public class largestelementqueue {
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap.offer(10);  
        minHeap.offer(20);
        minHeap.offer(13);
    }
}
