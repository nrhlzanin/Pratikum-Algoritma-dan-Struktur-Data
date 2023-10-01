package minggu5;

import java.util.Scanner;

public class PemilihanKetuaBEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pemilihan vote = new Pemilihan();
        
        System.out.print("Masukkan banyak suara : ");
        vote.jml = sc.nextInt();
        int pilih[] = new int [vote.jml];
        
        System.out.println("Nama-nama calon");
        System.out.println("=====================================================");
        System.out.println("1. Haris");
        System.out.println("2. Dian");
        System.out.println("3. Rani");
        System.out.println("4. Bisma ");
        System.out.println("=====================================================");
        for (int i = 0; i < vote.jml; i++) {
            System.out.print("Pilih salah satu kandidat (1-4) : ");
            pilih[i] = sc.nextInt();
        }
        
        int suara = vote.voting(pilih, 0, vote.jml);
        switch (suara) {
            case 1:
                vote.nama = "Haris";
                break;
            case 2:
                vote.nama = "Dian";
                break;
            case 3:
                vote.nama = "Rani";
                break;
            case 4:
                vote.nama = "Bisma";
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak ada");
                break;
        }
        System.out.println("==============================================================================================");
        System.out.println("Kandidat yang calon ketua BEM yanng memiliki mayoritas suara adalah " + vote.nama);
        System.out.println("=============================================================================================");
        
    }
}
