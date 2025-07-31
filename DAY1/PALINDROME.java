
package DAY1;
public class PALINDROME {

    public static void main(String[] args) {
        // TODO code application logic here
        int n=121;
        int temp,rev,d;
        rev=0;
        temp=n;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
            
        }
        if(rev==temp){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
        
        
    }
    
}
