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
public class PolimorfisExample {
    public static void main(String[] args) {
        Person ref;
        Student student = new Student();
        Employee emp = new Employee();
        
        ref = student;
        String temp = ref.getName();
        System.out.println(temp);
        
        ref = emp;
        String temp1 = ref.getName();
        System.out.println(temp1);
        
    }
}
