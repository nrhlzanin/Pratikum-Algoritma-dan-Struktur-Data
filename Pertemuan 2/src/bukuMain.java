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
