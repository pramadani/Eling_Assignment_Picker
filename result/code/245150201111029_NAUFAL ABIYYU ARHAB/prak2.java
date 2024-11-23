import java.util.Scanner;

public class prak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int berat = input.nextInt();
        double tinggi = input.nextDouble();

        System.out.println("Berat badan (kg): " + berat);
        System.out.println("Tinggi badan (m): " + tinggi);

        double t2 = tinggi*tinggi;
        double imt = berat/t2;

        if (imt <= 18.5) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt, "termasuk kurus");
        } else if (imt>18.5&&imt<=25) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt, "termasuk normal");
        } else if (imt>25&&imt<=30) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt, "termasuk gemuk");
        } else {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt, "termasuk kegemukan");
        }

        // coba

        int berat2 = input.nextInt();
        double tinggi2 = input.nextDouble();

        System.out.println("Berat badan (kg): " + berat2);
        System.out.println("Tinggi badan (m): " + tinggi2);

        double t3 = tinggi2*tinggi2;
        double imt3 = berat2/t3;

        if (imt3 <= 18.5) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt3, "termasuk kurus");
        } else if (imt3>18.5&&imt3<=25) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt3, "termasuk normal");
        } else if (imt3>25&&imt3<=30) {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt3, "termasuk gemuk");
        } else {
            System.out.printf("%s %c %.2f %s\n", "IMT ", '=', imt3, "termasuk kegemukan");
        }
        
        input.close();
    }
}
