/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Fungsib {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] stock = {{10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}};

        System.out.println("Jumlah Stock Bunga: ");
        int[] jumlahStock = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jumlahStock[j] += stock[i][j];
            }
        }
        System.out.println("Aglonema: " + jumlahStock[0]);
        System.out.println("Keladi: " + jumlahStock[1]);
        System.out.println("Alocasia: " + jumlahStock[2]);
        System.out.println("Mawar: " + jumlahStock[3]);
    }
}
