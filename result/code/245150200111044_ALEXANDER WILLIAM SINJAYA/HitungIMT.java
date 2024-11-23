import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s: ", "Berat Badan (kg)");
        int b = input.nextInt();
        System.out.printf("%-20s: ", "Tinggi Badan (m)");
        double t = input.nextDouble();
        input.close();
        double imt = b / Math.pow(t, 2);
        String kategori;
        if (imt <= 18.5) kategori = "kurus";
        else if (imt <= 25) kategori = "normal";
        else if (imt <= 30) kategori = "gemuk";
        else kategori = "kegemukan";
        System.out.printf("IMT = %-7.2f Termasuk %s", imt, kategori);
    }
}
