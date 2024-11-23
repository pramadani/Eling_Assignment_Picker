import java.util.Scanner;

public class ConditionalAssignmentpassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Password: ");
        String password = in.nextLine();

        System.out.println("Login");
        System.out.print("Masukkan Nama: ");
        String lgnama = in.nextLine();
        System.out.print("Masukkan Password: ");
        String lgpassword = in.nextLine();
        
        System.out.println();
        System.out.println("BIODATA MAHASISWA");
        String output = lgnama.equals(nama) && lgpassword.equals(password)? "Nama: " + lgnama: "data tak ditemukan";
        System.out.println(output);
    }
}