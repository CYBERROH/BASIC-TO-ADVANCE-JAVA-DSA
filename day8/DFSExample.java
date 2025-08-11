package day8;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree {
    Node root;

    int count(Node node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }
    int sum(Node node){
        if(node == null) return 0;
        return node.data+sum(node.left)+sum(node.right);
    }
            
            
            
            
            
            
//    void bfs(Node node) {
//        if (node == null) return;
//        Queue<Node> q = new LinkedList<>();
//        q.add(node);
//        while (!q.isEmpty()) {
//            Node curr = q.poll();
//            System.out.print(curr.data + " ");
//            if (curr.left != null) q.add(curr.left);
//            if (curr.right != null) q.add(curr.right);
//        }
//        System.out.println();
//    }
//
//    void dfs(Node node) {
//        if (node == null) return;
//        System.out.print(node.data + " ");
//        dfs(node.left);
//        dfs(node.right);
//    }
}

public class DFSExample {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);

        /*System.out.println("BFS Traversal:");
        t.bfs(t.root);

        System.out.println("\nDFS Traversal:");
        t.dfs(t.root);
        System.out.println();

        System.out.println("\nTotal Nodes in Tree: " + t.count(t.root));*/
    }
}
