import java.util.Scanner;

public class luaskalku {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu: ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        Scanner in = new Scanner(System.in);
        int pilih = in.nextInt();

        switch (pilih) {
            case 1: 
                System.out.println("Pilihan anda: "+ pilih);
                System.out.print("Masukkan p (panjang): ");
                int pp = in.nextInt();
                System.out.print("Masukkan l (lebar): ");
                int ll = in.nextInt();

                int kp = (pp*2)+(ll*2);
                int lp = pp * ll;
                System.out.println("Keliling persegi panjang: " + kp);
                System.out.println("Luas persegi panjang: " + lp);
                break;

            case 2 :
                System.out.println("Pilihan anda: "+ pilih);
                final double pi = 3.14;
                System.out.println("Ketik 1 untuk perhitungan dengan jari jari selain itu akan dilakukan perhitungan dengan diameter");
                int pilihR = in.nextInt();
                double r;
                    if (pilihR == 1){
                        System.out.print("Masukkan r (jari-jari): ");
                        r = in.nextDouble();
                    }
                    else {
                        System.out.println("Masukkan d (diameter): ");
                        double d = in.nextDouble();
                        r = d/2 ;
                    }
                double KL = 2 * pi * r;
                double LL = pi * r * r;
                System.out.println("Keliling lingkaran :" + KL);
                System.out.println("Luas lingkaran :"+ LL);
                break;
            
            case 3 :
                System.out.println("Pilihan anda: "+ pilih);
                System.out.print("Masukkan a: ");
                int a = in.nextInt();
                System.out.print("Masukkan b: ");
                int b = in.nextInt();
                System.out.print("Masukkan r: ");
                int rr = in.nextInt();

                int ks = a + b + rr;
                double ls;
                if (rr > a && rr > b) {
                    ls = (double) a * b / 2;
                }
                else if (a > rr && a > b){
                    ls = (double) rr * b /2;
                }
                else {
                    ls = (double) rr * a /2;
                }
                System.out.println("Keliling segitiga: "+ ks);
                System.out.printf("%s%.0f","Luas segitiga: ", ls);
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
        in.close();
    }
}
