/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author USER
 */
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    

    public void tambah(Mahasiswa... Mahasiswa){
            mahasiswas.addAll(Arrays.asList(Mahasiswa));
    }
    
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+ mhs.toString());
        });
    }
    
    int linearSearch(String nim){
        for(int i=0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    
   int binarySearch(String nim){
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null), new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
   
    void ascSort() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2) {
                return o1.nim.compareTo(o2.nim);
            }
        });
    }

    void dscSort() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2) {
                return o2.nim.compareTo(o1.nim);
            }
        });
    }

    
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        System.out.println("\n----------------Menggunakan Linear Search-----------------------");
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();

        System.out.println("\n----------------Menggunakan Binary Search-----------------------");
        int index = lm.binarySearch("201235");
        if (index >= 0) {
            lm.update(index, new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        }
        
        //asc
        System.out.println("\n----------Data Diurut Secara Ascending Collections--------------");
        lm.ascSort();
        lm.tampil();

        //dsc
        System.out.println("\n----------Data Diurut secara Descending Collections------------");
        lm.dscSort();
        lm.tampil();
    } 
}
