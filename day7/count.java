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

    void InsertatBeginning(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }

    void InsertatEnd(int val) {
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

    void InsertatPosition(int pos, int val) {
        if (pos <= 0 || head == null) {
            InsertatBeginning(val);
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
}

public class count {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.InsertatBeginning(1);
        list.InsertatBeginning(2);
        list.InsertatBeginning(3);
        list.InsertatBeginning(4);
        list.InsertatBeginning(5);
        list.InsertatEnd(6);
        list.InsertatEnd(7);
        list.InsertatPosition(0, 8);
        list.InsertatPosition(3, 9);

        System.out.println("🧮 Total nodes: " + list.countNodes());
        System.out.print("📄 Linked list: ");
        list.display();
    }
}