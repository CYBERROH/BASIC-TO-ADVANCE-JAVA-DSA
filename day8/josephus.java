class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class josephus {
    private Node last;

    public josephus() {
        last = null;
    }

    // Create circular linked list with n people numbered 1 to n
    public void createCircle(int n) {
        for (int i = 1; i <= n; i++) {
            insert(i);
        }
    }

    // Insert new node at the end of circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Solve Josephus problem and return the safe position
    public int getSafePosition(int k) {
        if (last == null) return -1;

        Node ptr = last.next, prev = last;
        while (ptr.next != ptr) { // More than one node left
            // Move k-1 times to reach the k-th person to be eliminated
            for (int count = 1; count < k; count++) {
                prev = ptr;
                ptr = ptr.next;
            }
            // Remove k-th node
            prev.next = ptr.next;
            ptr = prev.next;
        }
        return ptr.data; // Last remaining node data
    }

    public static void main(String[] args) {
        int n = 7;  // Number of people
        int k = 2;  // Count for elimination

        josephus circle = new josephus();
        circle.createCircle(n);

        int safePos = circle.getSafePosition(k);
        System.out.println("The safe position is " + safePos);
    }
}
