// Ini adalah program untuk menghitung IMT dan menentukan kategorinya
import java.util.Scanner;
public class TP2_HitungIMT {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Input
    // Berat badan
    System.out.printf("%-26s%s", "Masukkan berat badan (kg)",": ");
    double berat = input.nextDouble();
    // Tinggi badan
    System.out.printf("%-26s%s", "Masukkan tinggi badan (cm)",": ");
    int tinggi = input.nextInt();

    // Penghitungan IMT
    double imt = 10000*berat/(tinggi * tinggi);
    // Dikali 10000 Karena tingginya dalam satuan cm

    // Pengkategorian IMT
    String kategori = "";
    if(imt > 30) {
      kategori = "kegemukan";
    } else if(imt > 25) {
      kategori = "gemuk";
    } else if(imt > 18.5) {
      kategori = "normal";
    } else {
      kategori = "kurus";
    }
    
    // Keluaran
    System.out.printf("%s%-6.2f Termasuk %s","IMT = ", imt, kategori);

    input.close();
  }
}