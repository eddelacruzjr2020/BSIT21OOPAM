/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bsit21oopam;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class animal {
    private String animalName;
    private int noOfLegs;
    private String animalDetails;
    
//    animal(String animalName, int noOfLegs){
//        this.animalName=animalName;
//        this.noOfLegs=noOfLegs;
//    }
    
    void setAnimalNameAndNoOfLegs(String animalName, int noOfLegs){
        this.animalName=animalName;
        this.noOfLegs=noOfLegs;
    }   
    
    public void addNameAndNoOfLegs(String animalName, int noOfLegs){
        this.animalDetails=animalName+" "+noOfLegs;
    }
    public String getAnimalNameAndNoOfLegs(){
        return animalDetails;
    }
    
    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }  
    
    public void setAnimalName(String animalName, int noOfLegs){
    this.animalName=animalName;
    }   
    public String getAnimalName(){
        return animalName;
    }
    
    public void setNoOfLegs(int noOfLegs){
    this.noOfLegs=noOfLegs;
    }   
    public int getNoOfLegs(){
        return noOfLegs;
    }
    
    
}
