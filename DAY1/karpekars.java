package DAY1;



public class karpekars {
    public static void main(String[] args){
        int n=9;
        int square=n*n;
        int divider=10;
        boolean iskaprekar=false;
        while(divider < square){
           // int sq=n*n;
            int left=square/divider;
            int right=square%divider;
            if(left + right==n){
                iskaprekar=true;
                break;
            
            }
            divider*=10;
        }
        if(iskaprekar){
            System.out.println(n + " number is a karpekars");
        }
        else{
            System.out.println(n + " number is not a karpekar");
        }
    }
}
