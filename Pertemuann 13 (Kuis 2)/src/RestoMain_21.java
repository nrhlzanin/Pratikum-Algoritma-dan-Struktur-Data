/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RestoMain_21 {
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("\tMENU\t");
        System.out.println("----------------------------------");
        System.out.println(" 1. Tambah antrian");
        System.out.println(" 2. Cetak antrian");
        System.out.println(" 3. Hapus antrian & Tambah pesanan");
        System.out.println(" 4. Laporan pesanan");
        System.out.println(" 5. Keluar");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        Resto_21 rq = new Resto_21();
        
        int pilih;
        do{
            menu();
            System.out.print("Masukkan menu yang ingin anda pilih = ");
            pilih = scan.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Nama pembeli = ");
                    String nama = input.nextLine();
                    System.out.print("No Hp pembeli = ");
                    String noHp = input.nextLine();
                    Pembeli_21 pembeli = new Pembeli_21(nama, noHp);
                    System.out.print("Masukkan kode pesanan = ");
                    int kode = scan.nextInt();
                    System.out.print("Masukkan nama pesanan = ");
                    String namaPesanan = input.nextLine();
                    System.out.print("Masukkan harga pesanan = ");
                    int harga = scan.nextInt();
                    Pesanan_21 pesanan = new Pesanan_21(kode, namaPesanan,harga);
                    rq.addFirst(pembeli, pesanan);
                break;

                case 2:
                    rq.print();
                break;

                case 3:
                    rq.removeFirst();
                    System.out.print("Masukkan kode pesanan = ");
                    kode = scan.nextInt();
                    System.out.print("Masukkan nama pesanan = ");
                    namaPesanan = input.nextLine();
                    System.out.print("Masukkan harga pesanan = ");
                    harga = scan.nextInt();
                    Pesanan_21 pes = new Pesanan_21(kode, namaPesanan,harga);
                    rq.print();
                break;

                case 4:
                    rq.print();
                    System.out.println("Total pemasukan = ");
                    rq.totalPemasukan();
                break;

                case 5:
                    System.out.println("Anda keluar!");
                break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
