import java.util.Scanner;
public class DataMahasiswa {
     public static void main(String[] args) {
        Mahasiswa[] mArray = new Mahasiswa[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            mArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            mArray[i].nama = sc.next();
            System.out.print("Masukkan nim: ");
            mArray[i].nim = sc.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            mArray[i].gender = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mArray[i].ipk = sc.nextFloat();
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("nama: " + mArray[i].nama + "\nnim: " + mArray[i].nim + "\nJenis kelamin: " + mArray[i].gender + "\nNilai IPK: " + mArray[i].ipk);
        }
    }
}
