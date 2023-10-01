public class Kerucut {
    public int jariJari;
    public int sisiMiring;

    public Kerucut(int r, int s) {
        jariJari = r;
        sisiMiring = s;
    }

    public double hitungLuasPermukaan(){
        return 3.14 * jariJari * (sisiMiring + jariJari);
    }
    
    public double tinggi() {
        return Math.sqrt(Math.pow(sisiMiring,2) - Math.pow(jariJari,2));
    }

    public double hitungVolume(){
        return  0.3333333333333333 * 3.14  * jariJari * jariJari * tinggi();
        }
}