package imt;
import java.util.Scanner;
public class imt {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float imt, b, t;
        String kriteria;
        System.out.printf("%-20s : ", "Berat badan (kg)");
        b = input.nextFloat();
        System.out.printf("%-20s : ", "Tinggi badan (m)");
        t = input.nextFloat();
        imt = b / (t * t);
        System.out.printf("%s %c %.2f  ", "IMT", '=', imt);
        
        if (imt <= 18.5){
            kriteria = "kurus";
            System.out.println("Termasuk " + kriteria);
        }
        else if (imt > 18.5 && imt <= 25){
            kriteria = "normal";  
            System.out.println("Termasuk " + kriteria);
        }
        else if (imt > 25 && imt <= 30){
            kriteria = "gemuk";
            System.out.println("Termasuk " + kriteria);
        }
        else if (imt > 30){
            kriteria = "kegemukan"; 
            System.out.println("Termasuk " + kriteria);
        }
    }
}
