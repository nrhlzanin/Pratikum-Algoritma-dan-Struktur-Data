/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class Nilai {
    String kodeNil;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;

    public Nilai(String kodeNil, double nilai, Mahasiswa mhs, MataKuliah mk){
        this.kodeNil = kodeNil;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    List<Mahasiswa> mhsA = new ArrayList<>();
    List<MataKuliah> matkulA = new ArrayList<>();
    Queue<Nilai> nilaiQueue = new LinkedList<>();

    public void tambahMhs(Mahasiswa... mahasiswa){
        mhsA.addAll(Arrays.asList(mahasiswa));
    }
    
    public void tambahMatkul(MataKuliah... matkul){
        matkulA.addAll(Arrays.asList(matkul));
    }
    
    public void tampilMhs(){
        mhsA.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }
    
    public void tampilMatkul(){
        matkulA.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }
    
    int linearSearchMhs(String nim){
            for(int i = 0; i < mhsA.size(); i++){ 
                if(nim.equals(mhsA.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }
    
    int linearSearchMatkul(String matkul){
            for(int i = 0; i < matkulA.size(); i++){ 
                if(matkul.equals(matkulA.get(i).kodeMk)){
                    return i;
                }
            }
            return -1;
    }
    
    Mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhsA.size(); i++){
            if(nim.equals(mhsA.get(i).nim)){
                return mhsA.get(i);
            }
        }
        return null;
    }
    
    MataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkulA.size(); i++){
            if(matkul.equals(matkulA.get(i).kodeMk)){
                return matkulA.get(i);
            }
        }
        return null;
    }
    
    public String toString(int idx1, int idx2) {
        if (idx1 >= 0 && idx1 < mhsA.size() && idx2 >= 0 && idx2 < matkulA.size()) {
            Mahasiswa mahasiswa = mhsA.get(idx1);
            MataKuliah mataKuliah = matkulA.get(idx2);
            return mahasiswa.nim + "\t" + mahasiswa.nama + "\t" + mataKuliah.namaMk + "\t" + mataKuliah.sks + "\t";
        } else {
            return "";
        }
    }

    static Comparator<Nilai> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };
    
    public boolean hapusMhs(String nim) {
        boolean removed = mhsA.removeIf(mhs -> mhs.nim.equals(nim));
        nilaiQueue.removeIf(nilai -> nilai.mhs.nim.equals(nim));
        return removed;
    }
    
    public boolean hapusNilai(String kodeMataKuliah) {
    Iterator<Nilai> iterator = nilaiQueue.iterator();
    boolean removed = false;
    while (iterator.hasNext()) {
        Nilai nilai = iterator.next();
        if (nilai.mk.kodeMk.equals(kodeMataKuliah)) {
            iterator.remove();
            removed = true;
        }
    }
    return removed;
}

}
