
package day5;
import java.util.Scanner;
public class  stringindex{
    static char getChar(String s,int index)throws StringIndexOutOfBoundsException{
        if(index <0 || index>=s.length()){
            throw new StringIndexOutOfBoundsException("divided by zero exception");
        }
        return s.charAt(index);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter the string");
            String input=sc.nextLine();
            System.out.println("enter the index");
            int i=sc.nextInt();
            char ch=getChar(input,i);
            System.out.println("charcater at index " + i +" :" +ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(  "error : " + e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
    }
}
