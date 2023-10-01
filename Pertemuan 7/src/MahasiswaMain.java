package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        
        Mahasiswa listMahasiswa[] = new Mahasiswa[jumMhs];
        int urut[] = new int[jumMhs];
        PencarianMhs data = new PencarianMhs();
        int jumlah = jumMhs;
        
        System.out.println("---------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("------------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            //data.tambah(m);
            listMahasiswa[i] = m;
        }       
        
        data.listMhs = listMahasiswa;
        data.cari(urut);
        System.out.println("-----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa");
        data.tampil();

        System.out.println("_______________________________________________");
        System.out.println("_______________________________________________");
        System.out.println("Pencarian Data: ");    
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("Nama\t: ");
        String cari = sl.nextLine();
        System.out.print("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosis(cari, posisi);
        data.TampilData(cari, posisi);
            
//        System.out.println("================================================");
//        System.out.print("menggunakan binary Search");
//        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
//        data.TampilPosis(cari, posisi);
//        data.TampilData(cari, posisi);

    }
}
