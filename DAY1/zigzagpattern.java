package DAY1;


public class zigzagpattern {
    public static void main(String[] args){
       for(int r=1;r<4;r++){
            for(int c=1;c<14;c++){
                if(r==1 && c%4==3 || r==2 && c%2==0 || r==3 && c%4==1){
                    System.out.print("* ");
                }else{
                System.out.print(" ");
                        }
                
            
        }
            System.out.println();
        }
    }
}
