
package day7;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addbegandend {
    public static void main(String args[]){
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next=new Node(30);
   
    var curr = head;
    while(curr!=null){
        System.out.print( curr.data + "->");
        curr=curr.next;
    }
        System.out.println("null");
    
}
}