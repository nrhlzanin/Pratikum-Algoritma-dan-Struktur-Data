import java.util.Scanner;

public class MayoritasSuara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah kandidat dan jumlah suara
        System.out.print("Masukkan jumlah kandidat: ");
        int numCandidates = sc.nextInt();

        System.out.print("Masukkan jumlah suara: ");
        int numVotes = sc.nextInt();

        // Input suara untuk setiap kandidat
        int[] candidateVotes = new int[numCandidates];
        for (int i = 0; i < numCandidates; i++) {
            System.out.print("Masukkan jumlah suara untuk kandidat ke-" + (i+1) + ": ");
            candidateVotes[i] = sc.nextInt();
        }

        // Cari nilai mayoritas suara
        int majority = numVotes / 2;
        int maxVotes = 0;
        for (int i = 0; i < numCandidates; i++) {
            if (candidateVotes[i] > maxVotes) {
                maxVotes = candidateVotes[i];
            }
        }

        // Cari kandidat dengan mayoritas suara
        int count = 0;
        for (int i = 0; i < numCandidates; i++) {
            if (candidateVotes[i] == maxVotes) {
                count++;
            }
        }

        if (count > numCandidates / 2 && maxVotes > majority) {
            System.out.println("Kandidat dengan mayoritas suara: ");
            for (int i = 0; i < numCandidates; i++) {
                if (candidateVotes[i] == maxVotes) {
                    System.out.println("Kandidat ke-" + (i+1) + " dengan " + maxVotes + " suara");
                }
            }
        } else {
            System.out.println("Tidak ada kandidat dengan mayoritas suara.");
        }
    }
}

