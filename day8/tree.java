
package day8;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
        
    }
}
class Tree{
    Node root;
    void bfs(Node node){
        if(node==null) return;
        Queue<Node> q= new LinkedList<>();
       
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.println(curr.data + "");
            if(curr.left !=null) q.add(curr.left);
            if(curr.right !=null) q.add(curr.right);
        }
    }
}
public class tree {
    public static void main(String args[]){
        Tree t = new Tree();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left=new Node(4);
        t.root.left.right=new Node(5);
        
        t.bfs(t.root);
    }
    
}
