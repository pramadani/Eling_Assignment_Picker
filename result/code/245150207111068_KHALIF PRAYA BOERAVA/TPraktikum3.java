package PRAKTIKUM;

import java.util.Scanner;

public class TPraktikum3 {
    public static void main(String[] args) {
        final int upahPerJam = 5000;
        final int upahLemburPerJam = 6000;
        final int dendaPerJam = 1000;
        final int batasMaksimalJamKerja = 60;
        final int batasMinimalJamKerja = 50;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jam kerja: ");
        int jamKerja = scanner.nextInt();
        
        int upah = 0;
        int lembur = 0;
        int denda = 0;
        int total = 0;

        if (jamKerja > batasMaksimalJamKerja) {
            upah = batasMaksimalJamKerja * upahPerJam;
            lembur = (jamKerja - batasMaksimalJamKerja) * upahLemburPerJam;
        } else if (jamKerja >= batasMinimalJamKerja) {
            upah = jamKerja * upahPerJam;
        } else {
            upah = jamKerja * upahPerJam;
            denda = (batasMinimalJamKerja - jamKerja) * dendaPerJam;
        }
        
        total = upah + lembur - denda;

        System.out.println("Upah = Rp. " + upah);
        System.out.println("Lembur = Rp. " + lembur);
        System.out.println("Denda = Rp. " + denda);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + total);
    }
}
