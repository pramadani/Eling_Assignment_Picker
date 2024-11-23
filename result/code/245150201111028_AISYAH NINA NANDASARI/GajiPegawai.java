import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int upahPerJam = 5000;
        int upahLemburPerJam = 6000;
        int dendaPerJam = 1000;
        int batasMaksimal = 60;
        int batasMinimal = 50;

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        int upah = 0;
        int lembur = 0;
        int denda = 0;

        if (jamKerja > batasMaksimal) {
            upah = batasMaksimal * upahPerJam;  
            lembur = (jamKerja - batasMaksimal) * upahLemburPerJam; 
        } else if (jamKerja < batasMinimal) {
            upah = jamKerja * upahPerJam; 
            denda = (batasMinimal - jamKerja) * dendaPerJam;  
        } else {
            upah = jamKerja * upahPerJam; 
        }

        int total = upah + lembur - denda;

        System.out.println("----------------------------");
        System.out.println("Jam kerja : " + jamKerja);
        System.out.println("Upah      = Rp. " + upah);
        System.out.println("Lembur    = Rp. " + lembur);
        System.out.println("Denda     = Rp. " + denda);
        System.out.println("----------------------------");
        System.out.println("Total     = Rp. " + total);
    }
}