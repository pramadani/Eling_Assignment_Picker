package Praktikum2;
import java.util.*;

public class LuasKeliling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Menu:\n");
		System.out.println("1. menghitung luas dan keliling persegi panjang");
		System.out.println("2. menghitung luas dan keliling lingkaran");
		System.out.println("3. menghitung luas dan keliling segitiga\n");
		System.out.printf("%-10s : ","Pilihan anda");
		int p = input.nextInt();
		switch (p) {
			case 1 :
				System.out.printf("%-15s : ","Masukkan panjang");
				int panjang = input.nextInt();
				System.out.printf("%-16s : ","Masukkan lebar");
				int lebar = input.nextInt();
				System.out.println();
				int luas1 = panjang*lebar;
				int keliling1 = 2*(panjang+lebar);
				System.out.printf("%-25s : %d%s\n","Keliling persegi panjang",keliling1," cm");
				System.out.printf("%-25s : %d%s\n\n","Luas persegi panjang",luas1," cm2");
				break;
			case 2 :
				System.out.printf("%-15s : ","Masukkan jari-jari");
				double jari = input.nextDouble();
				System.out.println();
				double luas2 = Math.PI*jari*jari;
				double keliling2 = Math.PI*(jari+jari);
				System.out.printf("%-20s : %.2f%s\n","Keliling lingkaran",keliling2," cm");
				System.out.printf("%-20s : %.2f%s\n\n","Luas lingkaran",luas2," cm2");
				break;
			case 3 :
				System.out.printf("%-15s : ","Masukkan alas");
				double alas = input.nextDouble();
				System.out.printf("%-15s : ","Masukkan tinggi");
				double tinggi = input.nextDouble();
				System.out.println();
				double luas3 = alas*tinggi/2;
				double keliling3 = (Math.sqrt((alas/2*alas/2)+(tinggi*tinggi))*2)+alas;
				System.out.printf("%-20s : %.2f%s\n","Keliling segitiga",keliling3," cm");
				System.out.printf("%-20s : %.2f%s\n\n","Luas segitiga",luas3," cm2");
				break;
			default :
				System.out.println("Data tak ditemukan, program dihentikan ...");
				input.close();
		}

	}

}
