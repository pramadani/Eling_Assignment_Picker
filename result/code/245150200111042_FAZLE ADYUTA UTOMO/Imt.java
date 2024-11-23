import java.util.Scanner;

public class Imt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Berat badan (kg) : ");
    double berat = scanner.nextDouble();
    System.out.print("Tinggi badan (m) : ");
    double tinggi = scanner.nextDouble();

    scanner.close();

    double imt = berat / (tinggi * tinggi);
    String label = "kegemukan";

    if (imt <= 18.5) {
      label = "kurus";
    } else if (imt <= 25) {
      label = "normal";
    } else if (imt < 30) {
      label = "gemuk";
    }

    System.out.printf("IMT = %f Termasuk %s%n", imt, label);
  }
}
