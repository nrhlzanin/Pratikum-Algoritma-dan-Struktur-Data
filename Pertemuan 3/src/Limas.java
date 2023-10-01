public class Limas {
    public int alas;
    public int tinggi;
        
    public Limas(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuasPermukaan(){
        return (alas * alas) * (4 * (0.5 * alas * tinggi) );
    }

    public double hitungVolume(){
        return 0.3333333333333333 * (alas * alas) * tinggi;
    }
}