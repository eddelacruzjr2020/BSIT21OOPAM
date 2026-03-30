/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PolygonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec = new Rectangle(4.5, 5.5);
        System.out.println("Area of rectangle is "+rec.calculateArea());
        
        Triangle tri = new Triangle(3.90, 10.5);
        System.out.println("Area of triangle is "+tri.calculateArea());
        
        Polygon poly = new Polygon(10.0, 50.0);
        System.out.println("Area of polygon is "+poly.calculateArea());
        
    }
    
}
