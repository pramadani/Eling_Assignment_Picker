package tugaslaprak2;
import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nama");
        String nama = scanner.nextLine();
        System.out.println("masukan password");
        String pw = scanner.nextLine();
       
        String name = "fiya";
        String password = "12345";
        String nim = "245150207111061";
        String prodi = "Teknik Informatika";
        String kelas = "D";

       if (nama.equals(nama) && password.equals(pw)) {
        System.out.println("\nBiodata Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("prodi: " + prodi);
        System.out.println("kelas: " + kelas);
       } else {
        System.out.println("Data tak ditemukan");
       }
    }
    }
