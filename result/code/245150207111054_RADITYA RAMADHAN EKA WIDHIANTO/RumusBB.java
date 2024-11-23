package PRAKTIKUM2;
import java.util.Scanner;

public class RumusBB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tinggi1, berat1, tinggi2, berat2;
        System.out.print("Berat Badan (kg)     : ");
        berat1 = in.nextDouble();
        System.out.print("Tinggi Badan (m)     : ");
        tinggi1 = in.nextDouble();

        double rumus1 = berat1 / (tinggi1 * tinggi1);
        System.out.printf("IMT = %.2f ", rumus1);

        if (rumus1 <= 18.5) {
            System.out.println("Termasuk Kurus");
        }
        else if (rumus1 <= 25 ) {
            System.out.println("Termasuk Normal");
        }
        else if (rumus1 <= 30) {
            System.out.println("Termasuk Gemuk");
        }
        else {
            System.out.println("Termasuk Kegemukan");
        }

        System.out.print("Berat Badan (kg)     : ");
        berat2 = in.nextDouble();
        System.out.print("Tinggi Badan (m)     : ");
        tinggi2 = in.nextDouble();

        double rumus2 = berat2 / (tinggi2 * tinggi2);
        System.out.printf("IMT = %.2f ", rumus2);
        
        if (rumus2 <= 18.5) {
            System.out.println("Termasuk Kurus");
        }
        else if (rumus2 <= 25 ) {
            System.out.println("Termasuk Normal");
        }
        else if (rumus2 <= 30) {
            System.out.println("Termasuk Gemuk");
        }
        else {
            System.out.println("Termasuk Kegemukan");
        }
        
    }
}
