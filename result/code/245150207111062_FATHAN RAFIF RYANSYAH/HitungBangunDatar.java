import java.util.Scanner;

public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Menghitung luas dan keliling persegi panjang");
            System.out.println("2. Menghitung luas dan keliling lingkaran");
            System.out.println("3. Menghitung luas dan keliling segitiga");
            System.out.println("Pilihan anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    double kelilingPersegiPanjang = 2 * (panjang + lebar);
                    double luasPersegiPanjang = panjang * lebar;
                    System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang + " cm");
                    System.out.println("Luas persegi panjang: " + luasPersegiPanjang + " cm2");
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = scanner.nextDouble();
                    double kelilingLingkaran = 2 * Math.PI * jariJari;
                    double luasLingkaran = Math.PI * jariJari * jariJari;
                    System.out.println("Keliling lingkaran: " + kelilingLingkaran + " cm");
                    System.out.println("Luas lingkaran: " + luasLingkaran + " cm2");
                    break;

                case 3:
                    System.out.print("Masukkan sisi a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Masukkan sisi c: ");
                    double c = scanner.nextDouble();
                    double kelilingSegitiga = a + b + c;
                    double s = kelilingSegitiga / 2;
                    double luasSegitiga = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Keliling segitiga: " + kelilingSegitiga + " cm");
                    System.out.println("Luas segitiga: " + luasSegitiga + " cm2");
                    break;

                default:
                    if (pilihan != 10) {
                        System.out.println("Data tak ditemukan, program dihentikan ...");
                    }
            }
        } while (pilihan != 10);
    }
}
