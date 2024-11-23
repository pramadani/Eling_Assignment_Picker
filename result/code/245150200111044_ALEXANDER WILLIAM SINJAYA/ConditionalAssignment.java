// Terdapat kesalahan

import java.util.Scanner;

public class ConditionalAssignment {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s.equals("filkom"))?"Brawijaya": "null";
        System.out.println(s+" "+val);
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nim = input.nextLine();
        String cetak1 = (nama.equals("Alexander William Sinjaya")) ? nama : "input nama salah";
        String cetak2 = (nim.equals("245150200111044")) ? nim : "input nim salah";
        System.out.println(cetak1);
        System.out.println(cetak2);
    }
}
