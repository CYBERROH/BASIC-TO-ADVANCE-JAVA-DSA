/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day8;

public class catalon {
    static int catalon(int n){
        if(n==1||n==0) return 1;
        int result=0;
        for(int i=0;i<n;i++){
            result+=catalon(i)*catalon(n-i-1);    
        
      }
        return result;
    }
   public static void main(String args[]){
   for(int i=0;i<10;i++)
   System.out.println(catalon(i) +"");
}
}

