import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  berat badan
        System.out.print("Berat badan (kg) : ");
        double beratBadan = scanner.nextDouble();
        
        //  tinggi badan
        System.out.print("Tinggi badan (m) : ");
        double tinggiBadan = scanner.nextDouble();
        // IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.printf("IMT = %.2f\n", imt);
        
        // kriteria kegemukan
        String kriteria;
        if (imt <= 18.5) {
            kriteria = "Kurus";
        } else if (imt <= 25) {
            kriteria = "Normal";
        } else if (imt < 30) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Kegemukan";
        }
        
        System.out.printf("Kriteria: %s\n", kriteria);
        System.out.print("\nBerat badan (kg) : ");
        beratBadan = scanner.nextDouble();
        
        System.out.print("Tinggi badan (m) : ");
        tinggiBadan = scanner.nextDouble();
        
        imt = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.printf("IMT = %.2f\n", imt);
        
        if (imt <= 18.5) {
            kriteria = "Kurus";
        } else if (imt <= 25) {
            kriteria = "Normal";
        } else if (imt < 30) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Kegemukan";
        }        
        System.out.printf("Kriteria: %s\n", kriteria);
        
        scanner.close();
    }
}
