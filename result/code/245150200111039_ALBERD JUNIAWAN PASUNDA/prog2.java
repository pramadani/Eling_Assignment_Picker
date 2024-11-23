import java.util.*;

public class prog2 {
    public static void main(String[] args){
        Scanner beto = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Berat badan (kg)    : ");
        double kg = beto.nextDouble();
        System.out.print("Tinggi badan (m)     : ");
        double m = beto.nextDouble();
        double imt = kg / (m * m);
        System.out.printf("%s%.2f  ", "IMT = ", imt);
        if (imt <= 18.5) {
            System.out.println("Termasuk Kurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.println("Termasuk Normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.println("Termasuk Gemuk");
        } else {
            System.out.println("Termasuk Kegemukan");
        }
    }
}
