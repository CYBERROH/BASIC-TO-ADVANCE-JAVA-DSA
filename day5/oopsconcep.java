/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;
class Shape{
    void calculateArea(){
        System.out.println("calculated area is");
    }
}
class Rectangle extends Shape{
    int l=10;
        int b=20;
    int area=l*b;
    Rectangle(){
       // int l=10;
       // int b=20;
        //int area=l*b;
    } //System.out.println("area is" +area);
    @Override
    void calculateArea(){
        System.out.println("area is" + area);
    }
}
class circle extends Shape{
    
    void calculateArea(){
        float pi=3.142f;
        int r=2;
        double Area=pi*(r*r);
        System.out.println("area is" +Area);
    }
}
class overmethodloading{
void sum(){
    int a = 10;
    int b = 20;
    System.out.println("Sum of two number is : " + a + b);
}
void sum(){
    int a = 10;
    int b = 20;
    System.out.println("Sum of two number is : " + a + b);
}
}
}
public class oopsconcep {
    public static void main(String args[]){
        
    }
}
