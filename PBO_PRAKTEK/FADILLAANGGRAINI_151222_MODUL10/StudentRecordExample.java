/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FADILLAANGGRAINI_151222_MODUL10;

/**
 *
 * @author HP
 */
public class StudentRecordExample{
    public static void main( String[] args ){ 
        //membuat 3 object StudentRecord 
        StudentRecord FADILLARecord = new StudentRecord(); 
        StudentRecord ANGGRAINIRecord = new StudentRecord(); 
        StudentRecord MI2BRecord = new StudentRecord(); 

        //Memberi nama siswa 
        FADILLARecord.setName("FADILLA"); 
        ANGGRAINIRecord.setName("ANGGRAINI"); 
        MI2BRecord.setName("MI2B"); 

        //Menampilkan nama siswa “Anna” 
        System.out.println( "nama :  FADILLARecord.getName()"); 
        System.out.println( "kelas : MI2BRecord.getName()"); 

        //Menampilkan jumlah siswa 
        System.out.println("jumlah siswa ="+StudentRecord.getStudentCount()); 
    }
}
