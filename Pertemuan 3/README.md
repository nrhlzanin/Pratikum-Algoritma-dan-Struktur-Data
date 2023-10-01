# Laporan Praktikum Algoritma dan Struktur Data | JOBSHEET III ARRAY OBJEK
 
## 1	Tujuan Pratikujm

## 2	Membuat Array dari Object, Mengisi dan Menampilkan
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, kemudian mengisi dan menampilkan array tersebut.

**2.1	Langkah-langkah Percobaan**
1. Buat Project baru, dengan nama “ArrayObjects”.
2. Buat class PersegiPanjang: 
```java
public class PersegiPanjang {
    public int panjang;
    public int lebar;
}
```

3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 elemen: 
```java
public static void main(String[] args){
       PersegiPanjang[] ppArray = new PersegiPanjang[3];
   }
```

4. Kemudian isikan masing-masing atributnya:
```java
       ppArray[0] = new PersegiPanjang();
       ppArray[0].panjang = 120; 
       ppArray[0].lebar = 30;
       
       ppArray[1] = new PersegiPanjang();
       ppArray[1].panjang = 80; 
       ppArray[1].lebar = 40;
       
       ppArray[2] = new PersegiPanjang();
       ppArray[2].panjang = 100; 
       ppArray[2].lebar = 20;
```

5. Cetak ke layar semua atribut dari objek ppArray:
```java
       System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + " , lebar: " + ppArray[0].lebar);
       System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + " , lebar: " + ppArray[1].lebar);
       System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + " , lebar: " + ppArray[2].lebar);
```

6. Jalankan dan amati hasilnya.

**2.2	Verifikasi Hasil Percobaan**

 Cocokkan hasil compile kode program anda dengan gambar berikut ini. 
 
**2.3	Pertanyaan**
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan! 
>Iya perlu, Kita memerlukan untuk mendefinisikan objek beserta atribut nya untuk menyimpan nilai yang diperlukan objek sedangkan methodnya berfungsi untuk memberikan cara kerja untuk 
 objek tersebut.

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
```java
 ppArray[1] = new PersegiPanjang(); 
```

>Tidak memiliki, pemanggilan itu difungsikan untuk class PersegiPanjang sehingga kita bisa mengakses fungsi yang ada pada atau di dalam class itu.

3. Apa yang dimaksud dengan kode berikut ini: 
```java
PersegiPanjang[] ppArray = new PersegiPanjang[3];
```

>Memiliki arti kita membuat new array dengan nama ppArray yang objeknya berasal dari class PersegiPanjang.

4. Apa yang dimaksud dengan kode berikut ini: 
```java
ppArray[1] = new PersegiPanjang();
ppArray[1].panjang = 80; 
ppArray[1].lebar = 40;
```

>Yang pertama memanggil class PersegiPanjang, yang kedua memanggil atribut yang tersedia pada class tersebut, dan step ketiga juga sama memanggil atribut yang tersedia dalam class itu juga.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
>Tujuan utama proses array of object yaitu tipe data yang sama yang disimpan kedalam array sehingga diperlukan untuk dipisahkan.

## 3	Menerima Input Isian Array Menggunakan Looping 
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray. 

**3.1	Langkah-langkah Percobaan**
1. Import scanner pada class ArrayObjects
```java
import java.util.Scanner;
```

Note: Letakkan kode import dibawah kode package. 
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek Scanner untuk menerima input, kemudian melakukan looping untuk menerima input: 
```java
Scanner sc = new Scanner(System.in);
       
       for(int i=0; i<3; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("Persegi panjang ke-" + i);
           System.out.print("Masukkan panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.print("Masukkan lebar: ");
           ppArray[i].lebar = sc.nextInt();
        }
3.	Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping untuk mengakses isi array ppArray dan menampilkannya ke layar: 
for(int i = 0; i<3; i++){
           System.out.println("Persegi panjang ke-" + i);
           System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
       }
```
4. Jalankan dan amati hasilnya.
   
**3.2	Verifikasi Hasil Percobaan**

Contoh verifikasi hasil percobaan ini. 
 
