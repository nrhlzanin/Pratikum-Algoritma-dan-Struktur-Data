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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarif = 4500;
        int diskonBaju = 5;
        int pendapatan = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan Berat Baju Laundry : ");
            int Berat = input.nextInt();
            int total = tarif * Berat;
            if (Berat > 10) {
               int diskon= total * diskonBaju /100;
               total = total -diskon;
            }
            System.out.println("Total Harga Laundry = " + total);
            pendapatan += total;
        }
        System.out.println("Pendapatan Untuk Hari ini adalah " + pendapatan);
    input.close();
    }
}
