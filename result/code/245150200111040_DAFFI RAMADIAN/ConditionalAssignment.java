// Terdapat kesalahan

import java.util.Scanner;
public class ConditionalAssignment {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s.equals("filkom"))?"Brawijaya": "null";
        System.out.println(s+" "+val);

        Scanner input = new Scanner(System.in);

        String nama = "Daffi Ramadian";
        String NIM = "245150200111040";

        System.out.print("Buat Username: ");
        String newUser = input.nextLine();
        System.out.print("Buat Password: ");
        String newPass = input.nextLine();

        System.out.print("Masukkan Username yang telah dibuat: ");
        String setNama = input.nextLine();
        System.out.print("Masukkan password yang telah dibuat: ");
        String setPass = input.nextLine();

        String hasil1 = (setNama.equals(newUser) && setPass.equals(newPass))? nama +"\n" + NIM: "Biodata Salah";

        System.out.println("===Biodata Kamu===");
        System.out.println(hasil1);

        System.out.println();

        System.out.print("Masukkan nama: ");
        String inNama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String inNIM = input.nextLine();

        String HasilNama = ( inNama.equals(nama))?nama: "Input nama salah";
        String HasilNIM = (inNIM.equals(NIM))?NIM: "Input NIM salah";

        System.out.println(HasilNama);
        System.out.println(HasilNIM);

        input.close();
    }
}
