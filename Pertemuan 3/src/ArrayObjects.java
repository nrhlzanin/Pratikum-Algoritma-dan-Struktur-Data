import java.util.Scanner;
public class ArrayObjects {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah persegi panjang: ");
        int pp = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[pp];
       
       for(int i=0; i < pp; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("Persegi panjang ke-" + i);
           System.out.print("Masukkan panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.print("Masukkan lebar: ");
           ppArray[i].lebar = sc.nextInt();
        }
       
       for(int i = 0; i < pp; i++){
           System.out.println("Persegi panjang ke-" + i);
           System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
       }
   }
}
