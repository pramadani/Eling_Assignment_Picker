package praktikum2;
import java.util.Scanner;
public class tugas2 {
public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Masukkan berat badan (kg)  :");
	double berat=in.nextDouble();
	System.out.print("Masukkan tinggi badan (m)  :");
	double tinggi=in.nextDouble();
	double imt=(berat/(tinggi*tinggi));
	
	 if(imt<=18.5) {
		 System.out.printf("%s%.2f%s","IMT = ",imt," Termasuk kurus");
	     }
		 else if (imt>18.5 && imt<=25) {
			 System.out.printf("%s%.2f%s","IMT = ",imt," Termasuk normal");
		 }
		 else if (imt>25 && imt<=30) {
			 System.out.printf("%s%.2f%s","IMT = ",imt," Termasuk gemuk");
		 }
		 else {
			 System.out.printf("%s%.2f%s","IMT = ",imt," Termasuk kegemukan");
		 }
	 
}
}