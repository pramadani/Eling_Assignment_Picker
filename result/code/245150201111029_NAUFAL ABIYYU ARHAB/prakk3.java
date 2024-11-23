import java.util.Scanner;

public class prakk3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamkerja = input.nextInt();
        final String UNDERLINE = "\u001B[4m";
        final String RESET = "\u001B[0m";
        System.out.println("Jam kerja : " + UNDERLINE +jamkerja + RESET);

        int upahperjam = 5000;
        int bonus = 6000;
        int denda = 1000;
        int opey = 0;
        int upah; 

        if (jamkerja < 50) {
            upah = jamkerja * upahperjam;
            int a = 50 - jamkerja;
            int kapok = a * denda;
            opey = upah - kapok;
            System.out.printf("%-9s %c %s %d\n", "Upah", '=', "Rp.", upah);
            System.out.printf("%-9s %c %s %d\n", "Lembur", '=', "Rp.", 0);
            System.out.printf("%-9s %c %s %d\n", "Denda", '=', "Rp.", kapok);
        } else if (jamkerja >= 50 && jamkerja <= 60) {
            upah = jamkerja * upahperjam;
            opey = upah;
            System.out.printf("%-9s %c %s %d\n", "Upah", '=', "Rp.", upah);
            System.out.printf("%-9s %c %s %d\n", "Lembur", '=', "Rp.", 0);
            System.out.printf("%-9s %c %s %d\n", "Denda", '=', "Rp.", 0);
        } else {
            upah = 60 * upahperjam;
            int q = jamkerja - 60;
            int kerenfull = q * bonus;
            opey = upah + kerenfull;
            System.out.printf("%-9s %c %s %d\n", "Upah", '=', "Rp.", upah);
            System.out.printf("%-9s %c %s %d\n", "Lembur", '=', "Rp.", kerenfull);
            System.out.printf("%-9s %c %s %d\n", "Denda", '=', "Rp.", 0);
        }

        System.out.println("---------------------");
        System.out.printf("%-9s %c %s %d", "Total", '=', "Rp." ,opey);

        input.close();
    }
}
