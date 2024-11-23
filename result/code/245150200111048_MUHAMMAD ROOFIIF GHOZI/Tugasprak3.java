/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak3;

import java.util.Scanner;
public class Tugasprak3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int jamkerja,jamkerja2,jamkerja3,upahperjam=5000,lemburperjam=6000,dendaperjam=1000;
        System.out.print("Jam kerja : ");
        jamkerja=in.nextInt();
        
        int total=0,lembur=0,denda=0;
        
        if (jamkerja > 60) {
            lembur = (jamkerja - 60) * lemburperjam;
            total = (60 * upahperjam) + lembur;
        } else if (jamkerja >= 50) {
            total = jamkerja * upahperjam;
        } else {
            denda = (50 - jamkerja) * dendaperjam;
            total = (jamkerja * upahperjam) - denda;
        }
        
        
        System.out.println("Upah   = Rp. " +total);
        System.out.println("Lembur = Rp. " +lembur);
        System.out.println("Denda  = Rp. " +denda);
        System.out.println("---------------------");
        System.out.println("Total  = Rp. " +(total - denda));
        
        System.out.print("\nJam kerja : ");
        jamkerja2=in.nextInt();
     
        if (jamkerja2 > 60) {
            lembur = (jamkerja2 - 60) * lemburperjam;
            total = (60 * upahperjam) + lembur;
        } else if (jamkerja2 >= 50) {
            total = jamkerja2 * upahperjam;
        } else {
            denda = (50 - jamkerja2) * dendaperjam;
            total = (jamkerja2 * upahperjam) - denda;
        }
        
        
        System.out.println("Upah   = Rp. " +total);
        System.out.println("Lembur = Rp. " +lembur);
        System.out.println("Denda  = Rp. " +denda);
        System.out.println("---------------------");
        System.out.println("Total  = Rp. " +(total - denda));
        
        System.out.print("\nJam kerja : ");
        jamkerja3=in.nextInt();
     
       if (jamkerja3 > 60) {
            lembur = (jamkerja3 - 60) * lemburperjam;
            total = (60 * upahperjam) + lembur;
        } else if (jamkerja3 >= 50) {
            total = jamkerja3 * upahperjam;
        } else {
            denda = (50 - jamkerja3) * dendaperjam;
            total = (jamkerja3 * upahperjam) - denda;
        }
        
        
        System.out.println("Upah   = Rp. " +total);
        System.out.println("Lembur = Rp. " +lembur);
        System.out.println("Denda  = Rp. " +denda);
        System.out.println("---------------------");
        System.out.println("Total  = Rp. " +(total - denda));
        
     
    }
    
}
