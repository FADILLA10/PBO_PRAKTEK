/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT_FADILLA.controller;
import PROJECT_FADILLA.FormBuku;
import PROJECT_FADILLA.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class BukuController {
    private FormBuku formBuku;
    private BukuDao bukuDao;
    private Buku buku;

    public BukuController(FormBuku formBuku) {
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodebuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
               (DefaultTableModel) formBuku.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku : list){
            Object[] data = {
                buku.getKode(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit()
            };
            tabelModel.addRow(data); 
        }
    }
}

