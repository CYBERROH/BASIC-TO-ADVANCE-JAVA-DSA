
package day4;
class single{
    String teamName="Avengers";
    public void showTeam(){
        System.out.println("team " + teamName);
    }
}
class IronMan extends single{
    String name="Tony stark";
    String suit="armor";
    public void show(){
        System.out.println("name " + name);
        System.out.println("suit " + suit);
    }
}
    public class single_level{
    public static void main(String args[]){
        IronMan im= new IronMan();
        im.showTeam();
        im.show();
    }
    
}
