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
public class LATIHAN4DOWHILE_MODUL6 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
    System.out.println("masukkan angka : ");
    int angka = input.nextInt();
    System.out.println("masukkan pangkat : ");
    int pangkat = input.nextInt();

    int i = 1;
    int h = 1;

    do {
    h = h*angka;
    i++ ;
    }while(i<pangkat);
    
    System.out.println(angka +" ^ " + pangkat + " = " +h);
    
    }
}

