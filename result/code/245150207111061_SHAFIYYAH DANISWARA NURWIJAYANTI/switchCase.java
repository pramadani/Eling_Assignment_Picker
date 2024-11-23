package tugaslaprak2;
import java.util.Scanner;

public class switchCase {
    public static void main (String[]args){
        System.out.println("menu");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran\n" + 
                        "3. menghitung luas dan keliling segitiga");

        System.out.print("pilihan anda:");
        Scanner scanner = new Scanner (System.in);
        int pil = scanner.nextInt();
        switch(pil){
            case 1 : 
            System.out.print("masukan a:");
            int a = scanner.nextInt();
            System.out.print("masukan b:");
            int b = scanner.nextInt();
            System.out.print("masukan c:");
            int c = scanner.nextInt();
            int Lp =  a*b*c;
            float Kp = 2*(a+b);
            System.out.println("keliling pesergi panjang:" + (Kp)+ "cm");
            System.out.println("luas pesergi panjang:" + (Lp)+ "cm");
            break;
            
            case 2 :
            System.out.print("masukan a:");
            a = scanner.nextInt();
            double phi = 3.14;
            double Lling = phi*a*a;
            double Kling = 2*phi*a;
            System.out.println("keliling lingkaran:"+ (Kling)+ "cm");
            System.out.println("luas lingkaran:" + (Lling)+ "cm");
             break;
            
            case 3 :
            System.out.print("masukan a: ");
             a = scanner.nextInt();
            System.out.print("masukan b:");
             b = scanner.nextInt();
            System.out.print("masukan c:");
             c = scanner.nextInt();
            int kel = a+b+c;
            float s = kel / 2;
            double L = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("keliling segitiga:"+ (kel)+"cm");
            System.out.println("Luas segitiga:"+ (L)+ "cm" );
            
            break;
            default : 
            System.out.println("Data tak ditemukan, program dihentikan");

        }
    }

    
}
