package bukuperpustakaan;
import java.util.Scanner;
public class BukuPerpustakaan {
    public static void main(String[] args) {
        registrasi[] regis = new registrasi[3];
        buku[] data = new buku[2];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
        System.out.println ("===========================================================");
        System.out.println ("INPUT DATA PEMINJAM");
        System.out.println ("===========================================================");
        System.out.print   ("Masukkan Nama       = ");
        regis[i].nama = sc.nextLine();
        System.out.print   ("Masukkan Nim        = ");
        regis[i].nim = sc.nextInt();
        System.out.print   ("Masukan Jumlah Buku = ");
        regis[i].jml = sc.nextInt();
        System.out.println ("==========================================================");
        }
        for (int b = 0; b < 2; b++) {
        System.out.print("Masukan Judul Buku : ");
        data[b].namaBuku = sc.next();
        System.out.print("Masukkan nama pengarang: ");
        data[b].pengarang = sc.next();
        }
        
        System.out.println("");
        System.out.println ("==========================================================");
        System.out.println ("DATA PEMINJAM");
        System.out.println ("==========================================================");
        System.out.println ("Nama Mahasiswa               = " + regis[1].nama);
        System.out.println ("==========================================================");
        System.out.println ("DAFTAR BUKU YANG DIPINJAM");
        System.out.println ("==========================================================");
        System.out.println ("Judul Buku : " + data[1].namaBuku);
        System.out.println ("Judul Buku : " + data[1].pengarang);
    }
}
