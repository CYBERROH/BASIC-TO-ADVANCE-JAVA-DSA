/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class linkedlist {
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