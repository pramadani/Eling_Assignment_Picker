import java.util.Scanner;

public class Luas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int pilihan, a, b, r;
    double luas, keliling;

    System.out.println("Menu:");
    System.out.println("1. menghitung luas dan keliling persegi panjang");
    System.out.println("2. menghitung luas dan keliling lingkaran");
    System.out.println("3. menghitung luas dan keliling segitiga");
    System.out.println();


    System.out.print("Pilihan anda: ");
    pilihan = scanner.nextInt();

    switch (pilihan) {
      case 1:
        System.out.print("Masukkan a: ");
        a = scanner.nextInt();
        System.out.print("Masukkan b: ");
        b = scanner.nextInt();
        System.out.println();

        luas = a * b;
        keliling = (a + b) * 2;

        System.out.printf("Keliling segitiga : %.0f cm%n", keliling);
        System.out.printf("Luas segitiga : %.0f cm2%n", luas);
        break;
      case 2:
        System.out.print("Masukkan r: ");
        r = scanner.nextInt();
        System.out.println();

        luas = Math.PI * r * r;
        keliling = 2 * Math.PI * r;
        
        System.out.printf("Keliling segitiga : %.0f cm%n", keliling);
        System.out.printf("Luas segitiga : %.0f cm2%n", luas);
        break;
      case 3:
        System.out.print("Masukkan a: ");
        a = scanner.nextInt();
        System.out.print("Masukkan b: ");
        b = scanner.nextInt();
        System.out.print("Masukkan r: ");
        r = scanner.nextInt();
        System.out.println();

        luas = a * b / 2;
        keliling = a + b + r;

        System.out.printf("Keliling segitiga : %.0f cm%n", keliling);
        System.out.printf("Luas segitiga : %.0f cm2%n", luas);
        break;
      default:
        System.out.printf("Data tak ditemukan, program dihentikan ...");
        break;
    }

    scanner.close();
  }
}
