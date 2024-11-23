import java.util.Scanner;

public class upahPegawai {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Jam kerja   : ");
        int jamPegawai1 = in.nextInt();

        int upah1 = (jamPegawai1 > 60)?  60*5000 : jamPegawai1*5000 ;
        int lembur1 = (jamPegawai1 > 60)? (jamPegawai1 - 60) * 6000 : 0;
        int denda1 = (jamPegawai1 < 50)? (50 - jamPegawai1) * 1000 : 0;
        int hasil1 = upah1 + lembur1 - denda1;

        if(jamPegawai1 <= 60 && jamPegawai1 >= 50){
            System.out.println("Upah = Rp. " + upah1);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil1);
        } else if (jamPegawai1 > 60){
            System.out.println("Upah = Rp. " + jamPegawai1 * 5000);
            System.out.println("Lembur = Rp. " + (jamPegawai1 - 60) * 6000);
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil1);
        } else if (jamPegawai1 < 50 && jamPegawai1 >=0) {
            System.out.println("Upah = Rp. " + jamPegawai1 * 5000);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. " + (50 - jamPegawai1) * 1000);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil1);
        } else {
            System.out.println("input tidak valid");
        }

        System.out.println();

        System.out.print("Jam kerja   : ");
        int jamPegawai2 = in.nextInt();

        int upah2 = (jamPegawai2 > 60)?  60*5000 : jamPegawai2*5000 ;
        int lembur2 = (jamPegawai2 > 60)? (jamPegawai2 - 60) * 6000 : 0;
        int denda2 = (jamPegawai2 < 50)? (50 - jamPegawai2) * 1000 : 0;
        int hasil2 = upah2 + lembur2 - denda2;

        if(jamPegawai2 <= 60 && jamPegawai2 >= 50){
            System.out.println("Upah = Rp. " + upah2);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp." + hasil2);
        } else if (jamPegawai2 > 60){
            System.out.println("Upah = Rp. " + jamPegawai2 * 5000);
            System.out.println("Lembur = Rp. " + (jamPegawai2 - 60) * 6000);
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil2);
        } else if (jamPegawai2 < 50 && jamPegawai2 >=0){
            System.out.println("Upah = Rp. " + jamPegawai2 * 5000);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. " + (50 - jamPegawai2) * 1000);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil2);
        } else {
            System.out.println("input tidak valid");
        }

        System.out.println();

        System.out.print("Jam kerja   : ");
        int jamPegawai3 = in.nextInt();

        int upah3 = (jamPegawai3 > 60)?  60*5000 : jamPegawai3*5000 ;
        int lembur3 = (jamPegawai3 > 60)? (jamPegawai3 - 60) * 6000 : 0;
        int denda3 = (jamPegawai3 < 50)? (50 - jamPegawai3) * 1000 : 0;
        int hasil3 = upah3 + lembur3 - denda3;

        if(jamPegawai3 <= 60 && jamPegawai3 >= 50){
            System.out.println("Upah = Rp. " + upah3);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp." + hasil3);
        } else if (jamPegawai3 > 60){
            System.out.println("Upah = Rp. " + jamPegawai3 * 5000);
            System.out.println("Lembur = Rp. " + (jamPegawai3 - 60) * 6000);
            System.out.println("Denda = Rp. 0");
            System.out.println("---------------------");
            System.out.println("Total = Rp." + hasil3);
        } else if (jamPegawai3 < 50 && jamPegawai3 >=0){
            System.out.println("Upah = Rp. " + jamPegawai3 * 5000);
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. " + (50 - jamPegawai3) * 1000);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + hasil3);
        } else {
            System.out.println("input tidak valid");
        }
    }
}
