import java.util.Scanner;
public class seleksi2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("masukkan nilai: ");
    int nilai = in.nextInt();
    if (nilai * 2 < 50) {
    nilai += 10;
    }
    if (nilai <= 20 && nilai % 2 == 1) {
    System.out.println("Filkom");
    System.out.println("UB");
    } else if (nilai <= 20) {
    System.out.println("Filkom");
    System.out.println("Brawijaya");
    } else {
    System.out.println("PTIIK");
    if (nilai % 2 == 1) {
    System.out.println("UB");
    } else {
    System.out.println("Brawijaya");
    }
}
    }
}

