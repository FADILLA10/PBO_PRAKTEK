/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FADILLA080123_MODUL11;

/**
 *
 * @author HP
 */
public class Person {
    protected String name;
    protected String address;
    protected String nobp;
    
    public Person(){
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
        nobp = "";
    }
    
    public Person(String name, String address){
        this.name = name; 
        this.address = address;
        this.address = nobp;
    }
    
    public String getName(){ 
        System.out.println("getName Person");
        return name; 
    } 
    public String getAddress(){ 
        return address; 
    } 
    public void setName( String name ){ 
        this.name = name; 
    } 
    public void setAddress( String add ){ 
        this.address = add; 
    }
    
     public static void main( String[] args ){ 
        Person p = new Person();
        System.out.println(p);
    }
    
}
