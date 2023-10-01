package minggu5;

import java.util.Scanner;

public class MainSum {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlah = sc.nextInt();

        Sum[] sm = new Sum[jmlah];

        for (int i = 0; i < sm.length; i++) {

            System.out.printf("Masukkan jumlah bulan perusahaan ke - %d: ", (i + 1));
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);

            System.out.println("=============================================================");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
            System.out.println("=============================================================");
        }

        for (int i = 0; i < sm.length; i++) {
            System.out.println("\n\nKeuntungan Perusahaan ke - " + (1 + i));
            System.out.println("=============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perubahan selama %d bulan adalah = %.1f \n", sm[i].elemen, sm[i].totalBF(sm[i].keuntungan));

            System.out.println("=============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perubahan selama %d bulan adalah = %.1f \n", sm[i].elemen, sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }
    }
}
