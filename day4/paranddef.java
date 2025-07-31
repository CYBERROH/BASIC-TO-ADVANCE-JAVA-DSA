package day4;
public class paranddef {
   
        String name;
        int rollno;
        float fees;
       public paranddef(){
            this("ram",45,45000.7f);
            System.out.println("this is a default" );
        }
        public paranddef(String name,int rollno,float fees){
        
        this.name=name;
        this.rollno=rollno;
        this.fees=fees;
        }
        public void display(){
            System.out.println("" +this.name);
            System.out.println(""+this.rollno);
            System.out.println(""+this.fees);              
        }
    public static void main(String[] args){
        paranddef s=new paranddef ();
        s.display();
    }
}
