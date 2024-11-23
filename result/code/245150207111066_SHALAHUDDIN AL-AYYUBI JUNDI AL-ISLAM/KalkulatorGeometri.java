import java.util.Scanner;

public class KalkulatorGeometri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        
        System.out.print("Pilihan anda: ");
        pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                
                double luasPersegiPanjang = panjang * lebar;
                double kelilingPersegiPanjang = 2 * (panjang + lebar);
                
                System.out.printf("Luas persegi panjang: %.2f cm2\n", luasPersegiPanjang);
                System.out.printf("Keliling persegi panjang: %.2f cm\n", kelilingPersegiPanjang);
                break;
                
            case 2:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                
                double luasLingkaran = Math.PI * jariJari * jariJari;
                double kelilingLingkaran = 2 * Math.PI * jariJari;
                
                System.out.printf("Luas lingkaran: %.2f cm2\n", luasLingkaran);
                System.out.printf("Keliling lingkaran: %.2f cm\n", kelilingLingkaran);
                break;
                
            case 3:
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double sisiMiring = scanner.nextDouble();
                
                double luasSegitiga = 0.5 * alas * tinggi;
                double kelilingSegitiga = alas + tinggi + sisiMiring;
                
                System.out.printf("Luas segitiga: %.2f cm2\n", luasSegitiga);
                System.out.printf("Keliling segitiga: %.2f cm\n", kelilingSegitiga);
                break;
                
            default:
                System.out.println("Data tak ditemukan, program dihentikan...");
        }
    }
}