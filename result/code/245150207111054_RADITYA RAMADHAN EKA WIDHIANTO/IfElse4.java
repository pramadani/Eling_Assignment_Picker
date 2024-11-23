package PRAKTIKUM2;
import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = in.nextInt();
        if (nilai > 60)
            System.out.println("Anda Lulus");
        else if (nilai >= 40)
            System.out.println("Nilai Kurang!");
        else {
            System.out.println("Anda Gagal!");
        }
    }
}
