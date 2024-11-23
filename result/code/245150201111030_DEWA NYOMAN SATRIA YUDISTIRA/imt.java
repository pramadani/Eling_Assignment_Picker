import java.util.Scanner;
public class imt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berat badan (kg) : ");
        double bb = input.nextDouble();
        System.out.print("Tinggi badan (m) : ");
        double tb = input.nextDouble();
        double imt2 = tb*tb;
        double imt = bb/(Math.pow(tb, 2));
        if(imt <= 18.5){
            System.out.printf("IMT = %.2f Termasuk kurus\n", imt);
        }
        else if (18.5 < imt && imt <= 25) {
            System.out.printf("IMT = %.2f Termasuk normal\n", imt);
        }
        else if (25 < imt && imt <= 30) {
            System.out.printf("IMT = %.2f Termasuk gemuk\n", imt);
        }
        else if (imt > 30) {
            System.out.printf("IMT = %.2f Termasuk obesitas\n", imt);

    }
}
}
