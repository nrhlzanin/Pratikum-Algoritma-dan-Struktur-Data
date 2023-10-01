package Pratikum1;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);

        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data pakaian (Push)");
            System.out.println("2. Hapus data pakaian teratas (Pop)");
            System.out.println("3. Tampilkan data pakaian teratas (Peek)");
            System.out.println("4. Tampilkan seluruh data pakaian");
            System.out.println("5. Tampilkan data pakaian dengan harga terendah");
            System.out.print("Pilih menu: ");
            
            int menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();
                    
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                    
                case 2:
                    stk.pop();
                    break;
                    
                case 3:
                    stk.peek();
                    break;
                    
                case 4:
                    stk.print();
                    break;
                    
                case 5:
                    stk.getMin();
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
            
            System.out.print("Apakah Anda akan melanjutkan program (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');
    }
}
