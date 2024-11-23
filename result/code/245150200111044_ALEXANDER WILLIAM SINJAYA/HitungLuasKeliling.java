import java.util.Scanner;

public class HitungLuasKeliling {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Pilihan anda: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan a: ");
                int a = input.nextInt();
                System.out.print("Masukkan b: ");
                int b = input.nextInt();
                int keliling = 2 * (a + b);
                int luas = a * b;
                System.out.println();
                System.out.printf("%-30s: %d cm%n", "Keliling persegi panjang", keliling);
                System.out.printf("%-30s: %d cm2%n", "Luas persegi panjang", luas);
            }
            case 2 -> {
                System.out.print("Masukkan r: ");
                int r = input.nextInt();
                double keliling = 2 * Math.PI * r;
                double luas = Math.PI * Math.pow(r, 2);
                System.out.println();
                System.out.printf("%-30s: %.2f cm%n", "Keliling lingkaran", keliling);
                System.out.printf("%-30s: %.2f cm2%n", "Luas lingkaran", luas);
            }
            case 3 -> {
                System.out.print("Masukkan a: ");
                int a = input.nextInt();
                System.out.print("Masukkan b: ");
                int b = input.nextInt();
                System.out.print("Masukkan c: ");
                int c = input.nextInt();
                int keliling = a + b + c;
                double s = keliling / 2;
                double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println();
                if ((int) luas == 0) {
                    System.out.println("Segitiga tidak ada");
                    break;
                }
                System.out.printf("%-30s: %d cm%n", "Keliling segitiga", keliling);
                System.out.printf("%-30s: %.2f cm2%n", "Luas segitiga", luas);
            }
            default -> {
                System.out.println("Data tak ditemukan, program dihentikan ...");
            }
        }
        input.close();
    }
}
