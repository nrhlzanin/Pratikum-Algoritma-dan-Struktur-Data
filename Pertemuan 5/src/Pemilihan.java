package minggu5;

public class Pemilihan {
    int jml;
    String nama;
    
    public int voting(int[] pilih, int low, int high) {
        if(high - low == 1){
            if(pilih[low] >= pilih[high]){
                return pilih[low];
            }else{
                return pilih[high];
            }
        }else if(high > low){
            int m = (high - low) / 2 + low;
            int r = voting(pilih, m + 1, high);
            int l = voting(pilih, low, m);
            if(l != 0){
                return l;
            }else if (r != 0){
                return r;
            }
            return high;
        }
        return 0;
    }
}


