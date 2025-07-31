package DAY1;

public class primenumber {
    public static void main(String args[]){
        int number=34;
        boolean isprime=true;
        if(number<=1){
            isprime=false;
        }
        else{
        for(int i=2;i<number;i++){
            if(number%1==0){
                isprime=false;
                break;
            }
            
        }
            
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
}
