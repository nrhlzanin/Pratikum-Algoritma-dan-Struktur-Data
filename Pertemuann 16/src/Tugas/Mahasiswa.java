/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nim, nama, noTelp;

    public Mahasiswa(){

    }
    
    public Mahasiswa(String nim, String nama, String noTelp){
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
    }
}
