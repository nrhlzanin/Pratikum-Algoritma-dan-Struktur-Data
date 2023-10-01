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
