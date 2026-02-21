/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit21oopam;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AnimalMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal animal = new animal();
        animal.setAnimalName("Dog");
        animal.setNoOfLegs(4);
        System.out.println(animal.getAnimalName());
        System.out.println(animal.getNoOfLegs());
        animal.addNameAndNoOfLegs("Cat", 4);
        System.out.println(animal.getAnimalNameAndNoOfLegs());
//        animal.noOfLegs = 0;
//        animal.animalName = "Snake"

        classSample cs = new classSample();
        cs.addNameAndNoOfLegs("Rat", 4);
        cs.doDance();
        cs.setAnimalName("Rat", 4);
        cs.setAnimalName("Cat");
    }  
}
