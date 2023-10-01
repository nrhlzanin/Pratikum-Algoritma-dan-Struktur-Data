package uts;

/**
 *
 * @author USER
 */
public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    
    
    public Transaksi(double a, double b, double c, String d, String e){
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.tanggalTransaksi = d;
        this.type = e;
    }
    
    void tampilkanDataTransaksi(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type){
        for (Transaksi transaksi : tran) {
            System.out.println(transaksi);
        }
    }    
}
