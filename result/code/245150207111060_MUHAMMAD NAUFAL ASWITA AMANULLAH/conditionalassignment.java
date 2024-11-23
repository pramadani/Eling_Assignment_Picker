package praktikum2;
import java.util.Scanner;
public class conditionalassignment {
	public static void main(String[] args) {
        String s = "filkom";
        String val = (s.equals("filkom"))?"Brawijaya": "null";
        System.out.println(s+" "+val);
        
        Scanner in=new Scanner(System.in);
       System.out.print("Masukkan Nama :");
        String nama=in.nextLine();
        
        System.out.print("Masukkan NIM  :");
        String nim=in.nextLine();
        
        String namas="aswita";
        String nims="2451";
        
        String name=(nama.equals(namas))? "":"input nama salah";
        String nimp=(nim.equals(nims))? "":"\ninput NIM salah";
        String hasil=(nama.equals(namas) && nim.equals(nims))?"Data sesuai":name+nimp;
        System.out.println(hasil);
        		
        System.out.print("Masukkan username :");
        String usn=in.nextLine();
        System.out.print("Masukkan password :");
        String pass=in.nextLine();
        
        String user="naufal";
        String pss="123";
        
        String usn1=(usn.equals(user) && pass.equals(pss))?"username & password benar, silakan konfirmasi":"data tak ditemukan";
        System.out.println(usn1);
        
        if (usn.equals(user) && pass.equals(pss)) {
        System.out.print("Konfirmasi username :");
        String usn2=in.nextLine();
        System.out.print("Konfirmasi password :");
        String pass2=in.nextLine();
        
        String usn3=(usn2.equals(user) && pass2.equals(pss))?"Biodata = Naufal Aswita":"data tak ditemukan";
        System.out.println(usn3);
        }
    }
}
