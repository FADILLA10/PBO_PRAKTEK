/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FADILLA031122_MODUL7;

/**
 *
 * @author HP
 */
public class LATIHAN1_DOWHILE {
    public static void main(String[] args){
        String hari[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int i=0;
        
        do{
             System.out.println(hari[i]);
             i++;
        }while(i<hari.length);
    }
}
