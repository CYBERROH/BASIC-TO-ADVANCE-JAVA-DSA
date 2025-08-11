package day9;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;

    void insertArray(int[] arr) {
        for (int val : arr)
            root = insert(root, val);
    }

    Node insert(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.data)
            node.left = insert(node.left, val);
        else if (val > node.data)
            node.right = insert(node.right, val);
        return node;
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null)
            return node.data;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}

public class DAY9 {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = {10, 5, 15, 3, 7, 8, 12, 18};
        tree.insertArray(arr);
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Number of leaf nodes: " + tree.countLeaves(tree.root));
    } 
}
