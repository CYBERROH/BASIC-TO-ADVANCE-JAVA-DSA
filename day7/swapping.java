class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SinglyLinkedList {
    Node head;

    void insertAtBeginning(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }

    void insertAtEnd(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
    }

    void insertAtPosition(int pos, int val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        if (pos < 0) {
            System.out.println("⚠ Position cannot be negative");
            return;
        }

        Node newnode = new Node(val);
        Node curr = head;

        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("⚠ Position out of bounds");
            return;
        }

        newnode.next = curr.next;
        curr.next = newnode;
    }

    int countNodes() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        head = prev;
    }

    void swapNodesData(int val1, int val2) {
        if (val1 == val2)
            return; // No need to swap if same value

        Node node1 = null, node2 = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data == val1)
                node1 = curr;
            else if (curr.data == val2)
                node2 = curr;
            curr = curr.next;
        }

        if (node1 == null || node2 == null) {
            System.out.println("One or both values not found; swap not performed.");
            return;
        }

        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
}

public class swapping {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtBeginning(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtPosition(0, 8);
        list.insertAtPosition(3, 9);

        System.out.println("Total nodes: " + list.countNodes());

        System.out.print("Original list: ");
        list.display();

        list.swapNodesData(3, 6);

        System.out.print("List after swapping 3 and 6: ");
        list.display();

        list.reverse();

        System.out.print("Reversed list: ");
        list.display();
    }
}
