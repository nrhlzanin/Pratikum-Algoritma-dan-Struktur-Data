import static java.lang.Math.sqrt;
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas(){
        return alas * tinggi / 2;
    }
    
    public int hitungKeliling(){
        int miring = (int) sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + miring;
    }
}
