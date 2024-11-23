package praktikum2;

import java.util.Scanner;

public class tugas3 {
public static void main(String[]args) {
Scanner in=new Scanner(System.in);

System.out.print("Jumlah jam kerja tiap minggu :");
int jumlah=in.nextInt();

int max=60;
int upah=jumlah*5000;
int lembur=((jumlah-60)*6000);
int denda=((50-jumlah)*1000);


if(jumlah>=50 && jumlah<=60) {
	System.out.println("Jam kerja = " + jumlah);
	System.out.println("Upah      =" + " Rp. " + upah);
	System.out.println("Lembur    =" + " Rp. " + "0");
	System.out.println("Denda     = Rp. " + "0");
	System.out.println("---------------------");
	System.out.println("Total     = Rp. " + upah);
}
else if(jumlah<50) {
	System.out.println("Jam kerja = " + jumlah);
	System.out.println("Upah      =" + " Rp. " + upah);
	System.out.println("Lembur    =" + " Rp. " + "0");
	System.out.println("Denda     = Rp. " + denda);
	System.out.println("---------------------");
	System.out.println("Total     = Rp. " + (upah-denda));
}
else {
	System.out.println("Jam kerja = " + jumlah);
	System.out.println("Upah      =" + " Rp. " + max*5000);
	System.out.println("Lembur    =" + " Rp. " + lembur);
	System.out.println("Denda     = Rp. " + "0");
	System.out.println("---------------------");
	System.out.println("Total     = Rp. " + (max*5000+lembur));
}


}
}