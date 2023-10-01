package uts;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class MainTransaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rekening[] rek = new Rekening[5];
        Transaksi[] tran = new Transaksi[5];

        rek[0] = new Rekening("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu");
        rek[1] = new Rekening("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        rek[2] = new Rekening("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org");
        rek[3] = new Rekening("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca");
        rek[4] = new Rekening("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com");

        tran[0] = new Transaksi(898214, 494048, 3587, "2021-03-09 07:54:42", "");
        tran[1] = new Transaksi(205420, 200162, 775880, "2021-06-25 10:23:00", "");
        tran[2] = new Transaksi(838632, 350929, 328316, "2021-09-18 23:00:04", "");
        tran[3] = new Transaksi(230659, 204434, 690503, "2022-02-02 19:10:34", "");
        tran[4] = new Transaksi(770592, 334245, 444267, "2020-08-11 13:36:56", "");
        
        int pilih = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Tampilkan data rekening");
            System.out.println("2. Tampilkan data transaksi");
            System.out.println("3. Mencari saldo > 50000");
            System.out.println("4. Shorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5) : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    tampilkanDataRekening();
                    break;
                
                case 2:
                    tampilkanDataTransaksi();
                    break;
                
                case 3:
                    urutkanDataRekening();
                    break;
                
                case 4:
                    cariDataRekening();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while (pilih != 5);
    }
    
}
