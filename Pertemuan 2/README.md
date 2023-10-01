# Laporan Praktikum Algoritma dan Struktur Data | JOBSHEET II OBJEK

## 1. Tujuan

## 2. Pratikum

### 2.1 Tujuan Pratikum

Setelah melakukan materi praktikum ini, mahasiswa mampu:
  1. Mengenal objek dan class sebagai konsep mendasar pada pemrograman berorientasi objek
  2. Mendeklarasikan class, atribut dan method
  3. Membuat objek (instansiasi)
  4. Mengakses atribut dan method dari suatu objek
  5. Menerapkan konstruktor
### 2.2 Deklarasi Class, Atribut dan Method 
Waktu percobaan : 45 menit
Perhatikan Diagram Class berikut ini

|              Film              |
|--------------------------------|
|judul: String                   |
|genre: String                   |
|rate: String                    |
|jumlahTiket: int                |
|hargaTiket: int                 |
|                                |
|tampilFilm(): void              |
|tambahTiket(n: int): void       |
|kurangiTiket(n: int): void      |
|totalRevenue(jumlah: int): int  |

Berdasarkan diagram class di atas, akan dibuat program class dalam Java.

**2.2.1 Langkah-langkah Percobaan**

1. Buat Project baru, dengan nama StrukturData. Buat paket dengan nama minggu2 (opsional). buatlah class baru dengan nama Film.
2. Lengkapi class Film dengan atribut dan method yang telah digambarkan di dalam diagram class di atas, sebagai berikut:
   
_Kode Program_
```java
package jobsheet2;

public class Film {
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;
    
    void tampilFilm(){
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Rate: " + rate);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga Tiket: " + hargaTiket);
    }
    
    void tambahTiket(int n){
        jumlahTiket += n;
    }
    
    void kurangiTiket(int n){
        jumlahTiket -= n;
    }
    
    int totalRevenue(int jumlah){
        return jumlah * hargaTiket;
    }
}
```

**2.2.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program Anda dengan gambar berikut ini.

![Hasil Running Film](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/Film.png
)

**2.2.3 Pertanyaan**

1. Sebutkan 2 karakteristik class/objek!

>* Objek memiliki sesuatu yang dinamakan atribut dan melakukan sesuatu yang disebut method
>* Class juga memiliki atribut dan method, sebagaimana objek
>* juga memilikinya. 
>* Bedanya, jika atribut dan method yang di objek sudah riil, sudah
>* bisa diberi nilai tertentu. Sedangkan atribut dan method di class
>* masih berupa rancangan.
>* Objek tidak akan ada jika tidak ada class, dan class tidak akan bisa
>* digunakan jika belum dibuat objek nya.

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?

>class

3. Perhatikan class Film yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?

>Atribut yang digunakan ada 5 dan berada pada baris ke 8 sampai 12

4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan
 
>Method yang dimiliki ada 4 yaitu tampilFilm, tambahTiket, kurangiTiket, totalRenevue.

5. Perhatikan method kurangiTiket() yang ada di class Film, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)

```java
void tambahTiket(int n){
        if(jumlahTiket > 0){
            jumlahTiket += n;
        }
    }
    
    void kurangiTiket(int n){
        if(jumlahTiket < 0){
            jumlahTiket -= n;
        }
    }
```

6. Menurut Anda, mengapa method tambahTiket() dibuat dengan memiliki 1 parameter berupa bilangan int?
 
>Karena terdapat parameter n yang menyatakan jumlah yang ditambahkan

7. Menurut Anda, mengapa method totalRevenue() memiliki tipe data int?

>Karena digunakan untuk mereturn hasilnya

8. Menurut Anda, mengapa method tambahTiket() memiliki tipe data void?
 
>Karena tidak perlu menambahkan method apapun

### 2.3 Instansiasi Objek dan Mengakses Atribut & Method
Waktu percobaan : 45 menit
Sampai tahap ini, kita telah membuat class Film dengan sukses. Selanjutnya, apabila diinginkan untuk mulai menggunakan class Film tersebut, mengakses atribut-atribut dan method-method yang ada di dalamnya, maka selanjutnya perlu dibuat objek/instance dari class Film terlebih dahulu.

**2.3.1 Langkah-langkah** 

