// Program ini akan menghitung upah yang diterima pegawai sesuai jam kerjanya
// Jam kerja minimum = 50, upah = 5000/jam, lembur = 6000/jam, denda = 1000/jam
import java.util.Scanner;
public class TP3_Pengupahan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int jkMin = 50; // Ini jam kerja minimumnya
    final int jkMax = 60; // Ini jam kerja maksimalnya

    // Masukkan jam kerja
    System.out.print("Jam kerja : ");
    int jamKrj = input.nextInt();

    // Penentuan upah, lembur, denda
    int upah;
    int lembur = 0; // Ini adalah nilai default-nya
    int denda = 0; // Ini adalah nilai default-nya

    if(jkMin <= jamKrj && jamKrj <= jkMax) {
      upah = jamKrj * 5000;
    } else if(jamKrj > jkMax) {
      upah = jkMax * 5000;
      lembur = (jamKrj - jkMax) * 6000;
    } else {
      upah = jamKrj * 5000;
      denda = (jkMin - jamKrj) * 1000;
    }

    // Keluaran
    System.out.printf("%-10s%s%d\n","Upah", "= Rp", upah);
    System.out.printf("%-10s%s%d\n","Lembur", "= Rp", lembur);
    System.out.printf("%-10s%s%d\n","Denda", "= Rp", denda);
    System.out.println("---------------------");
    System.out.printf("%-10s%s%d\n","Total", "= Rp", (upah + lembur - denda));

    input.close();
  }
}