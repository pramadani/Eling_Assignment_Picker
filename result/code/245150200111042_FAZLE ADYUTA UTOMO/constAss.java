import java.util.Scanner;

public class constAss {
    public static void main(String[] args){
        String s = "filkom";
        String val = (s=="filkom") ? "Brawijaya" : "";
        System.out.println(s+" "+val);

        Scanner scanner = new Scanner(System.in);

        String namaString = scanner.nextLine(); 
        String passwordString = scanner.nextLine();       
        String biodataString = "Biodata Mahasiswa\n" + "nama: " + namaString;

        System.out.println();
        
        String namaString2 = scanner.nextLine();
        String passwordString2 = scanner.nextLine(); 

        System.out.println();

        String output = namaString2.equals(namaString) && passwordString2.equals(passwordString)
        ? biodataString
        : "data tak ditemukan";
        
        System.out.println(output);

        scanner.close();
    }
}