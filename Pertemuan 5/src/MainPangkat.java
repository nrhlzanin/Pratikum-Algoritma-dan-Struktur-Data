package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat [] png = new Pangkat[elemen];
        
        for (int i = 0; i < elemen; i++){
            // png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            int n = sc.nextInt();
            System.out.print("Masukkan nilai pemangkatan ke-" + (i+1) + " : ");
            int p = sc.nextInt();
            png[i] = new Pangkat (n, p);
        }
        
        boolean exitMenu = false;
        do {
        System.out.println("=====================================================");
        System.out.println("Pilih Metode Perangkatan");
        System.out.println("1. Brute Force");
        System.out.println("2. Devide and Conquer ");
        System.out.println("3. Exit ");
        System.out.println("=====================================================");
        System.out.print("Pilih metode perpangkatan : ");
        int pilih = sc.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }   System.out.println("=====================================================");
                break;
            case 2:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }   System.out.println("=====================================================");
                break;
            default:
                System.out.println("Anda keluar");
                exitMenu = true;
                break;
        }
        
        } while (!exitMenu);
    }
}
