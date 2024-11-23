import java.util.Scanner;
public class ConditionalAssignment {
    public static void main(String[] args) {
        String s = "filkom";
        int val = (s=="filkom")? 1 : 2 ;
        System.out.println(s+" "+val);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        String ininama = scanner.nextLine();
        System.out.println("Masukan Password: ");
        String inipassword = scanner.nextLine();
        String nama = "Raisya Nadiva";
        String password = "98765";
        String hasilnama = (ininama.equals(nama))? "" : "input nama tidak sesuai";
        String hasilpassword = (inipassword.equals(password))? "" : "input password tidak sesuai";
        String hasil = (ininama.equals(nama) && inipassword.equals(password))?  hasilnama + hasilpassword : "data tak ditemukan";
        System.out.println(hasil);
           }
}
 