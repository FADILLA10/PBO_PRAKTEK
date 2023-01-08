/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FADILLAANGGRAINI_TUGASZOOM;

/**
 *
 * @author HP
 */
 class KABATAKU
 {
     static double perkalian(double a, double b)
     {
         return a * b;
     }
     
      static double  pembagian(double c, double d)
     {
         return c /  d;
     }
      
     static int pertambahan (int e, int f)
     {
         return e + f;
     }
     
     static int perkurangan(int g, int h)
     {
         return g - h;
     }     
     
 }

    public class data
{
        public static void main(String[] args)
    {
            double hasil1 = KABATAKU.perkalian(8.9, 9);
            double hasil2 = KABATAKU.pembagian(9.3, 2.1);
            int hasil3 = KABATAKU.pertambahan(20, 6);
            int hasil4 = KABATAKU.perkurangan(78, 9);
            
            System.out.println("HASIL PERKALIAN = "+hasil1);
            System.out.println("HASIL PEMBAGIAN = "+hasil2);
            System.out.println("HASIL PERTAMBAHAN = "+hasil3);
            System.out.println("HASIL PERKURANGAN = "+hasil4);
     }
}
