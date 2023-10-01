/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

/**
 *
 * @author USER
 */
public class Array {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        int[] pengurangan = {1, 2, 0, 5};

        int[] jmlStok = new int[4];
        int pendapatan = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jmlStok[j] += stok[i][j];
            }
        }
        System.out.println("===============================================");
        System.out.println("A. Jumlah seluruh stok berdasarkan jenis bunga pdi seluruh cabang:");
        System.out.println();
        System.out.println("Aglonema: " + jmlStok[0]);
        System.out.println("Keladi: " + jmlStok[1]);
        System.out.println("Alocasia: " + jmlStok[2]);
        System.out.println("Mawar: " + jmlStok[3]);
        System.out.println("===============================================");

        for (int i = 0; i < 4; i++) {
            pendapatan += (stok[0][i] - pengurangan[i]) * harga[i];
        }
        System.out.println("B. Total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis");
        System.out.println();
        System.out.printf("Jumlah Pendapatan RoyalGarden 1: Rp%,d", pendapatan);
        System.out.println();
        System.out.println("Informasi tambahan :");
        System.out.println("Terdapat pengurangan stock karena bunga tersebut mati pada cabang RoyalGarden 1.");
        System.out.println("Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.");
        System.out.println("===============================================");
    }
}
