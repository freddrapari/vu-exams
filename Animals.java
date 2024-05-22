/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.animals;

/**
 *
 * @author hp
 */
// Animal class
public class Animals {
    protected String name;
    protected int age;
    
    public void makeSound() {

        System.out.println("The animal makes a sound.");
        
    }
    public void eat(){
        System.out.println("The animal is eating");
        
    }
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }
    
    public void eat(String foodType){
        System.out.println("The animal is eating " + foodType + ".");
    }
}




       
            
        
        
    

