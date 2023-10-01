package minggu7;

public class PencarianMhs {
    
    Mahasiswa listMhs[];
    int idx = 0; 
   
    public void cari(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(left, middle, right);
        }
    }

    public void merge(int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        Mahasiswa L[] = new Mahasiswa[n1];
        Mahasiswa R[] = new Mahasiswa[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = listMhs[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = listMhs[middle + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].nim <= R[j].nim) {
                listMhs[k] = L[i];
                i++;
            } else {
                listMhs[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            listMhs[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            listMhs[k] = R[j];
            j++;
            k++;
        }
    }
 
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------");
        }
    }

    
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0; j <listMhs.length; j++){
            if(listMhs[j].nama.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosis(String x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }   
    
    public void TampilData(String x, int pos){
        if(pos != -1){
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else{
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return (mid);
            } else if(listMhs[mid].nim  < cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
}
