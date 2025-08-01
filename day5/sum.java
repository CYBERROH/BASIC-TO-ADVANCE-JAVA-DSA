
package day5;

public class  sum{
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("divided by zero exception");
        }
        return a/b;
    }
    public static void main(String args[]){
        try{
            System.out.println(divide(8,0));
        }catch(ArithmeticException e){
            System.out.println(  "error : " + e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
    }
}
