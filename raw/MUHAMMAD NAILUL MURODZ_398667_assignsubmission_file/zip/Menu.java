import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Menu, Panjang, Lebar, Alas, Tinggi, Depan, Miring, Samping;
        Double phi = 3.14 ;
        double jari;
        System.out.println("Menu : ");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Panjang : ");
                Panjang = in.nextInt();
                System.out.print("Masukkan Lebar : ");
                Lebar = in.nextInt();
                System.out.println("Keliling persegi panjang : "+(2*(Panjang+Lebar)));
                System.out.println("Luas persegi panjang : "+ (Panjang*Lebar));
                break;
            case 2:
                 System.out.print("Masukkan Jari-jari : ");
                 jari = in.nextDouble();
                 System.out.println("Keliling Lingkaran: "+(2*(phi*jari)));
                 System.out.println("Luas Lingkaran : "+ (phi*(jari*jari)));
                break;
            case 3:
                System.out.print("Masukkan Alas : ");
                Alas = in.nextInt();
                System.out.print("Masukkan Tinggi : ");
                Tinggi = in.nextInt();
                System.out.print("Masukkan Miring : ");
                Miring = in.nextInt();
                System.out.println("Luas Segitiga : " + (1/2*Alas*Tinggi));
                System.out.println("Keliling Segitiga : " + (Miring+Tinggi+Alas));
                break;
            default:
                System.out.println("data tak ditemukan, Program dihentikan....");
        }
    }
}


