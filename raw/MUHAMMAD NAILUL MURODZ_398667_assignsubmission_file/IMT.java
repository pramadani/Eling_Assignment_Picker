import java.util.Scanner;
public class IMT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Berat badan (kg) : ");
        double beratBadan = in.nextDouble();
        
        System.out.print("Tinggi badan (m) : ");
        double tinggiBadan = in.nextDouble();
        
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        System.out.printf("IMT = %.2f\n", imt);
        
        if (imt <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (imt <= 25) {
            System.out.println("Termasuk normal");
        } else if (imt <= 30) {
            System.out.println("Termasuk gemuk");
        } else {
            System.out.println("Termasuk kegemukan");
        }
    }
}
    

