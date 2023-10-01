package Tugas2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StrukMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kapasitas stack: ");
        int kapasitas = input.nextInt();

        StackStruk stack = new StackStruk(kapasitas);

        int pilihan = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Tambah data struk belanja");
            System.out.println("2. Ambil data struk belanja");
            System.out.println("3. Tampilkan data struk belanja yang tersimpan");
            System.out.println("4. Tukar struk belanja dengan voucher");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nomor Transaksi: ");
                    String noTransaksi = input.next();
                    System.out.print("Tanggal Pembelian: ");
                    String tglPembelian = input.next();
                    System.out.print("Jumlah Barang: ");
                    int jumlahBarang = input.nextInt();
                    System.out.print("Total Harga Bayar: ");
                    double totalHarga = input.nextDouble();
                    StrukBelanja struk = new StrukBelanja(noTransaksi, tglPembelian, jumlahBarang, totalHarga);
                    stack.push(struk);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.print();
                    break;

                case 4:
                    System.out.print("Jumlah struk yang ingin ditukar: ");
                    int jumlahStruk = input.nextInt();
                    stack.tukarVoucher(jumlahStruk, 500 / 100.0);
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while (pilihan != 5);
    }
}

