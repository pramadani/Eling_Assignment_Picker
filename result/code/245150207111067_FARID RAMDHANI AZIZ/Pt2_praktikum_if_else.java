
package pt2_praktikum_if_else;
    import java.util.Scanner;
public class Pt2_praktikum_if_else {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         // Input pertama
         double beratBadan1, tinggiBadan1;
        System.out.print("Berat badan (kg): ");
         beratBadan1 = input.nextDouble();
        System.out.print("Tinggi badan (m): ");
         tinggiBadan1 = input.nextDouble();

        // Menghitung IMT untuk input pertama
        double imt1 = beratBadan1 / (tinggiBadan1 * tinggiBadan1);
        String kriteria1;

        // Menentukan kriteria IMT untuk input pertama
        if (imt1 <= 18.5) {
            kriteria1 = "Kurus";
        } else if (imt1 > 18.5 && imt1 <= 25) {
            kriteria1 = "Normal";
        } else if (imt1 > 25 && imt1 <= 30) {
            kriteria1 = "Gemuk";
        } else {
            kriteria1 = "Kegemukan";
        }

        // Menampilkan hasil untuk input pertama
        System.out.printf("IMT = %.2f Termasuk %s\n", imt1, kriteria1);

        // Input kedua
        double beratBadan2, tinggiBadan2;
        System.out.print("Berat badan (kg): ");
         beratBadan2 = input.nextDouble();
        System.out.print("Tinggi badan (m): ");
         tinggiBadan2 = input.nextDouble();

        // Menghitung IMT untuk input kedua
        double imt2 = beratBadan2 / (tinggiBadan2 * tinggiBadan2);
        String kriteria2;

        // Menentukan kriteria IMT untuk input kedua
        if (imt2 <= 18.5) {
            kriteria2 = "Kurus";
        } else if (imt2 > 18.5 && imt2 <= 25) {
            kriteria2 = "Normal";
        } else if (imt2 > 25 && imt2 <= 30) {
            kriteria2 = "Gemuk";
        } else {
            kriteria2 = "Kegemukan";
        }

        // Menampilkan hasil untuk input kedua
        System.out.printf("IMT = %.2f Termasuk %s\n", imt2, kriteria2);
        
    }
    
}
