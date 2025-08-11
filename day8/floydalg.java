package day8;
class Node {
    int data;
    Node next;
    Node(int d) { 
        data = d; 
        next = null; }
}

public class floydalg {
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating a cycle: 4 points back to 2
      
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head) ? "Cycle found" : "No cycle");
    }
}
