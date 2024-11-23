import java.util.Scanner;
public class Seleksi6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah jam kerja: ");
        int JamKerja = input.nextInt();
        int UpahPerJam = 5000;
        int UpahLemburPerJam = 6000;
        int DendaPerJam = 1000;
        int BatasKerjaMaksimal = 60;
        int BatasKerjaMinimal = 50;
        int Upah = 0;
        int Lembur = 0;
        int Denda = 0;
        int Total = 0;
        if (JamKerja> BatasKerjaMaksimal) {
            Lembur = (JamKerja - BatasKerjaMaksimal) * UpahLemburPerJam;
            Upah = BatasKerjaMaksimal * UpahPerJam;
        } else if (JamKerja >= BatasKerjaMinimal) {
            Upah = JamKerja * UpahPerJam;
        } else {
            Upah = JamKerja * UpahPerJam;
            Denda = (BatasKerjaMinimal - JamKerja) * DendaPerJam;
        }
        Total = Upah + Lembur - Denda;
        System.out.println("Upah = Rp. " + Upah);
        System.out.println("Lembur = Rp. " + Lembur);
        System.out.println("Denda = Rp. " + Denda);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + Total);



    }
}