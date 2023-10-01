/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainPembeli {
    public static void menu() {
        System.out.println("===========================================");
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah antrian");
        System.out.println("2. Panggil antrian");
        System.out.println("3. Lihat antrian terdepan");
        System.out.println("4. Lihat antrian terbelakang");
        System.out.println("5. Lihat posisi antrian berdasarkan nama");
        System.out.println("6. Lihat daftar pembeli");
        System.out.println("0. Keluar");
        System.out.println("===========================================");
        System.out.print("Masukkan menu yang anda pilih(1-6): ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas antrian pembeli: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih; 
        
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan no. HP Pembeli: ");
                    int noHp = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    System.out.println();
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (data != null){
                        System.out.println("Antrian yang dipanggil: " + data.nama + " - " + data.noHp);
                    }
                    System.out.println();
                    break;
                case 3:
                    antri.peek();
                    System.out.println();
                    break;
                case 4:
                    antri.peekRear();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    String cariNama = sc.next();
                    antri.peekPosition(cariNama);
                    System.out.println();
                    break;
                case 6:
                    antri.print();
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
