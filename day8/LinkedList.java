package day8;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;

    public void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;
        if (index == 0) {
            deleteAtBeginning();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) return;
            current = current.next;
        }
        if (current.next == null) return;
        current.next = current.next.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        list.printList();

        list.deleteAtBeginning();
        System.out.println("After deleting at beginning:");
        list.printList();

        list.deleteAtEnd();
        System.out.println("After deleting at end:");
        list.printList();

        list.deleteAtIndex(1);
        System.out.println("After deleting at index 1:");
        list.printList();
    }
}
