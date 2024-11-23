import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Berat badan (kg): ");
        double beratBadan = input.nextDouble();
 
        System.out.print("Tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
     
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
   
        String kategori;
        if (imt <= 18.5) {
            kategori = "Kurus";
        } else if (imt > 18.5 && imt <= 25) {
            kategori = "Normal";
        } else if (imt > 25 && imt <= 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Kegemukan";
        }
        System.out.printf("IMT = %.2f Termasuk %s\n", imt, kategori);
    }
}