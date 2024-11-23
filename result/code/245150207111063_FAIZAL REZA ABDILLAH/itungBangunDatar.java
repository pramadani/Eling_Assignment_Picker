import java.util.Scanner;

public class itungBangunDatar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.println();
        System.out.print("Pilihan anda: ");
        int pilihan = in.nextInt();

        switch(pilihan){
            case 1:
                System.out.print("Massukan a: ");
                int apers = in.nextInt();
                System.out.print("Massukan b: ");
                int bpers = in.nextInt();
                System.out.println();
                System.out.println();
                int kpers = apers + bpers;
                int lpers = apers * bpers;
                System.out.println("Keliling persegi panjang   : " + kpers);
                System.out.println("Luas persegi panjang       : " + lpers);
                break;
            case 2:
                System.out.print("Massukan ruas: ");
                int rling = in.nextInt();
                double kling = 2 * 3.14 * rling;
                double lling = rling * rling * 3.14;
                System.out.println("Keliling lingkaran   : " + kling);
                System.out.println("Luas lingkaran       : " + lling);
                break;
            case 3:
                System.out.print("Massukan a: ");
                int a = in.nextInt();
                System.out.print("Massukan b: ");
                int b = in.nextInt();
                System.out.print("Massukan r: ");
                int r = in.nextInt();
                System.out.println();
                System.out.println();
                int ksegitiga = a + b + r;
                int lsegitiga = (a + b)/2;
                System.out.println("Keliling segitiga   : " + ksegitiga);
                System.out.println("Luas segitiga       : " + lsegitiga);
                break;
            default:
                System.out.println("Data tidak ditemukan, program dihentikan ...");
                break;

        }
    }
}
