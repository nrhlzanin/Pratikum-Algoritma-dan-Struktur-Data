/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SLLMain {
    public static void menu(){
        System.out.println("\nPilih Menu ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari Index Mahasiswa dengan NIM");
        System.out.println("7. Cek Data Mahasiswa berdasarkan Antrian");
        System.out.println("8. Keluar");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan pilihan anda = ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
    
        SLL singLL = new SLL();

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch(pilih){
                case 1:
                    System.out.println();
                    System.out.println("Maukkan data");
                    System.out.print("NIM Mahasiswa\t: ");
                    String nim = sc.nextLine(); 
                    System.out.print("Nama Mahasiswa\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen Mahasiswa\t: ");
                    int absen = sd.nextInt();
                    System.out.print("IPK Mahasiswa\t: ");
                    double ipk = sb.nextDouble();
                    singLL.addLast(nim, nama, absen, ipk);
                    System.out.println();
                    singLL.print();
                break;
                
                case 2:
                    singLL.removeFirst();
                    System.out.println();
                    System.out.println("Mahasiswa urutan awal berhasil keluar!!!");
                    System.out.println("Dengan sisa antrian dibawah ini: \n");
                    singLL.print();
                break;
                
                case 3:
                    System.out.println();
                    System.out.println("Berikut adalah antrian mahasiswa terdepan:");
                    singLL.peek();
                break;
                
                case 4:
                    System.out.println();
                    System.out.println("Berikut adalah data semua antrian:");
                    singLL.print();
                break;
                
                case 5:
                    System.out.println();
                    System.out.println("Berikut adalah antrian mahasiswa paling belakang:");
                    singLL.peekRear();
                break;
                
                case 6:
                    System.out.println();
                    System.out.println("Pencarian Index Mahasiswa Dengan NIM");
                    System.out.print("Masukkan NIM mahasiswa : ");
                    String nimm = sc.nextLine();
                    singLL.cariNim(nimm);
                break;
                
                case 7:
                    System.out.println();
                    System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                    System.out.print("Masukkan antrian mahasiswa: ");
                    int antrian = sd.nextInt();
                    singLL.cariIndex(antrian);
                break;
                
                case 8:
                    System.out.println();
                    System.out.println("Terima Kasih Telah menggunakan layanan kami");
                    System.exit(0);
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
}
