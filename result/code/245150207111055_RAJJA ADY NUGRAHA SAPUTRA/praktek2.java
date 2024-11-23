import java.util.Scanner;

public class praktek2 {
    public static void main(String []args) {
        System.out.println("Berat badan (kg) : ");
        System.out.println("Tinggi badan (m) : ");
    

        Scanner input = new Scanner(System.in);
        System.out.print("masukan berat : ");
        double berat = input.nextDouble();
        System.out.print("masukan tinggi : ");
        double tinggi = input.nextDouble();
        double uji = berat / (tinggi * tinggi);


        System.out.println("Berat badan (kg) : " + berat);
        System.out.println("Tinggi badan (m) : " + tinggi);
        System.out.printf("IMT = %.2f ", uji);
        

        if (uji <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (uji <= 25 ) {
            System.out.println("Termasuk normal");;
        } else if (uji <= 30) {
            System.out.println("Termasuk gemuk");;
        } else if (uji > 30) {
            System.out.println("termasuk kegemukan");
        }

       


        




        
    }

}