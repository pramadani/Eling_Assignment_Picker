import java.util.*;
public class hitungBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-20s: ","Berat badan (kg)");
        int b = in.nextInt();
        System.out.printf("%-20s: ","Tinggi badan (m)");
        double t = in.nextDouble();

        double imt = (double) b / (t * t);
        String q = "";

        if (imt > 30){
            q = "Kegemukan";
        }
        else if (imt > 25 && imt <= 30){
            q = "Gemuk";
        }
        else if (imt > 18.5 && imt <= 25){
            q = "Normal";
        }
        else if (imt <= 18.5){
            q = "Kurus";
        }

        System.out.printf("%-5s= %.2f %s %s","IMT", imt,"Termasuk", q);
        in.close();
    }
}
