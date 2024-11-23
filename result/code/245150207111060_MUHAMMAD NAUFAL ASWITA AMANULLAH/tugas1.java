package praktikum2;
import java.util.Scanner;
public class tugas1 {
public static void main(String[]args) {
	
	Scanner in=new Scanner(System.in);
	int masuk;
	System.out.println("1. menghitung luas dan keliling persegi panjang");
	System.out.println("2. menghitung luas dan keliling lingkaran");
	System.out.println("3. menghitung luas dan keliling segitiga");
	System.out.print("Pilihan anda :");
	masuk=in.nextInt();
	
	switch(masuk) {
	
	case 1:
		System.out.print("Masukkan p :");
		int p=in.nextInt();
	    System.out.print("Masukkan l :");
	    int l=in.nextInt();
	    int luas=p*l;
	    int keliling=(2*(p+l));
	    System.out.println("Luas persegi panjang     :" + luas + " cm2");
	    System.out.println("Keliling persegi panjang :" + keliling + " cm");
	    break;
	case 2:
		System.out.print("Masukkan r :");
		int r=in.nextInt();
		double luas2=(double) (3.14*(r*r));
		double keliling2=(double) (2*3.14*r);
		System.out.println("Luas lingkaran     :" + luas2 + " cm2");
		System.out.println("Keliling lingkaran :" + keliling2 + " cm");
		break;
	case 3:
		int a,b,c;
		System.out.print("Masukkan a :");
		a=in.nextInt();
		System.out.print("Masukkan b :");
		b=in.nextInt();
		System.out.print("Masukkan c :");
		c=in.nextInt();
		int luas3=(int) (0.5*a*b);
		int keliling3=a+b+c;
		System.out.println("Luas segitiga     :" + luas3 + " cm2");
		System.out.println("Keliling segitiga :" + keliling3 + " cm");
		break;
	default:
		System.out.println("Data tak ditemukan, program dihentikan ...");

}

}
}