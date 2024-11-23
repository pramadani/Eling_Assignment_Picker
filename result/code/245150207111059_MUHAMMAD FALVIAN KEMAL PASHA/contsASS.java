import java.util.Scanner;

public class contsASS {
    public static void main(String[] args) {
        //String s = "filkom";
        //String val = (s == "filkom")? "Brawijaya" : "null";
        //System.out.println(s+ " " +val);

        String nama = ("muhammad falvian kemal pasha");
        String password = ("vian24");
        Scanner input = new Scanner(System.in);

        System.out.print("namaku : ");
        String namaku = input.nextLine();
        System.out.print("passwordku : ");
        String passwordku = input.nextLine();
        
        String namaqu = (namaku.equals(nama)) ? namaku :"data tak ditemukan";
        String passworqu = (passwordku.equals(password)) ? passwordku : "data tak ditemukan";

        System.out.println(namaqu);
        System.out.println(passworqu);


    }
    
}
