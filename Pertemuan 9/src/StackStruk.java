package Tugas2;

/**
 *
 * @author USER
 */
public class StackStruk {
    int size;
    int top;
    StrukBelanja[] data;
    
    public StackStruk(int size) {
        this.size = size;
        data = new StrukBelanja[size];
        top = -1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == size - 1;
    }

    public void push(StrukBelanja struk) {
        if (!IsFull()) {
            top++;
            data[top] = struk;
            System.out.println("Data struk belanja berhasil ditambahkan");
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public StrukBelanja pop(){
        if (!IsEmpty()) {
            StrukBelanja x = data[top];
            top--;
            System.out.println("Data struk belanja: " + x.no + " " + x.tgl + " " + x.jml + " " + x.total + " berhasil diambil");
        } else {
            System.out.println("Stack sudah kosong");
        }
        return null;
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top].no + " " + data[top].tgl + " " + data[top].jml + " " + data[top].total);
    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Isi stack struk belanja:");
            for (int i = top; i >= 0; i--) {
                System.out.println("Nomor Transaksi: " + data[i].no);
                System.out.println("Tanggal Pembelian: " + data[i].tgl);
                System.out.println("Jumlah Barang : " + data[i].jml);
                System.out.println("Total Harga Bayar: " + data[i].total);
                System.out.println();
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void tukarVoucher(int jumlahStruk, double nilaiVoucher) {
        if (IsEmpty()) {
            System.out.println("Stack kosong, tidak ada data struk belanja yang bisa ditukar!");
            return;
        }

        if (jumlahStruk > size) {
            System.out.println("Jumlah struk yang ingin ditukar melebihi kapasitas stack!");
            return;
        }

        double nilaiVoucherDapat = jumlahStruk * (5 / 100.0);
        
        System.out.println("Nilai voucher yang didapat: " + nilaiVoucherDapat);
    }
}
