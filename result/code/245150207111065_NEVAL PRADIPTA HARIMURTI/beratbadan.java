import java.util.Scanner;

public class beratbadan {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.printf("%-17s%s","Berat badan (kg)" ,": ");
        double kg = sc.nextDouble();
        System.out.printf("%-17s%s","Tinggi badan (m)" ,": ");
        double m = sc.nextDouble();
        
        double imt = (kg/(m*m));

        if (imt<= 18.5){
            System.out.printf("%s%.2f%s","IMT = ",imt,"  termasuk kurus");
        }
        if (18.5 <= imt && imt <= 25){
            System.out.printf("%s%.2f%s","IMT = ",imt,"  termasuk normal");
        }
        if (25 < imt && imt <= 30){
            System.out.printf("%s%.2f%s","IMT = ",imt,"  termasuk gemuk");
        }
        if (imt>30){
            System.out.printf("%s%.2f%s","IMT = ",imt,"  termasuk kegemukan");
        }

        else {
            ("maaf")
        }

    }
}

