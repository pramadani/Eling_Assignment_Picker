import java.util.Scanner;

public class constAss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        String nama = "Yubi";
        String password = "malang124";

        if (inputNama.equals(nama) && inputPassword.equals(password)) {
            System.out.println("Biodata Mahasiswa:");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: 245150207111066");
            System.out.println("Fakultas: Ilmu Komputer");
            System.out.println("Jurusan: Teknik Informatika");
        } else {
            System.out.println("Data tak ditemukan");
        }
    }
}