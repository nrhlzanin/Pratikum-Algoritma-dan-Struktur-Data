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
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        long nim, n;
        int j = 0;
        
        System.out.print("Masukkan NIM: ");
        nim = input.nextLong();
        System.out.println("=============================");
        
        n = nim % 100;
        if(n < 10){
            n += 10;
        }
        System.out.println("n : " + n);
        
        for (int i = 0; i < n; i++) {
            if (j == hari.length) {
                j = 0;
            }
                System.out.print(hari[j] + " ");
                j++;
        }
        input.close();
    }
}
