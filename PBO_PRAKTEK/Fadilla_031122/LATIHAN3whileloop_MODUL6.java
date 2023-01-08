/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fadilla_031122;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LATIHAN3whileloop_MODUL6 {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int batas,i = 0;
        String nama = "FADILLAANGGRAINI";
        
        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();
        
        while(i<batas){
            System.out.println(nama);
            i++;
        }
        
    }
}
