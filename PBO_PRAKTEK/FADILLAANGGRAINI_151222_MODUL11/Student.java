/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FADILLAANGGRAINI_151222_MODUL11;

/**
 *
 * @author HP
 */
public class Student extends Person {
    public Student()
    { 
        super("Anna","Padang");
        System.out.println("Inside Student:Constructor"); 
    }
    
    public static void main( String[] args )
    { 
        Student anna = new Student(); 
        System.out.println (anna.name);
        System.out.println (anna.address);
    } 
}

