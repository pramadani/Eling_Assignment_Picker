package Praktikum2;
import java.util.*;

public class IMT {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("%-15s : ","Berat badan (kg)");
		double bb = input.nextDouble();
		System.out.printf("%-15s : ","Tinggi badan (m)");
		double tb = input.nextDouble();
		double imt = bb/(tb*tb);
		System.out.printf("%s%.2f","IMT = ",imt);
		if (imt<=18.5)
			System.out.println(" Termasuk kurus");
		else if (imt>18.5 && imt<=25)
			System.out.println(" Termasuk normal");
		else if (imt>25 && imt<=30)
			System.out.println(" Termasuk gemuk");
		else
			System.out.println(" Termasuk kegemukan");
		input.close();
	}

}
