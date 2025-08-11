
package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arralist {
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
     int a=li.size();
     //for(int i=0;i>=a;i++){
//         Iterator<Integer> iterator = li.iterator();
//         while (iterator.hasNext()) {
//         if (iterator.next() > 7) {
//           iterator.remove();
//           }
//         }
//         System.out.println("the element is:" +li);



    for(int i=li.size()-1;i>=0;i--){
    if(li.get(i)>7){
        li.remove(i);
     }
    }
        System.out.println("lesser than seven value is :" +li);
    }
    
}
