
package day7;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class linkedList{
    Node head;
    void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=newNode;
    }
    void insertAtPosition(int pos,int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newNode= new Node(val);
        Node curr=head;
        for(int i=0;i<pos-1&&curr!=null;i++)
            curr=curr.next;
        if(curr==null) return;
        newNode.next=curr.next;
        curr.next=newNode;
    }
    void printLastNode(){
        if(head==null)  return;
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        System.out.println(curr.data);
    }
    
}
public class singlylinked {
    public static void main(String args[]){
       linkedList a=new linkedList();
       a.insertAtEnd(1);
       a.insertAtEnd(2);
       a.insertAtEnd(3);
       a.insertAtEnd(4);
       a.insertAtEnd(5);
       a.insertAtBeginning(7);
       a.insertAtBeginning(6);
       a.insertAtPosition(3, 8);
       a.printLastNode();
    
    
}
}