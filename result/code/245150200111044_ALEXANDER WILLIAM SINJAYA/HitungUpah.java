import java.util.Scanner;

public class HitungUpah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s: ", "Jam kerja");
        int jamKerja = input.nextInt();
        input.close();
        long upah = (jamKerja <= 60) ? jamKerja * 5000 : 300000;
        long lembur = (jamKerja > 60) ? (jamKerja - 60) * 6000 : 0;
        long denda = (jamKerja < 50) ? (50 - jamKerja) * 1000 : 0;
        long total = upah + lembur - denda;
        System.out.printf("%-7s= Rp. %d%n", "Upah", upah);
        System.out.printf("%-7s= Rp. %d%n", "Lembur", lembur);
        System.out.printf("%-7s= Rp. %d%n", "Denda", denda);
        System.out.println("---------------------");
        System.out.printf("%-7s= Rp. %d", "Total", total);
    }
}
