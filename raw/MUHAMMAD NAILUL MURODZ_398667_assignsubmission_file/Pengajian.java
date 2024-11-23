import java.util.Scanner;
public class Pengajian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int BATAS_MAKSIMAL = 60;
        final int BATAS_MINIMAL = 50;
        final int UPAH_NORMAL = 5000;
        final int UPAH_LEMBUR = 6000;
        final int DENDA = 1000;
        
        System.out.print("Jam kerja : ");
        int jamKerja = scanner.nextInt();
        
        int upah, lembur, denda;
        
        if (jamKerja > BATAS_MAKSIMAL) {
            upah = BATAS_MAKSIMAL * UPAH_NORMAL;
            System.out.println("Upah = Rp. " + upah);
            lembur = (jamKerja - BATAS_MAKSIMAL) * UPAH_LEMBUR;
            System.out.println("Lembur = Rp. " + lembur);
            denda = 0;
            System.out.println("Denda = Rp. " + denda);
        } else if (jamKerja >= BATAS_MINIMAL) {
            upah = jamKerja * UPAH_NORMAL;
            System.out.println("Upah = Rp. " + upah);
            lembur = 0;
            System.out.println("Lembur = Rp. " + lembur);
            denda = 0;
            System.out.println("Denda = Rp. " + denda);
        } else {
            upah = jamKerja * UPAH_NORMAL;
            System.out.println("Upah = Rp. " + upah);
            lembur = 0;
            System.out.println("Lembur = Rp. " + lembur);
            denda = (BATAS_MINIMAL - jamKerja) * DENDA;
            System.out.println("Denda = Rp. " + denda);
        }
        int total = upah + lembur - denda;
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + total);
    }
}

