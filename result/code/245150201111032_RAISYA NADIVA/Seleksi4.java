import java.util.Scanner;
public class Seleksi4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      double a, b, r, s, panjang, lebar, jari_jari, luas, keliling;
        System.out.println("Menu");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1: 
            System.out.print("Masukan panjang persegi panjang");
            panjang = input.nextDouble();
            System.out.print("Masukan lebar persegi panjang");
            lebar = input.nextDouble();
            luas = panjang * lebar;
            keliling = 2 * (panjang + lebar);
            System.out.printf("Luas persegi panjang : %.2f cm2\n", luas);
            System.out.printf("Keliling persegi panjang : %.2f cm2\n", keliling);
            break;
            case 2:
             System.out.print("Masukan jari-jari lingkaran");
            jari_jari = input.nextDouble();
            luas = Math.PI * jari_jari * jari_jari;
            keliling = 2 * Math.PI * jari_jari;
            System.out.printf("Luas lingkaram : %.2f cm2\n", luas);
            System.out.printf("Kelilng lingkaran : %.2f cm\n", keliling);
            break;
            case 3:
                System.out.print("Masukan panjang sisi a: ");
                a = input.nextDouble();
                System.out.print("Masukan panjang sisi b: ");
                b = input.nextDouble();
                System.out.print("Masukan panjang sisi r: ");
                r = input.nextDouble();
                keliling = a + b + r;
                s = keliling / 2;
                luas = Math.sqrt(s * (s - a) * (s - b) * (s - r));
                System.out.printf("keliling segitiga : %.2f cm\n", keliling);
                System.out.printf("Luas segitiga : %.2f cm\n", luas);
                break;
                default:
                System.out.println("data tak ditemukan, program dihentikan...");

        }
        System.out.println();




    } 
}
