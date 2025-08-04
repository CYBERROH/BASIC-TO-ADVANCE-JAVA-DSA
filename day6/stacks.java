package day6;

class StackCustom {
    int[] stacks;
    int top;

    StackCustom(int size){
        stacks = new int[size];
        top = -1;
    }

    void push(int val){
        if(top < stacks.length - 1){
            stacks[++top] = val;
        } else {
            System.out.println("stack overflow");
        }
    }

    int pop(){
        if(top >= 0){
            return stacks[top--];
        } else {
            System.out.println("stack underflow");
            return -1;
        }
    }

    int peek(){
        if(top >= 0){
            return stacks[top];
        } else {
            System.out.println("stack is Empty");
            return -1;
        }
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class stacks {
    public static void main(String[] args) {
       
        StackCustom v = new StackCustom(10);
        v.push(1);
        v.push(2);
        v.push(5);

        System.out.println("top element in StackCustom is: " + v.peek());
        System.out.println("deleted element from StackCustom is: " + v.pop());
        System.out.println("top element in StackCustom now is: " + v.peek());
    }
}
