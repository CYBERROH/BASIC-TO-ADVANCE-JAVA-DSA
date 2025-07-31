package DAY1;



public class hammingwieght {
    public static void main(String args[]){
//        int n=17;
//        int count = 0;
//        while (n != 0) {
//            n &= (n - 1);    
//            count++;
//           
//        }
//        System.out.println(count);
int num=11;
int count=0;
while(num>0){
    if((num & 1)==1){
        count++;
        
    }
    num=num>>1;
}
System.out.println("hamming weight is : " +count);
        
    }
}

    
    

