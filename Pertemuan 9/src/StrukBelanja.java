package Tugas2;

/**
 *
 * @author USER
 */
public class StrukBelanja {
    String no;
    String tgl;
    int jml;
    double total;
    
    public StrukBelanja(String noTransaksi, String tglPembelian, int jumlahBarang, double totalHarga){
        this.no = noTransaksi;
        this.tgl = tglPembelian;
        this.jml = jumlahBarang;
        this.total = totalHarga;
    }
}
