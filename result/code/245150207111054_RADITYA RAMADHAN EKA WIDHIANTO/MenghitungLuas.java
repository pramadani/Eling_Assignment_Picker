package PRAKTIKUM2;
import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, r;
        System.out.println("Menu: ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.println(" ");
        System.out.println(" ");

        int pilihan;
        System.out.println("Pilihan anda: ");
        pilihan = in.nextInt();
        

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan a: ");
                a = in.nextDouble();
                System.out.println("Masukkan b: ");
                b = in.nextDouble();
                System.out.println("Masukkan r: ");
                r = in.nextDouble();
                double l1 = a * b * r;
                double k1 = a + b + r;
                
                System.out.println("Keliling persegi panjang    : " + k1);
                System.out.println("Luas persegi panjang        : " + l1);
                
                break;
            case 2:
                System.out.println("Masukkan a: ");
                a = in.nextDouble();
                System.out.println("Masukkan b: ");
                b = in.nextDouble();
                System.out.println("Masukkan r: ");
                r = in.nextDouble();
                double l2 = 3.14 * r * r;
                double k2 = 2 * 3.14 * r;

                System.out.println("Keliling lingkaran      : " + k2);
                System.out.println("Luas lingkaran          : " + l2);

                break;
            case 3:
                System.out.println("Masukkan a: ");
                a = in.nextDouble();
                System.out.println("Masukkan b: ");
                b = in.nextDouble();
                System.out.println("Masukkan r: ");
                r = in.nextDouble();
                System.out.println(" ");
                double l3 = 0.5 * a * b;
                int l3I = (int) l3;
                double k3 = a + b + r;
                int k3I = (int) k3;
                System.out.println("Keliling segitiga    : " + k3I);
                System.out.println("luas segitiga    : " + l3I);
                System.out.println();
                System.out.println("Pilihan anda: ");
                pilihan = in.nextInt();
            default:
                System.out.println("Data tidak ditemukan, program dihentikan ...");
        }
    }
    
}
