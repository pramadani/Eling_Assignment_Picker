package luaskeliling;
import java.util.Scanner;
public class luasKeliling {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Luas dan Keliling Persegi Panjang");
        System.out.println("2. Luas dan Keliling Lingkaran");
        System.out.println("3. Luas dan Keliling Segitiga");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        int a, b, r, luas, keliling;
        double luasLingkaran, kllLingkaran, luasSTiga;
        int menu;
        
        System.out.print("Pilihan anda : ");
        menu = input.nextInt();
        
        switch (menu){
            case 1:
                System.out.print("Masukkan panjang : ");
                a = input.nextInt();
                System.out.print("Masukkan lebar : ");
                b = input.nextInt();
                System.out.println(" ");
                luas = a * b;
                keliling = 2 * (a + b);
                System.out.printf("%-15s %c %d cm\n", "Keliling persegi panjang", ':', keliling);
                System.out.printf("%-15s %c %d cm2\n", "Luas persegi panjang", ':', luas);
                System.out.println(" ");
                break;
            
            case 2:
                System.out.print("Masukkan jari-jari : ");
                r = input.nextInt();
                System.out.println(" ");
                luasLingkaran = 3.14 * r * r;
                kllLingkaran = 2 * 3.14 * r;
                System.out.printf("%-15s %c %.2f cm\n", "Keliling lingkaran", ':', kllLingkaran);
                System.out.printf("%-15s %c %.2f cm2\n", "Luas lingkaran", ':', luasLingkaran);
                System.out.println(" ");
                break;
            
            case 3:
                System.out.print("Masukkan panjang a : ");
                a = input.nextInt();
                System.out.print("Masukkan panjang b : ");
                b = input.nextInt();
                System.out.print("Masukkan panjang r : ");
                r = input.nextInt();
                System.out.println(" ");
                luasSTiga = (double) (1.0/2) * a * b;
                keliling = a + b + r;
                System.out.printf("%-15s %c %d cm\n", "Keliling segitiga", ':', keliling);
                System.out.printf("%-15s %c %.2f cm2\n", "Luas segitiga", ':', luasSTiga);
                System.out.println(" ");
                break;
                
            default:
                System.out.println("Data tidak ditemukan, program dihentikan...");    
        } 
    }
}
