import java.util.Scanner;

public class prog1 {
    public static void main(String[] args){
        Scanner beto = new Scanner(System.in);
        System.out.println("Menu:\n1. menghitung luas dan keliling persegi panjang\n2. menghitung luas dan keliling lingkaran\n3. menghitung luas dan keliling segitiga\n");
        System.out.print("Pilihan anda: ");
        int x = beto.nextInt();
        int a,b,r;
        switch(x){
            case 1 :
                System.out.print("Masukkan a: ");
                a = beto.nextInt();
                System.out.print("Masukkan b: ");
                b = beto.nextInt();
                System.out.println("Keliling persegi panjang : " + ((a+b)*2) + "cm");
                System.out.println("Luas persegi panjang     : " + (a*b) + "cm2");
                break;
            case 3 :
                System.out.print("Masukkan a: ");
                a = beto.nextInt();
                System.out.print("Masukkan b: ");
                b = beto.nextInt();
                System.out.print("Masukkan r: ");
                r = beto.nextInt();
                System.out.println("Keliling segitiga    : " + (a+b+r) + "cm");
                System.out.println("Luas segitiga        : " + (a*b/2) + "cm2");
                break;
            case 2 :
                System.out.print("Masukkan r: ");
                r = beto.nextInt();
                System.out.println("Keliling lingkaran   : " + (2*r*22/7) + "cm");
                System.out.println("Luas lingkaran       : " + (r*r*22/7) + "cm2");
                break;
            default :
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }
}
