import java.util.Scanner;

public class SoalNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        System.out.println();
        System.out.println("Login");
        System.out.print("Nama: ");
        String logNama = input.nextLine();
        System.out.print("Password: ");
        String logPass = input.nextLine();
        String hasil = (logNama.equals(nama) && logPass.equals(password)) ? "Nama anda " + nama : "data tak ditemukan";
        System.out.println();
        System.out.println(hasil);
    }
}
