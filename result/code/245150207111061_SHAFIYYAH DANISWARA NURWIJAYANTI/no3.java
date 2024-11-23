package tugaslaprak2;
    import java.util.Scanner;
    public class no3{
public static void main(String[] args){
    String a = "filkom";
    String val = (a =="filkom")?"brawijaya": null;
    System.out.println(a +" "+val);
    Scanner scanner = new Scanner (System.in);
    System.out.println("input nama");
    String iName = scanner.nextLine();
    System.out.println("input nim");
    String iNim = scanner.nextLine();
    String nama = "fiya";
    String nim = "245150207111061";
    if (iName.equals(nama)) {
        if (iNim.equals(nim)){
            System.out.println( iName );
            System.out.println(iNim);
} else {
            System.out.println("input nim salah");
        }
        
    } else {
        System.out.println("input nama salah");
    }
}
}
    