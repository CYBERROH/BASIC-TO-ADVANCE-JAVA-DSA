
package day4;

interface innerpower{
    void meditate();
}
interface innerpowers{
    void fight();
}
interface outerp{
    void run();
}
class shaktiman implements innerpower,innerpowers,outerp{
    public void meditate(){
        System.out.println("Mediating...");
    }
    public void fight(){
        System.out.println("fighting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    
}

public class multiple {
    public static void main(String args[]){
     shaktiman s=new shaktiman();
     s.meditate();
     s.fight();
     s.run();
    }
}
