/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak1;
import java.util.Scanner;
public class Tugasprak1 {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga ");
        
        System.out.print("Pilihan anda:");
        int pilihan = in.nextInt();
        
        int panjang,lebar,jari,alas,tinggi,miring;
        
        switch (pilihan){
            case 1: 
                System.out.println("Masukan panjang:");
                panjang=in.nextInt();
                System.out.println("Masukan lebar:");
                lebar=in.nextInt();
                int luas=panjang*lebar;
                int keliling = 2 * (panjang + lebar);
                
                System.out.println("Keliling persegi panjang: " + keliling + " cm");
                System.out.println("Luas persegi panjang: " + luas + " cm2");
                break;
            case 2:
                System.out.print("Masukan jari:");
                jari=in.nextInt();
                double pi=3.14;
                double luas2= pi*jari*jari;
                double keliling2= pi*jari*2;
               
                
                System.out.println("Keliling lingkaran: " + keliling2 + " cm");
                System.out.println("Luas lingkaran: " + luas2 + " cm2");
                break;
            case 3:
                System.out.print("Masukan a:");
                alas=in.nextInt();
                System.out.print("Masukan b:");
                tinggi=in.nextInt();
                System.out.print("Masukan c:");
                miring=in.nextInt();
                int luas3=alas*tinggi/2;
                int keliling3=alas+tinggi+miring;
               
                System.out.println("Keliling segitiga: " + keliling3 + " cm");
                System.out.println("Luas segitiga: " + luas3 + " cm2");
                break;
                default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        
                
                
                
                
        }
        
        
       
     
    }
}
