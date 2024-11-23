package PRAKTIKUM;

import java.util.Scanner;
public class contsAss {
    public static void main(String[] args) {
        //String s = "filkom";
        //String val = (s=="filkom")?"Brawijaya": "null";
        //System.out.println(s+" "+val);

        String nama = ("khalif praya boerava");
        String pw = ("laprak");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("namaku : ");
        String namaku = input.nextLine();
        System.out.print("password : ");
        String pwku = input.nextLine();
        
        String namame = (namaku.equals(nama)) ? namaku :"input nama salah";
        String pwme = (pwku.equals(pw)) ? pwku :"input pw salah";

        System.out.println(namame);
        System.out.println(pwme);
    }
}
