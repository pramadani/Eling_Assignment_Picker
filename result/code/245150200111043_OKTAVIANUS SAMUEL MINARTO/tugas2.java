package praktikum.praktikumpemdasmodul2;

import java.util.*;
public class tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-20s : ","Berat badan (kg)");
        int bb = in.nextInt();
        System.out.printf("%-20s : ","Tinggi badan (cm)");
        int tb = in.nextInt();      

        float imt = (float) bb/(((float) tb*tb)/10000);
        System.out.printf("%-20s : %.2f ","IMT",imt);
        
        if(imt>30){
            System.out.print("Termasuk kegemukan");
        } else if(imt>25){
            System.out.print("Termasuk gemuk");
        } else if(imt>18.5){
            System.out.print("Termasuk normal");
        } else{
            System.out.print("Termasuk kurus");
        }
        in.close();
    }
}
