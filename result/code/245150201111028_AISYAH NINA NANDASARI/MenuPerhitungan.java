import java.util.Scanner;

public class MenuPerhitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("\nPilihan anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                int panjang = input.nextInt();
                System.out.print("Masukkan lebar: ");
                int lebar = input.nextInt();
                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println("Luas persegi panjang: " + luasPersegiPanjang + " cm2");
                System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang + " cm");
                break;
            case 2:
                System.out.print("Masukkan jari-jari (r): ");
                int r = input.nextInt();
                int luasLingkaran = (int) Math.round(Math.PI * r * r);
                int kelilingLingkaran = (int) Math.round(2 * Math.PI * r);
                System.out.println("Luas lingkaran: " + luasLingkaran + " cm2");
                System.out.println("Keliling lingkaran: " + kelilingLingkaran + " cm");
                break;
            case 3:
                System.out.print("Masukkan alas (a): ");
                int a = input.nextInt();
                System.out.print("Masukkan tinggi (t): ");
                int t = input.nextInt();
                System.out.print("Masukkan sisi miring (b): ");
                int b = input.nextInt();
                int kelilingSegitiga = a + b + t;
                int luasSegitiga = (a * t) / 2;
                System.out.println("Keliling segitiga: " + kelilingSegitiga + " cm");
                System.out.println("Luas segitiga: " + luasSegitiga + " cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan...");
        }
    }
}
