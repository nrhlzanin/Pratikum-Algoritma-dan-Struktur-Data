package bukuperpustakaan;

public class NewClass {
    public void pinjamBuku(){
        String namaPeminjam = "";
        String bukuKode = "";
        String peminjaman = "";
        String dataBuku = displayData();
        namaPeminjam = JOptionPane.showInputDialog("Masukkan nama peminjam : ");
        if(namaPeminjam.length()==0){
            showError("Maaf nama peminjam harus diisi");
        }

        bukuKode = JOptionPane.showInputDialog(dataBuku+"\nMasukkan kode buku yang ingin Anda pinjam ");
        if(in_array(bukuKode, kodeBuku)){
            peminjaman = namaPeminjam+"$"+bukuKode+"$"+now()+"\n";
            peminjam += peminjaman;
            JOptionPane.showMessageDialog(rootPane, "Peminjaman buku berhasil", "Operasi Sukses", JOptionPane.INFORMATION_MESSAGE);
            displayPeminjam();
        }else{
            showError("Maaf kode buku yang Anda masukkan tidak tersedia");
        }
    }

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
            showError("Maaf, tidak bisa melakukan pengembalian buku dengan data tersebut");
        }else{
            peminjam = tampunganKembali;
            JOptionPane.showMessageDialog(rootPane, "Pengembalian buku berhasil dilakukan", "Operasi Sukses", JOptionPane.INFORMATION_MESSAGE);
            displayPeminjam();
        }
    }
}
