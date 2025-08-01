
package day5;

public class  stack{
    static void triggerError(boolean danger)throws ArithmeticException{
        if(danger){
            throw new ArithmeticException("iron man trigger");
        }
        System.out.println("all safe mission");
    }
    public static void main(String args[]){
        try{
            triggerError(true);
        }catch(ArithmeticException e){
            System.out.println("hello  " +  e.getMessage());
        }
        finally{
            System.out.println("hello adil");
        }
    }
}
