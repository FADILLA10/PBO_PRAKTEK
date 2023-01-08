/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadilla_241022_mvc;

/**
 *
 *  FADILLA ANGGRAINI
 */
public class model_menu{
    
    private String makanan;
    private String harga;
    
    public void setMakanan (String makanan)
    {
        this.makanan = makanan;
    }
    
    public void setHarga(String harga)
    {
        this.harga = harga;
    }
    
    public String getMakanan()
    {
        return makanan;
    }
    
    public String getHarga() 
    {
        return harga;
    }
}
