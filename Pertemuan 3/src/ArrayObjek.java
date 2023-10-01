import java.util.Scanner;
public class ArrayObjek {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayObjek[] brArray = new ArrayObjek[3];
        int r=0, s=0, a=0, t=0;
        for (int i = 0; i < brArray.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("======== Kerucut ========");
                    System.out.print("Masukkan Jari-jari: ");
                    r = sc.nextInt();
                    System.out.print("Masukkan Sisi Miring: ");
                    s = sc.nextInt();
                    System.out.println();
                    break;
                case 1:
                    System.out.println("======== Limas Segi Empat========");
                    System.out.print("Masukkan Alas: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan Tinggi: ");
                    t = sc.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("======== Bola ========");
                    System.out.print("Masukkan Jari-jari: ");
                    r = sc.nextInt();
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
        System.out.println("========== Hasil Perhitungan ==========");
        Kerucut k= new Kerucut(r, s);
        Limas l = new Limas(a, t);
        Bola b = new Bola(r);
        
        System.out.println();
        for (int i = 0; i < brArray.length; i++) {
            if (i == 0) {
            System.out.println("======== Kerucut ========");
            System.out.println("Luas Permukaan Kerucut " + k.hitungLuasPermukaan());
            System.out.println("Volume Kerucut " + k.hitungVolume());
            System.out.println();
        } else if (i == 1) {
            System.out.println("======== Limas Segi Empat========");
            System.out.println("Luas Permukaan Limas " +
            l.hitungLuasPermukaan());
            System.out.println("Volume Limas " + l.hitungVolume());
            System.out.println();
        } else if (i == 2) {
            System.out.println("======== Bola ========");
            System.out.println("Luas Permukaan Bola " +
            b.hitungLuasPermukaan());
            System.out.println("Volume Bola " + b.hitungVolume());
            System.out.println();
            }
        }
    }
}
