/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fadilla_031122;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class LATIHAN2ifelse_MODUL6 {
     public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bil;
        
       
        try {
            System.out.print("Masukkan Angka : ");
            bil = Integer.parseInt(input.readLine());
            if(bil>=1 && bil<=10){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Invalid Number");
        }
        } catch (IOException ex) {
            Logger.getLogger(LATIHAN2ifelse_MODUL6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