1. Buatlah class baru dengan nama FilmMain. Dan di dalam class FilmMain tersebut, buatlah method main().
2. Di dalam method main(), lakukan instansiasi, dan kemudian lanjutkan dengan mengakses atribut dan method dari objek yang telah terbentuk.

```java
package jobsheet2;

public class FilmMain {
    public static void main(String[] args){
        Film film1 = new Film();
        
        film1.judul = "Quantumania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;
        
        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();
        
        int income = film1.totalRevenue(4);
        
        System.out.println("Total jual 4 tiket = " + income);
    }
}
```

3. Jalankan (Run) class FilmMain tersebut dan amati hasilnya

**2.3.2 Verifikasi Hasil Percobaan** 

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

![Hasil Running FilmMain](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/FilmMain.png
)

**2.3.3 Pertanyaan**

1. Pada class FilmMain, pada kode apa yang digunakan untuk proses instansiasi? Apa nama objek yang dihasilkan?
 
>Pada FilmMain kode dibawah ini digunakan untuk proses instansiasi
```java
Film film1 = new Film();
```
>Dan nama objek yang digunakan adala film1

2. Bagaimana cara mengakses atribut dan method dari suatu objek?
>

### 2.4 Membuat Konstruktor
Waktu percobaan : 45 menit
Di dalam percobaan ini, kita akan mempraktekkan bagaimana membuat berbagai macam konstruktor berdasarkan parameternya.

**2.4.1 Langkah-langkah Percobaan**

1. Perhatikan kembali class Film. Tambahkan di dalam class Film tersebut 2 buah konstruktor. 1 konstruktor default dan 1 konstruktor berparameter.

```java
package jobsheet2;

public class Film {
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;
    
    Film(){
        
    }
        Film(String jd, String gr, String rt, int jt, int ht){
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = ht;
    }s
    
    void tampilFilm(){
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Rate: " + rate);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga Tiket: " + hargaTiket);
    }
    
    void tambahTiket(int n){
        jumlahTiket += n;
    }
    
    void kurangiTiket(int n){
        jumlahTiket -= n;
    }
    
    int totalRevenue(int jumlah){
        return jumlah * hargaTiket;
    }
}
```

2. Buka kembali class FilmMain. Dan buat sebuah objek lagi, kali ini dengan menggunakan konstruktor berparameter.

 ```java
package jobsheet2;

public class FilmMain {
    public static void main(String[] args){
        Film film1 = new Film();
        
        film1.judul = "Quantumania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;
        
        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();
        
        int income = film1.totalRevenue(4);
        
        System.out.println("Total jual 4 tiket = " + income);
        
        System.out.println("=========\n");
        
        Film film2 = new Film ("Maniaquantum", "Horor", "Dewasa", 2000, 40000); 
        film2.tampilFilm();
    
    }
}
 ```

3. Jalankan kembali class FilmMain dan amati hasilnya.

**2.4.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

![Hasil Running FilmMainKonstruktor](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/FilmMainKonstruktor.png
)

**2.4.3 Pertanyaan**

1.Perhatikan class Film yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan?

>Pada baris ke 26, 32, 28 deklarasi konstruktor berparameter digunakan.

2.Perhatikan class FilmMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini?
```jav
Film film2 = new Film ("Maniaquantum", "Horor", "Dewasa", 2000, 40000); 
```

>Menambahkan instansiasi dengan nama objek film2

3.Coba buat objek dengan nama film3 dengan menggunakan konstruktor berparameter dari class Barang.
```java
Film film3 = new Film ("Konjuring", "Horor", "Dewasa", 1000, 40000);
film3.tampilFilm();
```

_Hasil Rungging Program_

![Hasil Running FilmMain](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/FilmMainKonstruktorS3.png
)

### 2.5 Latihan Pratikum
Waktu percobaan : 60 menit ‘
1. Buat program berdasarkan diagram class berikut ini!

|           Buku          |
|-------------------------|
|nama: String             |
|pengarang: String        |
|penerbit: String         |
|hargaSatuan: int         |
|jumlah: int              | 
|                         |
|hitungHargaTotal(): int  |
|hitungDiskon(): int      |
|hitungHargaBayar(): int  |

* Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan perkalian antara hargaSatuan dengan jumlah barang yang dibeli
* Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan sbb:
  - Jika harga total > 100000, akan mendapat diskon 10%
  - Jika harga total mulai dari 50000 sampai 100000 akan mendapat diskon sebesar 5%
  - Jika dibawah 50000 tidak mendapat diskon
* Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi diskon

_Kode Program Class Buku_
```java
package jobsheet2;

public class buku {
        String nama, pengarang, penerbit;
        int hargaSatuan, jumlah;
        
        int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
        }
        
        int hargaDiskon(){
            int total = hitungHargaTotal(); 
            int diskon = 0;
            if(total > 100000){
                diskon = total * 10/100;
            }else if(total >= 50000 && total <= 100000){
                diskon = total * 5/100;
            }else{
                diskon = total * 0;
            }
            return diskon;
        }
        
        int hitungHargaBayar(){
        int bayar = hitungHargaTotal() - hargaDiskon();
        return bayar;
        }
        
        void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Jumlah buku: " + jumlah);
        int bayar = hitungHargaBayar();
        System.out.println("Total Bayar: " + bayar);
    }
}
```

_Kode Program Class BukuMain_
```java
package jobsheet2;

public class bukuMain {
    public static void main(String[] args){
        buku buku1 = new buku();
        
        buku1.nama = "Bumi";
        buku1.pengarang = "Tere Liye"; 
        buku1.penerbit = "Gramedia Pustaka Utama";
        buku1.hargaSatuan = 81000;
        buku1.jumlah = 5;
        
        buku1.hitungHargaTotal();
        buku1.hargaDiskon();
        buku1.hitungHargaBayar();
        buku1.tampil();

    }  
}
```

_Hasil Running Program_

![Hasil Running buku](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/Buku.png
)

2. Buat program berdasarkan diagram class berikut ini!

|                  Snake                |
|---------------------------------------|
|x: int                                 |
|y: int                                 |
|width: int                             |
|height: int                            |
|                                       |
|moveLeft(): void                       |
|moveRight(): void                      |
|moveUp(): void                         |
|moveDown(): void                       |
|printPosition(): void                  |
|detectCollision(x: int, y: int): void  |

* Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari snake, sedangkan atribut y untuk posisi koordinat y (vertikal)
* Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height
untuk menyimpan panjang area
* Method moveLeft() digunakan untuk mengubah posisi snake ke kiri (koordinat x akan berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah 1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()
* Method moveUp() digunakan untuk mengubah posisi snake ke atas (koordinat y akan berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()
* Method detectCollision() akan mencetak pesan “Game Over” apabila snake menyentuh ujung area permainan.

_Kode Program Snake_
```java
package jobsheet2;

public class snake {
    int x, y, widht, height;        
    
    void moveLeft(){
        x -=1;
    }
    
    void moveRight(){
        x+=1;
    }
     
    void moveUp (){
        y -=1;
    }
    void moveDown(){
        y +=1;
    }
    
    void printPosition(){
        System.out.println(x + " , " + y);
    }
     
    void detectCollision(int x, int y){
        if(x < 0 || x > widht){
            System.out.println("GAME OVER");
        }else if(y <0 || y > height){
            System.out.println("GAME OVER");
        }else {
        System.out.println("GAME OVER");
        }
    }
}
```

_Kode Program SnakeMain_
```java
package jobsheet2;
import java.util.Scanner;
public class snakeMain {
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       snake snake1 = new snake();
       
       System.out.print("Masukkan koordinat x = ");
       snake1.x = input.nextInt();
       System.out.print("Masukkan koordinat y = ");
       snake1.y = input.nextInt();
       System.out.print("Masukkan Lebar Area Permainan = ");
       snake1.widht = input.nextInt();
       System.out.print("Masukkan Panjang Area Permainan = ");
       snake1.height = input.nextInt();
       
       snake1.moveLeft();
       snake1.moveRight();
       snake1.moveUp();
       snake1.moveDown();
       snake1.printPosition();
       snake1.detectCollision(snake1.x, snake1.y);
       
   } 
}
```

_Hasil Running Program_

![Hasil Running Snake](https://github.com/nrhlzanin/Algoritma-dan-Struktur-Data/blob/main/Pertemuan%202/img/Snake.png)
