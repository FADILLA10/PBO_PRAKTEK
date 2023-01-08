/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_81222_fadilla;

/**
 *
 * @author HP
 */
public class aritmatika {
    public int tambah(int a,int b)
    {
        return a + b;
    }
    
    public static int kurang(int a, int b)
    {
        return a - b;
    }
    
    public static void main(String[] args){
        aritmatika Aritmatika = new aritmatika();
        int a =6;
        int b=10;
        
        int hasil = Aritmatika.tambah(a,b);
        int hasil1 = Aritmatika.kurang(a,b);
        
        System.out.println(hasil);
        System.out.println(hasil1);
    }
}
