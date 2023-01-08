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
public class main_menu {
    public static void main (String[] args){
        model_menu model = retrivemodel_menuFromDatabase();
        view_menu view = new  view_menu();
        controller_menu controller = new controller_menu(model,view);
        controller.updateView();    
        
        controller.setHarga("Rp.20.000");
        
        controller.updateView();
    } 
    
    private static model_menu retrivemodel_menuFromDatabase(){
        model_menu menu = new model_menu();
        menu.setMakanan("NASI PADANG");
        menu.setHarga("Rp.25.000"); 
        
        return menu;
    }
}
