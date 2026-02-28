/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2Code;

import java.util.Arrays;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int stud1grade = 100;
        int stud2grade = 99;
        int stdud3grade = 98;
        
        int[] studgrades = {100, 99, 98, 75};
        studgrades[0] = 65;
        System.out.println(Arrays.toString(studgrades));
        System.out.println(studgrades.length);

        
    }
    
}
