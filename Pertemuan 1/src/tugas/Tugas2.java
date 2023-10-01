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
public class Tugas2 {
    public static Scanner input = new Scanner(System.in);
	public static double a, b;

	public static void menu(){
		System.out.println();
		System.out.println("======================================");
                System.out.println("                MENU                  ");
                System.out.println("--------------------------------------");
                System.out.println("|1. Rumus untuk menghitung kecepatan |");
                System.out.println("|2. Rumus untuk menghitung jarak     |");
                System.out.println("|3. Rumus untuk menghitung waktu     |");
                System.out.println("--------------------------------------");
		System.out.print("Masukkan angka rumus yang akan dihitung : ");
		int rumus = input.nextInt();

		switch (rumus) {
			case 1:
				System.out.print("Masukan jarak     : ");
				a = input.nextDouble();
				System.out.print("Masukan waktu     : ");
				b = input.nextDouble();
				System.out.println("Maka kecepatannya : " + kecepatan(a, b));
				a = 0;
				b = 0;
				menu();
			break;
			case 2:
				System.out.print("Masukan kecepatan : ");
				a = input.nextDouble();
				System.out.print("Masukan waktu     : ");
				b = input.nextDouble();
				System.out.println("Maka jaraknya     : " + jarak(a, b));
				a = 0;
				b = 0;
				menu();
			break;
			case 3:
				System.out.print("Masukan jarak     : ");
				a = input.nextDouble();
				System.out.print("Masukan kecepatan : ");
				b = input.nextDouble();
				System.out.println("Maka waktunya     : " + waktu(a, b));	
				a = 0;
				b = 0;
				menu();
			break;
		}
	}

	public static double kecepatan(double a, double b){
		double v = a / b;
		return v;
	}

	public static double jarak(double a, double b){
		double s = a * b;
		return s;
	}

	public static double waktu(double a, double b){
		double t = a / b;
		return t;
	}

	public static void main(String[] args) {
		menu();
                System.out.println("Apakah anda ingin melakukan transaksi ulang? jika ya tekan huruf 'y' jika tidak tekan huruf 't'");
            System.out.print("Pilihan anda = ");
            char ulang = input.next().charAt(0);

            if(ulang == 't' || ulang == 'T'){
                System.out.println("\n\tANDA KELUAR");
                System.exit(0);
            }
	}
}
