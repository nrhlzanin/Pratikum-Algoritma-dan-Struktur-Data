/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import static Tugas.Nilai.CompNilai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NilaiMain {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);

        List<Nilai> nill = new ArrayList<>();
        Nilai n = new Nilai("", 0, null, null);

        Mahasiswa m1 = new Mahasiswa("20001", "Thalhah", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20002", "Zubair", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20003", "Abdur-Rahman", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20004", "Sa'ad", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20005", "Sa'id", "021xxx");
        Mahasiswa m6 = new Mahasiswa("20006", "Ubaidah", "021xxx");

        n.tambahMhs(m1, m2, m3, m4, m5, m6);

        MataKuliah mk1 = new MataKuliah("0001", "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah("0002", "Algoritma dan Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("0003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk4 = new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("0005", "Pemrograman Algoritma dan Pemrograman", 3);

        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);

        Nilai n1 = null;
        String nimMhs, mkMhs;

        int menu = 0;
        do{
            System.out.println("===================================================");
            System.out.println(" Sistem Pengelolahan Data Nilai Mahasiswa Semester ");
            System.out.println("===================================================");
            System.out.println(" 1. Input Nilai");
            System.out.println(" 2. Tampil Nilai");
            System.out.println(" 3. Mencari Nilai Mahasiswa");
            System.out.println(" 4. Urut Data Nilai");
            System.out.println(" 5. Hapus Data Mahasiswa");
            System.out.println(" 6. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih\t: ");
            menu = sd.nextInt();
            System.out.println("");

            switch(menu){
                case 1 :
                    System.out.println("Masukkan data");
                    System.out.print("Kode\t: ");
                    String kd = sc.nextLine();
                    System.out.print("Nilai\t: ");
                    double nilai = sb.nextDouble();
                    System.out.println("");

                    System.out.println("                    Daftar Mahasiswa               ");
                    System.out.println("====================================================");
                    System.out.println("NIM\tNama\t\tNo Telp");
                    n.tampilMhs();
                    System.out.println("---------------------------------------------------");
                    System.out.print("Pilih Mahasiswa by nim\t\t: ");
                    nimMhs = sc.nextLine();
                    Mahasiswa mahaSiswas;
                    mahaSiswas = n.cariMhs(nimMhs);

                    System.out.println("");
                    System.out.println("                    Daftar Mata Kuliah              ");
                    System.out.println("====================================================");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilMatkul();
                    System.out.println("---------------------------------------------------");
                    System.out.print("Pilih Mata Kuliah by Kode\t:");
                    mkMhs = sc.nextLine();
                    MataKuliah mataKuliahs;
                    mataKuliahs = n.cariMatkul(mkMhs);

                    n1 = new Nilai(kd, nilai, mahaSiswas, mataKuliahs);

                    nill.add(n1);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("                  Daftar Nilai Mahasiswa           ");
                    System.out.println("====================================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    for(int i=0; i<nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("                  Daftar Nilai Mahasiswa           ");
                    System.out.println("====================================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    int sks = 0;
                    for(int i=0; i<nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                    }
                    System.out.println("---------------------------------------------------");
                    System.out.print("Masukkan Data Mahasiswa NIM\t\t: ");
                    String input = sc.nextLine();
                    System.out.println("");
                    for (int i = 0; i < nill.size(); i++){
                        if(input.equalsIgnoreCase(nill.get(i).mhs.nim)){
                            sks += n.matkulA.get(i).sks;
                            n.linearSearchMhs(nill.get(i).mhs.nim);
                            n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                            System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);    
                        }
                    }
                    System.out.println("---------------------------------------------------");
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("                  Daftar Mahasiswa                 ");
                    System.out.println("====================================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    nill.sort(CompNilai);
                    for (int i = 0; i < nill.size(); i++){
                        n.linearSearchMhs(nill.get(i).mhs.nim);
                        n.linearSearchMatkul(nill.get(i).mk.kodeMk);
                        System.out.println(n.toString(n.linearSearchMhs(nill.get(i).mhs.nim), n.linearSearchMatkul(nill.get(i).mk.kodeMk)) + nill.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                
                case 5:
                    System.out.println("Hapus Data Mahasiswa");
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nimMhs = sc.nextLine();
                    boolean removed = n.hapusMhs(nimMhs);
                    if (removed) {
                        System.out.println("Data Mahasiswa dengan NIM " + nimMhs + " telah dihapus.");

                        // Menghapus data nilai mahasiswa dengan NIM yang sesuai
                        Iterator<Nilai> iterator = nill.iterator();
                        while (iterator.hasNext()) {
                            Nilai nilai1 = iterator.next();
                            if (nilai1.mhs.nim.equals(nimMhs)) {
                                iterator.remove();
                            }
                        }

                        System.out.println("Data nilai untuk mahasiswa dengan NIM " + nimMhs + " juga dihapus.");
                    } else {
                        System.out.println("Data Mahasiswa dengan NIM " + nimMhs + " tidak ditemukan.");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("+==================================================+");
                    System.out.println("+                    Terima Kasih                  +");
                    System.out.println("+==================================================+");
                    break;
            }
        } while (menu < 6 && menu > 0);
    }    
}
