
package day5;
abstract class animal{
    abstract void sound();
    void sleep(){
        System.out.println("Sleeeping..........");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("HELLO adil ahemd");
    }
}
public class abstration {
    public static void main(String args[]){
        animal s = new dog();
        s.sound();
        s.sleep();
    }
}
