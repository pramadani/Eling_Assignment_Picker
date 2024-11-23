package Praktikum2;
import java.util.*;

public class Kerja {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("%-10s : ","Jam Kerja");
		int jamkerja = input.nextInt();
		if (jamkerja<50) {
			int upah = jamkerja*5000;
			int lembur = 0;
			int denda = (50-jamkerja)*1000;
			int total = upah+lembur-denda;
			System.out.printf("%-6s = Rp. %d\n","Upah",upah);
			System.out.printf("%-6s = Rp. %d\n","Lembur",lembur);
			System.out.printf("%-6s = Rp. %d\n","Denda",denda);
			System.out.println("---------------------");
			System.out.printf("%-6s = Rp. %d\n","Total",total);
		}else if (jamkerja>60) {
			int upah = 60*5000;
			int lembur = (jamkerja-60)*6000;
			int denda = 0;
			int total = upah+lembur-denda;
			System.out.printf("%-6s = Rp. %d\n","Upah",upah);
			System.out.printf("%-6s = Rp. %d\n","Lembur",lembur);
			System.out.printf("%-6s = Rp. %d\n","Denda",denda);
			System.out.println("---------------------");
			System.out.printf("%-6s = Rp. %d\n","Total",total);
		}else {
			int upah = jamkerja*5000;
			int lembur = 0;
			int denda = 0;
			int total = upah+lembur-denda;
			System.out.printf("%-6s = Rp. %d\n","Upah",upah);
			System.out.printf("%-6s = Rp. %d\n","Lembur",lembur);
			System.out.printf("%-6s = Rp. %d\n","Denda",denda);
			System.out.println("---------------------");
			System.out.printf("%-6s = Rp. %d\n","Total",total);
		} 	

	}

}


/*import java.util.Scanner; more effective (gpt)

public class Kerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s : ", "Jam Kerja");
        int jamkerja = input.nextInt();
        
        int upah;
        int lembur = 0;
        int denda = 0;
        int total;

        if (jamkerja < 50) {
            upah = jamkerja * 5000;
            denda = (50 - jamkerja) * 1000;
        } else if (jamkerja > 60) {
            upah = 60 * 5000;
            lembur = (jamkerja - 60) * 6000;
        } else {
            upah = jamkerja * 5000;
        }
        
        total = upah + lembur - denda;
        
        System.out.printf("%-6s = Rp. %d\n", "Upah", upah);
        System.out.printf("%-6s = Rp. %d\n", "Lembur", lembur);
        System.out.printf("%-6s = Rp. %d\n", "Denda", denda);
        System.out.println("---------------------");
        System.out.printf("%-6s = Rp. %d\n", "Total", total);
    }
}
*/



