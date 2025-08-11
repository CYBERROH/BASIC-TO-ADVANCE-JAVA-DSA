
package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class DAY8 {
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<Integer> li=new ArrayList<>();
     
     //Arraylist<Integer> numbers =  new ArrayList<>(Arrays.asList(10,20...........))
     //Collections.addAll(10,20..........);
     li.add(10);
     li.add(20);
     li.add(30);
     li.add(40);
     li.add(50);
     li.add(2,25);
     System.out.println("adding value in a index 2 :" + li);
     //li.get(1);
     System.out.println("index one value is :" +li.get(1));
     li.remove(3);
     System.out.println("remove the value 3rd index : " + li.remove(3));
     System.out.println("the value is :" +li.contains(30));
     li.size();
     System.out.println("total element in a array : " +li);
     System.out.println("index element in a array : " +li.indexOf(40));
     
     Iterator<Integer> it=li.iterator();
     while(it.hasNext())
            System.out.println(it.next() + "");
        System.out.println("");
    li.clear();
    System.out.println(li);
    System.out.println("is empty:" + li.isEmpty());
    }
    
}
