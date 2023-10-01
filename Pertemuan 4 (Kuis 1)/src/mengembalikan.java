package bukuperpustakaan;

public class mengembalikan {
    public void kembalikanBuku(String nama, String kode){
        String gabungan = nama+"$"+kode+"$";
        String kumpulanPeminjam[] = peminjam.split("\n");
        String tampunganKembali = "";
        boolean sukses = false;
        for(int i=0;i<kumpulanPeminjam.length;i++){
            if(kumpulanPeminjam.length==1){
                if(kumpulanPeminjam[i].startsWith(gabungan)){
                    sukses = true;
                }
            }else{
                if(!kumpulanPeminjam[i].startsWith(gabungan)){
                    sukses = true;
                    tampunganKembali += kumpulanPeminjam[i]+"\n";
                }
            }
        }
        if(!sukses){
            System.out.println("Maaf, tidak bisa melakukan pengembalian buku dengan data tersebut");
        }else{
            peminjam = tampunganKembali;
            JOptionPane.showMessageDialog(rootPane, "Pengembalian buku berhasil dilakukan", "Operasi Sukses", JOptionPane.INFORMATION_MESSAGE);
            displayPeminjam();
        }
    }
    
}
