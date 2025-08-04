
package day6;
import java.util.Stack;
public class stackcollections {
    public static void main(String args[]){
        Stack<Integer> ne=new Stack<>();
//        ne.push("(");
//        ne.push("{");
//        ne.push("[");
//        ne.push("]");
//        ne.push("}");
//        ne.push(")");
       
        

        ne.push(10);  
        ne.push(56);
        //ne.push(4);  
        //ne.push(3);
        System.out.println("total element in stack  "+ne);
        System.out.println("top element in StackCustom is: " + ne.peek());
        System.out.println("deleted element from StackCustom is: " + ne.pop());
        System.out.println("top element in StackCustom now is: " + ne.peek());
        System.out.println(ne.size());
       
    }
}
