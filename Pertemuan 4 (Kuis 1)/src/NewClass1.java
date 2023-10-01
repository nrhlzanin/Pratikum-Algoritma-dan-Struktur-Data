package bukuperpustakaan;
import java.util.Scanner;
public class NewClass1 {
        public static void main(String[] args) {
           
    Scanner a = new Scanner(System. in );
    int nim, jenis, harga_sewa;
    int total_harga=0;
    String namaMHS;
    System.out.println ("===========================================================");
    System.out.println ("INPUT DATA PEMINJAM");
    System.out.println ("===========================================================");
    System.out.print   ("Masukkan Nama       = ");
    namaMHS = a.nextLine();
    System.out.print   ("Masukkan Nim        = ");
    nim = a.nextInt();
    System.out.print   ("Masukan Jumlah Buku = ");
    jenis = a.nextInt();
    System.out.println ("==========================================================");
    
    int jenis_arr[];
            jenis_arr = new int[jenis];
    String judul_arr[] = new String[jenis];
    
    for (int b = 0; b < jenis; b++) {
    System.out.print("Masukan Judul Buku : ");
    judul_arr[b] = a.next();
    if(jenis_arr[b]==1){
    harga_sewa = 5000;

    total_harga = total_harga+harga_sewa;
    }else if(jenis_arr[b]==2){
    harga_sewa = 3000;

    total_harga = total_harga+harga_sewa;
    }
    }
    System.out.println("");
    System.out.println ("==========================================================");
    System.out.println ("DATA PEMINJAM");
    System.out.println ("==========================================================");
    System.out.println ("Nama Mahasiswa               = "+namaMHS);
    System.out.println ("Nim Mahasiswa                = "+nim);
    System.out.println ("Total Biaya Pinjam           = "+total_harga);
    System.out.println ("==========================================================");
    System.out.println ("DAFTAR BUKU YANG DIPINJAM");
    System.out.println ("==========================================================");
    for (int b = 0;b<jenis;b++){
    System.out.println ("Judul Buku Ke : " + b +": " + judul_arr [b]);
    }
        }
    }

