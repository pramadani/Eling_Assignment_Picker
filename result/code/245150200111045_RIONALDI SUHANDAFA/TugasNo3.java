import java.util.Scanner;
public class TugasNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-10s: ", "Jam Kerja");
        int jam = in.nextInt();

        if (jam < 50) {
            System.out.printf("%-8s= Rp. %6d\n", "Upah", jam * 5000);
            System.out.printf("%-8s= Rp. %6d\n", "Lembur", 0);
            System.out.printf("%-8s= Rp. %6d\n", "Denda", (50 - jam) * 1000);
            System.out.println("---------------------");
            System.out.printf("%-8s= Rp. %6d\n", "Total", jam * 5000 - ((50 - jam) * 1000));
        } else if (jam >= 50 && jam <= 60) {
            System.out.printf("%-8s= Rp. %6d\n", "Upah", jam * 5000);
            System.out.printf("%-8s= Rp. %6d\n", "Lembur", 0);
            System.out.printf("%-8s= Rp. %6d\n", "Denda", 0);
            System.out.println("---------------------");
            System.out.printf("%-8s= Rp. %6d\n", "Total", jam * 5000 );
        } else if (jam > 60) {
            System.out.printf("%-8s= Rp. %6d\n", "Upah", 300000);
            System.out.printf("%-8s= Rp. %6d\n", "Lembur", (jam - 60) * 6000);
            System.out.printf("%-8s= Rp. %6d\n", "Denda", 0);
            System.out.println("---------------------");
            System.out.printf("%-8s= Rp. %6d\n", "Total", 300000 + ((jam - 60) * 6000));
        }
        in.close();
    }
}