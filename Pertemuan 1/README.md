# Laporan Praktikum Algoritma dan Struktur Data | JOBSHEET 1 Studi Kasus

## 1. Tujuan
## 2. Praktikum
### 2.1 Percobaan 1: Instalasi Java Development Kit/JDK
Waktu percobaan: 30 menit

### 2.2 Pemilihan 
Waktu percobaan : 30 menit
Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman, Sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaanpertanyaan yang ada berikut ini :

**2.2.1 Pratikum Pemilihan**

1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 35% nilai UTS dan 45% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100. Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuang sebagai berikut: Jika Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.
   - Input dari program berupa komponen nilai tugas, UTS, UAS
   - Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/TIDAK LULUS
      
_Kode Program_

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pemilihan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int nim, j = 0;
        
        System.out.print("Masukkan NIM: ");
        nim = input.nextInt();
        System.out.println("=============================");
        
        int n = nim % 100;
        if(n < 100){
            n += 10;
        }
        System.out.print("n : " + n);
        
        for (int i = 0; i < n; i++){
            if(j == hari.length){ 
            j = 0;
            }
        System.out.print(hari[j]);
        j++;
        }
        input.close();
    } 
}
```

_Hasil Running Program_

![Hasil running pemilihan](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/pemilihan.png)

### 2.3 Perulangan
Waktu percobaan : 30 menit
Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman. Sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaanpertanyaan yang ada berikut ini :

**2.3.1 Pratikum Perulangan**

1. Buatlah program yang dapat menampilkan nama hari dari senin hingga minggu secara berulang dengan jumlah hari sebesar n, dengan n = 2 digit terakhir NIM anda.
   * bila n<10 maka tambahkan 10(n+=10)
   * Contoh: 
     - Input NIM: 2041720010 maka n=10
     - OUTPUT : senin selasa rabu kamis jumat sabtu minggu senin selasa rabu
   * Contoh 2:
     - Input NIM: 2041720002 maka n=12
     - OUTPUT : senin selasa rabu kamis jumat sabtu minggu senin selasa rabu kamis jumat
    
_Kode Program_

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        long nim, n;
        int j = 0;
        
        System.out.print("Masukkan NIM: ");
        nim = input.nextLong();
        System.out.println("=============================");
        
        n = nim % 100;
        if(n < 10){
            n += 10;
        }
        System.out.println("n : " + n);
        
        for (int i = 0; i < n; i++) {
            if (j == hari.length) {
                j = 0;
            }
                System.out.print(hari[j] + " ");
                j++;
        }
        input.close();
    }
}
```

_Hasil Running Program_

![Hasil running perulangan](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/perulangan.png)

### 2.4 Array
Waktu percobaan : 30 menit
Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman, sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaan pertanyaan yang ada berikut ini :

**2.4.1 Pratikum Array**

1. RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga-bunga yang dijual selalu dicatat dengan rincian seperti berikut ini: Baris = Cabang Toko, Kolom = Stock bunga pada hari x 
Rincian Harga Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000. Bantulah RoyalGarden dengan membuatkan program yang dapat menghitung : 
   * Jumlah Stock berdasarkan jenis bunganya di seluruh Cabang
   * Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati pada cabang RoyalGarden 1. Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5. Maka berapakah total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis

_Kode Program_

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

/**
 *
 * @author USER
 */
public class Array {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        int[] pengurangan = {1, 2, 0, 5};

