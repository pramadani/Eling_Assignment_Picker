import java.util.Scanner;

public class prak1 {
    public static void main(String[] args) {
        System.out.println("Menu: ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        Scanner input = new Scanner(System.in);

        int pilih = input.nextInt();
        System.out.println("pilihan anda: " + pilih);

        System.out.print("Masukkan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan b: ");
        int b = input.nextInt();
        System.out.print("Masukkan r: ");
        int c = input.nextInt();

        switch (pilih) {
            case 1:
                double kel = a+b+c;
                double l = a*b;
                System.out.printf("%s %c %d %s\n", "Keliling persegi panjang ", ':', (int) kel, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas persegi panjang", ':' , (int) l, " cm2");

                break;
            case 2:
                double kel2 = 3.14*2*c;
                double luas = 3.14*c*c;
                System.out.printf("%s %c %d %s\n", "Keliling lingkaran ", ':',(int) kel2, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas lingkaran ", ':' , (int) luas, " cm2");

                break;
            case 3:
                System.out.println("segitiga");
                double kelilings = a+b+c; 
                double luass = 0.5*a*b;
                System.out.printf("%s %c %d %s\n", "Keliling keliling segitiga ", ':', (int) kelilings, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas segitiga ", ':' , (int) luass, " cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan");
        }

        // baru coba

        int pilih2 = input.nextInt();
        System.out.println("pilihan anda: " + pilih2);

        switch (pilih2) {
            case 1:
                double kel = a+b+c;
                double l = a*b;
                System.out.printf("%s %c %d %s\n", "Keliling persegi panjang ", ':', (int) kel, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas persegi panjang", ':' , (int) l, " cm2");
                break;
            case 2:
                double kel2 = 3.14*2*c;
                double luas = 3.14*c*c;
                System.out.printf("%s %c %d %s\n", "Keliling lingkaran ", ':',(int) kel2, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas lingkaran ", ':' , (int) luas, " cm2");
                break;
            case 3:
                System.out.println("segitiga");
                double kelilings = a+b+c; 
                double luass = 0.5*a*b;
                System.out.printf("%s %c %d %s\n", "Keliling keliling segitiga ", ':', (int) kelilings, " cm" );
                System.out.printf("%s %c %d %s\n", "Luas segitiga ", ':' , (int) luass, " cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan");
        }

        input.close();
    }
}
