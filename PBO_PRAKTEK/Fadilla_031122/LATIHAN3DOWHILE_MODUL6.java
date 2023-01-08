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
public class LATIHAN3DOWHILE_MODUL6 {
      public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i=0,batas;
        String nama="FADILLA ANGGRAINI";
        
        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();
        
        do{
            System.out.println(nama);
            i++;
        } while(i<batas);
    }
}