**3.3	Pertanyaan** 
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? 
>Iya dapat selama menggunakan class object yang benar sehingga dapat merepresentasikan elemen array dengan benar.

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan! 
>Misal kita ingin membuat program tic tac toe untuk merepresentasikan kotaknya perlu atribut yang menyatakan bahwa kotak itu kosong atau tidak dan kemudian akan diinisialisasikan array of object 2 dimensi untuk membuat 3x3 kotak

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
```java
Persegi[] pgArray = new Persegi[100];
pgArray[5].isi = 20;
```
>Karena saat dijalankan akan terjadi error nullPointerException karena tidak ada objek pada clasa persegi.

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!  
_Kode program_ 
```java
import java.util.Scanner;
public class ArrayObjects {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah persegi panjang: ");
        int pp = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[pp];
       
       for(int i=0; i < pp; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("Persegi panjang ke-" + i);
           System.out.print("Masukkan panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.print("Masukkan lebar: ");
           ppArray[i].lebar = sc.nextInt();
        }
       
       for(int i = 0; i < pp; i++){
           System.out.println("Persegi panjang ke-" + i);
           System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
       }
   }
}
```

_Hasil  output_


5.	Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !
>Boleh, tetapi jika kita mengubah value dari variable asli, maka variable duplikat akan berubah juga.

## 4	Operasi Matematika Atribut Object Array 
Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada masing-masing anggota array. 

**4.1	Langkah-langkah Percobaan** 
1.	Buat package baru “ArrayBalok”. 
2.	Buat class Balok: 
```java
public class Balok {
   public int panjang;
   public int lebar;
   public int tinggi;
   
   public Balok(int p, int l, int t){
       panjang = p;
       lebar = l;
       tinggi = t;
   }
   
   public int hitungVolume(){
       return panjang * lebar * tinggi;
   }
}
```

3.	Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen: 
```java
public class ArrayBalok {
    public static void main(String[] args){
    Balok[]  blArray = new Balok[3];
    }
}
```

4.	Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor dari class Balok:
```java
blArray[0] = new Balok(100, 30, 12);
blArray[1] = new Balok(120, 40, 15);
blArray[2] = new Balok(210, 50, 25);
```

5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di dalam looping seperti berikut ini: 
```java
for(int i = 0; i < 3; i++){
    System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
}
```

6. Jalankan dan amati hasilnya.

**4.2	Verifikasi Hasil Percobaan **

Cocokkan hasil compile kode program anda dengan gambar berikut ini. 
 
**4.3	Pertanyaan**
1.	Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! 
>Tidak boleh, karena konstruktor biasanya digunakan untuk initialize (menyiapkan) data untuk class tersebut.
 
2.	Jika diketahui terdapat class Segitiga seperti berikut ini:
```java
public class Segitiga {
    public int alas;
    public int tinggi;
}
```
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. 
```java 
public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
```

4.	Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring) 
```java
import static java.lang.Math.sqrt;

public int hitungLuas(){
        return alas * tinggi / 2;
    }
    
public int hitungKeliling(){
        int miring = (int) sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + miring;
    }
```
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut: 
  a.	sgArray ke-0 alas: 10, tinggi: 4 
  b.	sgArray ke-1 alas: 20, tinggi: 10 
  c.	sgArray ke-2 alas: 15, tinggi: 6 
  d.	sgArray ke-3 alas: 25, tinggi: 10 
```java 
sgArray[0] = new Segitiga(10, 4);
sgArray[1] = new Segitiga(20, 10);
sgArray[2] = new Segitiga(15, 6);
sgArray[3] = new Segitiga(25, 10);
```

5.	Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().
```java
for(int i = 0; i < 3; i++){
            System.out.println("Luas segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
        }
for(int i = 0; i < 3; i++){
            System.out.println("Keliling segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
```
Hasil compile 
 
_Kode program main_
```java
public class ArraySegitiga {
    public static void main(String[] args){
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        
        for(int i = 0; i < 3; i++){
            System.out.println("Luas segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Keliling segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
```

_Kode Program_
```java
import static java.lang.Math.sqrt;
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas(){
        return alas * tinggi / 2;
    }
    
    public int hitungKeliling(){
        int miring = (int) sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + miring;
    }
}
```

