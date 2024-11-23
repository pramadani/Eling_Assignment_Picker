import java.util.Scanner;
public class luasBidang {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segi tiga");
        System.out.println();
        System.out.print("Pilihan anda: ");
        int pilihan = in.nextInt();
        int a,b,r;
        switch (pilihan) {
          case 1:
            System.out.print("Masukkan a: ");
            a=in.nextInt();
            System.out.print("Masukkan b: ");
            b=in.nextInt();
            System.out.println("Keliling persegi panjang: " + ((b+a)*2) + " cm");
            System.out.println("Luas persegi panjang: " + a*b + " cm2");
            break;
          case 2:
            System.out.print("Masukkan r: ");
            r=in.nextInt();
            System.out.printf("%s%.2f%s \n","Keliling lingkaran: " , 3.1416*2*r , " cm");
            System.out.printf("%s%.2f%s \n","Luas lingkaran: " , 3.1416*r*r , " cm2");
            break;
          case 3:
            System.out.print("Masukkan a: ");
            a=in.nextInt();
            System.out.print("Masukkan b: ");
            b=in.nextInt();
            System.out.print("Masukkan r: ");
            r=in.nextInt();
            System.out.println("Keliling segi tiga: " + (a+b+r) + " cm");
            System.out.println("Luas segi tiga: " + a*b/2 + " cm2");
            break;
          default:
            System.out.println("Data tak ditemukan, program dihentikan ...");
            break;
        }
  }
}
