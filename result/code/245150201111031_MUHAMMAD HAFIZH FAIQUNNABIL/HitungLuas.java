import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double luas;
        double keliling;

        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        System.out.print("Pilihan anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                int p = input.nextInt();
                System.out.print("Masukkan lebar: ");
                int l = input.nextInt();
                luas = p * l;
                keliling = 2 * (p + l);
                System.out.printf("%-24s%s %.0f%s\n", "Keliling persegi panjang", ":", keliling, " cm");
                System.out.printf("%-24s%s %.0f%s\n", "Luas persegi panjang", ":", luas, " cm2");
                break;
            case 2:
                System.out.print("Masukkan jari-jari: ");
                int r = input.nextInt();
                luas = Math.PI * r * r;
                keliling = Math.PI * 2 * r;
                System.out.printf("%-18s%s %.2f%s\n", "Keliling lingkaran", ":", keliling, " cm");
                System.out.printf("%-18s%s %.2f%s\n", "Luas lingkaran", ":", luas, " cm2");
                break;
            case 3:
                System.out.print("Masukkan a: ");
                int a = input.nextInt();
                System.out.print("Masukkan b: ");
                int b = input.nextInt();
                System.out.print("Masukkan c: ");
                int c = input.nextInt();
                luas = 0.5 * a * b;
                keliling = a + b + c;
                System.out.printf("%-17s%s %.0f%s\n", "Keliling segitiga", ":", keliling, " cm");
                System.out.printf("%-17s%s %.0f%s\n", "Luas segitiga", ":", luas, " cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan...");
                break;
        }

        input.close();
    }
}
