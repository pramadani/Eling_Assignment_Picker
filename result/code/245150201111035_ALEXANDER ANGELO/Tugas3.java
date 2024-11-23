import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jam kerja : ");
        int jamker = in.nextInt();

        int upah = 0, lembur = 0, denda = 0;
        if (jamker>60) {
            upah = 60*5000;
            lembur = (jamker-60)*6000;
        }
        else if (jamker<50) {
            upah = jamker*5000;
            denda = (50-jamker)*1000;
        }
        else {
            upah = jamker*5000;
        }

        System.out.printf("%-7s= Rp. %,d\n", "Upah", upah);
        System.out.printf("%-7s= Rp. %,d\n", "Lembur", lembur);
        System.out.printf("%-7s= Rp. %,d\n", "Denda", denda);
        System.out.println("---------------------");
        System.out.printf("%-7s= Rp. %,d\n", "Total", upah+lembur-denda);
    }
}
