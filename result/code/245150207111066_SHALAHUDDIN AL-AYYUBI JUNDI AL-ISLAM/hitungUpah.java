import java.util.Scanner;

public class hitungUpah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jam kerja: ");
        int jamKerja = scanner.nextInt();
        
        int upahPerJam = 5000;
        int upahLemburPerJam = 6000;
        int dendaPerJam = 1000;
        int upah = 0;
        int lembur = 0;
        int denda = 0;
        if (jamKerja > 60) {
            upah = 60 * upahPerJam;
            lembur = (jamKerja - 60) * upahLemburPerJam;
        } else if (jamKerja >= 50) {
            upah = jamKerja * upahPerJam;
        } else {
            upah = jamKerja * upahPerJam;
            denda = (50 - jamKerja) * dendaPerJam;
        }
        
        int total = upah + lembur - denda;
        
        System.out.printf("Upah = Rp. %d\n", upah);
        System.out.printf("Lembur = Rp. %d\n", lembur);
        System.out.printf("Denda = Rp. %d\n", denda);
        System.out.println("---------------------");
        System.out.printf("Total = Rp. %d\n", total);
    }
}