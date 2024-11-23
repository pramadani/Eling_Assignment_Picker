import java.util.Scanner;
public class dua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double tb, bb, imt, bb1, tb1, imt1;
        //Masukan ke 1
        System.out.printf("%-20s %s","Berat badan (kg)", ": ");
        bb = userInput.nextDouble();
        System.out.printf("%-20s %s","Tinggi badan (m)", ": ");
        tb = userInput.nextDouble();
        //rumus imt 1
        imt = bb / (tb*tb);
        //if else 1
        if (imt<=18.5)
            System.out.printf("%s %.2f %s\n","IMT = " , imt , " Termasuk kurus");
        else if (imt>18.5 && imt<=25)
            System.out.printf("%s %.2f %s\n","IMT = " , imt , " Termasuk normal");
        else if (imt>25 && imt<=30)
            System.out.printf("%s %.2f %s\n","IMT = " , imt , " Termasuk gemuk");
        else if (imt>30)
            System.out.printf("%s %.2f %s\n","IMT = " , imt , " Termasuk kegemukan");
        System.out.println();
        //Masukan Ke2
        System.out.printf("%-20s %s","Berat badan (kg)", ": ");
        bb1 = userInput.nextDouble();
        System.out.printf("%-20s %s","Tinggi badan (m)", ": ");
        tb1 = userInput.nextDouble();
        //rumus imt 2
        imt1 = bb1 / (tb1*tb1);
        //if else 2
        if (imt1<=18.5)
            System.out.printf("%s %.2f %s\n","IMT = " , imt1 , " Termasuk kurus");
        else if (imt1>18.5 && imt1<=25)
            System.out.printf("%s %.2f %s\n","IMT = " , imt1 , " Termasuk normal");
        else if (imt1>25 && imt1<=30)
            System.out.printf("%s %.2f %s\n","IMT = " , imt1 , " Termasuk gemuk");
        else if (imt1>30)
            System.out.printf("%s %.2f %s\n","IMT = " , imt1 , " Termasuk kegemukan");
    }

}