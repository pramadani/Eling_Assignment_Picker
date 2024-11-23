package PRAKTIKUM;

import java.util.Scanner;

public class TPraktikum1 {
    // utk hitung l n p persegi panjang
    public static void persegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.printf("Luas persegi panjang: %.2f cm2\n", luas);
        System.out.printf("Keliling persegi panjang: %.2f cm\n", keliling);
    }

    // utk itung l n k lingkaran
    public static void lingkaran(double radius) {
        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;
        System.out.printf("Luas lingkaran: %.2f cm2\n", luas);
        System.out.printf("Keliling lingkaran: %.2f cm\n", keliling);
    }

    // utk itung l n k segitiga
    public static void segitiga(double a, double b, double c) {
        double keliling = a + b + c;
        double s = keliling / 2; // Setengah dari keliling
        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Rumus Heron
        System.out.printf("Keliling segitiga: %.2f cm\n", keliling);
        System.out.printf("Luas segitiga: %.2f cm2\n", luas);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double a, b, c, r, panjang, lebar;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menghitung luas dan keliling persegi panjang");
            System.out.println("2. Menghitung luas dan keliling lingkaran");
            System.out.println("3. Menghitung luas dan keliling segitiga");
            System.out.print("Pilihan anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    lebar = scanner.nextDouble();
                    persegiPanjang(panjang, lebar);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari (r): ");
                    r = scanner.nextDouble();
                    lingkaran(r);
                    break;

                case 3:
                    System.out.print("Masukkan sisi a: ");
                    a = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    b = scanner.nextDouble();
                    System.out.print("Masukkan sisi c: ");
                    c = scanner.nextDouble();
                    segitiga(a, b, c);
                    break;

                default:
                    System.out.println("Data tak ditemukan, program dihentikan ...");
                    return;
            }
        }
    }
}

