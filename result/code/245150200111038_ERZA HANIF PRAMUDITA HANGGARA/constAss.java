package Praktikum2;
import java.util.*;

public class constAss {
	public static void main(String[] args){
		String s = "filkom";
		String val = (s=="filkom")?"Brawijaya": "null";
		System.out.println(s+" "+val);
		Scanner input = new Scanner(System.in);
		System.out.print("Nama: ");
		String nama = input.nextLine();
		System.out.print("Password: ");
		String pass = input.nextLine();
		String outbio = (nama.equals("Erza")&&pass.equals("245150200111038"))?"Nama: Erza Hanif Pramudita Hanggara\nNIM: 245150200111038":"data tidak ditemukan";
		System.out.println(outbio);
		
		}
}

