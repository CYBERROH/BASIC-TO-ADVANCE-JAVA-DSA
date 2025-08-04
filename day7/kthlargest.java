package day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class kthlargest {
    public static void main(String args[]){
        Queue<Integer> s= new LinkedList<>(Arrays.asList(50,20,30,40,5,45,10));
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:s){
            maxHeap.offer(num);
        }
        int k=3;
        int kthlargest=-1;
        for(int i=0;i<k;i++){
            kthlargest=maxHeap.poll();
        }
        System.out.println(kthlargest);
    }

   
}