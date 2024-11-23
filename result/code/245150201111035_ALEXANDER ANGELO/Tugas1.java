import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.println("");

        System.out.print("Pilihan anda: ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan lebar (cm): ");
                int lebar = in.nextInt();
                System.out.print("Masukkan panjang (cm): ");
                int panjang = in.nextInt();

                System.out.printf("%-26s: %d cm\n", "Keliling persegi panjang", (lebar+panjang)*2);
                System.out.printf("%-26s: %d cm2\n", "Luas persegi panjang", lebar*panjang);
                break;
            case 2:
                System.out.print("Masukkan jari-jari: ");
                int r = in.nextInt();

                System.out.printf("%-20s: %.4f cm\n", "Keliling lingkaran", 3.1415*2*r);
                System.out.printf("%-20s: %.4f cm2\n", "Luas lingkaran", 3.1415*r*r);
                break;
            case 3:
                System.out.print("Masukkan c (sisi terpanjang): ");
                int c = in.nextInt();
                System.out.print("Masukkan b: ");
                int b = in.nextInt();
                System.out.print("Masukkan a: ");
                int a = in.nextInt();
                float s = (a+b+c)/2.0f;

                if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2)) {
                    System.out.println("Segitiga tidak bisa dibentuk");
                }
                else {
                    System.out.printf("%-20s: %.1f cm\n", "Keliling segitiga", 2*s);
                    System.out.printf("%-20s: %.3f cm2\n", "Luas segitiga", Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                }
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }
}
