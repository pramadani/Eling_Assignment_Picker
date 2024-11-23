import java.util.Scanner;

public class keliling {
    public static void main(String[] args) {
        Scanner pil = new Scanner(System.in); 
        System.out.println(
            "Menu:\n" +
            "1. menghitung luas dan keliling persegi panjang\n" +
            "2. menghitung luas dan keliling lingkaran\n" +
            "3. menghitung luas dan keliling segitiga"
        );
        double a, b, r;
        double luas, keliling;
    
        int sw = pil.nextInt();
        System.out.println("pilihan anda :"+sw);

        switch (sw) {
            case (1) :
            System.out.print("Masukan a:");
             a = pil.nextDouble();

            System.out.print("Masukan b:");
             b = pil.nextDouble();

             luas = a*b ;
             keliling = 2*(a +b );

             System.out.printf("%-30s%s%s\n","luas persegi panjang",":",luas);
             System.out.printf("%-30s%s%s","keliling persegi panjang",":",keliling);
            break;

    
         case (2) :
            System.out.print("Masukan r:");
                 r = pil.nextDouble();

                 luas = r*3.14 ;
                 keliling = 2*3.14*r;
    
                 System.out.printf("%-30s%s%s\n","luas lingkaran",":",luas);
                 System.out.printf("%-30s%s%s","keliling lingkaran",":",keliling);
                break;

         case (3) :
                System.out.print("Masukan a:");
                     a = pil.nextDouble();
                 System.out.print("Masukan b:");
                     b = pil.nextDouble();
                System.out.print("Masukan r:");
                     r = pil.nextDouble();
    
                     luas = a*0.5*b ;
                     keliling = a+b+r;
        
                    System.out.printf("%-30s%s%s\n","luas segitiga",":",luas);
                    System.out.printf("%-30s%s%s","keliling segitiga",":",keliling);
                    break;
         default:
        
         System.out.println("tidak ditemukan,program dihentikan...");
                break;
        }
    }
}