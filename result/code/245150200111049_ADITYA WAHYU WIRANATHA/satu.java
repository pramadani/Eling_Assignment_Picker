import java.util.Scanner;
public class satu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan Anda: ");
        byte pilihan = userInput.nextByte();
        switch (pilihan) {
            case 1:
                System.out.print("Masukan p: ");
                int p = userInput.nextInt();
                System.out.print("Masukan l: ");
                int l = userInput.nextInt();
                int luas = p * l;
                int keliling = p + p + l + l;
                System.out.println("Luas persegi panjang : " + luas);
                System.out.println("Keliling persegi panjang : " + keliling);
                break;
            case 2:
                System.out.print("Masukan r: ");
                double r = userInput.nextDouble();
                double luasL = (r*r) * Math.PI;
                double kelilingL = 2*r*Math.PI;
                System.out.println("Luas persegi panjang : " + luasL);
                System.out.println("Keliling persegi panjang : " + kelilingL);
                break;
            case 3:
                System.out.println("Segitiga siku-siku");
                System.out.print("Masukan alas: ");
                int a = userInput.nextInt();
                System.out.print("Masukan tinggi: ");
                int t = userInput.nextInt();
                System.out.print("Masukan miring: ");
                int m = userInput.nextInt();
                int luasS = (a*t)/2;
                int kelilingS = a+m+t;
                System.out.println("Luas persegi panjang : " + luasS);
                System.out.println("Keliling persegi panjang : " + kelilingS);
                break;
            default:
                System.out.println("data tak ditemukan");
        }
    }
}