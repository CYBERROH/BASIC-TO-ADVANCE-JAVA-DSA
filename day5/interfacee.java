package day5;
interface animal{
    void sound();
    default void sleep(){
        System.out.println("Sleeeping..........");
    }
}
class dog implements animal{
    @Override
    public void sound(){
        //sleep();
        System.out.println("HELLO adil ahemd");
    }
}
public class interfacee {
    public static void main(String args[]){
        animal s = new dog();
        s.sound();
        s.sleep();
    }
}