## 5	Latihan Praktikum
1.	Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan, 
  a.	Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut. 
  b.	Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
  c.	Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas 
  d.	Pada bola, inpuntan untuk atribut hanya jari-jari

_Kode Program Main_
```java
import java.util.Scanner;
public class ArrayObjek {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayObjek[] brArray = new ArrayObjek[3];
        int r=0, s=0, a=0, t=0;
        for (int i = 0; i < brArray.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("======== Kerucut ========");
                    System.out.print("Masukkan Jari-jari: ");
                    r = sc.nextInt();
                    System.out.print("Masukkan Sisi Miring: ");
                    s = sc.nextInt();
                    System.out.println();
                    break;
                case 1:
                    System.out.println("======== Limas Segi Empat========");
                    System.out.print("Masukkan Alas: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan Tinggi: ");
                    t = sc.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("======== Bola ========");
                    System.out.print("Masukkan Jari-jari: ");
                    r = sc.nextInt();
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
        System.out.println("========== Hasil Perhitungan ==========");
        Kerucut k= new Kerucut(r, s);
        Limas l = new Limas(a, t);
        Bola b = new Bola(r);
        
        System.out.println();
        for (int i = 0; i < brArray.length; i++) {
            if (i == 0) {
            System.out.println("======== Kerucut ========");
            System.out.println("Luas Permukaan Kerucut " + k.hitungLuasPermukaan());
            System.out.println("Volume Kerucut " + k.hitungVolume());
            System.out.println();
        } else if (i == 1) {
            System.out.println("======== Limas Segi Empat========");
            System.out.println("Luas Permukaan Limas " +
            l.hitungLuasPermukaan());
            System.out.println("Volume Limas " + l.hitungVolume());
            System.out.println();
        } else if (i == 2) {
            System.out.println("======== Bola ========");
            System.out.println("Luas Permukaan Bola " +
            b.hitungLuasPermukaan());
            System.out.println("Volume Bola " + b.hitungVolume());
            System.out.println();
            }
        }
    }
}
```

_Kode Program Class Kerucut_
```java
public class Kerucut {
    public int jariJari;
    public int sisiMiring;

    public Kerucut(int r, int s) {
        jariJari = r;
        sisiMiring = s;
    }

    public double hitungLuasPermukaan(){
        return 3.14 * jariJari * (sisiMiring + jariJari);
    }
    
    public double tinggi() {
        return Math.sqrt(Math.pow(sisiMiring,2) - Math.pow(jariJari,2));
    }

    public double hitungVolume(){
        return  0.3333333333333333 * 3.14  * jariJari * jariJari * tinggi();
        }
}
```

_Kode Program Class Limas Segi Empat_
```java
public class Limas {
    public int alas;
    public int tinggi;
        
    public Limas(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuasPermukaan(){
        return (alas * alas) * (4 * (0.5 * alas * tinggi) );
    }

    public double hitungVolume(){
        return 0.3333333333333333 * (alas * alas) * tinggi;
    }
}
```

_Kode Program Class Bola_
```java
public class Bola {
    public int jariJari;

    public Bola(int r){
        jariJari = r;
    }

    public double hitungLuasPermukaan(){
        return 4 * 3.14 * jariJari *jariJari;
    }

    public double hitungVolume(){
        return 4 / 3.14 * jariJari * jariJari * jariJari;
    }
}
```

_Hasil Running_
 
2.	Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

_Kode Program Main_
```java
import java.util.Scanner;
public class DataMahasiswa {
     public static void main(String[] args) {
        Mahasiswa[] mArray = new Mahasiswa[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            mArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            mArray[i].nama = sc.next();
            System.out.print("Masukkan nim: ");
            mArray[i].nim = sc.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            mArray[i].gender = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mArray[i].ipk = sc.nextFloat();
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("nama: " + mArray[i].nama + "\nnim: " + mArray[i].nim + "\nJenis kelamin: " + mArray[i].gender + "\nNilai IPK: " + mArray[i].ipk);
        }
    }
}
```

_Kode program class Mahasiswa_
```java
public class Mahasiswa{
    public String nama;
    public long nim;
    public char gender;
    public float ipk;
}
```

_Hasil Running_
 
