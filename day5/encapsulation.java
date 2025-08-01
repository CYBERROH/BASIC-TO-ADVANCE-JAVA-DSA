
package day5;
class hero{
    void action(){
        System.out.println("hello");
    }
}
class Super extends hero{
    @Override
    void action(){
        System.out.println("ram");
    }
}
public class encapsulation {
    public static void main(String args[]){
        hero h3=new hero();
        h3.action();
        hero h1=new Super();
        h1.action();
        Super h2=new Super();
        h2.action();
    }
}
