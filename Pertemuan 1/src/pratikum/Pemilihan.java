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
public class Pemilihan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int nim, j = 0;
        
        System.out.print("Masukkan NIM: ");
        nim = input.nextInt();
        System.out.println("=============================");
        
        int n = nim % 100;
        if(n < 100){
            n += 10;
        }
        System.out.print("n : " + n);
        
        for (int i = 0; i < n; i++){
            if(j == hari.length){ 
            j = 0;
            }
        System.out.print(hari[j]);
        j++;
        }
        input.close();
    } 
}
