import java.util.Scanner;

public class LuasDanKeliling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,r;
        double pi = 3.14;
        System.out.println("Menu: ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.println();
        System.out.print("Pilihan anda: ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan a: ");
                a = in.nextInt();
                System.out.print("Masukkan b: ");
                b = in.nextInt();
                System.out.println();
                System.out.println("Keliling persegi panjang: " + ((a+b)*2) + " cm");
                System.out.println("Luas persegi panjang: " + (a*b) + " cm2");
                break;
            case 2:
                System.out.print("Masukkan r: ");
                r = in.nextInt();
                System.out.println();
                System.out.println("Keliling lingkaran: " + (pi*(r+r)) + " cm");
                System.out.println("Luas segitiga: " + (pi*r*r) + " cm2");
                break;
            case 3:
                System.out.print("Masukkan a: ");
                a = in.nextInt();
                System.out.print("Masukkan b: ");
                b = in.nextInt();
                System.out.print("Masukkan r: ");
                r = in.nextInt();
                System.out.println();
                System.out.println("Keliling segitiga: " + (a+b+r) + " cm");
                System.out.println("Luas segitiga: " + (a*b/2) + " cm2");
                break;
            default:
                System.out.println("data tak ditemukan, program dihentikan ...");
        }
    }
}