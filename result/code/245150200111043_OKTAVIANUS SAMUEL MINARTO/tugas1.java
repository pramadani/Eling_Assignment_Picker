package praktikum.praktikumpemdasmodul2;
import java.util.*;
public class tugas1 {
    public static void main(String[] args) {
     int n;
     Scanner in = new Scanner(System.in);
     System.out.println("Menu :");
     System.out.println("1. menghitung luas dan keliling persegi panjang\n2. menghitung luas dan keliling lingkaran\n3. menghitung luas dan keliling segitiga\n");
     System.out.print("Pilihan anda: ");
     n= in.nextInt();

     switch (n) {
        case 1:            
        int p,l;
        System.out.print("Masukkan p: ");
        p=in.nextInt();
        System.out.print("Masukkan l: ");
        l=in.nextInt();
        System.out.printf("\n%-28s:  %d cm\n","Keliling persegi panjang",(2*(p+l)));
        System.out.printf("%-28s:  %d cm2","Luas persegi panjang",(p*l));
        break;
        
        case 2:
        float r;
        float pi= (float)22/7;
        System.out.print("Masukkan r: ");
        r=in.nextFloat();
        System.out.printf("\n%-22s:  %.2f cm\n","Keliling segitiga",(2*r*pi));
        System.out.printf("%-22s:  %.2f cm","Luas segitiga",(r*r*pi));
        break;
        
        case 3:
        float als;
        float tinggi;
        float sm;
        System.out.print("Masukkan alas: ");
        als=in.nextFloat();
        System.out.print("Masukkan tinggi: ");
        tinggi=in.nextFloat();
        System.out.print("Masukkan sisi miring: ");
        sm=in.nextFloat();
        System.out.printf("\n%-22s:  %.2f cm\n","Keliling segitiga",(als+tinggi+sm));
        System.out.printf("%-22s:  %.2f cm","Luas segitiga",((als*tinggi)/2));
        break;
        
        default:
        System.out.println("Data tak ditemukan, program dihentikan ...");
     }
     in.close();
    }   

}
