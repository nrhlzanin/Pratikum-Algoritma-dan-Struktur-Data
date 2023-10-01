/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProjekNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas, uts, uas;
        double nt, nUts, nUas;
        String nilaiHuruf = null, note = null;

        System.out.println("=============================");
        System.out.print("Masukkan nilai Tugas: ");
        tugas = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextInt();
        System.out.println("=============================");
        System.out.println("=============================");
        nt = 0.2 * tugas;
        nUts = 0.35 * uts;
        nUas = 0.45 * uas;
        double nilaiAkhir = nt + nUts + nUas ;

        if(nilaiAkhir >80 && nilaiAkhir <=100 ){
            nilaiHuruf = "A";
        }
        else if(nilaiAkhir >73 && nilaiAkhir <=80 ){
            nilaiHuruf = "B+";
        }
        else if(nilaiAkhir >65 && nilaiAkhir <=73 ){
            nilaiHuruf = "B";
        }
        else if(nilaiAkhir >60 && nilaiAkhir <=65 ){
            nilaiHuruf = "C+";
        }
        else if(nilaiAkhir >50 && nilaiAkhir <60 ){
            nilaiHuruf = "C";
        }
        else if(nilaiAkhir >39 && nilaiAkhir <=50 ){
            nilaiHuruf = "D";
        }
        else if(nilaiAkhir <=39 ){
            nilaiHuruf = "E";
        }
        
        if (nilaiAkhir > 50){
            note = "SELAMAT LULUS";
        }else{
            note = "MAAF ANDA TIDAK LULUS";
        }

        System.out.println("Nilai akhir= " + nilaiAkhir);
        System.out.println("Nilai huruf = " + nilaiHuruf);
        System.out.println("=============================");
        System.out.println(note);
        input.close();
    }
}
