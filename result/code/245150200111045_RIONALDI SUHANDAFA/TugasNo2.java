import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-15s: ", "Berat Badan (kg)");
        int bb = in.nextInt();
        System.out.printf("%-15s: ", "Tinggi Badan (m)");
        double tb = in.nextDouble();
        double IMT = bb / Math.pow(tb, 2);
        in.close();

        if (IMT <= 18.5) {
            System.out.printf("%s = %.2f  %s", "IMT", IMT, "Termasuk Kurus");
        } else if (IMT > 18.5 && IMT <= 25) {
            System.out.printf("%s = %.2f  %s", "IMT", IMT, "Termasuk Normal");
        } else if (IMT > 25 && IMT <=30) {
            System.out.printf("%s = %.2f  %s", "IMT", IMT, "Termasuk Gemuk");
        } else if (IMT > 30) {
            System.out.printf("%s = %.2f  %s", "IMT", IMT, "Termasuk Kegemukan");
        } 
    }
}