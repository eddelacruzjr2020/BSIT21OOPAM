/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class imaginaryNumber extends number implements arithmetic{
    private int a, b, c;
    private int d = 10;
    private int e = 100;
    
    
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
       
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);
      
    }
    
    public void multiple(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String args[]){
        imaginaryNumber in = new imaginaryNumber();
        in.multiple(100, 200);
    }
    
    public void shoutNumber(int x){
        System.out.println("Number is "+x);
        
    }

    
}
