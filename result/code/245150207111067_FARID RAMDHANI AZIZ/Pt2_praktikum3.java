
package pt2_praktikum3;
 import java.util.Scanner;
public class Pt2_praktikum3 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       // Input jumlah jam kerja
        System.out.print("Jam kerja: ");
        int jamKerja = input.nextInt();

        // Inisialisasi variabel
        int upahPerJam = 5000;
        int lemburPerJam = 6000;
        int dendaPerJam = 1000;
        int totalUpah = 0;
        int lembur = 0;
        int denda = 0;

        // Hitung upah, lembur, dan denda berdasarkan jam kerja
        if (jamKerja > 60) {
            lembur = (jamKerja - 60) * lemburPerJam; 
            totalUpah = (60 * upahPerJam) + lembur; 
        } else if (jamKerja >= 50) {
            totalUpah = jamKerja * upahPerJam; 
        } else {
            denda = (50 - jamKerja) * dendaPerJam; 
            totalUpah = (jamKerja * upahPerJam) - denda; 
        }

        
        System.out.printf("Upah \t= Rp. %d\n", totalUpah);
        System.out.printf("Lembur \t= Rp. %d\n", lembur);
        System.out.printf("Denda \t= Rp. %d\n", denda);
        System.out.println("---------------------");
        System.out.printf("Total \t= Rp. %d\n", totalUpah);

        
    }
    
}
 