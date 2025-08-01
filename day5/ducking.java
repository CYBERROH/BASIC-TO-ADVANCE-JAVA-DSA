
package day5;

public class  ducking{
    static void stepone()throws ArithmeticException{
        int a=10, b=7;
        
        if(b==0){
            throw new ArithmeticException("divided by zero exception");
        }
        int result=a/b;
        System.out.println("result is:" + result);
        
    }
    static void steptwo()throws ArithmeticException{
        stepone();
    }
    static void stepthree()throws ArithmeticException{
        steptwo();
    }
    
    
    public static void main(String args[]){
        try{
            stepthree();
        }catch(ArithmeticException e){
            System.out.println(  "error : " + e.getMessage());
        }
        
    }
}