        int[] jmlStok = new int[4];
        int pendapatan = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jmlStok[j] += stok[i][j];
            }
        }
        System.out.println("===============================================");
        System.out.println("A. Jumlah seluruh stok berdasarkan jenis bunga pdi seluruh cabang:");
        System.out.println();
        System.out.println("Aglonema: " + jmlStok[0]);
        System.out.println("Keladi: " + jmlStok[1]);
        System.out.println("Alocasia: " + jmlStok[2]);
        System.out.println("Mawar: " + jmlStok[3]);
        System.out.println("===============================================");

        for (int i = 0; i < 4; i++) {
            pendapatan += (stok[0][i] - pengurangan[i]) * harga[i];
        }
        System.out.println("B. Total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis");
        System.out.println();
        System.out.printf("Jumlah Pendapatan RoyalGarden 1: Rp%,d", pendapatan);
        System.out.println();
        System.out.println("Informasi tambahan :");
        System.out.println("Terdapat pengurangan stock karena bunga tersebut mati pada cabang RoyalGarden 1.");
        System.out.println("Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.");
        System.out.println("===============================================");
    }
}
```

_Hasil Running Program_

![Hasil running array](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/array.png)

### 2.5 Fungsi
Waktu percobaan : 30 menit ‘
Materi pada praktikum ini telah dijelaskan pada matakuliah Dasar Pemrograman, sehingga didalam praktikum ini, tidak akan dilakukan langkah-langkah percobaan. Jawablah pertanyaanpertanyaan yang ada berikut ini :

**2.5.1 Praktikum Fungsi**

1. Buatlah fungsi untuk menampilkan array stock bunga sesuai tabel yang terdapat pada pertanyaan praktikum bagian 2.4.

_Kode Program_

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Fungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] stock = {{10, 5, 15, 7},
                        {6, 11, 9, 12},
                        {2, 10, 10, 5},
                        {5, 7, 12, 9}};

            System.out.println("Stock Bunga: ");
            for (int i = 0; i < 4; i++) {
                System.out.println("Cabang " + (i + 1) + ": ");
                for (int j = 0; j < 4; j++) {
                    System.out.print(stock[i][j] + " ");
                }
                System.out.println();
            }
    }
}
```

_Hasil Program_

![Hasil running fungsi](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/fungsi.png)

2. Buatlah fungsi untuk pada pertanyaan bagian 2.4 untuk mengetahui jumlah Stock berdasarkan jenis bunganya di seluruh Cabang

_Kode Program_

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Fungsib {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] stock = {{10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}};

        System.out.println("Jumlah Stock Bunga: ");
        int[] jumlahStock = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jumlahStock[j] += stock[i][j];
            }
        }
        System.out.println("Aglonema: " + jumlahStock[0]);
        System.out.println("Keladi: " + jumlahStock[1]);
        System.out.println("Alocasia: " + jumlahStock[2]);
        System.out.println("Mawar: " + jumlahStock[3]);
    }
}
```

_Hasil Running Program_

![Hasil running fungsi2](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/fungsi2.png)

## 3.Tugas
1. Sebuah jasa cuci pakaian Smile Laundry memiliki aturan biaya seperti beriku ini
   - Tarif untuk setiap 1kg pakaian adalah Rp. 4.500, – 
   - Jika customer mencucikan baju lebih dari 10 kg maka : customer akan mendapatkan diskon 5%. Pada hari ini laundy tersebut hanya memiliki 4 customer yaitu Ani, Budi, Bina, dan Cita. Ani membawa 4kg pakaian, budi membawa 15kg pakaian, Bina membawa 6kg, dan terakir Cita membawa 11kg. Berapakah pendapat Smile laundry pada hari itu? Buatlah programnya

_Kode Program_

```java
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
```

_Hasil Program_

![Hasil running tugas1](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/tugas1.png)

2. Buat program untuk menghitung rumus kecepatan, jarak, dan waktu Berikut adalah persamaan untuk menghitung rumus tersebut : Rumus Kecepatan 𝑣 = 𝑠 𝑡 Rumus Jarak 𝑠 = 𝑣.𝑡 Rumus Waktu 𝑡 = 𝑠 𝑣 Keterangan : 𝑣 = 𝑘𝑒𝑐𝑒𝑝𝑎𝑡𝑎𝑛 𝑠 = 𝑗𝑎𝑟𝑎𝑘 𝑡 = 𝑤𝑎𝑘𝑡𝑢 Program yang dibuat memiliki fungsi sebagai berikut: a. Menu (Untuk memilih rumus yang akan dihitung (kecepatan/jarak/waktu) b. Menghitung hasil perhitungan Kecepatan c. Menghitung hasil perhitungan Jarak d. Menghitung hasil perhitungan Waktu Panggil fungsi-fungsi tersebut pada fungsi main

_Kode Program_

```java
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
		return v;f
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
```

_Hasil Program_

![Hasil running tugas2](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%201/img/tugas2.png)
