import java.util.Scanner;  
public class constAss {
    public static void main(String[] args) {
        String s = "filkom";
        int val = (s.equals("filkom")) ? 1 : 0; 
        System.out.println(s + " " + val);

        Scanner input = new Scanner(System.in);

        //Nama dan NIM benar
        String NamaBenar = "Fathan Rafif Ryansyah";
        String NIMBenar = "245150207111062";  
        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama: ");
        String namaInput = input.nextLine();

        // Meminta input NIM dari pengguna
        System.out.print("Masukkan NIM: ");
        String nimInput = input.nextLine();

        // Mengecek  nama dan NIM sesuai atau tidak
        if (namaInput.equals(NamaBenar)) {
            if (nimInput.equals(NIMBenar)) {
                // Jika nama dan NIM benar
                System.out.println("Nama: " + namaInput + ", NIM: " + nimInput);
            } 
            else {
                // Jika NIM salah
                System.out.println("Input NIM salah");
            }
        } else {
            // Jika nama salah
            System.out.println("Input nama salah");
        }
        
    }
}