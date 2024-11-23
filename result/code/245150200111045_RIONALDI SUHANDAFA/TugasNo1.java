import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.println();
        System.out.print("Pilihan Anda: ");
        Scanner in = new Scanner(System.in);
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.printf("%-17s: ","Masukkan Panjang");
                int P = in.nextInt();
                System.out.printf("%-17s: ","Masukkan Lebar");
                int L = in.nextInt();
                System.out.println();
                System.out.printf("%-25s: %d cm\n", "Keliling Persegi Panjang", 2 * (Math.abs(P) + Math.abs(L)));
                System.out.printf("%-25s: %d cm2\n", "Luas Persegi Panjang", Math.abs(P) * Math.abs(L));
                break;
            case 2:
                System.out.printf("%-19s: ", "Masukkan jari-jari");
                int r = in.nextInt();
                System.out.println();
                System.out.printf("%-19s: %.2f cm\n", "Keliling Lingkaran", 3.14 * (Math.abs(r) + Math.abs(r)));
                System.out.printf("%-19s: %.2f cm2\n", "Luas Lingkaran", 3.14 * Math.abs(r) * Math.abs(r));
                break;
            case 3:
                System.out.printf("%-23s: ", "Masukkan Alas");
                int a = in.nextInt();
                System.out.printf("%-23s: ", "Masukkan sisi miring 1");
                int b = in.nextInt();
                System.out.printf("%-23s: ", "Masukkan sisi miring 2");
                int c = in.nextInt();
                System.out.printf("%-23s: ", "Masukkan Tinggi");
                int t = in.nextInt();
                System.out.println();
                System.out.printf("%-18s: %d cm\n", "Keliling Segitiga", a + b + c);
                System.out.printf("%-18s: %.1f cm2\n", "Luas Segitiga", 0.5 * a * t);
                break;
            case 4:
                System.out.println("Keluar dari program ...");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
        in.close();
    }
}