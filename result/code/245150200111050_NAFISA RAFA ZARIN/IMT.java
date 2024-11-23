import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    double t = in.nextDouble();
    double tmeter = t/100;
    double IMT= b/(t*t)*10000;
    
    if (IMT <= 18.5){
        System.out.println("Berat badan (kg) : " + b );
        System.out.println("Tinggi badan (m) : " + tmeter);
        System.out.printf("IMT = %.2f", IMT);
        System.out.println(" Termasuk kurus");
    }else if(IMT < 18 && IMT <= 25){
        System.out.println("Berat badan (kg) : " + b );
        System.out.println("Tinggi badan (m) : " + tmeter);
        System.out.printf("IMT = %.2f", IMT);
        System.out.println(" Termasuk normal");
    }else if(IMT < 25 && IMT <= 30){
        System.out.println("Berat badan (kg) : " + b );
        System.out.println("Tinggi badan (m) : " + tmeter);
        System.out.printf("IMT = %.2f", IMT);
        System.out.println(" Termasuk gemuk");
    }else if (IMT > 30){
        System.out.println("Berat badan (kg) : " + b );
        System.out.println("Tinggi badan (m) : " + tmeter);
        System.out.printf("IMT = %.2f", IMT);
        System.out.println(" Termasuk kegemukan");        
    }
   }    
}
