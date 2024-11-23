package PRAKTIKUM;

import java.util.Scanner;

public class TPraktikum2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Berat badan (kg): ");
        double berat = scanner.nextDouble();
        
        System.out.print("Tinggi badan (m): ");
        double tinggi = scanner.nextDouble();
        
        double imt = berat / (tinggi * tinggi);
        
        String kriteria;
        if (imt <= 18.5) {
            kriteria = "kurus";
        } else if (imt <= 25) {
            kriteria = "normal";
        } else if (imt <= 30) {
            kriteria = "gemuk";
        } else {
            kriteria = "kegemukan";
        }
        
        System.out.printf("IMT = %.2f Termasuk %s\n", imt, kriteria);
    }
}