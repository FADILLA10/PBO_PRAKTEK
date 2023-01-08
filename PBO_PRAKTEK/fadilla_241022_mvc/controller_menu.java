/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadilla_241022_mvc;

/**
 *
 * @author HP
 */
public class controller_menu {
    
    private model_menu model;
    private view_menu view;
    
    public controller_menu(model_menu model,view_menu view) {
        this.model = model;
        this.view = view;
    }
    
    public void setMakanan (String makanan){
        model.setMakanan(makanan);
    }
    
    public String getMakanan (){
        return model.getMakanan();
    }
    
    public void setHarga (String harga){
        model.setHarga(harga);
    }
    
    public String getHarga (){
        return model.getHarga();
    }
    
    public void updateView() {
       view.printMenuDetails(model.getMakanan(), model.getHarga());
    }
}
