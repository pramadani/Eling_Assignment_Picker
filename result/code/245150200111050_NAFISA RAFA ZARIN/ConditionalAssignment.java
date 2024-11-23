import java.util.Scanner;

public class ConditionalAssignment {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s.equals("filkom"))?"Brawijaya": "null";
        System.out.println(s+" "+val);
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        String nim = in.nextLine();

        String hasil = nama.equals("Nafisa Rafa Zarin")? nama + " " + nim: "input nama Modul Praktikum Pemrogaman Dasar 13 salah";
        String hasil2 = nim.equals("245150200111050")? nama + " " + nim: "input nim salah";
        
        System.out.println(hasil);
        System.out.println(hasil2);


    }
}