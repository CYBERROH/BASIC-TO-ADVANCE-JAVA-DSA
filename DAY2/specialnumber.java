package DAY2;


public class specialnumber {
    public static void main(String[] args){
        int first,last;
        int sum;
        for(int i=10;i<=99;i++){
            first=i/10;
            last=i%10;
            sum=(first+last)+(first*last);
            if(sum==i){
                System.out.println(i+"");
            }
        }
    }
    
}
