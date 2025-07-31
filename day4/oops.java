package day4;



public class oops {
   
        String name;
        int age;
        int studentid;
        oops(String name,int age,int studentid){
        this.name=name;
        this.age=age;
        this.studentid=studentid;
    }
        void display(){
            System.out.println("" +name);
            System.out.println(""+age);
            System.out.println(""+studentid);              
        }
    public static void main(String[] args){
        oops s=new oops("Rohit",18,5667);
        s.display();
    }
}
