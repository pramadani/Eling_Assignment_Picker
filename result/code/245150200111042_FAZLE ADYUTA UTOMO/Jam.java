import java.util.Scanner;

public class Jam {
  public static void main(String[] args) {
    /*

    • Batas kerja maksimal adalah 60 jam / minggu, dengan upah Rp. 5000,- / jam. Kelebihan jam kerja
    dari batas maksimum akan dianggap sebagai lembur dengan upah Rp. 6000,- / jam.
    • Batas kerja minimal adalah 50 jam / minggu. Apabila pegawai mempunyai jam kerja di bawah
    batas kerja minimal ini, maka akan dikenakan denda sebesar Rp. 1000, - / jam.

    */

    Scanner scanner = new Scanner(System.in);

    System.out.printf("Jam kerja : ");
    int jam = scanner.nextInt();
    scanner.close();

    int jamPokok = jam < 60 ? jam : 60;
    int pokok = jamPokok * 5000;

    int jamLembur = jam - 60;
    jamLembur = jamLembur > 0 ? jamLembur : 0;
    int lembur = jamLembur * 6000;
    
    int jamKurang = 50 - jam;
    jamKurang = jamKurang > 0 ? jamKurang : 0;
    int denda = jamKurang * 1000;

    System.out.printf("Upah = Rp. %d%n", pokok);
    System.out.printf("Lembur = Rp. %d%n", lembur);
    System.out.printf("Denda = Rp. %d%n", denda);
    System.out.println("---------------------");
    System.out.printf("Total = Rp. %d%n", pokok + lembur - denda);


  }
}
