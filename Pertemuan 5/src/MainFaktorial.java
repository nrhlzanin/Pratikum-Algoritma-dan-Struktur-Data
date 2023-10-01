package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long startTime1 = System.nanoTime();
        long endTime1 = System.nanoTime();
        
        long startTime2 = System.nanoTime();
        long endTime2 = System.nanoTime();
    
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Waktu eksekusi faktorialBF() " + (endTime1-startTime1));
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("Waktu eksekusi faktorialDC() " + (endTime2-startTime2));
        System.out.println("=====================================================");
    }
}