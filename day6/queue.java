package day6;

class QueueCustom {
    int[] queue;
    int front, rear, size;

    QueueCustom(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add element at the rear
    void offer(int val) {
        if(size < queue.length){
        rear = (rear + 1) % queue.length; // circular increment
        queue[rear] = val;
        size++;
        }
        else{
            System.out.println("queue overflow");
        }
    
    }

    // Remove element from the front
    int poll() {
        if(size > 0) {
        int val = queue[front];
        front = (front + 1) % queue.length; // circular increment
        size--;
        return val;
        }
        else{
            System.out.println("Queue underflow");
            return -1;
          }
        
    }
    // Peek element at the front
    int peek() {
        if(size > 0){
            return queue[front];
        }
            else{
            System.out.println("Queue is empty");
            return -1;
        }
       
    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class queue {
    public static void main(String[] args) {
        QueueCustom q = new QueueCustom(10);

        q.offer(1);
        q.offer(2);
        q.offer(5);

        System.out.println("front element in QueueCustom is: " + q.peek());
        System.out.println("deleted element from QueueCustom is: " + q.poll());
        System.out.println("front element in QueueCustom now is: " + q.peek());
    }
}
