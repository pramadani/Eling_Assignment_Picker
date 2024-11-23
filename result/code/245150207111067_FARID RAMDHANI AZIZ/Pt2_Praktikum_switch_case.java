package pt2_praktikum_switch_case;
  import java.util.Scanner;
public class Pt2_Praktikum_switch_case {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pilihan;

        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                double panjang, lebar, luasPP, kelilingPP;
                System.out.print("Masukkan panjang: ");
                 panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                lebar = input.nextDouble();
                luasPP = panjang * lebar;
                kelilingPP = 2 * (panjang + lebar);
                System.out.printf("Luas persegi panjang: %.2f cm²\n", luasPP);
                System.out.printf("Keliling persegi panjang: %.2f cm\n", kelilingPP);
                break;
            case 2:
                double r,luasLingkaran, kelilingLingkaran;
                System.out.print("Masukkan jari-jari: ");
                 r = input.nextDouble();
                 luasLingkaran = Math.PI * r * r;
                 kelilingLingkaran = 2 * Math.PI * r;
                System.out.printf("Luas lingkaran: %.2f cm²\n", luasLingkaran);
                System.out.printf("Keliling lingkaran: %.2f cm\n", kelilingLingkaran);
                break;
            case 3:
                double a,b,luasSegitiga,kelilingSegitiga;
                System.out.print("Masukkan alas segitiga: ");
                 a = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                 b = input.nextDouble();
                 luasSegitiga = 0.5 * a * b;
                 kelilingSegitiga = a + b + Math.sqrt(a * a + b * b); // Menghitung keliling dengan Pythagoras
                System.out.printf("Luas segitiga\t\t: %.1f cm2\n", luasSegitiga);
                System.out.printf("Keliling segitiga\t: %.1f cm\n", kelilingSegitiga);
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
      }
    }
}
