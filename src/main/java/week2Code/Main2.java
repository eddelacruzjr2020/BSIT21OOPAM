/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2Code;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        List<String> names = Arrays.asList("Bob", "John", "Kenneth", "Bob1", "John2", "John", "Kenneth3");
        String name = "John";
        int index;
        for (index = 0; index < names.size(); index++){
            if(names.get(index).equals(name)){
                break;
            }
        }
    
        System.out.println(index < names.size()
                ? "Found at index: " + index
                : "Not Found");
    
    
}
    
}
