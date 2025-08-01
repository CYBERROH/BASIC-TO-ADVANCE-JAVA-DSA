
package day5;
class person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
        
    }
    public void setAge(int age){
        this.age=age;
        
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulationy {
    public static void main(String args[]){
        person a = new person();
        a.setName("ram");
        a.setAge(18);
        System.out.println(a.getName());
        System.out.println(a.getAge());
    }
}
