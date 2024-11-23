
import java.util.Scanner;

public class hitungUpah {
    public static void main(String[] args) {
        int jamKerja;
        int jamLembur;
        int jamKurang;
        int upah = 5000;
        int denda = 1000;
        int lembur = 6000;
        int upahRP = 0;
        int lemburRP = 0;
        int dendaRP = 0;
        int total;

        Scanner in = new Scanner(System.in);
        System.out.printf("%-15s: ", "Jam kerja");
        jamKerja = in.nextInt();

        if (jamKerja <= 60 && jamKerja >= 50){
            upahRP = jamKerja * upah;
        }else if (jamKerja > 60){
            jamLembur = jamKerja - 60;
            upahRP = 60 * upah;
            lemburRP = (jamLembur * lembur);
        }else if (jamKerja < 50){
            jamKurang = 50 - jamKerja;
            upahRP = jamKerja * upah;
            dendaRP = (jamKurang * denda);
        }

        
        total = upahRP + lemburRP - dendaRP;

        System.out.printf("\n%-7s: Rp.%d", "Upah",upahRP);
        System.out.printf("\n%-7s: Rp.%d", "Lembur",lemburRP);
        System.out.printf("\n%-7s: Rp.%d", "Denda",dendaRP);

        System.out.println("\n---------------------");
        System.out.printf("%-7s: Rp.%d", "Total",total);
        in.close();
    }
}
