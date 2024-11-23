import java.util.Scanner;
public class Seleksi5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Berat badan (kg) : ");
        double Berat = input.nextDouble();
        System.out.print("Tinggi badan (m) : ");
        double Tinggi = input.nextDouble();
        double IMT = Berat / (Tinggi * Tinggi);
        String Kriteria;
         if (IMT <= 18.5){
            Kriteria = "kurus";
         } else if (IMT <= 25){
            Kriteria = "Normal";
         } else if (IMT <= 30){
            Kriteria = ("Gemuk");
         } else {
            Kriteria = "Kegemukan";
         }
         System.out.printf("IMT = %.2f Termasuk %s\n", IMT, Kriteria);
    }
}


