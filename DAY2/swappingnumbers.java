package DAY2;


public class swappingnumbers {
    public static void main(String[] args){
        int a=5,b=4;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a =" +a+ " b =  "+ b);
        
    }
}
