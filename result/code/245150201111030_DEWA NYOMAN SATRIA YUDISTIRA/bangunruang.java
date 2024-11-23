import java.util.Scanner;
public class bangunruang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda : ");
        int opsi = input.nextInt();
        switch (opsi){
            
            case 1:
            System.out.print("Masukkan nilai p : ");
            int p = input.nextInt();
            System.out.print("Masukkan nilai l : ");
            int l = input.nextInt();
            int kel1 = (p*2)+(l*2);
            int l1 = (p*l);

            System.out.println("Keliling persegi panjang : " + kel1 + " cm");
            System.out.println("Luas persegi panjang : " + l1 + " cm2");
            break;

            case 2:
            System.out.print("Masukkan nilai r : ");
            int rad = input.nextInt();
            double kel2 = (3.14)*rad*2;
            double l2 = (3.14)*rad*rad;

            System.out.println("Keliling lingkaran : " + (int)kel2 + " cm");
            System.out.println("Luas lingkaran : " + l2 + " cm2");
            break;

            case 3:
            System.out.print("Masukkan nilai a : ");
            int a = input.nextInt();
            System.out.print("Masukkan nilai b : ");
            int b = input.nextInt();
            System.out.print("Masukkan nilai r : ");
            int r = input.nextInt();
            int kel3 = a+b+r;
            double l3 =(0.5)*a*b;

            System.out.println("Keliling segitiga : " + kel3 + " cm");
            System.out.println("Luas segitiga : " + (int)l3 + " cm2");
            break;

            default:
            System.out.println("Data tidak ditemukan, program dihentikan ...");

        }
    }
    
}
