import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berat badan (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Tinggi badan (m): ");
        double tinggi = scanner.nextDouble();
        double imt = berat / (tinggi * tinggi);
        System.out.printf("IMT = %.2f\n", imt);
        if (imt <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.println("Termasuk normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.println("Termasuk gemuk");
        } else {
            System.out.println("Termasuk kegemukan");
        }
    }
}