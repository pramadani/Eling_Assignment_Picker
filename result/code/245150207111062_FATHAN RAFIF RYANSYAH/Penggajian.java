import java.util.Scanner;

public class Penggajian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        int jamKerja;
        int upahPerJam = 5000;
        int upahLemburPerJam = 6000;
        int batasMaksJamKerja = 60;
        int batasMinJamKerja = 50;
        int dendaPerJam = 1000;
        int upah, lembur, denda, total;

        System.out.print("Masukkan jam kerja: ");
        jamKerja = input.nextInt();
        
        if (jamKerja > batasMaksJamKerja) {
            upah = batasMaksJamKerja * upahPerJam;
            lembur = (jamKerja - batasMaksJamKerja) * upahLemburPerJam;
            denda = 0;
        } else if (jamKerja < batasMinJamKerja) {
            upah = jamKerja * upahPerJam;
            lembur = 0;
            denda = (batasMinJamKerja - jamKerja) * dendaPerJam;
        } else {
            upah = jamKerja * upahPerJam;
            lembur = 0;
            denda = 0;
        }
            total = upah + lembur - denda;

        //hasil
        System.out.println("Upah   = Rp. " + upah);
        System.out.println("Lembur = Rp. " + lembur);
        System.out.println("Denda  = Rp. " + denda);
        System.out.println("---------------------");
        System.out.println("Total  = Rp. " + total);
        
        input.close();
    }
}
