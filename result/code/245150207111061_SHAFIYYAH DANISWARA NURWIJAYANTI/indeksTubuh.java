package tugaslaprak2;
import java.util.Scanner;
public class indeksTubuh {
public static void main(String[] args) {
    //deklarasi
    int weight;
    double height;
    double Imt;
    String kriteria;

    //input
    Scanner scanner = new Scanner (System.in);
    System.out.print("Berat badan (kg):");
    weight = scanner.nextInt();
    System.out.print("Tinggi badan(m):");
    height = scanner.nextDouble();
    //rumus
    //Imt = weight / (height*height);
    Imt = weight / Math.pow(height, 2); 
    if (Imt<= 18.5) {
        kriteria = "kurus";
         }
    else
    if (Imt<=25){
        kriteria = "Normal";
    }else if(Imt <=30){
        kriteria = " Gemuk";
    }else { kriteria = "kegemukan";
      }
//System.out.println("IMT = "+(Imt)+ "termasuk" + kriteria);
System.out.printf("Imt=%.2f termasuk %s", Imt, kriteria);
    
}
    
}
