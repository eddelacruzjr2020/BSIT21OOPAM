/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bsit21oopam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class classSample extends animal implements interfaceSample, interfaceSample_1{
   
    int noOfLegs;

    @Override
    public void doWalk() {
        System.out.println("walk");
    }

    @Override
    public void doSing() {
        System.out.println("Sign");
    }

    @Override
    public void doDance() {
        System.out.println("Dance");
    }

    @Override
    public void doShowRun() {
        System.out.println("Show Run");
    }

    @Override
    public void doWrite() {
        System.out.println("Write");
    }
   

    @Override
    public void doSleep() {
        System.out.println("Sleep");
    }
 
    
    @Override
    public void doCrying(){
        System.out.println("Cry");
    }
    
    @Override
    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs=noOfLegs;
        System.out.println("Arf arf arf");
    }
    

   
}
