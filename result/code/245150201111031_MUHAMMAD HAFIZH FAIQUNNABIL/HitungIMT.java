import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berat badan (kg): ");
        double bb = input.nextDouble();

        System.out.print("Tinggi badan (m): ");
        double tb = input.nextDouble();

        double imt = bb / (tb * tb);
        String kriteria;

        if (imt <= 18.5) {
            kriteria = "Kurus";
        } else if (imt > 18.5 && imt <= 25) {
            kriteria = "Normal";
        } else if (imt > 25 && imt <= 30) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Kegemukan";
        }

        input.close();

        System.out.printf("%s %.2f %s", "IMT =", imt, "Termasuk " + kriteria);
    }
}
