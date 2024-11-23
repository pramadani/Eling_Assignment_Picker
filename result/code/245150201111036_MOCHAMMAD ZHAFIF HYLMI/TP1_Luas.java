// Program untuk menghitung luas dan keliling persegi panjang, lingkaran, atau segitiga
// Note: rumus Heron digunakan untuk mencari luas segitiga
// L = sqrt(s*(s-a)*(s-b)*(s-c))
import java.util.Scanner;
public class TP1_Luas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String bangun = "";
    // Pilihan menu
    System.out.println("Menu:");
    System.out.println("1. menghitung luas dan keliling persegi panjang");
    System.out.println("2. menghitung luas dan keliling lingkaran");
    System.out.println("3. menghitung luas dan keliling segitiga");

    // User memasukkan opsi
    System.out.print("\nPilihan Anda: ");
    int opsi = input.nextInt();
    switch(opsi) {
      case 1 -> { // Persegi panjang
        bangun = "persegi panjang";

        // Masukkan panjang (p)
        System.out.printf("%-12s","Masukkan p:");
        int p = input.nextInt();
        // Masukkan lebar (l)
        System.out.printf("%-12s","Masukkan l:");
        int l = input.nextInt();
        
        // Seleksi apakah p dan l nilainya valid
        if(p < 0 || l < 0) {
          System.out.println("p atau l tidak valid!");
        } else {
          System.out.printf("\n%-24s%s%d\n","Keliling " + bangun, ": ", 2*(p + l));
          System.out.printf("%-24s%s%d\n","Luas " + bangun, ": ", p*l);
        }
      }
      case 2 -> { // Lingkaran
        bangun = "lingkaran";
        final double PI = Math.PI;

        // Masukkan jari-jari (r)
        System.out.print("Masukkan r: ");
        int r = input.nextInt();

        // Seleksi apakah nilai r valid (r >= 0)
        if(r < 0) {
          System.out.println("Nilai r tidak valid!");
        } else {
          System.out.printf("\n%-18s%s%.2f\n","Keliling " + bangun, ": ", 2*PI*r);
          System.out.printf("%-18s%s%.2f\n","Luas " + bangun, ": ", PI*r*r);
        }
      }
      case 3 -> {
        bangun = "segitiga";

        // Masukkan a
        System.out.print("Masukkan a: ");
        int a = input.nextInt();
        // Masukkan b
        System.out.print("Masukkan b: ");
        int b = input.nextInt();
        // Masukkan c
        System.out.print("Masukkan c: ");
        int c = input.nextInt();
        
        // Seleksi untuk pertidaksamaan segitiga
        int terbesar = a;
        int terkecil = a;
        int mid = a;
        // Terbesar
        if(b > terbesar) {
          terbesar = b;
        }
        if(c > terbesar) {
          terbesar = c;
        }
        // Terkecil
        if(b < terkecil) {
          terkecil = b;
        }
        if(c < terkecil) {
          terkecil = c;
        }
        // Middle
        if(terkecil < b && b < terbesar) {
          mid = b;
        }
        if(terkecil < c && c < terbesar) {
          mid = c;
        }

        // Seleksi apakah a, b, dan c valid
        if((a < 0 || b < 0 || c < 0) || (terkecil + mid) <= terbesar) {
          System.out.println("Nilai a, b, atau c tidak valid!");
        } else {
          double s = (a + b + c)/2.0;
          double luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));

          // Keluaran
          System.out.printf("\n%-17s%s%.0f\n","Keliling " + bangun, ": ", 2*s);
          System.out.printf("%-17s%s%.2f\n","Luas " + bangun, ": ", luas);
        }
      }
      default -> {
        System.out.println("Opsi tidak ditemukan, program dihentikan...");
      }
    }
    input.close();
  }
}