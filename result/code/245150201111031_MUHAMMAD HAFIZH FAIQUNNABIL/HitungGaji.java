import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja;
        int jamLembur = 0;
        int kurangJam = 0;
        int upah = 5000;
        int upahLembur = 6000;
        int denda = 1000;

        System.out.print("Jam kerja: ");
        jamKerja = input.nextInt();

        if (jamKerja > 60) {
            jamLembur = jamKerja - 60;
        } else if (jamKerja < 50) {
            kurangJam = 60 - jamKerja;
        }

        int totalUpah = upah * (jamKerja - jamLembur);
        int totalUpahLembur = upahLembur * jamLembur;
        int totalDenda = denda * kurangJam;

        System.out.printf("%-8s%s %d\n", "Upah", "= Rp.", totalUpah);
        System.out.printf("%-8s%s %d\n", "Lembur", "= Rp.", totalUpahLembur);
        System.out.printf("%-8s%s %d\n", "Denda", "= Rp.", totalDenda);
        System.out.println("---------------------");
        System.out.printf("%-8s%s %d\n", "Total", "= Rp.", totalUpah + totalUpahLembur - totalDenda);

        input.close();
    }
}
