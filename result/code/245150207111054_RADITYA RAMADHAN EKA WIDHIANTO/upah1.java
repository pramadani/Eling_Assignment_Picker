package PRAKTIKUM2;
import java.util.Scanner;

public class upah1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jam Kerja    : ");
        int jamKerja1;
        jamKerja1 = in.nextInt();
        
        int upah1 = 0;
        int denda1 = 0;
        int lembur1 = 0;
        
        if (jamKerja1 > 60) {
            upah1 = 60 * 5000;
            lembur1 = (jamKerja1 - 60) * 6000;
        }
        else if (jamKerja1 < 50) {
            upah1 = jamKerja1 * 5000;
            denda1 = (50 - jamKerja1) * 1000;
        }
        else {
            upah1 = jamKerja1 * 5000;
        }
        int total1 = upah1 + lembur1 - denda1;
        
        System.out.println("Upah   = Rp. " + upah1);
        System.out.println("Lembur = Rp. " + lembur1);
        System.out.println("Denda  = Rp. " + denda1);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + total1);
        
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Jam Kerja    : ");
        int jamKerja2;
        jamKerja2 = in.nextInt();

        int upah2 = 0;
        int denda2 = 0;
        int lembur2 = 0;
        
        if (jamKerja2 > 60) {
            upah2 = 60 * 5000;
            lembur2 = (jamKerja2 - 60) * 6000;
        }
        else if (jamKerja2 < 50) {
            upah2 = jamKerja2 * 5000;
            denda2 = (50 - jamKerja2) * 1000;
        }
        else {
            upah2 = jamKerja2 * 5000;
        }
        int total2 = upah2 + lembur2 - denda2;
        
        System.out.println("Upah   = Rp. " + upah2);
        System.out.println("Lembur = Rp. " + lembur2);
        System.out.println("Denda  = Rp. " + denda2);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + total2);

        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Jam Kerja    : ");
        int jamKerja3;
        jamKerja3 = in.nextInt();

        int upah3 = 0;
        int denda3 = 0;
        int lembur3 = 0;
        
        if (jamKerja1 > 60) {
            upah3 = 60 * 5000;
            lembur3 = (jamKerja3 - 60) * 6000;
        }
        else if (jamKerja3 < 50) {
            upah3 = jamKerja3 * 5000;
            denda3 = (50 - jamKerja3) * 1000;
        }
        else {
            upah3 = jamKerja3 * 5000;
        }
        int total3 = upah3 + lembur3 - denda3;
        
        System.out.println("Upah   = Rp. " + upah3);
        System.out.println("Lembur = Rp. " + lembur3);
        System.out.println("Denda  = Rp. " + denda3);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + total3);
    }
}
