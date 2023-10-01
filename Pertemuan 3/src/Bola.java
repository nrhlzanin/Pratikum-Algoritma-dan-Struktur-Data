 public class Bola {
    public int jariJari;

    public Bola(int r){
        jariJari = r;
    }

    public double hitungLuasPermukaan(){
        return 4 * 3.14 * jariJari *jariJari;
    }

    public double hitungVolume(){
        return 4 / 3.14 * jariJari * jariJari * jariJari;
    }
}