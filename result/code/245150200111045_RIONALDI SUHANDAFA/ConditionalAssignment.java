import java.util.Scanner;
public class ConditionalAssignment {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s.equals("filkom")) ? "Brawijaya" : "null";
        System.out.println(s + " " + val);
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String InNama = in.nextLine();
        System.out.print("Masukkan NIM: ");
        String InNIM = in.nextLine();

        String Nama = "RIONALDI SUHANDAFA";
        String NIM = "245150200111045";

        if (!InNama.equalsIgnoreCase(Nama)) {
            System.out.println("input Nama salah");
        } else if (!InNIM.equalsIgnoreCase(NIM)) {
            System.out.println("input NIM salah");
        } else if (InNama.equalsIgnoreCase(Nama) && InNIM.equals(NIM)) {
            System.out.println(Nama + " " + NIM);
        } 

        System.out.print("Masukkan Nama anda yang baru: ");
        String NewNama = in.nextLine();
        System.out.print("Masukkan password anda yang baru: ");
        String NewPass = in.nextLine();

        System.out.print("Masukkan Nama anda lagi: ");
        String InNama2 = in.nextLine();
        System.out.print("Masukkan password anda lagi: ");
        String InPass = in.nextLine();

        String biodata = NewNama.toUpperCase() + " Aku Suka Makan Ayam Geprek";

        if (InNama2.equals(NewNama) && InPass.equals(NewPass)) {
            System.out.println(biodata);
        } else
            System.out.println("Data Tidak Ditemukan");
        in.close();
    }
}