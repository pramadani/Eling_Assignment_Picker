import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta memasukan nama dan password pertama
        System.out.print("Masukkan nama: ");
        String namaPertama = input.nextLine();

        System.out.print("Masukkan password: ");
        String passwordPertama = input.nextLine();

        // untuk verifikasi
        System.out.println("\n--- Verifikasi Nama dan Password ---");
        System.out.print("Masukkan kembali nama: ");
        String namaKedua = input.nextLine();

        System.out.print("Masukkan kembali password: ");
        String passwordKedua = input.nextLine();

        // Mengecek input kedua sesuai dengan input pertama
        if (namaPertama.equals(namaKedua) && passwordPertama.equals(passwordKedua)) {
            // Jika benar, mencetak biodata mahasiswa
            System.out.println("\n--- Biodata Mahasiswa ---");
            System.out.println("Nama: " + namaPertama);
            System.out.println("NIM: 245150207111062");
            System.out.println("Program Studi: Teknik Komputer");
            System.out.println("Fakultas: Fakultas Ilmu Komputer");
        } else {
            // Jika salah, mencetak pesan data tak ditemukan
            System.out.println("\nData tak ditemukan.");
        }
        
        // Menutup Scanner
        input.close();
    }
}
